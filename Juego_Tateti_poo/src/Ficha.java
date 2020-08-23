
public class Ficha 
{
	
	
	private String valor;    //cruz o circulo
	private int posf;		//posicion de la fila	
	private int posc;		//posicion de la columna
	
	
	
	public Ficha(String simbolo, int fila, int columna)
	{
		setValor(simbolo);  // le da un valor , instancia fichas y ubica fichas para poner su posicion
		setPosf(fila);
		setPosc(columna);
	}
	
	
	
	public void mostrarValor()   //mostrar valor de la ficha, si es X o O,  este metodo, es como mostrar datos de la agenda , muetsra el string que guarda esta ficha
	{
		System.out.print(getValor());
	}



	public String getValor() {
		return valor;
	}



	public void setValor(String valor) {
		this.valor = valor;
	}



	public int getPosf() {
		return posf;
	}



	public void setPosf(int posf) {
		this.posf = posf;
	}



	public int getPosc() {
		return posc;
	}



	public void setPosc(int posc) {
		this.posc = posc;
	}
	
	
	
}
