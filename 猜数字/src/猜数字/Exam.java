package ������;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Exam extends JFrame implements ActionListener {
	
	Exam(String title){
		super(title);
		init();
	}
	int x;
	JButton jb1,jb2;
	JLabel jl,jl1;
	JTextField jtf;
	Long timestart =  System.currentTimeMillis();
	static Exam s1 = new Exam("������");
	
	void init(){
		this.setSize(250,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		jl = new JLabel("������һ��һ�����ڵ�����");
		jtf = new JTextField(15);
		jb1 = new JButton("����");
		jb2 = new JButton("����");
		jl.setBounds(30,20,200,20);
		this.add(jl);
		jtf.setBounds(50,50,100,20);
		this.add(jtf);
		jb1.setBounds(30,85,70,20);
		this.add(jb1);
		jb2.setBounds(120,85,70,20);
		this.add(jb2);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		x= (int)(Math.random()*100);
		jl1 = new JLabel();
		jl1.setBounds(30,120,200,20);
		this.add(jl1);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		if(e.getSource()==jb1){
			int h=Exam.s1.x;
			String s =jtf.getText();
			int ss=Integer.parseInt(s);
		//	System.out.println(x);
		Long timeEnd=System.currentTimeMillis();
			if(ss==h){
				jl1.setText(null);
				jl1 = new JLabel("��ϲ�����˹���ʱ��" + (timeEnd-timestart) + "ms");
				jl1.setBounds(30,120,200,20);
				this.add(jl1);
			}
			if(ss>h){
				jl1.setText(null);
				jl1 = new JLabel("�´���");
				jl1.setBounds(30,120,200,20);
				this.add(jl1);
			}
			if(ss<h){
				jl1.setText(null);
				jl1 = new JLabel("��С��");
				jl1.setBounds(30,120,200,20);
				this.add(jl1);
			}
		}
		if(e.getSource()==jb2){
			jtf.setText(null);
			jl1.setText(null);
			x=(int)(Math.random()*100);
			timestart =  System.currentTimeMillis();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		s1.setVisible(true);
	}

}