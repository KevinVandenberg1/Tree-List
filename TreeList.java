public class TreeList {
    private TreeNode head;

    public void add(int customerID, String firstName, String lastName) {
        if (head == null) {
            head = new TreeNode(customerID, firstName, lastName);
        } else {
            TreeNode node = new TreeNode(customerID, firstName, lastName);

        }
    }
    private void addNode(TreeNode node) {
        TreeNode navigation = head;
        while (navigation.left != null && navigation.right != null) {
            if (head.getCustomerID() < node.getCustomerID()) {

                if (navigation.right == null) navigation.right = node;
                else navigation = navigation.right;

            } else if ((head.getCustomerID() > node.getCustomerID())) {

                if (navigation.left == null) navigation.left = node;
                else navigation = navigation.left;

            } else {break;}
        }   
    }
}
