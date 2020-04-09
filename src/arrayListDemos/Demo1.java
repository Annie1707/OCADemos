package arrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// Creation, accessing, modification and deletion on ArrayList
public class Demo1 {
  public static void main(String[] args) {
    // a new array list (dynamic array)is created with initial capacity of 10
    ArrayList<String> list = new ArrayList<>();

    // adding elements to arrayList at the end
    list.add("one");
    list.add("two");
    list.add("three");

    System.out.println(list);

    // adding elements to arrayList at a specific index
    list.add(1, "new");

    System.out.println(list);

    // accessing elements from arrayList
    // using enhanced for loop
    for (String i : list) System.out.println(i);

    //using list iterator
      ListIterator<String> iterator = list.listIterator();
    while (iterator.hasNext()) System.out.println(iterator.next());

    //using iterator
      Iterator<String> iterator1 = list.iterator();
    while (iterator1.hasNext()) System.out.println(iterator1.next());

    //you can remove elements while iterating using iterator and list iterator. This cannpt be done using enhanced for loop

      //Modifying elements of an arraylist
      //using set()
      list.set(1,"one and a half");
    System.out.println(list);

    //via traversing all the elements

      ArrayList<StringBuilder> list1 = new ArrayList<>();
      StringBuilder sb = new StringBuilder("kiran");
      list1.add(new StringBuilder("anushi"));
      list1.add(new StringBuilder("disha"));
      list1.add(new StringBuilder("aashi"));
      list1.add(new StringBuilder("dibbi"));
        list1.add(sb);

      for(StringBuilder s:list1)
          s.append(s.length());

    for (StringBuilder s : list1) System.out.println(s);

    //Deleting elements of arrayList
      //via remove(int index)
      list1.remove(1);

    System.out.println(list1);

    //using remove(Object obj)
      list1.remove(sb);
    System.out.println(list1);
      //using remove(Object obj)
      list1.remove(new StringBuilder("aashi5"));
    // aashi is not removed because remove() compares data using the equals method and equals method
    // is NOT
    // overridden in StringBuilder class. You can explicitly override the method in your custom
    // classes
    /*
    by default, two string builder objects are equal if their object references point to te same object
     */
    System.out.println(list1);

    ArrayList<Person> personArrayList = new ArrayList<>();
    Person person1 = new Person("summer");
    Person person2 = new Person("winter");
    Person person3 = new Person("spring");
    personArrayList.add(person1);
    personArrayList.add(person2);
    personArrayList.add(person3);

    System.out.println(personArrayList);

    personArrayList.remove(new Person("summer"));

    System.out.println(personArrayList);
  }
}
