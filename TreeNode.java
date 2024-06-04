public class TreeNode {
    // Fields
    private int customerID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    TreeNode left;
    TreeNode right;
    int weight = 0;

    // Nothing constructor
    public TreeNode() {}

    // Constructor for just data
    public TreeNode(int customerID, String firstName, String lastName, String phoneNumber, String address) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    // Constructor for data + treeNodes
    public TreeNode(int customerID, String firstName, String lastName, String phoneNumber, String address, TreeNode left, TreeNode right) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.left = left;
        this.right = right;
    }


    // Getter methods
    public int getCustomerID() {
        return this.customerID;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getAddress() {
        return this.address;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // Setter Methods
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    // String format
    public String toString() {
        return this.customerID + "|" + this.firstName + "|" + this.lastName;
    }
    
}
