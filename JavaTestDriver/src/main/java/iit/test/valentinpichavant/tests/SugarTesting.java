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
 * The Class SugarTesting.
 */
public class SugarTesting {


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
   * Test 12.
   */
  @Test(priority = 12)
  public void test12() {
    // T7 is the last transition due to the setUp()
    // P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P108
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P148
    // T15
    assertEquals(this.vendingMachine.tea(), 1);// P76
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 13.
   */
  @Test(priority = 13)
  public void test13() {
    // T7 is the last transition due to the setUp()
    // P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P108
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P149
    // T16
    assertEquals(this.vendingMachine.coin(), 1);// P122
    // T16
    assertEquals(this.vendingMachine.coin(), 1);// P121
    // T15
    assertEquals(this.vendingMachine.tea(), 1);// P73
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P10
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 14.
   */
  @Test(priority = 14)
  public void test14() {
    // T7 is the last transition due to the setUp()
    // P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P108
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P150
    // T17
    assertEquals(this.vendingMachine.small_cup(), 1);// P132
    // T17
    assertEquals(this.vendingMachine.small_cup(), 1);// P130
    // T15
    assertEquals(this.vendingMachine.tea(), 1);// P74
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P16
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 15.
   */
  @Test(priority = 15)
  public void test15() {
    // T7 is the last transition due to the setUp()
    // P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P108
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P151
    // T18
    assertEquals(this.vendingMachine.large_cup(), 1);// P142
    // T18
    assertEquals(this.vendingMachine.large_cup(), 1);// P141
    // T17
    assertEquals(this.vendingMachine.small_cup(), 1);// P130
    // T15
    assertEquals(this.vendingMachine.tea(), 1);// P77
    // T6
    assertEquals(this.vendingMachine.coin(), 1);// P28
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 16.
   */
  @Test(priority = 16)
  public void test16() {
    // T7 is the last transition due to the setUp()
    // P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P108
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P138
    // T15
    assertEquals(this.vendingMachine.tea(), 1);// P75
    // T4
    assertEquals(this.vendingMachine.set_price(25), 1);// P22
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 17.
   */
  @Test(priority = 17)
  public void test17() {
    // T7 is the last transition due to the setUp()
    // P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P147
    // T14
    assertEquals(this.vendingMachine.cancel(), 1);// P60
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 18.
   */
  @Test(priority = 18)
  public void test18() {
    // T7 is the last transition due to the setUp()
    // P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P147
    // T14
    assertEquals(this.vendingMachine.cancel(), 1);// P67
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P10
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 19.
   */
  @Test(priority = 19)
  public void test19() {
    // T7 is the last transition due to the setUp()
    // P
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P147
    // T14
    assertEquals(this.vendingMachine.cancel(), 1);// P68
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P16
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 20.
   */
  @Test(priority = 20)
  public void test20() {
    // T7 is the last transition due to the setUp()
    // P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P147
    // T14
    assertEquals(this.vendingMachine.cancel(), 1);// P71
    // T6
    assertEquals(this.vendingMachine.coin(), 1);// P28
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 21.
   */
  @Test(priority = 21)
  public void test21() {
    // T7 is the last transition due to the setUp()
    // P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P147
    // T14
    assertEquals(this.vendingMachine.cancel(), 1);// P69
    // T4
    assertEquals(this.vendingMachine.set_price(25), 1);// P22
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 22.
   */
  @Test(priority = 22)
  public void test22() {
    // T7 is the last transition due to the setUp()
    // P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P92
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P153
    // T13
    assertEquals(this.vendingMachine.tea(), 1);// P64
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 23.
   */
  @Test(priority = 23)
  public void test23() {
    // T7 is the last transition due to the setUp()
    // P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P92
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P146
    // T13
    assertEquals(this.vendingMachine.tea(), 1);// P61
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(2), 1);// P10
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 24.
   */
  @Test(priority = 24)
  public void test24() {
    // T7 is the last transition due to the setUp()
    // P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P92
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P146
    // T13
    assertEquals(this.vendingMachine.tea(), 1);// P62
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(2), 1);// P16
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 25.
   */
  @Test(priority = 25)
  public void test25() {
    // T7 is the last transition due to the setUp()
    // P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P92
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P146
    // T13
    assertEquals(this.vendingMachine.tea(), 1);// P63
    // T4
    assertEquals(this.vendingMachine.set_price(25), 1);// P22
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 26.
   */
  @Test(priority = 26)
  public void test26() {
    // T7 is the last transition due to the setUp()
    // P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P92
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P146
    // T13
    assertEquals(this.vendingMachine.tea(), 1);// P65
    // T6
    assertEquals(this.vendingMachine.coin(), 1);// P28
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 27.
   */
  @Test(priority = 27)
  public void test27() {
    // T7 is the last transition due to the setUp()
    // P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P92
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P149
    // T16
    assertEquals(this.vendingMachine.coin(), 1);// P123
    // T17
    assertEquals(this.vendingMachine.small_cup(), 1);// P131
    // T16
    assertEquals(this.vendingMachine.coin(), 1);// P124
    // T18
    assertEquals(this.vendingMachine.large_cup(), 1);// P140
    // T16
    assertEquals(this.vendingMachine.coin(), 1);// P125
    // T23
    assertEquals(this.vendingMachine.sugar(), 1);// P116
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P149
    // T16
    assertEquals(this.vendingMachine.coin(), 1);// P120
    // T14
    assertEquals(this.vendingMachine.cancel(), 1);// P60
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
