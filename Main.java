// Name: Kevin Vandenberg
// Class: CS 145
// Assignment: Lab 7
// Extra credit: Throughout the TreeList file, I made all of the methods iterative rather than recursive
// Notice: ChatGPT and GeeksForGeeks has been used to help get an idea
//         about how to do various traversals iteratively.
public class Main {
    public static void main(String[] args) {

        TreeList list = new TreeList();
        list.add(52, "James", "Apple", "1234567890", "52 Wallaby Way");
        list.add(32, "Emily", "Apple", "1234567890", "52 Wallaby Way");
        list.add(16, "Corban", "Apple", "1234567890", "52 Wallaby Way");
        list.add(33, "Garry", "Apple", "1234567890", "52 Wallaby Way");
        list.add(72, "Kevin", "Apple", "1234567890", "52 Wallaby Way");
        list.add(83, "Indigo", "Apple", "1234567890", "52 Wallaby Way");
        list.add(53, "Red", "Apple", "1234567890", "52 Wallaby Way");
        list.remove(16);
        System.out.println(list.contains(52));
        System.out.println(list.contains(33));
        System.out.println(list.contains(83));
        list.edit(16, "Red", "Apple", "1234567890", "52 Wallaby Way");
        list.preOrderPrint();
        System.out.println();
        list.postOrderPrint();
        System.out.println();
        list.inOrderPrint();
    }
}
