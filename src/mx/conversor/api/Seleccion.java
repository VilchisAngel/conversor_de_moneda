package mx.conversor.api;

import javax.swing.JOptionPane;

public class Seleccion {

	public static double seleccion(String monto, String a, String b) {
		double x = 0.0;
		if(a.equals("Seleccionar") || b.equals("Seleccionar")) {
			JOptionPane.showMessageDialog(null, "Falta opcion por seleccionar en el Menu", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			double newMonto = exceptionCampoEntrada(monto);
			String ladaA = arreglo(a);
			String ladaB = arreglo(b);
			
			x = ConsultarApi.Consultar(ladaA, ladaB, newMonto);
			x = (double)Math.round(x * 100d) /100;
			
		}
		
		return x;
	}
	
	protected static double exceptionCampoEntrada(String valor) {
		double x = 0;
		
		try {
			String y = valor.replaceAll(" ", "");
			x = Double.parseDouble(y);
			
		}catch(Exception e) {
			String mensaje = e.getMessage();
			JOptionPane.showMessageDialog(null, "Error en el campo de entrada " + mensaje, "Mensaje", JOptionPane.WARNING_MESSAGE);
		}
		
		return x;
	}
	
	public static String arreglo(String pais) {
		
		String lada = "";
		
		String [][] array = {
			{"Euro", "EUR"},
			{"Dolar EE.UU",  "USD"},
			{"Peso Argentino",  "ARS"},
			{"Peso Mexicano",  "MXN"},
			{"Sol Peruano",   "PEN"},
			{"Peso Colombiano",  "COP"},
			{"Peso Chileno",  "CLP"},
			{"Peso Cubano",  "CUP"},
			{"Real Brasileño",  "BRL"},
			{"Boliviano",  "BOB"},
			{"Rublo Ruso",  "RUB"},
		};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(pais.equals(array[i][j])) {
					lada = array[i][1];
					break;
				}
			}
		}

		return lada;
	}
	
}
