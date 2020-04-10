package flowControlDemos;

// if, if-else and ternary constructs
public class Demo1 {
  public static void main(String[] args) {
    // if constructs and its flavors
    String result = "1";
    int score = 10;
    if ((score = score + 10) == 100) // 20
    result = "A";
    else if ((score = score + 29) == 50) // 49
    result = "B";
    else if ((score = score + 200) == 10) // 249
    result = "C";
    else result = "F";
    System.out.println(result + ":" + score); // F:249

    boolean testValue = false;
    if (testValue == true) System.out.println("value is true");

    // if can exist without else but else always needs an if

    score = 100;
    if ((score = score + 10) > 110) ;
    System.out.println(score);

    // Implications of the presence and absence of {} in if-else constructs
      String name = "Lion";
      score = 100;
      if (name.equals("Lion"))
          score = 200;
    System.out.println(score); //200

      name = "anushi";
      score = 100;
      if (name.equals("Lion"))
          score = 200;
          name = "Larry"; //this will execute in any case

    System.out.println(name+" "+score); //Larry 100

// we get compile time error
//      String name = "Lion";
//      int score = 100;
//      if (name.equals("Lion"))
//          score = 200;
//      name = "Larry";
//else
//      score = 129;

      //use braces
       name = "Lion";
       score = 100;
      if (name.equals("Lion")) {
          score = 200;
          name = "Larry";
      }
      else
          score = 129;
    System.out.println(score+name);


       name = "Lion";
      if (name.equals("Lion"))
          System.out.println("Lion");
      else
          System.out.println("Not a Lion");
      System.out.println("Again, not a Lion"); //not part of else

      name = "xxx";
      if (name.equals("Lion"))
          System.out.println("Lion");
      else {
          System.out.println("Not a Lion");
          System.out.println("Again, not a Lion");
      }


      name = "Lion";
      if (name.equals("Lion"))
          for (int i = 0; i < 3; ++i)
              System.out.println(i);
          //0 1 2

      boolean allow = false;
      if (allow = true)
          System.out.println("value is true");
      else
          System.out.println("value is false");
  }
}
