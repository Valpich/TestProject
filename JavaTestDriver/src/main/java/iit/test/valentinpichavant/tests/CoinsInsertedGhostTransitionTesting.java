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
 * The Class CoinsInsertedGhostTransitionTesting.
 */
public class CoinsInsertedGhostTransitionTesting {

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
    assertNotNull(this.vendingMachine = new VendingMachine());
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(2), 1);
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(2), 1);
    // T4
    assertEquals(this.vendingMachine.set_price(50), 1);
    // T6
    assertEquals(this.vendingMachine.coin(), 1);
    // T7
    assertEquals(this.vendingMachine.coin(), 1);
  }

  /**
   * Test 45.
   */
  @Test(priority = 45)
  public void test45() {
    assertEquals(this.vendingMachine.tea(), 0);
    assertEquals(this.vendingMachine.insert_large_cups(-1), 0);
    assertEquals(this.vendingMachine.insert_small_cups(-1), 0);
    assertEquals(this.vendingMachine.set_price(-1), 0);
    assertEquals(this.vendingMachine.insert_large_cups(1), 0);
    assertEquals(this.vendingMachine.insert_small_cups(1), 0);
    assertEquals(this.vendingMachine.set_price(1), 0);
    assertEquals(this.vendingMachine.dispose(), 0);
    assertEquals(this.vendingMachine.cancel(), 1);
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
