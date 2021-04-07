package BinaryTree;

public class BinaryTreeDemo {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(27);
        tree.insert(22);
        tree.insert(15);
        tree.insert(22);
        tree.insert(30);
        tree.insert(26);
        tree.insert(26);
        tree.insert(35);
        tree.insert(-1);
        tree.traverseInOrder();
        System.out.println();
        System.out.println(tree.get(35));
        System.out.println(tree.get(26));
        System.out.println(tree.get(22));
        System.out.println(tree.get(-1));
    }
}
