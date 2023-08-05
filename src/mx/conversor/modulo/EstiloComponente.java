package mx.conversor.modulo;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class EstiloComponente {
	
	ClassLoader classloader = EstiloComponente.class.getClassLoader();
	listaDePaises lista = new listaDePaises();
	
	Componente component = new Componente();
	private JLabel titulo = component.tituloGUI();
	private JTextField campo = component.campoTexto();
	private JComboBox<String> listaA = component.JComboBoxA();
	private JComboBox<String> listaB = component.JComboBoxB();
	private JButton boton = component.botonCalcular(campo, listaA, listaB);
	private JLabel tagRespuesta = component.tagResultado();
    
	
	
	public Box estiloTitulo() {
		Box boxInvisible = Box.createHorizontalBox();
		titulo = new JLabel("Conversor De Moneda");
		titulo.setFont(new Font("Arial", Font.BOLD, 24));
		titulo.setForeground(Color.decode("#002b47"));
		
		boxInvisible.add(titulo);
		boxInvisible.add(Box.createRigidArea(new Dimension(0, 50)));
		
		return boxInvisible;
	}
	
	public JButton estiloBoton() {
		URL imagenUrl = classloader.getResource("resources/money.png");
		
		Icon iconoBtn = new ImageIcon(imagenUrl);
		boton.setFont(new Font("Arial", Font.PLAIN, 14));
		boton.setToolTipText("Haz clic para procesar la operacion");
		boton.setFocusPainted(false);
		boton.setIcon(iconoBtn);
		boton.setHorizontalTextPosition(SwingConstants.LEFT);
		
		return boton;
	}
	
	public Box estiloCampo() {
		Box campos = Box.createHorizontalBox();
		JLabel etiqueta = new JLabel("Cantidad : ");
		
		etiqueta.setFont(new Font("Arial", Font.PLAIN, 16));
		campo.setFont(new Font("Arial", Font.PLAIN, 16));
		campo.setToolTipText("Ingrese la cantidad");
		
		campos.add(etiqueta);
		campos.add(campo);
		
		return campos;
	}
	
	public Box estiloJComboBoxA() {
		Box box = Box.createHorizontalBox();
		Box contenedor = Box.createVerticalBox();
		
		JLabel tagDe = new JLabel("De");
		tagDe.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel tagIconC = new JLabel();
		
		listaA.setFont(new Font("Arial", Font.PLAIN, 14));
		
		Icon [] iconosC =  lista.iconos();
		
		listaA.addItemListener((ItemEvent evento) ->{
			if(evento.getStateChange() == ItemEvent.SELECTED) {
				tagIconC.setIcon(iconosC[listaA.getSelectedIndex()]);
			}
		});
		
		tagIconC.setIcon(iconosC[0]);
		box.add(listaA);
		box.add(Box.createHorizontalStrut(5));
		box.add(tagIconC);
		
		contenedor.add(tagDe);
		contenedor.add(Box.createHorizontalStrut(5));
		contenedor.add(box);
		
		return contenedor;
	}
	
	public JLabel complentoIcon() {
		
		URL url = classloader.getResource("resources/icons8-exchange.gif");
		Icon asset = new ImageIcon(url);
		
		JLabel labelIcon = new JLabel();
		labelIcon.setIcon(asset);
		
		return labelIcon;
	}
	
	public Box estiloJComBoxB() {
		Box box = Box.createHorizontalBox();
		Box contenedor = Box.createVerticalBox();
		
		JLabel tagIcon = new JLabel();
		
		Icon [] iconsC = lista.iconos();
		
		JLabel tagA = new JLabel("A");
		tagA.setFont(new Font("Arial", Font.PLAIN, 14));
		listaB.setFont(new Font("Arial", Font.PLAIN, 14));
		
		listaB.addItemListener((ItemEvent evento) ->{
			if(evento.getStateChange() == ItemEvent.SELECTED) {
				tagIcon.setIcon(iconsC[listaB.getSelectedIndex()]);
			}
		});
		
		tagIcon.setIcon(iconsC[0]);
		box.add(tagIcon);
		box.add(Box.createHorizontalStrut(5));
		box.add(listaB);
		
		contenedor.add(tagA);
		contenedor.add(box);
		
		return contenedor;
	}
	
	public JLabel estiloTagRespuesta() {
		
		tagRespuesta.setText("Resultado");
		tagRespuesta.setFont(new Font("Arial", Font.PLAIN, 18));
		
		return tagRespuesta;
		
	}
}
