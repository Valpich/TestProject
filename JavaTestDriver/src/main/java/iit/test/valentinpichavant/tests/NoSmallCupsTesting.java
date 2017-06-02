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
 * The Class NoSmallCupsTesting.
 */
public class NoSmallCupsTesting {


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
   * Test 32.
   */
  @Test(priority = 32)
  public void test32() {
    // T7 is the last transition due to the setUp()
    // P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P110
    // T25
    assertEquals(this.vendingMachine.tea(), 1);// P155
    // T9
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P40
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 33.
   */
  @Test(priority = 33)
  public void test33() {
    // T7 is the last transition due to the setUp()
    // P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P110
    // T25
    assertEquals(this.vendingMachine.tea(), 1);// P156
    // T28
    assertEquals(this.vendingMachine.coin(), 1);// P160
    // T28
    assertEquals(this.vendingMachine.coin(), 1);// P159
    // T9
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P37
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P10
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 34.
   */
  @Test(priority = 34)
  public void test34() {
    // T7 is the last transition due to the setUp()
    // P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P107
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P154
    // T27
    assertEquals(this.vendingMachine.tea(), 1);// P157
    // T9
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P38
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P16
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }


  /**
   * Test 35.
   */
  @Test(priority = 35)
  public void test35() {
    // T7 is the last transition due to the setUp()
    // P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P150
    // T17
    assertEquals(this.vendingMachine.small_cup(), 1);// P136
    // T27
    assertEquals(this.vendingMachine.tea(), 1);// P158
    // T28
    assertEquals(this.vendingMachine.coin(), 1);// P160
    // T28
    assertEquals(this.vendingMachine.coin(), 1);// P159
    // T9
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P39
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
