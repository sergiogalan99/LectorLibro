package modelo;

import java.util.ArrayList;

import modelo.acceso.ControlTextoImp;

public class Libro implements Legible {

	private int actual = 0;
	private int marca = 0;
	private String texto;
	private ArrayList<Pagina> paginas;
	private ControlTextoImp controlTexto;
	private int tamanoPagina;

	public Libro(String nombreLibro, int tamanoPagina) {
		this.tamanoPagina = tamanoPagina;
		this.controlTexto = new ControlTextoImp(nombreLibro);
		if (controlTexto.getLongitud() > 0) {
			crearPaginas();
		}
	}

	@Override
	public String avanzarPagina() {
		if (!comprobarUltimaPagina()) {
			this.actual++;
			refrescarPagina();
		}
		return this.texto;
	}

	@Override
	public String retrocederPagina() {
		if (!comprobarPrimeraPagina()) {
			this.actual--;
			refrescarPagina();
		}
		return this.texto;
	}

	@Override
	public void marcarPagina() {
		this.marca = this.actual;
	}

	public String irUltima() {
		return this.irAPagina(paginas.size() - 1);
	}
	

	@Override
	public String irAPagina(int numeroPagina) {
		this.actual = numeroPagina;
		this.refrescarPagina();
		return this.texto;

	}

	public int getActual() {
		return this.actual;
	}

	public int getMarca() {
		return this.marca;
	}

	private void crearPaginas() {
		paginas = new ArrayList<>();
		long inicioPaginas = 0;
		long finPagina = 1;
		int index = 0;
		while (finPagina < controlTexto.getLongitud()) {
			paginas.add(new Pagina(inicioPaginas, inicioPaginas + tamanoPagina, controlTexto));
			finPagina = paginas.get(index++).getUltimo();
			inicioPaginas = finPagina;
		}

	}

	private void refrescarPagina() {
		this.texto = paginas.get(actual).leerPagina();
	}

	private boolean comprobarUltimaPagina() {
		return this.actual == paginas.size() - 1;
	}

	private boolean comprobarPrimeraPagina() {
		return this.actual == 0;
	}

}
