package stringBuilderDemos;

// Superclass of StringBuilder class is AbstractStringBuilder class
// StringBuilder class takeaways
public class Demo1 {
  public static void main(String[] args) {
    // constructors of StringBuilder class
    // no-arg constructor
    StringBuilder builder = new StringBuilder();
    builder.append("abcd");

    // accepts string builder object
    StringBuilder builder1 = new StringBuilder(builder);

    // accepts int value to specify initial capacity
    StringBuilder builder2 = new StringBuilder(50);

    // Accepts String
    StringBuilder builder3 = new StringBuilder("anushi");

    // METHODS OF STRINGBUILDER
    /*
    1. Query position of char: charAt, indexOf, substring
    2. Modify StringBuilder: append, insert, delete
    3. Others: length, trimToSize, setLength
     */

    // append()
    /*
    behavior:
    adds the specified value at the end of the StringBuilder object
    in case of char[], you can give 3 parameters: array, offset and length
     */
    StringBuilder sb1 = new StringBuilder();
    sb1.append(true);
    sb1.append(10);
    sb1.append('a');
    sb1.append(20.99);
    sb1.append("Hi");
    System.out.println(sb1); // true10a20.99Hi

    StringBuilder sb2 = new StringBuilder();
    char[] name = {'J', 'a', 'v', 'a', '8'};
    sb2.append(name, 1, 4);
    System.out.println(sb2); // ava

    // append() can also take Object as a method parameter.
    StringBuilder builder4 = new StringBuilder();
    builder4.append("Anushi");
    builder4.append(new Person(" Agrawal"));
    System.out.println(builder4); // Anushi Agrawal

    // insert()
    /*
    behavior:
    you can insert desired data after any position
     */
    builder4.insert(7, "aka ");
    System.out.println(builder4);

    // insert char array, string or its substring to stringbuilder object
    StringBuilder sb = new StringBuilder("123");
    char[] c = {'J', 'a', 'v', 'a'};
    //      sb.insert(1, c, 1, 3);
    //      System.out.println(sb); //1ava23

    //      sb.insert(1,"anushi");
    //    System.out.println(sb); //1anushi23
    String s = new String("anushi");
    sb.insert(2, s.substring(3));
    System.out.println(sb); // 12shi3

    // delete()
    /*
    behavior:
    deletes characters from the stringbuilder object with the specified substring length
      first parameter included
      second excluded
     */
    sb.delete(2, 5);
    System.out.println(sb); // 123

    // deleteCharAt()
    /*
    behavior:
    removes character at the specified position
     */
    sb.deleteCharAt(1);
    System.out.println(sb); // 13

    // reverse()
    /*
    behavior:
    reverses the sequence of characters
     */
    System.out.println(sb.reverse());

    // replace()
    /*
    behavior:
    DIFFERENT THAN STRING
    replaces a sequence of characters, identified by their positions,
    with another String
     */
      StringBuilder s1 = new StringBuilder("0123456");
      s1.replace(2, 4, "ABCD");
      System.out.println(s1); //01ABCD456

      //subSequence()
      /*
      behavior:
      Apart from substring(), we can use subSequence() to get the sub sequence. returns a char sequence
       */
      StringBuilder b1 = new StringBuilder("0123456");
      System.out.println(b1.subSequence(2, 4));
      //doesn't modify the original
      System.out.println(b1);

  }
}
