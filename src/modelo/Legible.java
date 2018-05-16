package modelo;

public interface Legible {

	public String avanzarPagina();

	/**
	 * Avanza una pagina hacia delante
	 */

	public String retrocederPagina();

	/**
	 * Retrocede una pagina hacia atrás
	 */

	public void marcarPagina();

	/**
	 * Marca la pagina en la que esta dejandola guardada
	 * 
	 * @param numeroPagina
	 */

	public String irAPagina(int numeroPagina);
	/**
	 * Va a la pagina que está marcada
	 */
}
