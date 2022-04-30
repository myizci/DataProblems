public class TreeApp {

    public static void main(String[] args) {

        MyTree tree = new MyTree();

        int[] numbers = new int[]{10, 5, 12, 3, 6, 11, 13, 2};

        for (int i = 0; i < 8; i++) {
            tree.insert(numbers[i]);
        }

        VisualizeTree.printTree(tree.root, null, false);

        System.out.println("Pre-Order-Traversal");
        tree.preOrderTraversal(tree.root);
//        System.out.println();
//        System.out.println("In-Order-Traversal");
//        tree.inOrderTraversal(tree.root);
//        System.out.println();
//        System.out.println("Post-Order-Traversal");
//        tree.postOrderTraversal(tree.root);
//        System.out.println();
//        System.out.println("Breadth First Traversal");
//        tree.levelOrderTraversal();
//        System.out.println();
//        System.out.println("tree.contains(6) = " + tree.contains(6));
//
//        System.out.println();
//        System.out.println("Print Leaves of The Tree");
//        tree.printLeaves(tree.root);
//        System.out.println();
//        System.out.println("Count Leaves of The Tree");
//        System.out.println("tree.countLeaves(tree.root) = " + tree.countLeaves(tree.root));
//
//        System.out.println();
//        System.out.println( "Sum of leaf values:  " + tree.findSumOfLeaves(tree.root));
//        System.out.println();
//        System.out.println("tree.height(tree.root.leftChild) = " + tree.height(tree.root.leftChild));

    }
}
