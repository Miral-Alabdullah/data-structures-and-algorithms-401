package tree;

public class BinarySearchTree extends BinaryTree {
    Node2 root;

    public void add(int value){
        if(root == null){
            root = new Node2(value);
        } else{
            Node2 current = root;
            traverseAdd(current, value);
        }
    }

    public boolean contain(int value){
        Node2 current = root;
        return traverseContain(current, value) != null;
    }

    public void traverseAdd(Node2 current, int value){
        if(value > current.getValue()){
            if(current.getRightChild()== null){
                current.setRightChild(new Node2(value));
                return;
            }

            current = current.getRightChild();
        }else{
            if(current.getLeftChild() == null){
                current.setLeftChild(new Node2(value));
                return;
            }

            current = current.getLeftChild();
        }
        traverseAdd(current, value);
    }

    public Node2 traverseContain(Node2 current, int value){
        if(current == null || current.getValue() == value){
            return current;
        }

        if(current.getValue() > value){
            return traverseContain(current.getLeftChild(), value);
        }

        return traverseContain(current.getRightChild(), value);
    }
}
