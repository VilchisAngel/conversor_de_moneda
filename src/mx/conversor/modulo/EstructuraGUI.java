package mx.conversor.modulo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.net.URL;
import javax.swing.*;


public class EstructuraGUI extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private GridLayout layout = new GridLayout(2, 1);
	private BorderLayout esquemaPrincipal = new BorderLayout();
	
	EstiloComponente componentExpress = new EstiloComponente();
	
	private JPanel header;
	private JPanel contenedor;

	public EstructuraGUI() {
		super("Conversor De Moneda");
		configuracionVentana();
		setLayout(esquemaPrincipal);
		panelPrincipal();
	}

	public void configuracionVentana() {
		ClassLoader classloader = EstructuraGUI.class.getClassLoader();
		URL imagenUrl = classloader.getResource("resources/finance_icon.png");
		
		ImageIcon iconoVentana = new ImageIcon(imagenUrl);
		setIconImage(iconoVentana.getImage());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(600, 330);
		setLocationRelativeTo(null);
	}
	
	public void panelPrincipal() {
		
		header = new JPanel();
		header.setBackground(Color.WHITE);
		header.add(componentExpress.estiloTitulo());
		
		contenedor = new JPanel();
		contenedor.setLayout(layout);
		
		contenedor.add(marcoBody());
		contenedor.add(marcoFooter());
		
		add(header, BorderLayout.NORTH);
		add(contenedor);
	}
	
	public JPanel marcoBody() {
		
		JPanel body = new JPanel();
		
		Box contentHorizontal = Box.createHorizontalBox();
		Box content = Box.createVerticalBox();
		
		body = new JPanel();
		body.setBackground(Color.WHITE);
		
		contentHorizontal.add(componentExpress.estiloJComboBoxA());
		contentHorizontal.add(Box.createHorizontalStrut(40));
		contentHorizontal.add(componentExpress.complentoIcon());
		contentHorizontal.add(Box.createHorizontalStrut(40));
		contentHorizontal.add(componentExpress.estiloJComBoxB());
		
		content.add(Box.createRigidArea(new Dimension(0, 15)));
		content.add(Box.createHorizontalStrut(10));
		content.add(componentExpress.estiloCampo());
		content.add(Box.createRigidArea(new Dimension(0, 5)));
		
		body.add(content);
		body.add(contentHorizontal);
		return body;
	}
	
	public JPanel marcoFooter() {
		Box boxContainer1 = Box.createVerticalBox();
		Box boxContainer2 = Box.createHorizontalBox();
		
		JPanel container1 = new JPanel();
		FlowLayout esquema = new FlowLayout();
		
		container1.setLayout(esquema);
		container1.setBackground(Color.WHITE);
		esquema.setAlignment(FlowLayout.LEFT);
		
		JPanel container2 = new JPanel();
		container2.setBackground(Color.WHITE);
		container2.setLayout(new BorderLayout());
		
		JPanel footer;
		footer = new JPanel();
		footer.setBackground(Color.WHITE);
		footer.setLayout(new BoxLayout(footer, BoxLayout.X_AXIS));
		
		boxContainer1.add(Box.createRigidArea(new Dimension(33, 33)));
		boxContainer1.add(componentExpress.estiloBoton());
		container1.add(boxContainer1);
		
		boxContainer2.add(Box.createHorizontalGlue());
		boxContainer2.add(componentExpress.estiloTagRespuesta());
		boxContainer2.add(Box.createHorizontalGlue());
		boxContainer2.add(Box.createRigidArea(new Dimension(60, 0)));
		
		container2.add(boxContainer2);
		
		footer.add(container1);
		footer.add(container2);
		return footer;
	}
}
