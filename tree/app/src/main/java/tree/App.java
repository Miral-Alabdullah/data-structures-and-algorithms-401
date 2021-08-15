/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

import java.util.ArrayList;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeftChild(new Node(1));
        binaryTree.getRoot().setRightChild(new Node(2));
        binaryTree.getRoot().getLeftChild().setLeftChild(new Node(4));
        binaryTree.getRoot().getLeftChild().setRightChild(new Node(7));

        binaryTree.preOrder(binaryTree.getRoot());


        System.out.println("-----------------------------------");

        binaryTree.inOrder(binaryTree.getRoot());

        System.out.println("-----------------------------------");

        binaryTree.postOrder(binaryTree.getRoot());
    }


}
