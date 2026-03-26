import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class PracticeProblemTest {

   // ─────────────────────────────────────────────
   // min() Tests
   // ─────────────────────────────────────────────

   @Test
   @DisplayName("min() - first argument is smallest")
   void minTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int.class, int.class };
         Method method = testClass.getDeclaredMethod("min", cArg);
         assertEquals(1, (int) method.invoke(null, 1, 5, 9));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("min() - second argument is smallest")
   void minTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int.class, int.class };
         Method method = testClass.getDeclaredMethod("min", cArg);
         assertEquals(2, (int) method.invoke(null, 7, 2, 8));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("min() - third argument is smallest")
   void minTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int.class, int.class };
         Method method = testClass.getDeclaredMethod("min", cArg);
         assertEquals(3, (int) method.invoke(null, 10, 8, 3));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("min() - all arguments are equal")
   void minTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int.class, int.class };
         Method method = testClass.getDeclaredMethod("min", cArg);
         assertEquals(5, (int) method.invoke(null, 5, 5, 5));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("min() - negative numbers")
   void minTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int.class, int.class };
         Method method = testClass.getDeclaredMethod("min", cArg);
         assertEquals(-10, (int) method.invoke(null, -10, -3, 0));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("min() - two arguments are equal and smallest")
   void minTest6() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int.class, int.class };
         Method method = testClass.getDeclaredMethod("min", cArg);
         assertEquals(4, (int) method.invoke(null, 4, 4, 9));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   // ─────────────────────────────────────────────
   // isLeapYear() Tests
   // ─────────────────────────────────────────────

   @Test
   @DisplayName("isLeapYear() - divisible by 4 but not 100 (leap year)")
   void isLeapYearTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
         assertEquals(true, (boolean) method.invoke(null, 2024));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isLeapYear() - not divisible by 4 (not a leap year)")
   void isLeapYearTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
         assertEquals(false, (boolean) method.invoke(null, 2023));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isLeapYear() - divisible by 100 but not 400 (not a leap year)")
   void isLeapYearTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
         assertEquals(false, (boolean) method.invoke(null, 1900));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isLeapYear() - divisible by 400 (leap year)")
   void isLeapYearTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
         assertEquals(true, (boolean) method.invoke(null, 2000));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isLeapYear() - divisible by 4 and 100 but not 400 (not a leap year)")
   void isLeapYearTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
         assertEquals(false, (boolean) method.invoke(null, 1800));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isLeapYear() - another standard non-leap year")
   void isLeapYearTest6() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
         assertEquals(false, (boolean) method.invoke(null, 2001));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isLeapYear() - another divisible by 400 leap year")
   void isLeapYearTest7() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
         assertEquals(true, (boolean) method.invoke(null, 1600));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isLeapYear() - year 0 (divisible by 400, leap year)")
   void isLeapYearTest8() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
         assertEquals(true, (boolean) method.invoke(null, 0));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }
}