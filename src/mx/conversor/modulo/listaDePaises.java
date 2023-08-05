package mx.conversor.modulo;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;


public class listaDePaises {
	
	ClassLoader classloader = Componente.class.getClassLoader();
	
	public ArrayList<String> listaPais() {
		 
		ArrayList<String> listaPaises = new ArrayList<String>(); 
		listaPaises.add("Seleccionar");
		listaPaises.add("Euro");
		listaPaises.add("Dolar EE.UU");
		listaPaises.add("Peso Argentino");
		listaPaises.add("Peso Mexicano");
		listaPaises.add("Peso Colombiano");
		listaPaises.add("Peso Chileno");
		listaPaises.add("Peso Cubano");
		listaPaises.add("Real Brasileño");
		listaPaises.add("Boliviano");
		listaPaises.add("Rublo Ruso");
		listaPaises.add("Sol Peruano");
			
		return listaPaises;
	}
	
	public Icon[] iconos() {
		
		URL seleccionar = classloader.getResource("resources/money-cash-bill-1.png");
		URL europa = classloader.getResource("resources/european.png");
		URL unido = classloader.getResource("resources/united.png");
		URL argentina = classloader.getResource("resources/argentina.png");
		URL mexico = classloader.getResource("resources/mexico.png");
		URL colombia = classloader.getResource("resources/colombia.png");
		URL chile = classloader.getResource("resources/chile.png");
		URL cuba = classloader.getResource("resources/cuba.png");
		URL brazil = classloader.getResource("resources/brazil.png");
		URL bolivia = classloader.getResource("resources/bolivia.png");
		URL rusia = classloader.getResource("resources/rusia.png");
		URL peru = classloader.getResource("resources/peru.png");
		
		Icon [] iconosCountry = {
				new ImageIcon(seleccionar),
				new ImageIcon(europa),
				new ImageIcon(unido),
				new ImageIcon(argentina),
				new ImageIcon(mexico),
				new ImageIcon(colombia),
				new ImageIcon(chile),
				new ImageIcon(cuba),
				new ImageIcon(brazil),
				new ImageIcon(bolivia),
				new ImageIcon(rusia),
				new ImageIcon(peru),
		};
		
		return iconosCountry;
		
	}
}
