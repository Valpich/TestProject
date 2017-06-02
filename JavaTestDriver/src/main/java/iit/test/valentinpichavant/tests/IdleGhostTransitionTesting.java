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
 * The Class IdleGhostTransitionTesting.
 */
public class IdleGhostTransitionTesting {

  /** The vending machine. */
  VendingMachine vendingMachine;

  /**
   * Before class.
   */
  @BeforeClass
  public void beforeClass() {}

  /**
   * Test 44.
   */
  @Test(priority = 44)
  public void test44() {
    assertNotNull(this.vendingMachine = new VendingMachine());
    assertEquals(this.vendingMachine.small_cup(), 0);
    assertEquals(this.vendingMachine.large_cup(), 0);
    assertEquals(this.vendingMachine.sugar(), 0);
    assertEquals(this.vendingMachine.tea(), 0);
    assertEquals(this.vendingMachine.insert_large_cups(0), 0);
    assertEquals(this.vendingMachine.insert_small_cups(0), 0);
    assertEquals(this.vendingMachine.set_price(0), 0);
    assertEquals(this.vendingMachine.cancel(), 0);
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
