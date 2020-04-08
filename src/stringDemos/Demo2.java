package stringDemos;

// methods of class String
public class Demo2 {
  public static void main(String[] args) {
    /*
    Frequently used String methods can be divided into 3 groups
    GROUP 1: Query position of chars -> charAt, indexOf, substring
    GROUP 2: Seem to modify string -> substring, trim, replace
    GROUP 3: Others -> length, startsWith, endsWith
     */

    // charAt()
    /*
    behavior:
    returns character at the specified location
     */
    String str1 = new String("Anushi");
    System.out.println(str1.charAt(1)); // n
    System.out.println(str1.charAt(3)); // s

    // indexOf()
    /*
    behavior:
    search a string for the occurrence of a character or string.
    Returns index of the character if present
    Returns index of first character of the search string if present
    Returns -1 if not found
     */
    System.out.println(str1.indexOf('A')); // 0
    System.out.println(str1.indexOf("n")); // 1
    System.out.println(str1.indexOf("nu")); // 1
    System.out.println(str1.indexOf("usa")); // -1

    String str2 = "abcdacbcd";
    System.out.println(str2.indexOf("cd", 4)); // 7
    /*
    we can also define the index from which we want the search to begin
     */
    // substring()
    /*
    behavior:
    when 1 parameter is passed, substring from the given position till teh end is returned
    when 2 parameters are passed, substring from the given position to the second parameter - 1 position is returned.
     */
    String sub = str2.substring(4);
    System.out.println(sub); // acbcd
    System.out.println(str2.substring(3, 6)); // dac

    // trim()
    /*
    behavior:
    returns a new string by removing all the leading and trailing backspaces. It doesn't hinder the white spaces in between the
    character sequence.
     */
    String str3 = "          Anushi    Agrawal         ";
    System.out.println(str3);
    System.out.println(str3.trim());

    // replace()
    /*
    behavior:
    returns a new string by replacing all the occurrences of a char with another char
     */
    System.out.println(str2.replace('a', 'A'));
    System.out.println(str2.replace("ac", "AC"));

    // Either both will be String or both will be char
    // System.out.println(str2.replace("b",'B'));

    // length()
    /*
    behavior:
    returns the actual length of the string.
    value = last index of string + 1
     */
    System.out.println(str2.length());

    // startsWith()
    /*
    behavior:
    returns a boolean value of the check whether a String starts with the prefix, specified as a STRING
    returns a boolean value of the check whether a String from the given index starts with a prefix,
     */
    System.out.println(str2.startsWith("a"));

    // character argument is not accepted
    // System.out.println(str2.startsWith('a'));

    System.out.println(str2.startsWith("a", 4));

    // endsWith()
    /*
    behavior:
    returns a boolean value of the check whether a String ends with the suffix, specified as a STRING
     */
    System.out.println(str2.endsWith("d"));

    // character argument is not accepted
    // System.out.println(str2.endsWith('d'));

      //METHOD CHAINING
      String result = "Sunday ".replace(' ', 'Z').trim().concat("M n");
    /*
    SundayZZ
    SundayZZM n
     */
    System.out.println(result); //SundayZZM n

      String day = "SunDday";
      System.out.println(day);
      day = day.replace('D', 'Z').substring(3);
      System.out.println(day);
  }
}
