package Unidad_1;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class helloworld  extends JFrame implements ActionListener{
	
	private JLabel etiqueta1,etiqueta2;
	private JButton boton1;
	
	
	public helloworld(){
		
		super("Hello World");
		setLayout(new FlowLayout());
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image im = Toolkit.getDefaultToolkit().getImage("1494978526_student_icon.png");
		setIconImage(im);
		Icon ic = new ImageIcon("icono.jpg");
		
		etiqueta1=new JLabel("Hello World");
		etiqueta1.setText("hello world");
		boton1=new JButton("Aceptar");
		boton1.addActionListener(this);
		 etiqueta2 = new JLabel(ic);
		add(etiqueta1);
		add(boton1);
		add(etiqueta2);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		helloworld ventana= new helloworld();
		
	}
	
	
	public void actionPerformed(ActionEvent e){
		
		
		etiqueta1.setText(" Hola Mundo");
		
	}

}
