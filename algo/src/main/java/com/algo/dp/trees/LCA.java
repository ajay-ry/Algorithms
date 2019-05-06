package com.algo.dp.trees;

import java.util.ArrayList;

public class LCA {

    public static  int findLCAOfABinaryTree(Node root, int key1, int key2){
        ArrayList<Node> path1 = new ArrayList<Node>();
        ArrayList<Node> path2 = new ArrayList<Node>();

        boolean key1_check = findPath(root,key1,path1);
        boolean key2_check = findPath(root,key2,path2);
        int lca=-1;
        if(key1_check && key2_check){
            for(int i=0;i<path1.size()&&i<path2.size();i++){
                if(path1.get(i).data==path2.get(i).data){
                    lca=path1.get(i).data;
                }else break;

            }
        }
        return lca;
    }

    public static boolean findPath(Node root, int key, ArrayList<Node> list){

        if(root==null)
            return false;
        list.add(root);

        if(root.data==key)
            return true;

        if(root.left!=null && findPath(root.left,key,list))
            return true;
        if(root.right!=null && findPath(root.right,key,list))
            return true;

        list.remove(list.size()-1);
        return false;
    }

    public static void main(String[] args) {
        Node root = BinaryTree.getConstructedTree();
        System.out.println(findLCAOfABinaryTree(root,12,22));
    }
}
