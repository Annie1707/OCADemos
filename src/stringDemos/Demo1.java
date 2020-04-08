package stringDemos;

/*
there is no import statement here because classes and interfaces in the java.lang package are automatically imported
in all the classes, interfaces and enums
 */

// Creating String objects
public class Demo1 {
  public static void main(String[] args) {
    // method 1: using new keyword
    String str1 = new String("Anushi"); // object 1
    String str2 = new String("Anushi"); // object 2

    System.out.println(str1 == str2); // false

    /*
    == operator compares address. Whenever new keyword is used, a new object is created by the JVM.
     */

    // method 2: using assignment operator
    String str3 = "Agrawal"; // object 3 created in the String pool
    String str4 = "Agrawal"; // reference to object 3 created

    System.out.println(str3 == str4); // true

    /*
    == operator compares address. str3 and str4 refer to the same object, object 3 in the string pool.
     */
    System.out.println("Persistent"); // object 4 created in the string pool
    String str5 = "Persistent";
    System.out.println("Persistent" == str5); // true

    /*
    when we do sout of any string, a new string object is created in the string pool
     */

    String str6 = new String("Persistent");
    System.out.println("Persistent" == str6); // false

    /*
    objects created using new keyword doesn't reside in the string pool
     */

    // Various overloaded constructors of String class
    // constructor that accepts String
    String str7 = new String("Anushi");
    System.out.println(str7);

    // constructor that accepts char array
    char[] c = new char[] {'A', 'N', 'U', 'S', 'H', 'I'};
    String str8 = new String(c);
    System.out.println(str8);

    // constructor that accepts StringBuilder object
    StringBuilder sb1 = new StringBuilder("String Builder");
    String str9 = new String(sb1);
    System.out.println(str9);

    // constructor that accepts StringBuffer object
    StringBuffer sb2 = new StringBuffer("String Buffer");
    String str10 = new String(sb2);
    System.out.println(str10);

    // no arg constructor
    String str11 = new String();
    System.out.println(str11.length());

    // Since String is a class, we can assign null to it
    str11 = null;
    System.out.println(str11);

    //COUNTING NUMBER OF STRING OBJECTS CREATED
      String a = new String("Anushi"); //obj1
      String b = "Anushi"; //obj2
    System.out.println("Anushi"); //reference
    System.out.println("Agrawal"); //obj3
    System.out.println("Agrawal"=="anushi"); //obj4 (anushi)
    String d = new String("Anushi"); //obj5
    System.out.println("total objects created = 5");
  }
}
