package usingThisAndSuper;

public class Demo2 {
  public static void main(String[] args) {
      Interviewer m = new Manager();
      m.submitInterviewStatus();
  }
}

interface Interviewer {
    int MIN_SAL = 9999;
    default void submitInterviewStatus() {
        System.out.println(this);
        System.out.println(this.MIN_SAL);
        System.out.println(this.print());
    }
    String print();
}
class Manager implements Interviewer {
    public String print() {
        return("I am " + this);
    }

    @Override
    public String toString() {
        return "Manager";
    }
}