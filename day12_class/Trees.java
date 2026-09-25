package day12_class;

public class Trees {

    static void display(Node root, int space) {

        if (root == null) {
            return;
        }

        // Display right subtree
        display(root.right, space + 5);

        // Print spaces
        System.out.println();

        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }

        // Print root
        System.out.println(root.data);

        // Display left subtree
        display(root.left, space + 5);
    }

    public static void main(String[] args) {

        Trees ob = new Trees();

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(12);
        root.right.right = new Node(20);

        System.out.println("Binary Tree:");

        display(root, 0);
    }
}