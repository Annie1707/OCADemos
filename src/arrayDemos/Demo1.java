package arrayDemos;

// All about arrays: one dimensional and multi-dimensional
/*
Array types:
1. primitive  data type
2. interface
3. abstract class
4. concrete class
 */
public class Demo1 {
  public static void main(String[] args) {
    // array as a collection of primitive data types stores primitive values
    int intArray[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    // you cannot print an array directly
    // System.out.println(intArray);

    for (int i : intArray) {
      System.out.println(i);
    }

    // array as a collection of objects stores addresses or references to the objects from the
    // heap-memory
    String objArray[] = new String[] {"a", "b", "c", "d", "e"};
    for (String i : objArray) {
      System.out.println(i);
    }
    System.out.println("---------------------------------------");
    /*
    Creating an array involves 3 steps which can be done in separate lines of code or combined.
    1) Declaration: array type + array variable
    creates a variable pointing to null
    2) Allocation: use of new keyword
    3) Initialization
     */

    // Declaration of array
    String[] arr1; // 1 dimensional
    String arr2[]; // 1 dimensional
    String[] arr3[]; // 2 dimensional
    String[][] arr4; // 2 dimensional
    String arr5[][]; // 2 dimensional

    // compilation error because the array is only declared and not initialized
    //      for (String i : arr1) {
    //          System.out.println(i);
    //      }
    // array size can't be defined at the time of declaration because no element is created at that
    // time
    // this gives compilation error
    // String[5] arr6;
    System.out.println("---------------------------------------");
    // Array Allocation
    /*
    memory is allocated for the elements of array.
    important to specify the dimension of array. Once declared, can't be changed. Size must be on thr right hand side and not left hand side
     */
    arr1 = new String[3];
    arr3 = new String[2][3];

    for (String i : arr1) {
      System.out.println(i);
    }
    // size of the array must evaluate to an int value
    // arr2 = new String[2.2];

    arr2 = new String[2 * 6];
    int x = 1;
    int y = 5;
    // array accepts expressions in size until it evaluates to an integer
    arr4 = new String[x + y][Math.max(x, y)];
    for (String[] i : arr4) {
      for (String j : i) System.out.println(j);
    }
    /*
    in multi dimensional array, if size is given in both brackets, an array of first size is created with each element
    ro be another array object of second size
    if only first size is given, an array of given size is created wh=ith each element pointing to null
    you have to give the first size else compilation error
     */

    // arr5=new String[2][3];
    arr5 = new String[2][];

    /*
    once allocation is done, all elements store their default values.
    objects: null
    int,byte,short,long: 0
    float,double: 0.0
    boolean: false
    char: \u0000
     */
    System.out.println("---------------------------------------");
    // Array Initialization
    // 1. Initialization using for loop
    for (int i = 0; i < arr1.length; i++) arr1[i] = "element " + i;

    for (String i : arr1) {
      System.out.println(i);
    }

    // 2 Initialization without for loop
    arr1[0] = "anushi";
    arr1[1] = "agrawal";
    arr1[2] = "disha";

    for (String i : arr1) {
      System.out.println(i);
    }
    // Multidimensional array initialization

    for (int i = 0; i < arr4.length; i++) {
      for (int j = 0; j < arr4[i].length; j++) {
        arr4[i][j] = "" + i + j;
      }
    }

    for (String[] i : arr4) {
      for (String j : i) System.out.println(j);
    }

    // initialization without for loop

    arr4[0][0] = "summer";
    arr4[1][1] = "winter";
    arr4[2][2] = "autumn";
    arr4[3][3] = "spring";
    arr4[4][4] = "season";

    for (String[] i : arr4) {
      for (String j : i) System.out.println(j);
    }

    // the indices and size are not checked at the compile time. Wrong value throws run time
    // arrayoutofboundexception
    int array[] = new int[4];
    // runtime error
    // System.out.println(array[4]);
    // System.out.println(array[-10]);

    // positions of an array can't be removed

    String a[] = new String[] {"a", "b", "c", "d"};
    a[0] = null;
    for (String i : a) System.out.println(i);
    System.out.println("---------------------------------------");
    // Combining array declaration, allocation and initialization
    int intArray1[] = {0, 1};
    String[] strArray = {"Summer", "Winter"};
    int multiArray[][] = {{0, 1}, {3, 4, 5}};

    for (int i : intArray1) System.out.println(i);

    for (String i : strArray) System.out.println(i);

    for (int[] i : multiArray) {
      for (int j : i) {
        System.out.println(j);
      }
    }

    System.out.println("--------using new keyword--------");

    int intArray2[] = new int[] {0, 1};
    String[] strArray2 = new String[] {"Summer", "Winter"};
    int multiArray2[][] = new int[][] {{0, 1}, {3, 4, 5}};

    // following won't compile. When we try to combine any of the three steps, size must not be
    // specified.
    // It is calculated by the number of elements entered in the curly braces.
    /*
       int intArray2[] = new int[2]{0, 1};
    String[] strArray2 = new String[2]{"Summer", "Winter"};
    int multiArray2[][] = new int[2][]{ {0, 1}, {3, 4, 5}};
        */

    // when declaration and initilization is n=done in two separate lines, new keyword is mandatory
    int intArray3[];
    intArray3 = new int[] {0, 1};
    for (int i : intArray3) {
      System.out.println(i);
    }

    // following code won't compile
    /*
    int intArray[];
    intArray = {0, 1};
     */
    System.out.println("------------------------");

    // Asymmetrical multidimensional arrays: different no. of columns for rows

    String multiStrArr[][] = {
      {"A", "B"}, null, {"Jan", "Feb", "Mar"},
    };
    // we get null pointer exception when accessing multiStrArr[1][0]
    //      for (String[] i : multiStrArr) {
    //          for (String j : i) {
    //              System.out.println(j);
    //          }
    //      }

    // Interface type array
    /*
    elements are either null or the objects that implement that interface
     */
    MyInterface[] interfaceArr = new MyInterface[] {new MyClass1(), null, new MyClass2()};
    System.out.println("------------interface array------------------");
    for (MyInterface i : interfaceArr) System.out.println(i);

    // Abstract class type array
    /*
    elements are either null or the objects of concrete classes that extend the given abstract class
     */
    Vehicle[] abstractArr = new Vehicle[] {new Bike(), null, new Car()};

    System.out.println("------abstract class type array------------");

    for (Vehicle i : abstractArr) System.out.println(i);

    // Object type array
    /*
    contains elements referring to any object because Object class is the supermost class of all the classes in java
     */
    Object[] objectArr =
        new Object[] {
          new MyClass1(),
          null,
          new Bike(),
          new java.util.Date(),
          new String("anushi"),
          new Integer[10]
        };

    for (Object i : objectArr) System.out.println(i);



    //Methods of an array:
      /*
      length: a variabe
      clone(): overridden method and doesn't throw checked exceptions. return type is same as that of array.
      inherited methods: inherits all the methods of class Object except clone()
       */

      //IMP: IN STRING, length() method is used
      //IN ARRAYS, length variable is used
  }
}

interface MyInterface {}

class MyClass1 implements MyInterface {}

class MyClass2 implements MyInterface {}

abstract class Vehicle {}

class Bike extends Vehicle {}

class Car extends Vehicle {}
