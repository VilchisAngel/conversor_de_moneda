package mx.conversor.api;

public class DatosApi {

	private String base;
	private Double destino;
	
	public DatosApi(String base, double destino) {
		this.base = base;
		this.destino = destino;
	}
	
	public String getBase() {
		return base;
	}
	
	public double getDestino() {
		return destino;
	}
}
