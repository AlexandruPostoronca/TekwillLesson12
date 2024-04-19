public class Main {
   public static void main(String[] args) {
      // Write your solution
      class A {

         public A method1() { return new A(); }

         public B method2() { return new B(); }

         public A method3(A a) { return a; }

         public B method4() { return new B(); }

      }

      class B extends A {

         @Override
         public B method1() { return new B(); }

         @Override
         public B method2() { return new B(); }

         public A method3(A a) { return a; }

         public A method4() { return new A(); }
      }
   }
}