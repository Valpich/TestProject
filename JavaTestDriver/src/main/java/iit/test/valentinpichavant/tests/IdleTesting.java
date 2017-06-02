package iit.test.valentinpichavant.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import iit.test.valentinpichavant.VendingMachine;

/**
 * The Class IdleTesting.
 */
public class IdleTesting {

  /**
   * Before class.
   */
  @BeforeClass
  public void beforeClass() {}

  /**
   * Test 1.
   */
  @Test(priority = 1)
  public void test1() {
    VendingMachine vendingMachine;
    // T1
    assertNotNull(vendingMachine = new VendingMachine());// P1
    // T2
    assertEquals(vendingMachine.insert_large_cups(2), 1);// P8
    // T3
    assertEquals(vendingMachine.insert_small_cups(3), 1);// P14
    // T3
    assertEquals(vendingMachine.insert_small_cups(3), 1);// P15
    // T4
    assertEquals(vendingMachine.set_price(25), 1);// P19
    // T2
    assertEquals(vendingMachine.insert_large_cups(2), 1);// P7
    // T2
    assertEquals(vendingMachine.insert_large_cups(2), 1);// P9
    // T4
    assertEquals(vendingMachine.set_price(25), 1);// P22
    // T5
    assertEquals(vendingMachine.dispose(), 1);
  }

  /**
   * Test 2.
   */
  @Test(priority = 2)
  public void test2() {
    VendingMachine vendingMachine;
    // T1
    assertNotNull(vendingMachine = new VendingMachine());// P2
    // T3
    assertEquals(vendingMachine.insert_small_cups(3), 1);// P15
    // T4
    assertEquals(vendingMachine.set_price(100), 1);// P23
    // T6
    assertEquals(vendingMachine.coin(), 1);// P28
    // T5
    assertEquals(vendingMachine.dispose(), 1);
  }

  /**
   * Test 3.
   */
  @Test(priority = 3)
  public void test3() {
    VendingMachine vendingMachine;
    // T1
    assertNotNull(vendingMachine = new VendingMachine());// P4
    // T5
    assertEquals(vendingMachine.dispose(), 1);
  }

  /**
   * Test 4.
   */
  @Test(priority = 4)
  public void test4() {
    VendingMachine vendingMachine;
    // T1
    assertNotNull(vendingMachine = new VendingMachine());// P3
    // T4
    assertEquals(vendingMachine.set_price(100), 1);// P21
    // T4
    assertEquals(vendingMachine.set_price(75), 1);// P20
    // T3
    assertEquals(vendingMachine.insert_small_cups(3), 1);// P13
    // T2
    assertEquals(vendingMachine.insert_large_cups(2), 1); // P11
    // T6
    assertEquals(vendingMachine.coin(), 1);// P26
    // T3
    assertEquals(vendingMachine.insert_small_cups(3), 1);// P17
    // T6
    assertEquals(vendingMachine.coin(), 1);// P27
    // T4
    assertEquals(vendingMachine.set_price(100), 1);// P19
    // T2
    assertEquals(vendingMachine.insert_large_cups(2), 1); // P10
    // T5
    assertEquals(vendingMachine.dispose(), 1);
  }

  /**
   * Test 5.
   */
  @Test(priority = 5)
  public void test5() {
    VendingMachine vendingMachine;
    // T1
    assertNotNull(vendingMachine = new VendingMachine());// P1
    // T2
    assertEquals(vendingMachine.insert_large_cups(2), 1); // P8
    // T3
    assertEquals(vendingMachine.insert_small_cups(3), 1);// P16
    // T5
    assertEquals(vendingMachine.dispose(), 1);
  }

  /**
   * Test 6.
   */
  @Test(priority = 6)
  public void test6() {
    VendingMachine vendingMachine;
    // T1
    assertNotNull(vendingMachine = new VendingMachine());// P3
    // T4
    assertEquals(vendingMachine.set_price(100), 1);// P23
    // T6
    assertEquals(vendingMachine.coin(), 1);// P29
    // T6
    assertEquals(vendingMachine.coin(), 1);// P25
    // T2
    assertEquals(vendingMachine.insert_large_cups(2), 1); // P10
    // T5
    assertEquals(vendingMachine.dispose(), 1);
  }

  /**
   * Tear down.
   *
   * @param result the result
   */
  @AfterMethod
  public void tearDown(ITestResult result) {
    if (result.getStatus() == ITestResult.FAILURE) {
      System.out.println("The " + result.getName() + " has failed!");
    }
    if (result.getStatus() == ITestResult.SUCCESS) {
      System.out.println("The " + result.getName() + " passed!");
    }
    if (result.getStatus() == ITestResult.SKIP) {
      System.out.println("The " + result.getName() + " has been skipped!");
    }
  }

  /**
   * After class.
   */
  @AfterClass
  public void afterClass() {}
}
