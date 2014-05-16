/********************************************************
 *      Robert McGirr                                   *
 *      CSC-262                                         *
 *      Week 11     PC7, pg. 800                        *
 ********************************************************/

package longdistancecharges;

import java.awt.*;
import javax.swing.*;

/**
 **
 *  The RateCat class allows the user to select 
 *  a call rate category depending on time of day
 *
 * @author Robert
 */
public class RateCatPanel extends JPanel
{
    
    // The following constants are used to indicate
   // the rate used during time call is made
   public final double DAYTIME = .07;
   public final double EVENING = .12;
   public final double OFF_PEAK = .05;

   // The following variables will reference radio
   // buttons for daytime, evening and off-peak time calls
   private final JRadioButton daytime;
   private final JRadioButton evening;
   private final JRadioButton offPeak;
   
   // The following variable will reference a
   // ButtonGroup object to group the radio buttons.
   private final ButtonGroup bg;

   /**
    *  Constructor
    */

   public RateCatPanel()
   {
      // Create a GridLayout manager with 
      // two rows and one column.
      setLayout(new GridLayout(3, 1));

      // Create the radio buttons.
      daytime = new JRadioButton("Daytime ($0.07 per minute)", true);
      evening = new JRadioButton("Evening ($0.12 per minute)");
      offPeak = new JRadioButton("Off-Peak ($0.05 per minute)");

      // Group the radio buttons.
      bg = new ButtonGroup();
      bg.add(daytime);
      bg.add(evening);
      bg.add(offPeak);

      // Add a border around the panel.
      setBorder(BorderFactory.createTitledBorder("Select a Rate Category"));

      // Add the radio buttons to this panel.
      add(daytime);
      add(evening);
      add(offPeak);
   }
   
   public double getRate()
   {
      // The following variable will hold the rate
      // for the selected call time
      double callRate = 0.0;

      // Determine which time of call is selected
      if (daytime.isSelected())
         callRate = DAYTIME;
      else if (evening.isSelected())
         callRate = EVENING;
      else if (offPeak.isSelected())
         callRate = OFF_PEAK;
      

      // Return the call rate
      return callRate;
   }
    
}
