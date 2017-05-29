package Unidad_1;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class matematicas extends JFrame implements ActionListener{
	
	// declaracion de variables
	
	private JLabel lbl_ingresa_numero,lbl_resultado,lbl_raiz_cuadrada ;
	//private lbl_raiz_cuadrada;
	private JTextField txt_numero;
	private JButton btn_raiz_cuadrada,btn_raiz_cubica;
	private String raiz_cuadrada;
	
	private double raiz_cuadrada1;
	
	public matematicas(){
		
		
		super("Matematicas");
		setSize(250,200);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Image imagen=Toolkit.getDefaultToolkit().getImage("calculadora.png");
		setIconImage(imagen);
		
		// uso de variables
		
		
		lbl_ingresa_numero = new JLabel("INGRESA UN NUMERO");
		txt_numero = new JTextField(4);
		btn_raiz_cuadrada = new JButton("Cuadrada");
		btn_raiz_cubica = new JButton("Cubica");
		lbl_resultado = new JLabel("El resultado es:");
		//resultado=Math.sqrt(txt_numero);
		
		
		btn_raiz_cuadrada.addActionListener(this);
		btn_raiz_cubica.addActionListener(this);
		
		// agregando elementos al JFrame //
		
		add(lbl_ingresa_numero);
		add(txt_numero);
		add(btn_raiz_cuadrada);
		add(btn_raiz_cubica);
		add(lbl_resultado);
		//add(lbl_raiz_cuadrada);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		matematicas ventana = new matematicas();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==btn_raiz_cuadrada){
			
			
			//raiz_cuadrada= Double.toString(());
			lbl_resultado.setText(raiz_cuadrada);
			//lbl_raiz_cuadrada.setText(txt_numero.getSelectedText());
			//raiz_cuadrada.setText()
			//lbl_raiz_cuadrada.math.sqr;
			//double resultado=Math.sqrt(numero);
			
		}//else{
			//lbl_mensaje.setText("Ingresa un numero porfavor");
		//}
		
		
	}

}
