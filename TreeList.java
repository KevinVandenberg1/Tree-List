public class TreeList {
    private TreeNode head;

    public void add(int customerID, String firstName, String lastName, String phoneNumber, String address) {
        if (head == null) {
            head = new TreeNode(customerID, firstName, lastName, phoneNumber, address);
        } else {
            TreeNode node = new TreeNode(customerID, firstName, lastName, phoneNumber, address);
            addNode(node);

        }
    }
    private void addNode(TreeNode node) {
        TreeNode navigation = head;
        while (navigation.left != null && navigation.right != null) {
            if (navigation.getCustomerID() < node.getCustomerID()) {

                if (navigation.right == null) {navigation.right = node; navigation = navigation.right; }
                else navigation = navigation.right;

            } else if ((navigation.getCustomerID() > node.getCustomerID())) {

                if (navigation.left == null) {navigation.left = node; navigation = navigation.left; }
                else navigation = navigation.left;

            } else {break;}
        }   
    }
    public void remove(int customerID) {

    }

    public void preOrderPrint() {

    }
    public void inOrderPrint() {

    }
    public void postOrderPrint() {

    }
}
