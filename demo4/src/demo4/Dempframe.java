package demo4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//加法计算器
public class Dempframe {

	public static void main(String[] args) {
        JFrame jf1 = new JFrame("加法计算器");
        JButton btn1 = new JButton("=");
//      JButton btn2 = new JButton("=");
        JTextField jtf1 = new JTextField(5);
        JTextField jtf2 = new JTextField(5);
        JTextField jtf3 = new JTextField(10);
//      JPasswordField jpf = new JPasswordField(10);
        JPanel p1 = new JPanel();
        JLabel l1 = new JLabel("+");
        
//       p1.add(btn2);
        p1.add(jtf1);
        p1.add(l1);
        p1.add(jtf2);
        p1.add(btn1);
        p1.add(jtf3);
//      p1.add(jpf);
        jf1.add(p1);
        jf1.pack();
        jf1.setVisible(true);

	}

}
