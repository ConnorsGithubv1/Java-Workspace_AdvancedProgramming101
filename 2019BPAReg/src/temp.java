import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.sun.media.sound.Toolkit;

public class temp extends JFrame{
	JButton newButton=new JButton();

	public temp() {
		// TODO Auto-generated constructor stub
		setTitle("Movie Rater - connor smith");
	    setResizable(false);
	    addWindowListener((WindowListener) new WindowAdapter() {
	      public void windowClosing(WindowEvent evt) {
	        exitForm(evt);
	      }
	    });
	    getContentPane().setLayout(new GridBagLayout());
	    
	    GridBagConstraints gridConstraints;
	    
	    gridConstraints=new GridBagConstraints();

	    gridConstraints.gridx=10;
	    gridConstraints.gridy=10;
	    gridConstraints.insets=new Insets(10, 10, 10, 10);
	    getContentPane().add(newButton, gridConstraints);
	    newButton.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        actionPerformed(e);
	      }
	    });
	    getContentPane().setBackground(Color.orange);
	    pack();
	    Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds((int)(0.5*(screenSize.width-getWidth())), (int)(0.5*(screenSize.height-getHeight())), getWidth(), getHeight());
	    newButton.doClick();
	  }
	}

	protected void exitForm(WindowEvent evt) {
		// TODO Auto-generated method stub
		
	}

}
