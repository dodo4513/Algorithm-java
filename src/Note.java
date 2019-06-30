import java.util.ArrayList;
import java.util.List;

/**
 * @author doyoung hwang on 2019-06-12
 */
public class Note {

  public static void main(String args[]) {

    List A = new ArrayList();
    A.add("2");
    A.get(1);

  }



  abstract class A {
    int a;

    abstract void log();
  }


  class B extends A {

    @Override
    void log() {

    }
  }

  class C {
    A a = new B();
  }
}
