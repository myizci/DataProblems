import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    public Node root;

    public MyTree(Node root) {
        this.root = root;
    }

    public MyTree() {
    }


    // Insert method
    public void insert(int value) {

        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;

        while (true) {
            if (value <= current.value) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;

            }
        }
    }

// PreOrder Traversal of Tree Root-Left-Right

    public void preOrderTraversal(Node root) {

        if (root == null) return;
        System.out.print(root.value + ", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);

    }

    // in order traversal
    public void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);

    }

    // post order traversal
    public void postOrderTraversal(Node root) {
        if (root == null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + ", ");
    }

    public void levelOrderTraversal() {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            Node toVisit = queue.poll();
            System.out.print(toVisit.value + ", ");
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);
        }// end while


    }// end levelOrder


    // task-1 , contains method

    public boolean contains(int value) {

        if (root == null) return false;

        Node current = root;

        while (current != null) {
            if (value < current.value) current = current.leftChild;
            else if (value > current.value) current = current.rightChild;
            else return true;
        }

        return false;
    }

// task-2 , if the node is a leaf

    public boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }

    // task-3 , print all leaves
    public void printLeaves(Node root) {
        if (root == null) return;
        if (isLeaf(root)) System.out.print(root.value + ", ");
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);

    }
    // task-4 , count all leaves

    public int countLeaves(Node root) {
        if (root == null) return 0;

        if (isLeaf(root)) return 1;

        return countLeaves(root.leftChild)+countLeaves(root.rightChild);
    }

    public int countNodes(Node root) {
        if (root == null) return 0;

        if (isLeaf(root)) return 1;

        return countNodes(root.leftChild)+countNodes(root.rightChild);
    }

    // task-5 sum of all leaves

    public int findSumOfLeaves(Node root){
        if (root == null) return 0;

        if (isLeaf(root)) return root.value;

        return findSumOfLeaves(root.leftChild)+ findSumOfLeaves(root.rightChild);
    }

    // task-6 find the height of a Node

    public int height(Node root){
        if (root == null) return -1;
        if (isLeaf(root)) return 0;

       return 1+Math.max(height(root.leftChild),height(root.rightChild));
    }



    public int calculateSumNodeDepths(){
        return nodeDepthSums(root,0);
    }
    public int nodeDepthSums(Node node, int sums ){

        if(node==null) return 0;

        return sums+ nodeDepthSums(node.leftChild,sums+1) + nodeDepthSums(node.rightChild,sums+1);
    }
}
