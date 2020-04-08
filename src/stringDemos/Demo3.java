package stringDemos;

// String objects and operators
public class Demo3 {
  /*
  There are two operators defined on string:
  1. Concatenation: + and +=
  2. Equality: == and !=
   */
  public static void main(String[] args) {
    // Concatenation of String

    String aString = "OCJA" + "Cert" + "Exam";
    System.out.println(aString); // OCJACertExam

    int num = 10;
    int val = 12;
    String aStr = "OCJA";
    String anotherStr = num + val + aStr;
    // Operations from left to right are done
    System.out.println(anotherStr); // 22OCJA
    // to get exact values:
    System.out.println("" + num + val + aStr); // 1012OCJA

    String lang = "Java";
    lang += " is everywhere!";
    System.out.println(lang);
    String initializedToNull = null;
    initializedToNull += "Java";
    System.out.println(initializedToNull); // nullJava
    String s = new String();
    System.out.println(s + "java"); // java

    // Equality of Strings
      /*
      Use equals() to compare the content of the two String objects
      behavior:
      returns if:
      1. object isn't null
      2. is a string object
      3. represents same sequence of characters as the object to which it is compared
       */

//      String var1 = new String("Java");
//      String var2 = new String("Java");
//      System.out.println(var1.equals(var2)); //true
//      System.out.println(var1 == var2); //false
//
//      //== compares reference variables
//
//      String var3 = "code";
//      String var4 = "code";
//      System.out.println(var3.equals(var4)); //true
//      System.out.println(var3 == var4); //true

      String var1 = new String("Java");
      String var2 = new String("Java");
      System.out.println(var1.equals(var2)); //true
      System.out.println(var1 == var2); //false
      System.out.println(var1 != var2); //true

      String var3 = "code";
      String var4 = "code";
      System.out.println(var3.equals(var4)); //true
      System.out.println(var3 == var4); //true
      System.out.println(var3 != var4); //false

      // != is an inverse of == operator

      String lang1 = "Java";
      String lang2 = "JaScala";
      String returnValue1 = lang1.substring(0,1); //J
      String returnValue2 = lang2.substring(0,1); //J
      System.out.println(returnValue1 == returnValue2); //false
      System.out.println(returnValue1.equals(returnValue2)); //True

      /*
      the substring method uses new keyword and returns a new object
       */

  }
}
