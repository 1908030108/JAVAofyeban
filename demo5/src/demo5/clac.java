package demo5;

import java.awt.BorderLayout;
import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class clac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JFrame jf = new JFrame("计算器");
//       创建两个面板
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
//       创建一个菜单类
        JMenuBar bar = new JMenuBar();
        jf.setJMenuBar(bar);
        JMenu menu1 = new JMenu("编辑");
        JMenu menu2 = new JMenu("查看");
        JMenu menu3 = new JMenu("帮助");
        
//        JMenuItem jit1 = new JMenuItem("1");
//        JMenuItem jit2 = new JMenuItem("2");
//        JMenuItem jit3 = new JMenuItem("3");
//        JMenuItem jit4 = new JMenuItem("4");
//        JMenuItem jit5 = new JMenuItem("6");
//        JMenuItem jit6 = new JMenuItem("5");
        
        bar.add(menu1);
        bar.add(menu2);
        bar.add(menu3);
//        menu1.add(jit1);
//        menu1.add(jit2);
//        menu2.add(jit3);
//        menu2.add(jit4);
//        menu3.add(jit5);
//        menu3.add(jit6);
        
        final JTextField jtf = new JTextField(55);
        p1.add(jtf);
        
        p2.setLayout(new GridLayout(4,5));
        final JButton btn1 = new JButton("7");
        final JButton btn2 = new JButton("8");
        final JButton btn3 = new JButton("9");
        JButton btn4 = new JButton("/");
        JButton btn5 = new JButton("sqrt");
        final JButton btn6 = new JButton("4");
        final JButton btn7 = new JButton("5");
        final JButton btn8 = new JButton("6");
        JButton btn9 = new JButton("*");
        JButton btn10 = new JButton("%");
        final JButton btn11 = new JButton("1");
        final JButton btn12 = new JButton("2");
        final JButton btn13 = new JButton("3");
        JButton btn14 = new JButton("-");
        JButton btn15 = new JButton("1/x");
        final JButton btn16 = new JButton("0");
        final JButton btn17 = new JButton("AC");
        final JButton btn18 = new JButton(".");
        final JButton btn19 = new JButton("+");
        final JButton btn20 = new JButton("=");
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        p2.add(btn4);
        p2.add(btn5);
        p2.add(btn6);
        p2.add(btn7);
        p2.add(btn8);
        p2.add(btn9);
        p2.add(btn10);
        p2.add(btn11);
        p2.add(btn12);
        p2.add(btn13);
        p2.add(btn14);
        p2.add(btn15);
        p2.add(btn16);
        p2.add(btn17);
        p2.add(btn18);
        p2.add(btn19);
        p2.add(btn20);
        
        jf.setLayout(new BorderLayout());
        jf.add(p1,BorderLayout.NORTH);
        jf.add(p2,BorderLayout.CENTER); 
        jf.setLocation(300,200);
//        jf.add(p1);
//        jf.add(p2);
        jf.pack();
        jf.setVisible(true);
        
	}

}
