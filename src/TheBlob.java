import java.util.Date;

public class TheBlob {
	/* clase con muchisimos atributos, 
	 * Este antipatrón se da en objetos con muchos atributos o
	 *  muchas operaciones. Esto rompe las ventajas de la programación OO,
	 *   ya que estas clases tan grandes son muy difíciles de mantener, 
	 *   de reusar y de probar. Suele aparecer por un diseño malo o debido a sistemas heredados.
	 *   
	 *   el ejemplo trata de una autorizacion, clase que usan en una eps para radicar autorizaciones. Se 
	 *   tienen atributos de otras clases, pero los tienen en la misma clase, ejemplo. la clase cliente
	 */
	public String Id;
	public Date FechaEnvioUsuario;
	public Date FechaRadicada;
	public int CodEstado;
	public String Estado;
	public Date FechaEstado;
	public int AutorizacionIdIpsPresta;
	public String NombreCliente;
	public String IdCliente;
	public String TipoIdCliente;
	public String DireccionIpsPresta;
	public String TelefonoIpsPresta;
	public String CodigoIps;
	public String AutorizacionReferenciaEstado;
	public String DireccionCliente;
	public String TelefonoCliente;
	public Cliente cliente;

}
