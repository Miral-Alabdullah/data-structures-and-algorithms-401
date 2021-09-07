/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }


    //Throw Exception if one of trees is empty
    @Test void emptyString() throws Exception{
        BinaryTree binaryTree = new BinaryTree();
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();
        Assertions.assertThrows(Exception.class, ()->{
            binaryTree.treeIntersection(tree1, tree2);
        });
    }

    @Test void happyPath() throws Exception{
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.setRoot(new Node(150));

        binaryTree.getRoot().setLeft(new Node(100));
        binaryTree.getRoot().getLeft().setLeft(new Node(75));
        binaryTree.getRoot().getLeft().setRight(new Node(160));
        binaryTree.getRoot().getLeft().getRight().setLeft(new Node(125));
        binaryTree.getRoot().getLeft().getRight().setRight(new Node(175));
        binaryTree.getRoot().setRight(new Node(250));
        binaryTree.getRoot().getRight().setLeft(new Node(200));
        binaryTree.getRoot().getRight().setRight(new Node(350));
        binaryTree.getRoot().getRight().getRight().setLeft(new Node(300));
        binaryTree.getRoot().getRight().getRight().setRight(new Node(500));

        /////////////////////////////////////////////////////////////////////////////////////////////

        BinaryTree binaryTree1 = new BinaryTree();

        binaryTree1.setRoot(new Node(42));

        binaryTree1.getRoot().setLeft(new Node(100));
        binaryTree1.getRoot().getLeft().setLeft(new Node(15));
        binaryTree1.getRoot().getLeft().setRight(new Node(160));
        binaryTree1.getRoot().getLeft().getRight().setLeft(new Node(125));
        binaryTree1.getRoot().getLeft().getRight().setRight(new Node(175));
        binaryTree1.getRoot().setRight(new Node(600));
        binaryTree1.getRoot().getRight().setLeft(new Node(200));
        binaryTree1.getRoot().getRight().setRight(new Node(350));
        binaryTree1.getRoot().getRight().getRight().setLeft(new Node(4));
        binaryTree1.getRoot().getRight().getRight().setRight(new Node(500));

        binaryTree.treeIntersection(binaryTree1, binaryTree);

        assertTrue(binaryTree.treeIntersection(binaryTree1, binaryTree).contains(500));
    }

}
