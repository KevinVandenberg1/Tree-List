// Name: Kevin Vandenberg
// Class: CS 145
// Assignment: Lab 7
// 
// Notice: ChatGPT and GeeksForGeeks has been used to help get an idea
//         about how to do various traversals iteratively.
public class Main {
    public static void main(String[] args) {

        TreeList list = new TreeList();
        list.add(52, "James", "Apple", "3603838030", "52 Wallaby Way");
        list.add(32, "Emily", "Apple", "3603838030", "52 Wallaby Way");
        list.add(16, "Corban", "Apple", "3603838030", "52 Wallaby Way");
        list.add(33, "Garry", "Apple", "3603838030", "52 Wallaby Way");
        list.add(72, "Kevin", "Apple", "3603838030", "52 Wallaby Way");
        list.add(83, "Indigo", "Apple", "3603838030", "52 Wallaby Way");
        list.add(53, "Red", "Apple", "3603838030", "52 Wallaby Way");
        list.remove(33);
        System.out.println(list.contains(52));
        System.out.println(list.contains(33));
        System.out.println(list.contains(83));
        list.edit(16, 700);
        list.preOrderPrint();
        list.postOrderPrint();
        list.inOrderPrint();
    }
}
