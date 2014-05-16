/********************************************************
 *      Robert McGirr                                   *
 *      CSC-262                                         *
 *      Week 11     PC7, pg. 800                        *
 ********************************************************/

package longdistancecharges;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

/**
 *  The LongDistanceCharges class creates the GUI for the
 *  Long Distance Charges application
 */

public class LongDistanceCharges extends JFrame
{
   
   // The following variables will reference the
   // custom panel objects.
   private final RateCatPanel rateCat;     // Call Rate Category panel
   private final CallTimePanel callTime; // Time of call (duration) panel
   
   // The following variables will reference objects
   // needed to add the Calculate and Exit buttons.
   private JPanel buttonPanel;    // To hold the buttons
   private JButton calcButton;    // To calculate the cost
   private JButton exitButton;    // To exit the application


   /**
    *  Constructor
    */

   public LongDistanceCharges()
   {
      // Display a title.
      super("Long Distance Charges");
              

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a BorderLayout manager for
      // the content pane.
      setLayout(new BorderLayout());
      setPreferredSize(new Dimension(600, 230));   

      // Create the custom panels.
      rateCat = new RateCatPanel();
      callTime = new CallTimePanel();
      

      // Call the buildButtonPanel method to
      // create the button panel.
      buildButtonPanel();

      // Add the components to the content pane.
      add(rateCat, BorderLayout.NORTH);
      add(callTime, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);

      // Pack the contents of the window and display it.
      pack();
      setVisible(true);
   }

   /**
    *  The buildButtonPanel method builds the button panel.
    */

   private void buildButtonPanel()
   {
      // Create a panel for the buttons.
      buttonPanel = new JPanel();

      // Create the buttons.
      calcButton = new JButton("Calculate Charges");
      exitButton = new JButton("Exit");

      // Register the action listeners.
      calcButton.addActionListener(new CalcButtonListener());
      exitButton.addActionListener(new ExitButtonListener());

      // Add the buttons to the button panel.
      buttonPanel.add(calcButton);
      buttonPanel.add(exitButton);
   }

   /**
    *  Private inner class that handles the event when
    *  the user clicks the Calculate button.
    */
   private class CalcButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double cost;  // The call cost 
         

         // Calculate the total
         cost = rateCat.getRate() * callTime.getCallTime(); 
                    
         // Create a DecimalFormat object to format
         // the total as a dollar amount.
         DecimalFormat dollar = new DecimalFormat("0.00");

         // Display the charges.
         JOptionPane.showMessageDialog(null, "Long DIstance Charges for this call $" +
                      dollar.format(cost)); 
      }
   }

   /**
    *  Private inner class that handles the event when
    *  the user clicks the Exit button. 
    */
   private class ExitButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Exit the application.
          System.exit(0);
      }
   }
}