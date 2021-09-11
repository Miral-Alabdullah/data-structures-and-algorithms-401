package HashMap;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashMapClass {


    public ArrayList<Integer> treeIntersection(BinaryTree tree1, BinaryTree tree2) throws Exception{
        ArrayList<Integer> arrayOfNode = new ArrayList<>();
        if(tree1.getRoot() == null || tree2.getRoot() == null){
            throw new Exception("Check your input, both trees can't be null!");
        }
        tree1.preOrder(tree1.getRoot());
        tree2.postOrder(tree2.getRoot());
        for(Integer i: tree1.hashMap.keySet()){
            if (tree2.hashMap2.get(i) != null){
                arrayOfNode.add(i);
            }
        }
        System.out.println(arrayOfNode);
        return arrayOfNode;
    }


    public List<List<String>> leftJoin(HashMap<String, String> left, HashMap<String, String> right) throws Exception{
        List<String> strings;
        List<List<String>> listOfLists = new ArrayList<>();

        if (left == null && right == null){
            throw new Exception("You can't merge empty hashmpas");
        }
        for(String s: left.keySet()){
            if(right.get(s) != null) {
                strings = new ArrayList<>();
                strings.add(s);
                strings.add(left.get(s));
                strings.add(right.get(s));
                listOfLists.addAll(Collections.singleton(strings));

            }
        }
        System.out.println(listOfLists);
        return listOfLists;
    }
}
