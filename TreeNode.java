public class TreeNode {
    private int customerID;
    private String firstName;
    private String lastName;
    TreeNode left;
    TreeNode right;


    public TreeNode() {}
    public TreeNode(int customerID, String firstName, String lastName, String phoneNumber, String address) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public TreeNode(int customerID, String firstName, String lastName, String phoneNumber, String address, TreeNode left, TreeNode right) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.left = left;
        this.right = right;
    }



    public int getCustomerID() {
        return this.customerID;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return this.customerID + "|" + this.firstName + "|" + this.lastName;
    }
    
}
