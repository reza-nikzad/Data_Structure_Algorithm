package BinaryTree;

public class Tree {
    private Node root;

    public void insert(int num){
        if(root == null){
            root = new Node(num);
        }else{
            root.insert(num);
        }

    }

    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }
    }

    public Node get(int value){
        if(root != null){
            return root.get(value);
        }
        return null;
    }

}
