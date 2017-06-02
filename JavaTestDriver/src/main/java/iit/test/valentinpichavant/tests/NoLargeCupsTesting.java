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
 * The Class NoLargeCupsTesting.
 */
public class NoLargeCupsTesting {


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
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P8
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P14
    // T4
    assertEquals(this.vendingMachine.set_price(50), 1);// P23
    // T6
    assertEquals(this.vendingMachine.coin(), 1);// P30
    // T7
    assertEquals(this.vendingMachine.coin(), 1);
  }

  /**
   * Test 28.
   */
  @Test(priority = 28)
  public void test28() {
    // T7 is the last transition due to the setUp()
    // P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P93
    // T24
    assertEquals(this.vendingMachine.tea(), 1);// P161
    // T8
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P35
    // T6
    assertEquals(this.vendingMachine.coin(), 1);// P28
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 29.
   */
  @Test(priority = 29)
  public void test29() {
    // T7 is the last transition due to the setUp()
    // P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P93
    // T24
    assertEquals(this.vendingMachine.tea(), 1);// P162
    // T29
    assertEquals(this.vendingMachine.coin(), 1);// P166
    // T29
    assertEquals(this.vendingMachine.coin(), 1);// P165
    // T8
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P32
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P16
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 30.
   */
  @Test(priority = 30)
  public void test30() {
    // T7 is the last transition due to the setUp()
    // P
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P92
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P153
    // T26
    assertEquals(this.vendingMachine.tea(), 1);// P163
    // T8
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P31
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P10
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }


  /**
   * Test 31.
   */
  @Test(priority = 31)
  public void test31() {
    // T7 is the last transition due to the setUp()
    // P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P150
    // T18
    assertEquals(this.vendingMachine.large_cup(), 1);// P144
    // T26
    assertEquals(this.vendingMachine.tea(), 1);// P164
    // T29
    assertEquals(this.vendingMachine.coin(), 1);// P166
    // T29
    assertEquals(this.vendingMachine.coin(), 1);// P165
    // T8
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P33
    // T4
    assertEquals(this.vendingMachine.set_price(25), 1);// P22
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
