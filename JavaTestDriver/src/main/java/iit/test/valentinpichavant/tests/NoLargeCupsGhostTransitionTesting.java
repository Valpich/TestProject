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
 * The Class NoLargeCupsGhostTransitionTesting.
 */
public class NoLargeCupsGhostTransitionTesting {

  /** The vending machine. */
  VendingMachine vendingMachine;

  /**
   * Before class.
   */
  @BeforeClass
  public void beforeClass() {}

  /**
   * Executed before each method be directly after reaching state No Large Cups
   */
  @BeforeMethod
  public void setUp() {
    // T1
    assertNotNull(this.vendingMachine = new VendingMachine());
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);
    // T4
    assertEquals(this.vendingMachine.set_price(50), 1);
    // T6
    assertEquals(this.vendingMachine.coin(), 1);
    // T7
    assertEquals(this.vendingMachine.coin(), 1);
    // T21
    assertEquals(this.vendingMachine.large_cup(), 1);
    // T24
    assertEquals(this.vendingMachine.tea(), 1);
  }

  /**
   * Test 48.
   */
  @Test(priority = 48)
  public void test48() {
    assertEquals(this.vendingMachine.small_cup(), 0);
    assertEquals(this.vendingMachine.large_cup(), 0);
    assertEquals(this.vendingMachine.sugar(), 0);
    assertEquals(this.vendingMachine.tea(), 0);
    assertEquals(this.vendingMachine.insert_large_cups(-1), 0);
    assertEquals(this.vendingMachine.insert_small_cups(-1), 0);
    assertEquals(this.vendingMachine.set_price(-1), 0);
    assertEquals(this.vendingMachine.insert_small_cups(1), 0);
    assertEquals(this.vendingMachine.set_price(1), 0);
    assertEquals(this.vendingMachine.cancel(), 0);
    assertEquals(this.vendingMachine.dispose(), 0);
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);
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
