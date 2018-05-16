package modelo;

import modelo.acceso.ControlTextoImp;

public class Pagina {

	private long primer;
	private long ultimo;
	private ControlTextoImp controlTexto;
	
	public Pagina(long primer, long ultimo, ControlTextoImp controlTexto) {
		this.controlTexto=controlTexto;
		this.primer=primer;
		this.ultimo = controlTexto.obtenerUltimo((int)ultimo);
	}

	public Long getUltimo(){
		return this.ultimo;
	}
	
	public String leerPagina(){
		return controlTexto.getTexto(this.primer,this.ultimo);
	}

}
