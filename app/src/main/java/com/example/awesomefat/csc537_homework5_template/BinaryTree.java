package com.example.awesomefat.csc537_homework5_template;

import android.view.View;

/**
 * Created by awesomefat on 11/28/17.
 */

public class BinaryTree {
    private Node root;
    private int count;

    public BinaryTree() {
        this.root = null;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public void add(int payload) {
        Node n = new Node(payload);
        this.count++;

        if (this.root == null) {
            this.root = n;
        } else {
            //we know that this.root is a thing
            this.root.add(n);
        }
    }


    public void inorder(Node ptr) // Performs the inorder traversal of the tree
    {
        Node lowerLeftChild = null;
        Node root = null;
        Node lowerRightChild = null;

        if (this.root == null) {
            System.out.println("Tree is empty");
            return;
        }
        if (ptr != null) {
            inorder(ptr.getLeftChild());
            System.out.format("%-12s%-12s%3s\n", ptr.getPayload());
            //System.out.print(ptr.patient.firstName + " ");
            //System.out.print(ptr.patient.lastName + "   ");
            //System.out.println(ptr.patient.age + " ");
            inorder(ptr.getRightChild());
        }
    }
    public void displayInOrder(View v)
    {
        this.inorder(root);
    }

}