class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int data) {
        val = data;
    }
}

class TreeExamples {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);

        int count = numberOfNodes(root);
        System.out.println("Number of nodes: " + count);
        int height = heightOfTree(root);
        System.out.println("Height of tree: " + height);
        int key = 80;
        boolean isFound = isKeyFound(root,key);
        System.out.println("Key is Found: " + isFound);
        int minimum = minimumOfTree(root);
        System.out.println("minimum of tree: " + minimum);
        int maximum = maximumOfTree(root);
        System.out.println("maximum of tree: " + maximum);
        int countLeaf = countOfLeafNodes(root);
        System.out.println("count of tree: " + countLeaf);
    }

    public static int numberOfNodes(TreeNode root) {
        if (root == null) return 0;
        int leftCount = numberOfNodes(root.left);
        int rightCount = numberOfNodes(root.right);
        return leftCount + rightCount + 1;
    }
     public static int heightOfTree(TreeNode root){
        if(root==null) return 0;
        int lHeight = heightOfTree(root.left);
        int rHeight = heightOfTree(root.right);
        return Math.max(lHeight,rHeight)+1;
     }
     public static boolean isKeyFound(TreeNode root,int key){
        if(root==null) return false;
        if(root.left==null && root.right==null) return false;
        if(root.val==key) return true;
        boolean lfound = isKeyFound(root.left,key);
        boolean rfound = isKeyFound(root.right,key);
        return lfound||rfound;
     }
     public static int  minimumOfTree(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        int lcount = minimumOfTree(root.left);
        int rcount = minimumOfTree(root.right);
        return Math.min(Math.min(lcount,rcount),root.val);
     }
    public static int  maximumOfTree(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        int lcount = maximumOfTree(root.left);
        int rcount = maximumOfTree(root.right);
        return Math.max(Math.max(lcount,rcount),root.val);
    }
    public static int countOfLeafNodes(TreeNode root){
        if (root==null) return 0;
        if(root.right==null && root.right==null) return 1;
        int lcount = countOfLeafNodes(root.left);
        int rcount = countOfLeafNodes(root.right);
        return lcount+rcount;
    }
}
