package arrayListDemos;

import java.util.ArrayList;

public class Demo3 {
  public static void main(String[] args) {
      ArrayList<Person> myArrList = new ArrayList<Person>();
      Person p1 = new Person("Shreya");
      Person p2 = new Person("Paul");
      myArrList.add(p1);
      myArrList.add(p2);
      myArrList.add(p2);
      System.out.println(myArrList.contains(new Person("Shreya")));
      System.out.println(myArrList.contains(p1));
      System.out.println(myArrList.indexOf(new Person("Paul")));
      System.out.println(myArrList.indexOf(p2));
      System.out.println(myArrList.lastIndexOf(new Person("Paul")));
      System.out.println(myArrList.lastIndexOf(p2));
  }
}
