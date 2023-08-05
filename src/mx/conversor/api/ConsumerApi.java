package mx.conversor.api;

import java.net.URL;
import javax.swing.JOptionPane;
import java.io.InputStream;
import java.net.HttpURLConnection;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ConsumerApi {
	
	public DatosApi consumerAPI(String key, String cambio) {
		String clave = key;
		String urlApi = "https://v6.exchangerate-api.com/v6/a1361f7914dbfd90c3c4bd58/latest/" + clave;
		
		try {
			@SuppressWarnings("deprecation")
			URL url = new URL(urlApi);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			
			InputStream infoStream = conn.getInputStream();
			byte [] arrayStream = infoStream.readAllBytes();
			String contenidoJSON = "";
			
			for(byte datos : arrayStream) {
				contenidoJSON += (char)datos;
			}
			
			//Parsear
			Gson gson = new Gson();
			JsonObject jsonObject = gson.fromJson(contenidoJSON, JsonObject.class);
			JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
			
			String origen = jsonObject.get("base_code").getAsString();
			double destino = conversionRates.get(cambio).getAsDouble();
			
			DatosApi date = new DatosApi(origen, destino);
			return date;
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Lo sentimos, Tenemos problemas de conexcion con la API, vuelva mas tarde.");
			ex.printStackTrace();
		}
		
		return null;
	}

}
