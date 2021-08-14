package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {

    private Node<T> root;

    List<T> list = new ArrayList<>();

    public T preOrder(Node<T> node){
        if (root == null){
            return null;
        }
        if (node != null){
            System.out.println(node.getValue());
            list.add(node.getValue());
            if (node.leftChild != null){
                preOrder(node.getLeftChild());
                if (node.rightChild != null){
                    preOrder(node.getRightChild());
                }
            }
        }
        return node.value;
    }

    public T inOrder(Node<T> node){
        if (root == null){
            return null;
        } if(node.leftChild != null){
            inOrder(node.getLeftChild());
            System.out.println(node.getValue());
            list.add(node.getValue());
            if(node.rightChild != null){
                inOrder(node.getRightChild());
            }
        }
        return node.value;
    }

    public T postOrder(Node<T> node){

        return node.value;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
