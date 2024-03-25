import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//leftChild = cell[2x]
//rightChild = cell[2x+1]
class BinaryTree{
    List<String> customeList;
    int lastUsedIndex;
    int maxSize;
    public BinaryTree(int size){
        customeList = new ArrayList<>(size);
        for(int i = 0; i < size; i++){
            customeList.add(null);
        }
        lastUsedIndex = 0;
        maxSize = size;
    }

    public String insertNode(String value){
        if(lastUsedIndex + 1 == maxSize){
            return "The Binary Tree is Full";
        }
        customeList.add(lastUsedIndex + 1 , value);
        lastUsedIndex += 1;
        return "Successfully inserted";
    }


    public String searchNode(String value){
        for(int i = 0; i < customeList.size(); i++){
            if(Objects.equals(customeList.get(i), value)){
                return "Yes Node is found";
            }
        }
        return "Node is not found";
    }
}
public class Tree {
    public static void main(String[] args){
        BinaryTree newBt = new BinaryTree(8);
        System.out.println(newBt.insertNode("Drinks"));
        System.out.println(newBt.insertNode("Hot"));
        System.out.println(newBt.insertNode("Cold"));
        System.out.println(newBt.customeList);
        System.out.println(newBt.searchNode("Cold"));

    }
}
