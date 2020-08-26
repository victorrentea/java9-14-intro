package victor.training;

// -XX:+ShowCodeDetailsInExceptionMessages
public class NPE {
   public static void main(String[] args) {
      output(new A(new B(new C("Halo"))));
      output(new A(new B(null)));
   }

   private static void output(A a) {
      // You, here

      System.out.println(a.getB().getC().getS().toUpperCase());
   }
}
class A {
   private final B b;

   public A(B b) {
      this.b = b;
   }

   public B getB() {
      return b;
   }
}
class B {
   private final C c;

   public B(C c) {
      this.c = c;
   }

   public C getC() {
      return c;
   }
}
class C {
   private final String s;

   public C(String s) {
      this.s = s;
   }

   public String getS() {
      return s;
   }
}