package arrayListDemos;

import java.util.ArrayList;

//Other method of ArrayList
public class Demo2 {
  public static void main(String[] args) {
    /*
    Adding multiple elements in an arraylist using addAll()
    addAll(Collection c)
    addAll(int index, Collection c)
     */
    ArrayList<String> myArrList = new ArrayList<String>();
    myArrList.add("One");
    myArrList.add("Two");
    ArrayList<String> yourArrList = new ArrayList<String>();
    yourArrList.add("Three");
    yourArrList.add("Four");
    myArrList.addAll(1, yourArrList);
    for (String val : myArrList)
      System.out.println(val);

    System.out.println("----------------------------");

    ArrayList<String> myArrList1 = new ArrayList<String>();
    String one = "One";
    String two = new String("Two");
    myArrList1.add(one);
    myArrList1.add(two);
    ArrayList<String> yourArrList1 = myArrList1;
    one.replace("O", "B");
    for (String val : myArrList1)
      System.out.print(val + ":");
    for (String val : yourArrList1)
      System.out.print(val + ":");

    //Clearing arraylist
    myArrList1.clear();
    for (String val:myArrList1)
      System.out.println(val);

    //accessing individual arraylist elements
    String valFromList = myArrList.get(1);
    System.out.println(valFromList);
    System.out.println(myArrList.size());

    ArrayList<StringBuilder> myArrList2 =
            new ArrayList<StringBuilder>();
    StringBuilder sb1 = new StringBuilder("Jan");
    StringBuilder sb2 = new StringBuilder("Feb");
    myArrList2.add(sb1);
    myArrList2.add(sb2);
    myArrList2.add(sb2);
    System.out.println(myArrList2.contains(new StringBuilder("Jan")));
    System.out.println(myArrList2.contains(sb1));
    System.out.println(myArrList2.indexOf(new StringBuilder("Feb")));
    System.out.println(myArrList2.indexOf(sb2));
    System.out.println(myArrList2.lastIndexOf(
            new StringBuilder("Feb")));
    System.out.println(myArrList2.lastIndexOf(sb2));
  }
}
