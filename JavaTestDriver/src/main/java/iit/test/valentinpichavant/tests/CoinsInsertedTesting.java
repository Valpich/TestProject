package iit.test.valentinpichavant.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import iit.test.valentinpichavant.VendingMachine;

/**
 * The Class CoinsInsertedTesting.
 */
public class CoinsInsertedTesting {

  /** The vending machine. */
  VendingMachine vendingMachine;

  /**
   * Before class.
   */
  @BeforeClass
  public void beforeClass() {}

  /**
   * Executed before each method be directly after reaching state Coin Inserted.
   */
  @BeforeMethod
  public void setUp() {
    // T1
    assertNotNull(this.vendingMachine = new VendingMachine());// P1
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(2), 1);// P8
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(2), 1);// P14
    // T4
    assertEquals(this.vendingMachine.set_price(50), 1);// P23
    // T6
    assertEquals(this.vendingMachine.coin(), 1);// P30
    // T7
    assertEquals(this.vendingMachine.coin(), 1);
  }

  /**
   * Test 7.
   */
  @Test(priority = 7)
  public void test7() {
    // T7 is the last transition due to the setUp()
    // P79
    // T10
    assertEquals(this.vendingMachine.cancel(), 1);// P46
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 8.
   */
  @Test(priority = 8)
  public void test8() {
    // T7 is the last transition due to the setUp()
    // P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P89
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P168
    // T12
    assertEquals(this.vendingMachine.tea(), 1);// P59
    // T6
    assertEquals(this.vendingMachine.coin(), 1);// P30
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P93
    // T24
    assertEquals(this.vendingMachine.tea(), 1);// P161
    // T8
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P34
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 9.
   */
  @Test(priority = 9)
  public void test9() {
    // T7 is the last transition due to the setUp()
    // P82
    // T20
    assertEquals(this.vendingMachine.coin(), 1);// P98
    // T20
    assertEquals(this.vendingMachine.coin(), 1);// P99
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P108
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P152
    // T23
    assertEquals(this.vendingMachine.sugar(), 1);// P114
    // T20
    assertEquals(this.vendingMachine.coin(), 1);// P100
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P152
    // T23
    assertEquals(this.vendingMachine.sugar(), 1);// P115
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P108
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P152
    // T23
    assertEquals(this.vendingMachine.sugar(), 1);// P113
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P92
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P152
    // T23
    assertEquals(this.vendingMachine.sugar(), 1);// P116
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P152
    // T23
    assertEquals(this.vendingMachine.sugar(), 1);// P171
    // T12
    assertEquals(this.vendingMachine.tea(), 1);// P58
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 10.
   */
  @Test(priority = 10)
  public void test10() {
    // T7 is the last transition due to the setUp()
    // P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P107
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P108
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P152
    // T23
    assertEquals(this.vendingMachine.sugar(), 1);// P111
    // T10
    assertEquals(this.vendingMachine.cancel(), 1);// P47
    // T6
    assertEquals(this.vendingMachine.coin(), 1);// P30
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P150
    // T17
    assertEquals(this.vendingMachine.small_cup(), 1);// P134
    // T23
    assertEquals(this.vendingMachine.sugar(), 1);// P112
    // T11
    assertEquals(this.vendingMachine.tea(), 1);// P52
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 11.
   */
  @Test(priority = 11)
  public void test11() {
    // T7 is the last transition due to the setUp()
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P106
    // T20
    assertEquals(this.vendingMachine.coin(), 1);// P97
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P91
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P105
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P90
    // T20
    assertEquals(this.vendingMachine.coin(), 1);// P95
    // T10
    assertEquals(this.vendingMachine.cancel(), 1);// P45
    // T4
    assertEquals(this.vendingMachine.set_price(25), 1);// P24
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P91
    // T10
    assertEquals(this.vendingMachine.cancel(), 1);// P44
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P16
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
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
