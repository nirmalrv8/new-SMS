import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBagLayoutDemo {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
   

    public void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
 jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        
        JButton button;
	pane.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
	if (shouldFill) {
	//natural height, maximum width
	c.fill = GridBagConstraints.HORIZONTAL;
	}
//
//	button = new JButton("Button 1");
//	if (shouldWeightX) {
//	c.weightx = 0.5;
//	}
//	c.fill = GridBagConstraints.HORIZONTAL;
//	c.gridx = 0;
//	c.gridy = 0;
//	pane.add(button, c);
//
//	button = new JButton("Button 2");
//	c.fill = GridBagConstraints.HORIZONTAL;
//	c.weightx = 0.5;
//	c.gridx = 1;
//	c.gridy = 0;
//	pane.add(button, c);
//
//	button = new JButton("Button 3");
//	c.fill = GridBagConstraints.HORIZONTAL;
//	c.weightx = 0.5;
//	c.gridx = 2;
//	c.gridy = 0;
//	pane.add(button, c);
//
//	button = new JButton("Long-Named Button 4");
//	c.fill = GridBagConstraints.HORIZONTAL;
//	c.ipady = 40;      //make this component tall
//	c.weightx = 0.0;
//	c.gridwidth = 3;
//	c.gridx = 0;
//	c.gridy = 1;
//	pane.add(button, c);
         for(int j=1;j<=5;j++){
        for(int i=1;i<=5;i++){
	 //button= new JButton("a");
         JPanel jPanel1=new JPanel();
          jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipady = 0;       //reset to default
	//c.weighty = 1.0;   //request any extra vertical space
	//c.anchor = GridBagConstraints.PAGE_END; //bottom of space
	c.insets = new Insets(10,10,10,10);  //top padding
	c.gridx = i;       //aligned with button 2
	c.gridwidth = 2;   //2 columns wide
	c.gridy = j;       //third row
	pane.add(jPanel1, c);
          jButton1.setText("jButton1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(57, 32, 35, 41);
        jPanel1.add(jButton1, gridBagConstraints);

        jLabel1.setText(i);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 49, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);
        }
         }
        
//         button = new JButton("5");
//	c.fill = GridBagConstraints.HORIZONTAL;
//	c.ipady = 0;       //reset to default
//	//c.weighty = 1.0;   //request any extra vertical space
//	//c.anchor = GridBagConstraints.PAGE_END; //bottom of space
//	c.insets = new Insets(10,10,10,10);  //top padding
//	//c.gridx = 3;       //aligned with button 2
//	c.gridwidth = 2;   //2 columns wide
//	c.gridy = 6;       //third row
//	pane.add(button, c);
//        
//        button = new JButton("5");
//	c.fill = GridBagConstraints.HORIZONTAL;
//	c.ipady = 0;       //reset to default
//	//c.weighty = 1.0;   //request any extra vertical space
//	//c.anchor = GridBagConstraints.PAGE_END; //bottom of space
//	c.insets = new Insets(10,10,10,10);  //top padding
//	c.gridx = 3;       //aligned with button 2
//	c.gridwidth = 2;   //2 columns wide
//	c.gridy = 6;       //third row
//	pane.add(button, c);
//        
//        for(int i=4;i>=7;i++){
//        button = new JButton("6");
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.gridy=i;
//        c.gridx = 3;       //aligned with button 2
//	c.gridwidth = 2;   //2 columns wide
//	c.ipady=0;
//        pane.add(button, c);
//        }
    }
    
    

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
       // addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
     private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
}

