package mx.conversor.api;

public class ConsultarApi {

	public static double Consultar(String origen, String destino, double cantidad) {
		
		ConsumerApi apis = new ConsumerApi();
		DatosApi datos = apis.consumerAPI(origen, destino);
		
		double operacion = cantidad * datos.getDestino();

		return operacion;
	}
}
