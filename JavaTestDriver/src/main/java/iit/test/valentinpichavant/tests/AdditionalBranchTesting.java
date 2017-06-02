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
 * The Class AdditionalBranchTesting.
 */
public class AdditionalBranchTesting {

  /** The vending machine. */
  VendingMachine vendingMachine;

  /**
   * Before class.
   */
  @BeforeClass
  public void beforeClass() {}

  /**
   * Test 49.
   */
  @Test(priority = 49)
  public void test49() {
    assertNotNull(this.vendingMachine = new VendingMachine());
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);
    assertEquals(this.vendingMachine.set_price(25), 1);
    assertEquals(this.vendingMachine.coin(), 1);
    assertEquals(this.vendingMachine.large_cup(), 1);
    assertEquals(this.vendingMachine.tea(), 0);
    assertEquals(this.vendingMachine.cancel(), 1);
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 50.
   */
  @Test(priority = 50)
  public void test50() {
    assertNotNull(this.vendingMachine = new VendingMachine());
    assertEquals(this.vendingMachine.insert_large_cups(2), 1);
    assertEquals(this.vendingMachine.set_price(25), 1);
    assertEquals(this.vendingMachine.coin(), 1);
    assertEquals(this.vendingMachine.small_cup(), 1);
    assertEquals(this.vendingMachine.sugar(), 1);
    assertEquals(this.vendingMachine.tea(), 0);
    assertEquals(this.vendingMachine.cancel(), 1);
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 51.
   */
  @Test(priority = 51)
  public void test51() {
    assertNotNull(this.vendingMachine = new VendingMachine());
    assertEquals(this.vendingMachine.set_price(25), 1);
    assertEquals(this.vendingMachine.coin(), 1);
    assertEquals(this.vendingMachine.sugar(), 1);
    assertEquals(this.vendingMachine.small_cup(), 1);
    assertEquals(this.vendingMachine.tea(), 0);
    assertEquals(this.vendingMachine.large_cup(), 1);
    assertEquals(this.vendingMachine.tea(), 0);
    assertEquals(this.vendingMachine.insert_large_cups(2), 0);
    assertEquals(this.vendingMachine.coin(), 1);
    assertEquals(this.vendingMachine.sugar(), 1);
    assertEquals(this.vendingMachine.small_cup(), 1);
    assertEquals(this.vendingMachine.tea(), 0);
    assertEquals(this.vendingMachine.cancel(), 1);
    assertEquals(this.vendingMachine.dispose(), 1);
  }
 
  /**
   * Test 53.
   */
  @Test(priority = 53)
  public void test53() {
    assertNotNull(this.vendingMachine = new VendingMachine());
    assertEquals(this.vendingMachine.set_price(25), 1);
    assertEquals(this.vendingMachine.coin(), 1);
    assertEquals(this.vendingMachine.tea(), 0);
    assertEquals(this.vendingMachine.small_cup(), 1);
    assertEquals(this.vendingMachine.tea(), 0);
    assertEquals(this.vendingMachine.large_cup(), 1);
    assertEquals(this.vendingMachine.tea(), 0);
    assertEquals(this.vendingMachine.cancel(), 1);
    assertEquals(this.vendingMachine.dispose(), 1);
  }
  
  /**
   * Test 54.
   */
  @Test(priority = 54)
  public void test54() {
    assertNotNull(this.vendingMachine = new VendingMachine());
    assertEquals(this.vendingMachine.set_price(25), 1);
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);
    assertEquals(this.vendingMachine.coin(), 1);
    assertEquals(this.vendingMachine.tea(), 0);
    assertEquals(this.vendingMachine.cancel(), 1);
    assertEquals(this.vendingMachine.dispose(), 1);
  }
  
  /**
   * Test 55.
   */
  @Test(priority = 55)
  public void test55() {
    assertNotNull(this.vendingMachine = new VendingMachine());
    assertEquals(this.vendingMachine.set_price(25), 1);
    assertEquals(this.vendingMachine.insert_large_cups(25), 1);
    assertEquals(this.vendingMachine.insert_small_cups(25), 1);
    assertEquals(this.vendingMachine.coin(), 1);
    assertEquals(this.vendingMachine.tea(), 0);
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
