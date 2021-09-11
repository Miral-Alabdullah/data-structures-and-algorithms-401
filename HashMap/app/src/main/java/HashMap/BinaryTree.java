package HashMap;


import java.util.ArrayList;
import java.util.HashMap;

//To practice the concept for the final interviews
public class BinaryTree {

    private Node root;
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    HashMap<Integer, Integer> hashMap2 = new HashMap<>();

    public void preOrder(Node node){
        if (node != null){
            hashMap.put(node.getValue(), node.getValue());
            if (node.getLeft() != null){
                preOrder(node.getLeft());
                if (root.getRight() != null){
                    preOrder(node.getRight());
                }
            }
        }
    }

    public void postOrder(Node node){
        if (node != null){
            if (node.getLeft() != null){
                postOrder(node.getLeft());
                if (root.getRight() != null){
                    postOrder(node.getRight());
                }
            }
        }
        hashMap2.put(node.getValue(), node.getValue());
    }






    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }


}
