package demo6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class szys extends JFrame implements ActionListener {
     szys(){
    	 init();
     }
     JPanel jp;
     JTextField jtf1;
     JTextField jtf2;
     JTextField jtf3;
     JButton jbt;
     JComboBox jcb;
     public void init(){
    	  jp = new JPanel();
    	  jtf1 = new JTextField(10);
    	  jtf2 = new JTextField(10);
    	  jtf3 = new JTextField(10);
    	  jbt = new JButton("=");
    	  String []list = {"+","-","*","/"};
    	  jcb = new JComboBox(list);
    	  jp.add(jtf1);
    	  jp.add(jcb);
    	  jp.add(jtf2);
    	  jp.add(jbt);
    	  jp.add(jtf3);
    	  this.setTitle("Àƒ‘Ú‘ÀÀ„");
    	  this.add(jp);
    	  this.pack();
    	  this.setVisible(true);
    	  
    	  jbt.addActionListener(this);
     }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
        String s = arg0.getActionCommand();
        int a, b, c = 0;
        String s1, s2, s3;
        s1 = jtf1.getText();
        s2 = jtf2.getText();
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        if(s.equals("=")) {
        	if(jcb.getSelectedItem()=="+") {
        		 c = a + b;
        	}
            if(jcb.getSelectedItem()=="-") {
        		c = a - b;
        	}
            if(jcb.getSelectedItem()=="*") {
	             c = a * b;
            }
            if(jcb.getSelectedItem()=="/") {
	             c = a / b;
            }
         s3 = c + "";
         jtf3.setText(s3);
        }
	}

}
