package mavenTestNGHomework;

import classroomSix.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CalculatorTest {
    public class CalculatorTestHomework {

        public void pirmsTesta() {
            System.out.println("Sākas tests!");
        }

        @AfterMethod
        public void pecTesta() {
            System.out.println("Beidzas tests!");
        }

        @Test
        public void testSum() {
            System.out.println("Saskaitīšana.");
            Calculator calculator = new Calculator();
            int actualResult = calculator.addition(15, 5);
            int expectedResult = 20;
            Assert.assertEquals(actualResult, expectedResult);
        }

        @AfterTest
        public void pecTestaViens() {
            System.out.println("Šī bija saskaitīšana.");
        }

        @Test
        public void testSubtraction() {
            System.out.println("Atņemšana.");
            Calculator calculator = new Calculator();
            int actualResult = calculator.subtraction(15, 5);
            int expectedResult = 10;
            Assert.assertEquals(actualResult, expectedResult);
        }
        @AfterTest
        public void pecPirmaTesta() {
            System.out.println("Šī bija atņemšana.");
        }

        @Test
        public void testMultiply() {
            System.out.println("Reizināšana.");
            Calculator calculator = new Calculator();
            int actualResult = calculator.multiply(15, 3);
            int expectedResult = 45;
            Assert.assertEquals(actualResult, expectedResult);
        }

        @AfterTest
        public void pecTestaDivi() {
            System.out.println("Šī bija reizināšana!");
        }

        @Test
        public void testDivision() {
            System.out.println("Dalīšana.");
            Calculator calculator = new Calculator();
            float actualResult = calculator.divide(15, 3);
            float expectedResult = 5;
            Assert.assertEquals(actualResult, expectedResult);
        }

        @AfterTest
        public void pecTestaTris() {
            System.out.println("Šī bija dalīšana!");
        }

        @AfterSuite
        public void pecTestiem() {
            System.out.println("Kalkulatora testa beigas.");
        }
    }
}
