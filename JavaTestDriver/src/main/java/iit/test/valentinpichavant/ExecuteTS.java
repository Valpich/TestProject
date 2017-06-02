package iit.test.valentinpichavant;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The Class ExecuteTS which executed the TS.txt if found in the same folder.
 */
public class ExecuteTS {

  
  /**
   * Instantiates a new execute TS.
   */
  public ExecuteTS(){
    Scanner s;
    try {
      // We read the TS.txt file
      s = new Scanner(new File(Paths.get(".").toAbsolutePath().normalize().toString()+File.separator+"TS.txt"));
      ArrayList<String> list = new ArrayList<String>();
      //We parse it a list of string
      while (s.hasNextLine()){
          list.add(s.nextLine());
      }
      //We execute the test suite.
      this.executeTestSuite(list);
      s.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
  
  /**
   * Execute test suite.
   *
   * @param file the file as a list of string
   */
  private void executeTestSuite(List<String> file){
    //For each line of the file
    for(String line : file){
      //If the line is a test
      if(line.startsWith("Test#")){
        Scanner s;
        //We create a boolean to check if the test can be incorrect
        boolean fail = false;
        s = new Scanner(line);
        //We save the name of the test
        String test = s.next();
        //We initialize a new VendingMachine
        VendingMachine vendingMachine = new VendingMachine();
        //We start the test
        System.out.println("Begin of the execution of "+test);
        //While there is a next method and the test hasn't failed
        while (s.hasNext() && fail == false){
          //At the beginning nothing is return
          int returnCode = 0;
          //We test what we found
          switch(s.next()){
            //For each case, we do the corresponding call and display the result.
            case "coin":
              returnCode = vendingMachine.coin();
              System.out.println("coin was executed and return "+returnCode+".");
              break;
            case "small_cup":
              returnCode = vendingMachine.small_cup();
              System.out.println("small_cup was executed and return "+returnCode+".");
              break;
            case "large_cup":
              returnCode = vendingMachine.large_cup();
              System.out.println("large_cup was executed and return "+returnCode+".");
              break;
            case "sugar":
              returnCode = vendingMachine.sugar();
              System.out.println("sugar was executed and return "+returnCode+".");
              break;
            case "tea":
              returnCode = vendingMachine.tea();
              System.out.println("tea was executed and return "+returnCode+".");
              break;
            case "insert_large_cups":
              System.out.print("insert_large_cups with ");
              try{
                int value = Integer.parseInt(s.next());
                returnCode = vendingMachine.insert_large_cups(value);
                System.out.println("parameter "+value+" executed and return "+returnCode+".");
              }catch(NumberFormatException nfe){
                System.out.println("bad parameter \""+s+"\" was not executed.");
              }
              break;
            case "insert_small_cups":
              System.out.print("insert_small_cups with ");
              try{
                int value = Integer.parseInt(s.next());
                returnCode = vendingMachine.insert_small_cups(value);
                System.out.println("parameter "+value+" executed and return "+returnCode+".");
              }catch(NumberFormatException nfe){
                System.out.println("bad parameter \""+s+"\" was not executed.");
              }
              break;
            case "set_price":
              System.out.print("set_price with ");
              try{
                int value = Integer.parseInt(s.next());
                returnCode = vendingMachine.set_price(value);
                System.out.println("parameter "+value+" executed and return "+returnCode+".");
              }catch(NumberFormatException nfe){
                System.out.println("bad parameter \""+s+"\" was not executed.");
              }
              break;     
            case "cancel":
              returnCode = vendingMachine.cancel();
              System.out.println("cancel was executed and return "+returnCode+".");
              break;
            case "dispose":
              returnCode = vendingMachine.dispose();
              System.out.println("dispose was executed and return "+returnCode+".");
              break;
            default:
              System.out.println("The "+test+" has failed.");
              fail = true;
              break;
          }
        }
        s.close();
        System.out.println("End of the successful execution of "+test.substring(0, test.length()-1)+".\n");
      }
    }
  }
}