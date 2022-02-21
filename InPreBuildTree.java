/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp 
 */
public class InPreBuildTree {
	 
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		
		if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0 
				|| preorder.length != inorder.length) {
			return null;
		}

		int preorderLength = preorder.length; 
		int inorderLength = inorder.length;

		return helper(preorder, inorder, 0, preorderLength - 1, 0, inorderLength - 1);
	}

	private TreeNode helper(int[] preorder,int[] inorder,int preStart,int preEnd,int inStart,int inEnd) {
		if (inStart > inEnd) {
			return null;
		}

		int rootIndex = 0;
		int rootValue = preorder[preStart];
		TreeNode root = new TreeNode(rootValue);

		for (int i = inStart; i <= inEnd; i++) {
			if (inorder[i] == rootValue) {
				rootIndex = i;
				break;
			}
		}

		int length = rootIndex - inStart;
		
		root.left = helper(preorder, inorder, preStart + 1, preStart + length, inStart, rootIndex - 1);
		root.right = helper(preorder, inorder, preStart + length + 1, preEnd, rootIndex + 1, inEnd);

		return root;
	}
	
	
	// TreeNode 
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode (int x) {
			val = x;
		}
	}
}