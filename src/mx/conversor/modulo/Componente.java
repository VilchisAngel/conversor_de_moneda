package mx.conversor.modulo;
import mx.conversor.api.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;


public class Componente {
	
	private listaDePaises lista = new listaDePaises();
	private JLabel tag;
	
	public JLabel tituloGUI() {
		JLabel titulo = new JLabel();
		return titulo;
	}
	
	public JTextField campoTexto() {
		JTextField campo = new JTextField(9);
		return campo;
	}
	
	public JButton botonCalcular(JTextField cadena, JComboBox<String> comboA, JComboBox<String> comboB) {
		JButton boton = new JButton("Calcular");
		boton.addActionListener((ActionEvent evento) ->{
			String comboSelecA = (String) comboA.getSelectedItem();
			String comboSelecB = (String) comboB.getSelectedItem();
			String valor = cadena.getText();
			
			double resultado = Seleccion.seleccion(valor, comboSelecA, comboSelecB);
			String resultadoS = "$ ";
			resultadoS += resultado;
			tag.setText(resultadoS);
		});
		
		return boton;
	}
	

	public JComboBox<String> JComboBoxA(){
		
		ArrayList<String> nombres = lista.listaPais();	
		JComboBox<String> listaA = new JComboBox<String>();
		
		for(String nombre : nombres) {
			listaA.addItem(nombre);
		}
		
		return listaA;
	}
	
	public JComboBox<String> JComboBoxB(){
		
		ArrayList<String> nombres = lista.listaPais();
		JComboBox<String> listaB = new JComboBox<String>();
		
		for(String nombre : nombres) {
			listaB.addItem(nombre);
		}
		
		return listaB;
	}
	
	public JLabel tagResultado() {
		tag = new JLabel();
		return tag;
	}
	
}
