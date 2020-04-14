package polymorphismDemos;

public class Demo2 {
  public static void main(String[] args) {
      Employees emp = new Employees();
      Employees programmer = new Programmers();
      System.out.println(emp.name);
      System.out.println(programmer.name);
      emp.printName();
      programmer.printName();
  }
}
class Employees {
    String name = "Employee";
    void printName() {
        System.out.println(name);
    }
}

class Programmers extends Employees {
    String name = "Programmer";
    void printName() {
        System.out.println(name);
    }
}
