package arrayListDemos;

import java.util.ArrayList;
//cloning of arraylist
public class Demo4 {
  public static void main(String[] args) {
      ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
      StringBuilder sb1 = new StringBuilder("Jan");
      StringBuilder sb2 = new StringBuilder("Feb");
      myArrList.add(sb1);
      myArrList.add(sb2);
      myArrList.add(sb2);
      ArrayList<StringBuilder> assignedArrList = myArrList;
      ArrayList<StringBuilder> clonedArrList =
              (ArrayList<StringBuilder>)myArrList.clone();
      System.out.println(myArrList == assignedArrList);
      System.out.println(myArrList == clonedArrList);
      StringBuilder myArrVal = myArrList.get(0);
      StringBuilder assignedArrVal = assignedArrList.get(0);
      StringBuilder clonedArrVal = clonedArrList.get(0);
      System.out.println(myArrVal == assignedArrVal);
      System.out.println(myArrVal == clonedArrVal);
  }
}
