// Let's go to the next level! `if` statements

public class Main {
  public static void main(String[] args) {
    // Same with other languages, Java follows the common comparison operators
    System.out.println(20 == 20); // true
    System.out.println(2 >= 20); // false
    System.out.println(2 <= 20); // true
    System.out.println(20 != 20); // false
  

    int i = 20;

    // Java doesn't check whether a variable has value or not, or even if
    // the value could be interpreted to be `true` unlike loosy typed languages
    // like Python.
    // 
    //    String.valueOf(20) -> "20"
    //    Boolean.valueof("20") -> false
    //
    // Modify the condition so that we could identify whether `i` could be 
    // considered `truthy`
    if (i) {
      System.out.println("`i` is truthy");
    }
  }
}
