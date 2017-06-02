package iit.test.valentinpichavant;

import org.testng.TestNG;
import org.testng.annotations.Test;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import iit.test.valentinpichavant.tests.AdditionalBranchTesting;
import iit.test.valentinpichavant.tests.AdditionalTesting;
import iit.test.valentinpichavant.tests.CoinsInsertedGhostTransitionTesting;
import iit.test.valentinpichavant.tests.CoinsInsertedTesting;
import iit.test.valentinpichavant.tests.IdleGhostTransitionTesting;
import iit.test.valentinpichavant.tests.IdleTesting;
import iit.test.valentinpichavant.tests.NoLargeCupsGhostTransitionTesting;
import iit.test.valentinpichavant.tests.NoLargeCupsTesting;
import iit.test.valentinpichavant.tests.NoSmallCupsGhostTransitionTesting;
import iit.test.valentinpichavant.tests.NoSmallCupsTesting;
import iit.test.valentinpichavant.tests.SugarGhostTransitionTesting;
import iit.test.valentinpichavant.tests.SugarTesting;

/**
 * The Class JavaTestDriverApplication which is responsible for creating the application.
 */
public class JavaTestDriverApplication {

  /** The frame of the test project driver. */
  private JFrame frmTestProjectDriver;
  
  /** The application core. */
  private ApplicationCore applicationCore;
  
  /** The text field containing the results of the outputs. */
  private final JTextPane txtpnText = new JTextPane();

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        try {
          final JavaTestDriverApplication window = new JavaTestDriverApplication();
          window.frmTestProjectDriver.setVisible(true);
        } catch (final Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Instantiates a new java test driver application.
   */
  public JavaTestDriverApplication() {
    this.initialize();
  }

  /**
   * Initialize the test driver application.
   */
  private void initialize() {
    //Create the frame 
    this.frmTestProjectDriver = new JFrame();
    this.frmTestProjectDriver.setResizable(false);
    this.frmTestProjectDriver.setTitle("Test Project Driver ");
    this.frmTestProjectDriver.setBounds(0, 0, 500, 600);
    this.frmTestProjectDriver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.frmTestProjectDriver.getContentPane()
        .setLayout(new BoxLayout(this.frmTestProjectDriver.getContentPane(), BoxLayout.X_AXIS));

    //Create the panel to be added on the frame
    final JPanel panel = new JPanel();
    this.frmTestProjectDriver.getContentPane().add(panel);
    //Create the layout of the panel
    final GridBagLayout gbl_panel = new GridBagLayout();
    gbl_panel.columnWidths = new int[] {150, 150, 150};
    gbl_panel.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 80};
    gbl_panel.columnWeights = new double[] {1.0, 0.0, 0.0};
    gbl_panel.rowWeights =
        new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
    panel.setLayout(gbl_panel);

    //Create and add the button reset which is responsible for reseting the Application Core on click
    final JButton btnReset = new JButton("RESET");
    btnReset.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JavaTestDriverApplication.this.applicationCore = new ApplicationCore();
        JavaTestDriverApplication.this.txtpnText.setText("");
      }
    });
    final GridBagConstraints gbc_btnReset = new GridBagConstraints();
    gbc_btnReset.insets = new Insets(0, 0, 5, 5);
    gbc_btnReset.gridx = 1;
    gbc_btnReset.gridy = 0;
    panel.add(btnReset, gbc_btnReset);

    //Create and add the button COIN to call the coin method over the applicationCore
    final JButton btnCoin = new JButton("COIN");
    btnCoin.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JavaTestDriverApplication.this.txtpnText.setText(
            JavaTestDriverApplication.this.txtpnText.getText() + "The  result of call of coin is "
                + JavaTestDriverApplication.this.applicationCore.coin() + ".\n");
      }
    });
    final GridBagConstraints gbc_btnCoin = new GridBagConstraints();
    gbc_btnCoin.insets = new Insets(0, 0, 5, 5);
    gbc_btnCoin.gridx = 1;
    gbc_btnCoin.gridy = 1;
    panel.add(btnCoin, gbc_btnCoin);

    //Create and add the button SMALL CUP to call the smallCup method over the applicationCore
    final JButton btnSmallCup = new JButton("SMALL CUP");
    btnSmallCup.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JavaTestDriverApplication.this.txtpnText
            .setText(JavaTestDriverApplication.this.txtpnText.getText()
                + "The result of the call of small_cup is "
                + JavaTestDriverApplication.this.applicationCore.smallCup() + ".\n");
      }
    });
    final GridBagConstraints gbc_btnSmallCup = new GridBagConstraints();
    gbc_btnSmallCup.insets = new Insets(0, 0, 5, 5);
    gbc_btnSmallCup.gridx = 1;
    gbc_btnSmallCup.gridy = 2;
    panel.add(btnSmallCup, gbc_btnSmallCup);

    //Create and add the button LARGE CUP to call the largeCup method over the applicationCore
    final JButton btnLargeCup = new JButton("LARGE CUP");
    btnLargeCup.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JavaTestDriverApplication.this.txtpnText
            .setText(JavaTestDriverApplication.this.txtpnText.getText()
                + "The result of the call of large_cup is "
                + JavaTestDriverApplication.this.applicationCore.largeCup() + ".\n");
      }
    });
    final GridBagConstraints gbc_btnLargeCup = new GridBagConstraints();
    gbc_btnLargeCup.insets = new Insets(0, 0, 5, 5);
    gbc_btnLargeCup.gridx = 1;
    gbc_btnLargeCup.gridy = 3;
    panel.add(btnLargeCup, gbc_btnLargeCup);

    //Create and add the button SUGAR to call the sugar method over the applicationCore
    final JButton btnSugar = new JButton("SUGAR");
    btnSugar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JavaTestDriverApplication.this.txtpnText
            .setText(JavaTestDriverApplication.this.txtpnText.getText()
                + "The result of the call of sugar is "
                + JavaTestDriverApplication.this.applicationCore.sugar() + ".\n");
      }
    });
    final GridBagConstraints gbc_btnSugar = new GridBagConstraints();
    gbc_btnSugar.insets = new Insets(0, 0, 5, 5);
    gbc_btnSugar.gridx = 1;
    gbc_btnSugar.gridy = 4;
    panel.add(btnSugar, gbc_btnSugar);

    //Create and add the button TEA to call the tea method over the applicationCore
    final JButton btnTea = new JButton("TEA");
    btnTea.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JavaTestDriverApplication.this.txtpnText.setText(
            JavaTestDriverApplication.this.txtpnText.getText() + "The result of the call of tea is "
                + JavaTestDriverApplication.this.applicationCore.tea() + ".\n");
      }
    });
    final GridBagConstraints gbc_btnTea = new GridBagConstraints();
    gbc_btnTea.insets = new Insets(0, 0, 5, 5);
    gbc_btnTea.gridx = 1;
    gbc_btnTea.gridy = 5;
    panel.add(btnTea, gbc_btnTea);

    //Create and add the button INSERT LARGE CUPS to call the inser_large_cups method over the applicationCore after asking for the value of cups
    final JButton btnInsertLargeCups = new JButton("INSERT LARGE CUPS");
    btnInsertLargeCups.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        final String amountString = JOptionPane.showInputDialog(panel,
            "Insert the amount of large cups you want to insert.", null);
        int amount;
        try {
          amount = Integer.parseInt(amountString);
          JavaTestDriverApplication.this.txtpnText
              .setText(JavaTestDriverApplication.this.txtpnText.getText()
                  + "The result of the call of insert_large_cups with value " + amount + " is "
                  + JavaTestDriverApplication.this.applicationCore.insertLargeCups(amount) + ".\n");
        } catch (final NumberFormatException nfe) {
          nfe.printStackTrace();
          JavaTestDriverApplication.this.txtpnText
              .setText(JavaTestDriverApplication.this.txtpnText.getText()
                  + "The value you choose is not a number.\n");
        }
      }
    });
    final GridBagConstraints gbc_btnInsertLargeCups = new GridBagConstraints();
    gbc_btnInsertLargeCups.insets = new Insets(0, 0, 5, 5);
    gbc_btnInsertLargeCups.gridx = 1;
    gbc_btnInsertLargeCups.gridy = 6;
    panel.add(btnInsertLargeCups, gbc_btnInsertLargeCups);

    //Create and add the button INSERT SMALL CUPS to call the inser_small_cups method over the applicationCore after asking for the value of cups
    final JButton btnInsertSmallCups = new JButton("INSERT SMALL CUPS");
    btnInsertSmallCups.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        final String amountString = JOptionPane.showInputDialog(panel,
            "Insert the amount of small cups you want to insert.", null);
        int amount;
        try {
          amount = Integer.parseInt(amountString);
          JavaTestDriverApplication.this.txtpnText
              .setText(JavaTestDriverApplication.this.txtpnText.getText()
                  + "The result of the call of insert_small_cups with value " + amount + " is "
                  + JavaTestDriverApplication.this.applicationCore.insertSmallCups(amount) + ".\n");
        } catch (final NumberFormatException nfe) {
          nfe.printStackTrace();
          JavaTestDriverApplication.this.txtpnText
              .setText(JavaTestDriverApplication.this.txtpnText.getText()
                  + "The value you choose is not a number.\n");
        }
      }
    });
    final GridBagConstraints gbc_btnInsertSmallCups = new GridBagConstraints();
    gbc_btnInsertSmallCups.insets = new Insets(0, 0, 5, 5);
    gbc_btnInsertSmallCups.gridx = 1;
    gbc_btnInsertSmallCups.gridy = 7;
    panel.add(btnInsertSmallCups, gbc_btnInsertSmallCups);

    //Create and add the button SET PRICE to call the set_price method over the applicationCore after asking for the value of price
    final JButton btnSetPrice = new JButton("SET PRICE");
    btnSetPrice.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        final String priceString =
            JOptionPane.showInputDialog(panel, "Insert the price you want.", null);
        int price;
        try {
          price = Integer.parseInt(priceString);
          JavaTestDriverApplication.this.txtpnText
              .setText(JavaTestDriverApplication.this.txtpnText.getText()
                  + "The result of the call of set_price with value " + price + " is "
                  + JavaTestDriverApplication.this.applicationCore.setPrice(price) + ".\n");
        } catch (final NumberFormatException nfe) {
          nfe.printStackTrace();
          JavaTestDriverApplication.this.txtpnText
              .setText(JavaTestDriverApplication.this.txtpnText.getText()
                  + "The value you choose is not a number.\n");
        }
      }
    });
    final GridBagConstraints gbc_btnSetPrice = new GridBagConstraints();
    gbc_btnSetPrice.insets = new Insets(0, 0, 5, 5);
    gbc_btnSetPrice.gridx = 1;
    gbc_btnSetPrice.gridy = 8;
    panel.add(btnSetPrice, gbc_btnSetPrice);

    //Create and add the button CANCEL to call the cancel method over the applicationCore
    final JButton btnCancel = new JButton("CANCEL");
    btnCancel.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JavaTestDriverApplication.this.txtpnText
            .setText(JavaTestDriverApplication.this.txtpnText.getText()
                + "The result of the call of cancel is "
                + JavaTestDriverApplication.this.applicationCore.cancel() + ".\n");
      }
    });
    final GridBagConstraints gbc_btnCancel = new GridBagConstraints();
    gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
    gbc_btnCancel.gridx = 1;
    gbc_btnCancel.gridy = 9;
    panel.add(btnCancel, gbc_btnCancel);

    //Create and add the button DISPOSE to call the dispose method over the applicationCore
    final JButton btnDispose = new JButton("DISPOSE");
    btnDispose.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JavaTestDriverApplication.this.txtpnText
            .setText(JavaTestDriverApplication.this.txtpnText.getText()
                + "The result of the call of dispose is "
                + JavaTestDriverApplication.this.applicationCore.dispose() + ".\n");
      }
    });
    final GridBagConstraints gbc_btnDispose = new GridBagConstraints();
    gbc_btnDispose.insets = new Insets(0, 0, 5, 5);
    gbc_btnDispose.gridx = 1;
    gbc_btnDispose.gridy = 10;
    panel.add(btnDispose, gbc_btnDispose);

    //Create and add the button SHOW VARIABLES to call the show_variables method over the applicationCore
    final JButton btnShowVariables = new JButton("SHOW VARIABLES");
    btnShowVariables.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JavaTestDriverApplication.this.txtpnText
            .setText(JavaTestDriverApplication.this.txtpnText.getText()
                + JavaTestDriverApplication.this.applicationCore.showVariables());
      }
    });
    final GridBagConstraints gbc_btnShowVariables = new GridBagConstraints();
    gbc_btnShowVariables.insets = new Insets(0, 0, 5, 5);
    gbc_btnShowVariables.gridx = 1;
    gbc_btnShowVariables.gridy = 11;
    panel.add(btnShowVariables, gbc_btnShowVariables);

    //Create and add the button EXECUTE TEST SUITE to call the method launchTests to launch the automated tests
    final JButton btnExecuteAutomatedTest = new JButton("EXECUTE TEST SUITE");
    btnExecuteAutomatedTest.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JavaTestDriverApplication.this.launchTests();
      }
    });
    final GridBagConstraints gbc_btnExecuteAutomatedTest = new GridBagConstraints();
    gbc_btnExecuteAutomatedTest.insets = new Insets(0, 0, 5, 5);
    gbc_btnExecuteAutomatedTest.gridx = 1;
    gbc_btnExecuteAutomatedTest.gridy = 12;
    panel.add(btnExecuteAutomatedTest, gbc_btnExecuteAutomatedTest);
    
    //Create and add the button EXECUTE TS.txt to be able to execute the TS.txt file in the same folder
    JButton btnExecuteTstxt = new JButton("EXECUTE TS.txt");
    btnExecuteTstxt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        //Save the current system output
        final PrintStream origOut = System.out;
        //Create a new outputStream
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final PrintStream out = new PrintStream(baos);
        //Change the java output to the new one to save all the out generated by the tests execution
        System.setOut(out);
        //Run the tests
        new ExecuteTS();
        //Update the text field
        txtpnText.setText(txtpnText.getText() + new String(baos.toByteArray(), StandardCharsets.UTF_8) + "\n");
        //Get back to the original system output
        System.setOut(origOut);
      }
    });
    GridBagConstraints gbc_btnExecuteTstxt = new GridBagConstraints();
    gbc_btnExecuteTstxt.insets = new Insets(0, 0, 5, 5);
    gbc_btnExecuteTstxt.gridx = 1;
    gbc_btnExecuteTstxt.gridy = 13;
    panel.add(btnExecuteTstxt, gbc_btnExecuteTstxt);

    //Initialize and add the text field which will display the output of the test driver
    this.txtpnText.setText("");
    this.txtpnText.setEditable(false);
    final GridBagConstraints gbc_txtpnText = new GridBagConstraints();
    gbc_txtpnText.fill = GridBagConstraints.BOTH;
    gbc_txtpnText.insets = new Insets(0, 0, 0, 0);
    gbc_txtpnText.gridwidth = 3;
    gbc_txtpnText.gridx = 0;
    gbc_txtpnText.gridy = 14;
    final JScrollPane scroll = new JScrollPane(this.txtpnText);
    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    panel.add(scroll, gbc_txtpnText);

    //Create the applicationCore
    this.applicationCore = new ApplicationCore();
  }

  /**
   * Launch the tests.
   */
  private void launchTests() {
    //Create the list containing all tests classes
    final List<Class<?>> testClasses = new ArrayList<>();
    //Adding all tests classes to the list
    testClasses.add(IdleTesting.class);
    testClasses.add(CoinsInsertedTesting.class);
    testClasses.add(SugarTesting.class);
    testClasses.add(NoLargeCupsTesting.class);
    testClasses.add(NoSmallCupsTesting.class);
    testClasses.add(AdditionalTesting.class);
    testClasses.add(IdleGhostTransitionTesting.class);
    testClasses.add(CoinsInsertedGhostTransitionTesting.class);
    testClasses.add(SugarGhostTransitionTesting.class);
    testClasses.add(NoLargeCupsGhostTransitionTesting.class);
    testClasses.add(NoSmallCupsGhostTransitionTesting.class);
    testClasses.add(AdditionalBranchTesting.class);
    //Create a new thread to execute the tests
    this.launchTestsThread(testClasses);
  }

  /**
   * Launch a thread to do testing.
   *
   * @param testClass the test classes list
   */
  private void launchTestsThread(final List<Class<?>> testClass) {
    //Start the thread of tests
    new Thread(new Runnable() {
      @Override
      public void run() {
        JavaTestDriverApplication.this.doTests(testClass);
      }
    }).start();
  }

  /**
   * Do the tests.
   *
   * @param testClasses the test classes list
   */
  @Test
  private void doTests(List<Class<?>> testClasses) {
    //Create the class needed to execute the tests
    final TestNG testng = new TestNG();
    //Define the tests
    testng.setTestClasses(testClasses.toArray(new Class[testClasses.size()]));
    //Save the current system output
    final PrintStream origOut = System.out;
    //Create a new outputStream
    final ByteArrayOutputStream baos = new ByteArrayOutputStream();
    final PrintStream out = new PrintStream(baos);
    //Change the java output to the new one to save all the out generated by the tests execution
    System.setOut(out);
    //Run the tests
    testng.run();
    //Update the text field
    this.txtpnText.setText(
        this.txtpnText.getText() + new String(baos.toByteArray(), StandardCharsets.UTF_8) + "\n");
    //Get back to the original system output
    System.setOut(origOut);
  }
}
