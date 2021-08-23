package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTree<T> {

    public Node<T> root;

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
                if(node.rightChild != null){
                    postOrder(node.getRightChild());
                }
            }
        }
        list.add(node.getValue());
        System.out.println(node.getValue());

        return node.value;
    }

    public int maxValue(Node<T> node) throws Exception{
        if (node == null) {
            return 0;
        }

        int root = (int) node.value;
        int left = maxValue(node.leftChild);
        int right = maxValue(node.rightChild);

        if (left > root)
            root = left;
        if (right > root)
            root = right;
        return root;
    }


    public String toString(){
        String s = "";
        for (int i = 0; i<list.size(); i++){
            s += list.get(i) + " -> ";
        }
        s = s + "NULL";
        System.out.println(s);
        return s;
    }

    public List<T> breadthFirst(BinaryTree tree){
        Queue<Node> breadth = new LinkedList();
        List<T> list = new ArrayList<>();
        String s = "";
        breadth.add(tree.getRoot());
        while(breadth.peek() != null) {
            Node<T> node = breadth.remove();
            list.add(node.getValue());
            if (node.getLeftChild() != null){
                breadth.add(node.getLeftChild());
            }
            if (node.getRightChild() != null){
                breadth.add(node.getRightChild());
            }
        }
        for (int i = 0; i < list.size(); i++) {
            s += list.get(i) + " -> ";
        }
        s = s + "NULL";
        System.out.println(s);
        return list;
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
