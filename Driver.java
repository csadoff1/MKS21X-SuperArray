public class Driver {
  public static void main(String args[]) {
    SuperArray A = new SuperArray();
    System.out.println(A.add("hey"));
    System.out.println(A.add("there"));
    System.out.println(A.add("how"));
    System.out.println(A.add("are"));
    System.out.println(A.add("you"));
    System.out.println(A.add("?"));
    System.out.println("Printing A, should see [hey there how are you?] " + A);
    System.out.println("Adding a new value, should be true: " + A.add("goodbye"));

  }
}
