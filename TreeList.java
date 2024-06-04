import java.util.Stack;
public class TreeList {
    private TreeNode head;

    // Method that adds a node to the treelist
    public void add(int customerID, String firstName, String lastName, String phoneNumber, String address) {
        if (head == null) {
            head = new TreeNode(customerID, firstName, lastName, phoneNumber, address);
            head.weight = 0;
        } else {
            TreeNode node = new TreeNode(customerID, firstName, lastName, phoneNumber, address);
            addNode(node);

        }
    }
    
    // Helper method that assists in adding a node to the list
    private void addNode(TreeNode node) {
        TreeNode navigation = head;
        while (navigation != null) {
            if (navigation.getCustomerID() < node.getCustomerID()) {

                if (navigation.right == null) {
                    navigation.right = node; 
                    navigation = navigation.right; 
                }
                else navigation = navigation.right;

            } else if ((navigation.getCustomerID() > node.getCustomerID())) {

                if (navigation.left == null) {
                    navigation.left = node; 
                    navigation = navigation.left; 
                }
                else navigation = navigation.left;

            } else {break;}
        }   
    }
 
    // Searches the treelist for a particular node, then returns it
    public TreeNode search(int customerID) {
        TreeNode navigation = head;
        while (navigation != null) {
            if (navigation.getCustomerID() < customerID) {
                navigation = navigation.right;
            } else if (navigation.getCustomerID() > customerID) {
                navigation = navigation.left;
            } else {return navigation;}
        }
        return null;
    }

    // Searches the treelist for a particular node, returns true if its there.
    public boolean contains(int customerID) {
        TreeNode navigation = head;
        while (navigation != null) {
            if (navigation.getCustomerID() < customerID) {
                navigation = navigation.right;
            } else if (navigation.getCustomerID() > customerID) {
                navigation = navigation.left;
            } else {return true;}
        }
        return false;
    }

    // Edits the customer information, first integer is for what you are changing
    public void edit(int customerID, String firstName, String lastName, String phoneNumber, String address) {
        TreeNode person = search(customerID);
        if (person != null) {
            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setAddress(address);
            person.setPhoneNumber(phoneNumber);
        } else {
            System.out.println("Error 1: Doesnt exist");
        }
    }

    // Edits the customer ID, first int is whats searched, second is whats changed
    public void edit(int customerID, int changedID) {
        TreeNode node = search(customerID);
        if(search(changedID) == null && node != null) {
            remove(customerID);
            add(changedID, node.getFirstName(), node.getLastName(), node.getPhoneNumber(), node.getAddress());
        } else if (node == null) {
            System.out.println("Error 1: Doesnt exist");
        } else {
            System.out.println("Error 2: Already exists");
        }
    }
    
    // Removes a specific node from the tree
    public void remove(int customerID) {
        if (head.getCustomerID() == customerID) {
            head = removeNode(head);
        } else {
            TreeNode current = head;
            while (current != null) {
                if (current.getCustomerID() > customerID) {
                    if (current.left != null && current.left.getCustomerID() == customerID) break;
                    current = current.left;
                } else {
                    if (current.right != null && current.right.getCustomerID() == customerID) break;
                    current = current.right;
                }
            }
            if (current == null) { // doesnt exist
                System.out.println("Error 1: Doesnt exist");
                return;
            }
            if (current.left.getCustomerID() == customerID) {
                current.left = removeNode(current.left);
            } else {
                current.right = removeNode(current.right);
            }
        }
    }

    // Helper method that removes a particular node from the tree
    private TreeNode removeNode(TreeNode node) {
        if (node.left == null) {
            node = node.right;
        } else if (node.right == null) {
            node = node.left;
        } else {
            TreeNode replace = removeMinRight(node.right);
            if (replace==node.right) node.right = null;
            replace.left = node.left;
            TreeNode temp = replace;
            while (temp.right != null) temp = temp.right;
            temp.right = node.right;
            node = replace;
        }
        return node;
    }


    private TreeNode removeMinRight(TreeNode node) {
        TreeNode previous = null;
        while (node.left != null) {
            previous = node;
            node = node.left;
        }
        if (previous != null) previous.left = null;
        return node;
    }


    public void preOrderPrint() {
        if (head == null) {
            return;
        }


        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(head);

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            System.out.println(currentNode);

            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }


    }
    public void inOrderPrint() {
        if (head == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>(); 
        TreeNode navigation = head;

        while (navigation != null || !stack.isEmpty()) {
            while(navigation != null) {
                stack.push(navigation);
                navigation = navigation.left;
            }
            navigation = stack.pop();
            System.out.println(navigation);
            navigation = navigation.right;
            
        }

    }
    public void postOrderPrint() {
        if (head == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>(); 
        Stack<TreeNode> printStack = new Stack<TreeNode>();
        stack.push(head);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            printStack.push(current);
            if (current.left != null) stack.push(current.left);
            if (current.right != null) stack.push(current.right);
        }
        while (!printStack.isEmpty()) {
            System.out.println(printStack.pop());
        }
    }
}
