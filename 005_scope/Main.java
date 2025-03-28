// In Java, `{}` are used to scope variables.
// Meaning a variable declared in a scope could only be access in that region.
//
//   public static void main(String[] args) {
//      {
//        int num = 10;
//
//        System.out.println("num = " + num);
//      }
//    }
//
//
//

public class Main {
  public static void main(String[] args) {
    {
      int num = 10;

      System.out.println("num = " + num);
    }
  }
}