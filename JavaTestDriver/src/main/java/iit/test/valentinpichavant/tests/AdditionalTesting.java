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
 * The Class AdditionalTesting.
 */
public class AdditionalTesting {

  /** The vending machine. */
  VendingMachine vendingMachine;

  /**
   * Before class.
   */
  @BeforeClass
  public void beforeClass() {}

  /**
   * Test 36.
   */
  @Test(priority = 36)
  public void test36() {
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
    assertEquals(this.vendingMachine.coin(), 1);// P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P104
    // T11
    assertEquals(this.vendingMachine.tea(), 1);// P49
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P11
    // T6
    assertEquals(this.vendingMachine.coin(), 1);// P30
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P108
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P154
    // T27
    assertEquals(this.vendingMachine.tea(), 1);// P157
    // T9
    assertEquals(this.vendingMachine.insert_small_cups(2), 1);// P40
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 37.
   */
  @Test(priority = 37)
  public void test37() {
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
    assertEquals(this.vendingMachine.coin(), 1);// P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P104
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P149
    // T16
    assertEquals(this.vendingMachine.coin(), 1);// P127
    // T27
    assertEquals(this.vendingMachine.tea(), 1);// P157
    // T9
    assertEquals(this.vendingMachine.insert_small_cups(2), 1);// P41
    // T6
    assertEquals(this.vendingMachine.coin(), 1);// P30
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P92
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P149
    // T16
    assertEquals(this.vendingMachine.coin(), 1);// P126
    // T26
    assertEquals(this.vendingMachine.tea(), 1);// P163
    // T8
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P34
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 38.
   */
  @Test(priority = 38)
  public void test38() {
    // T1
    assertNotNull(this.vendingMachine = new VendingMachine());// P1
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(2), 1);// P8
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P14
    // T4
    assertEquals(this.vendingMachine.set_price(25), 1);// P23
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P110
    // T25
    assertEquals(this.vendingMachine.tea(), 1);// P155
    // T9
    assertEquals(this.vendingMachine.insert_small_cups(2), 1);// P42
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P93
    // T24
    assertEquals(this.vendingMachine.tea(), 1);// P161
    // T8
    assertEquals(this.vendingMachine.insert_large_cups(3), 1);// P36
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P106
    // T20
    assertEquals(this.vendingMachine.coin(), 1);// P96
    // T11
    assertEquals(this.vendingMachine.tea(), 1);// P51
    // T4
    assertEquals(this.vendingMachine.set_price(25), 1);// P20
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P18
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P103
    // T10
    assertEquals(this.vendingMachine.cancel(), 1);// P43
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P10
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 39.
   */
  @Test(priority = 39)
  public void test39() {
    // T1
    assertNotNull(this.vendingMachine = new VendingMachine());// P1
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(10), 1);// P8
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(10), 1);// P14
    // T4
    assertEquals(this.vendingMachine.set_price(25), 1);// P23
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P104
    // T11
    assertEquals(this.vendingMachine.tea(), 1);// P50
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P15
    // T4
    assertEquals(this.vendingMachine.set_price(50), 1);// P23
    // T6
    assertEquals(this.vendingMachine.coin(), 1);// P30
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P104
    // T11
    assertEquals(this.vendingMachine.tea(), 1);// P53
    // T6
    assertEquals(this.vendingMachine.coin(), 1);// P30
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P168
    // T12
    assertEquals(this.vendingMachine.tea(), 1);// P59
    // T6
    assertEquals(this.vendingMachine.coin(), 1);// P30
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P90
    // T20
    assertEquals(this.vendingMachine.coin(), 1);// P169
    // T12
    assertEquals(this.vendingMachine.tea(), 1);// P57
    // T4
    assertEquals(this.vendingMachine.set_price(25), 1);// P24
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P168
    // T12
    assertEquals(this.vendingMachine.tea(), 1);// P55
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P12
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P168
    // T12
    assertEquals(this.vendingMachine.tea(), 1);// P60
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P168
    // T12
    assertEquals(this.vendingMachine.tea(), 1);// P56
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P16
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 40.
   */
  @Test(priority = 40)
  public void test40() {
    // T1
    assertNotNull(this.vendingMachine = new VendingMachine());// P1
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P8
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P14
    // T4
    assertEquals(this.vendingMachine.set_price(25), 1);// P23
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P83
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P90
    // T20
    assertEquals(this.vendingMachine.coin(), 1);// P101
    // T24
    assertEquals(this.vendingMachine.tea(), 1);// P161
    // T8
    assertEquals(this.vendingMachine.insert_large_cups(2), 1);// P36
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P106
    // T20
    assertEquals(this.vendingMachine.coin(), 1);// P102
    // T25
    assertEquals(this.vendingMachine.tea(), 1);// P155
    // T9
    assertEquals(this.vendingMachine.insert_small_cups(2), 1);// P42
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P147
    // T14
    assertEquals(this.vendingMachine.cancel(), 1);// P72
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P151
    // T18
    assertEquals(this.vendingMachine.large_cup(), 1);// P137
    // T13
    assertEquals(this.vendingMachine.tea(), 1);// P66
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P150
    // T17
    assertEquals(this.vendingMachine.small_cup(), 1);// P130
    // T15
    assertEquals(this.vendingMachine.tea(), 1);// P78
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P79
    // T10
    assertEquals(this.vendingMachine.cancel(), 1);// P46
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 41.
   */
  @Test(priority = 41)
  public void test41() {
    // T1
    assertNotNull(this.vendingMachine = new VendingMachine());// P1
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P8
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P14
    // T4
    assertEquals(this.vendingMachine.set_price(25), 1);// P23
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P83
    // T21
    assertEquals(this.vendingMachine.small_cup(), 1);// P108
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P152
    // T23
    assertEquals(this.vendingMachine.sugar(), 1);// P118
    // T25
    assertEquals(this.vendingMachine.tea(), 1);// P155
    // T9
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P42
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P81
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P92
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P152
    // T23
    assertEquals(this.vendingMachine.sugar(), 1);// P117
    // T24
    assertEquals(this.vendingMachine.tea(), 1);// P161
    // T8
    assertEquals(this.vendingMachine.insert_large_cups(1), 1);// P34
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 42.
   */
  @Test(priority = 42)
  public void test42() {
    // T1
    assertNotNull(this.vendingMachine = new VendingMachine());// P1
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(2), 1);// P8
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(1), 1);// P14
    // T4
    assertEquals(this.vendingMachine.set_price(25), 1);// P23
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P151
    // T18
    assertEquals(this.vendingMachine.large_cup(), 1);// P138
    // T14
    assertEquals(this.vendingMachine.cancel(), 1);// P72
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P151
    // T18
    assertEquals(this.vendingMachine.large_cup(), 1);// P143
    // T23
    assertEquals(this.vendingMachine.sugar(), 1);// P116
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P149
    // T16
    assertEquals(this.vendingMachine.coin(), 1);// P119
    // T13
    assertEquals(this.vendingMachine.tea(), 1);// P64
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 43.
   */
  @Test(priority = 43)
  public void test43() {
    // T1
    assertNotNull(this.vendingMachine = new VendingMachine());// P1
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(2), 1);// P8
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(2), 1);// P14
    // T4
    assertEquals(this.vendingMachine.set_price(25), 1);// P23
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P151
    // T17
    assertEquals(this.vendingMachine.small_cup(), 1);// P129
    // T14
    assertEquals(this.vendingMachine.cancel(), 1);// P72
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P150
    // T17
    assertEquals(this.vendingMachine.small_cup(), 1);// P133
    // T18
    assertEquals(this.vendingMachine.large_cup(), 1);// P141
    // T17
    assertEquals(this.vendingMachine.small_cup(), 1);// P134
    // T23
    assertEquals(this.vendingMachine.sugar(), 1);// P116
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P149
    // T16
    assertEquals(this.vendingMachine.coin(), 1);// P119
    // T13
    assertEquals(this.vendingMachine.tea(), 1);// P64
    // T5
    assertEquals(this.vendingMachine.dispose(), 1);
  }

  /**
   * Test 52.
   */
  @Test(priority = 52)
  public void test52() {
    // T1
    assertNotNull(this.vendingMachine = new VendingMachine());// P2
    // T3
    assertEquals(this.vendingMachine.insert_small_cups(2), 1);// P15
    // T4
    assertEquals(this.vendingMachine.set_price(25), 1);// P19
    // T2
    assertEquals(this.vendingMachine.insert_large_cups(2), 1);// P6
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P82
    // T20
    assertEquals(this.vendingMachine.coin(), 1);// P100
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P152
    // T23
    assertEquals(this.vendingMachine.sugar(), 1);// P114
    // T20
    assertEquals(this.vendingMachine.coin(), 1);// P97
    // T19
    assertEquals(this.vendingMachine.large_cup(), 1);// P87
    // T10
    assertEquals(this.vendingMachine.cancel(), 1);// P48
    // T7
    assertEquals(this.vendingMachine.coin(), 1);// P84
    // T22
    assertEquals(this.vendingMachine.sugar(), 1);// P147
    // T14
    assertEquals(this.vendingMachine.cancel(), 1);// P70
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
