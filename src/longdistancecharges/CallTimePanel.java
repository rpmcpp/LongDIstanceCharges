/********************************************************
 *      Robert McGirr                                   *
 *      CSC-262                                         *
 *      Week 11     PC7, pg. 800                        *
 ********************************************************/

package longdistancecharges;

import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 *  The CallTimePanel class allows the user to input
 *  the time duration of the call
 *
 * @author Robert
 */
public class CallTimePanel extends JPanel
{
   
   private final JLabel callTimeMinutes;       // A message to prompt for call time
   private final JTextField callMinutes;       // To enter call duration
    
    public CallTimePanel()
   {
       // Create a GridLayout manager with 
      // two rows and one column.
      setLayout(new GridLayout(1, 2));
      
      
      // Create the label.
      callTimeMinutes = new JLabel("Minutes:");
      // Create text field to enter call minutes
      callMinutes = new JTextField(10);

      // Add a border around the panel.
      setBorder(BorderFactory.createTitledBorder("Time of Call"));
      
      // Add the label to this panel.
      add(callTimeMinutes);
      add(callMinutes);
      
   }
    
    public double getCallTime()
   {
      // The following variable will hold the 
      // call duration time
      int callTime;

      // Get the wholesale cost entered in the
      // text field, convert to double
      callTime = Integer.parseInt(callMinutes.getText());

      // Return the coffee cost.
      return callTime;
   }
    
}
