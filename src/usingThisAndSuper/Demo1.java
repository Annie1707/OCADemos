package usingThisAndSuper;

public class Demo1 extends Employees {
    void accessEmployeeVariables() {
        name = "Programmer";
    System.out.println(name);
    }

    void accessEmployeeVariablesWithThis() {
        this.name = "Programmer";
    System.out.println(name);
    }

  public static void main(String[] args) {
        Employee employee = new Employee();
    System.out.println(employee);
    Employee employee1 = new Employee("anushi");
    System.out.println(employee1);
    Employee employee2 = new Employee("anushi","indore");
    System.out.println(employee2);

    Demo1 demo1 = new Demo1();
    demo1.accessEmployeeVariables();
    demo1.accessEmployeeVariablesWithThis();
  }
}

class Employee {
    String name;
    String address;

    Employee() {
        name = "NoName";
        address = "NoAddress";
    }

    Employee(String name) {
        this.name = name;
    }
    Employee(String name, String address) {
        this(name);
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
