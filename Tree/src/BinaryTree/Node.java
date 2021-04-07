package BinaryTree;

public class Node {

    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int num){
    /*    if(data == num ){
            return;
        }*/
        if(data >= num){
            if(leftChild == null){
                leftChild = new Node(num);
            }else{
                leftChild.insert(num);
            }
        }else{
            if(rightChild == null){
                rightChild = new Node(num);
            }else {
                rightChild.insert(num);
            }
        }
    }

    public void traverseInOrder(){
        if(leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.print(data+ ", ");
        if(rightChild != null){
            rightChild.traverseInOrder();
        }
    }

    public Node get(int value){
        if(value == data){
            return this;
        }
        if(value < data){
            if(leftChild != null){
                return leftChild.get(value);
            }
        }else{
            if(rightChild != null){
                return rightChild.get(value);
            }
        }
        return null;

    }

    public int getData() {
        return data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
