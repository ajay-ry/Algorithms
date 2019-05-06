package com.algo.dp.trees;

public class BinaryTree {

     public static Node getConstructedTree(){
         Node root = new Node(10);
         root.left=new Node(6);
         root.right=new Node(20);
         root.left.left=new Node(4);
         root.left.right=new Node(8);
         root.right.left=new Node(15);
         root.right.right=new Node(25);
         root.left.left.left= new Node(3);
         root.left.left.right=new Node(5);
         root.left.right.left=new Node(7);
         root.left.right.right=new Node(9);
         root.right.left.left=new Node(12);
         root.right.left.right=new Node(16);
         root.right.right.left=new Node(22);
         root.right.right.right=new Node(28);
         root.right.right.right.right=new Node(30);
         root.right.right.right.right.right=new Node(35);
         return root;
     }
}
