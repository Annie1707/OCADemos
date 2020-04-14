package polymorphismDemos;

public class Demo3 {
  public static void main(String[] args) {
      MobileAppExpert expert1 = new Programmer1();
      MobileAppExpert expert2 = new Manager1();
      expert1.deliverMobileApp();
      expert2.deliverMobileApp();
  }
}

interface MobileAppExpert {
    void deliverMobileApp();
}
class Employee1 {}
class Programmer1 extends Employee1 implements MobileAppExpert {
    public void deliverMobileApp() {
        System.out.println("testing complete on real device");
    }
}
class Manager1 extends Employee1 implements MobileAppExpert {
    public void deliverMobileApp() {
        System.out.println("QA complete");
        System.out.println("code delivered with release notes");
    }
}
