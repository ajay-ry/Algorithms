package com.algo.dp.trees;

public class BasicOperations {

    public static void main(String[] args) {
        Node root = BinaryTree.getConstructedTree();

        //find the smallest
        System.out.println(getSmallestValue(root));

        //check for a bst
        System.out.println(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));

        //get height of a tree
        System.out.println(getHeight(root));

        //get level of a node in a tree
        System.out.println(getLevel(root,8,0));

        //find element in BST
        System.out.println(findElementInBST(root,8));
        System.out.println(findElementInBST(root,18));
    }

    public static int getSmallestValue(Node root){
        if(root==null)
            return Integer.MAX_VALUE;
        int res = root.data;
        int left=getSmallestValue(root.left);
        int right=getSmallestValue(root.right);
        if(left<res)
            res=left;
        if(right<res)
            res=right;
        return res;
    }


    public static  boolean isBST(Node root,int smallest, int largest){
        if(root==null)
            return true;
        if(root.data<smallest || root.data>largest)
            return false;
        boolean flag1= isBST(root.left,smallest,root.data-1);
        boolean flag2= isBST(root.right,root.data+1,largest);
        if(flag1 && flag2)
            return true;
        else return false;
    }

    public static int getHeight(Node root){
        if(root==null)
            return 0;
        int leftHeight = getHeight(root.left);
        int rightHeiht = getHeight(root.right);
        if(leftHeight>rightHeiht)
            return 1+leftHeight;
        else return 1+rightHeiht;
    }

    public static int getLevel(Node root,int key,int level){
        if(root==null)
            return 0;
        if(root.data==key)
            return level;
        int left_level = getLevel(root.left,key,level+1);
        if(left_level!=0)
            return left_level;
        int right_level = getLevel(root.right,key,level+1);
        return right_level;
    }

    public static boolean findElementInBST(Node root,int key){
        if(root==null)
            return false;
        if(root.data==key)
            return true;
        if(root.data<key)
            return findElementInBST(root.right,key);
        else return findElementInBST(root.left,key);
    }
}
