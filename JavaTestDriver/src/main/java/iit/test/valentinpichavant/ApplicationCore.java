package iit.test.valentinpichavant;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class ApplicationCore which contains the vending machin for the test driver.
 */
public class ApplicationCore {

  /** The vending machine. */
  VendingMachine vendingMachine;

  /**
   * Instantiates a new application core.
   */
  public ApplicationCore() {
    super();
    this.vendingMachine = new VendingMachine();
  }

  /**
   * Reset the vending machine.
   */
  public void reset() {
    this.vendingMachine = new VendingMachine();
  }

  /**
   * Coin.
   *
   * @return the result of coin
   */
  public int coin() {
    return this.vendingMachine.coin();
  }

  /**
   * Small cup.
   *
   * @return the result of  small cup
   */
  public int smallCup() {
    return this.vendingMachine.small_cup();
  }

  /**
   * Large cup.
   *
   * @return the result of large cup
   */
  public int largeCup() {
    return this.vendingMachine.large_cup();
  }

  /**
   * Sugar.
   *
   * @return the result of sugar
   */
  public int sugar() {
    return this.vendingMachine.sugar();
  }

  /**
   * Tea.
   *
   * @return the result of tea
   */
  public int tea() {
    return this.vendingMachine.tea();
  }

  /**
   * Insert large cups.
   *
   * @param amount the amount of large cups to be added
   * @return the result of insert large cups
   */
  public int insertLargeCups(int amount) {
    return this.vendingMachine.insert_large_cups(amount);
  }

  /**
   * Insert small cups.
   *
   * @param amount the amount of small cups to be added
   * @return the result of insert small cups
   */
  public int insertSmallCups(int amount) {
    return this.vendingMachine.insert_small_cups(amount);
  }

  /**
   * Sets the price.
   *
   * @param price the price
   * @return the result of set price
   */
  public int setPrice(int price) {
    return this.vendingMachine.set_price(price);
  }

  /**
   * Cancel.
   *
   * @return the result of cancel
   */
  public int cancel() {
    return this.vendingMachine.cancel();
  }

  /**
   * Dispose.
   *
   * @return the result of dispose
   */
  public int dispose() {
    return this.vendingMachine.dispose();
  }

  /**
   * Show variables.
   *
   * @return the string contains all of the private variables
   */
  public String showVariables() {
    final StringBuilder sb = new StringBuilder();
    final List<Field> fields = getPrivateFields(VendingMachine.class);
    for (final Field field : fields) {
      field.setAccessible(true);
      switch (field.getType().toString()) {
        case "int":
          try {
            sb.append("The attribute: " + field.getName() + " is type " + field.getType()
                + " with a value of " + field.getInt(this.vendingMachine));
            sb.append("\n");
          } catch (final IllegalArgumentException e) {
            e.printStackTrace();
          } catch (final IllegalAccessException e) {
            e.printStackTrace();
          }
          break;
        default:
          try {
            sb.append("The field: " + field.getName() + " is type " + field.getType());
            sb.append("\n");
          } catch (final IllegalArgumentException e) {
            e.printStackTrace();
          }
          break;
      }
      field.setAccessible(false);
    }
    return sb.toString();
  }

  /**
   * Gets the private fields of a class.
   *
   * @param theClass the class to be analysed
   * @return the private fields
   */
  private static List<Field> getPrivateFields(Class<?> theClass) {
    final List<Field> privateFields = new ArrayList<>();
    final Field[] fields = theClass.getDeclaredFields();
    for (final Field field : fields) {
      if (Modifier.isPrivate(field.getModifiers())) {
        privateFields.add(field);
      }
    }
    return privateFields;
  }

}
