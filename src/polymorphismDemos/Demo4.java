package polymorphismDemos;

public class Demo4 implements BaseInterface1, BaseInterface2, MyInterface{
  public static void main(String[] args) {
      Interviewer interviewer = new Manager2();
      interviewer.submitInterviewStatus();
      Manager2 mgr = new Manager2();
      mgr.submitInterviewStatus();

      new Demo4().getName();
  }
}

interface Interviewer {
    default Object submitInterviewStatus() {
        System.out.println("Interviewer:Accept");
        return null;
    }
}
class Manager2 implements Interviewer {
    public String submitInterviewStatus() {
        System.out.println("Manager:Accept");
        return null;
    }
}

interface BaseInterface1 {
    default void getName() { System.out.println("Base 1"); }
}
interface BaseInterface2 {
    default void getName() { System.out.println("Base 2"); }
}
interface MyInterface extends BaseInterface1, BaseInterface2 {
    default void getName() { System.out.println("Just me"); }
}
