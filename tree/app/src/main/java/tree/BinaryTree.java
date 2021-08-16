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
        } if(node != null){
            if(node.leftChild != null){
                inOrder(node.getLeftChild());}
            System.out.println(node.getValue());
                list.add(node.getValue());
                if(node.rightChild != null){
                    inOrder(node.getRightChild());
                }
        }
        return node.value;
    }

    public T postOrder(Node<T> node){
        if (root == null){
            return null;
        } if(node != null){
            if(node.leftChild != null){
                postOrder(node.getLeftChild());
                list.add(node.getValue());
                if(node.rightChild != null){
                    postOrder(node.getRightChild());
                }
            }
        }
        System.out.println(node.getValue());
        return node.value;
    }

    public int maxValue(Node<T> node){
            if (node == null)
                return Integer.MIN_VALUE;

            int root = (int) node.value;
            int left = maxValue(node.leftChild);
            int right = maxValue(node.rightChild);

            if (left > root)
                root = left;
            if (right > root)
                root = right;
            return root;
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
