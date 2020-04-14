package usingThisAndSuper;

public class Demo3 {
  public static void main(String[] args) {
      Programmer programmer = new Programmer();
      Programmer programmer1 = new Programmer("anushi","indore","java");
      programmer.setNames();
      programmer.printNames();
        programmer1.printResults();
  }
}

class Employees {
    String name;
    String address;
    Employees(){

    }
    Employees(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
class Programmer extends Employees {
    String name;
    String progLanguage;

    Programmer(){

    }

    Programmer(String name, String address, String progLang) {
        super(name, address);
        this.progLanguage = progLang;
    }

    void printResults(){
    System.out.println(super.name+super.address+progLanguage);
    }
    //can't use super in static methods
    void setNames() {
        this.name = "Programmer";
        super.name = "Employee";
    }
    void printNames() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
