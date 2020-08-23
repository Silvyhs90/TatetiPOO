
public class Tateti  //controla la logica del juego
{
	private Ficha tablero[][] = new Ficha [3][3];  // Esto es una clase que tiene como atributo un objeto de otra clase.
	
	public void generarTablero() 
	{
		for(int f=0;f<tablero.length ;f++) 
		{
			for(int c=0;c<tablero[0].length;c++) 
			{
				tablero[f][c]= new Ficha("_",f,c);  //para que todas empiezan con raya baja, posicion en el tablero, fila y columna
			}
		}
		
	}
	
	public void mostrarTablero() 
	{
			System.out.println(" ");
		for(int f=0;f< tablero.length  ;f++) 
		{
			for(int c=0;c< tablero[0].length;c++) 
			{
				tablero[f][c].mostrarValor();  		//muestro la ficha
				System.out.print(" "); 				//agrego un espacio y muestro la ficha
			}
			System.out.println(" ");
		}
		
	}
	
	
	public boolean ponerFicha(Ficha ficha)   // jugador pasa su ficha e igualamos la ficha 
	{
		if(tablero[ficha.getPosf()][ficha.getPosc()].getValor().equalsIgnoreCase("_")) //objeto ficha, el valor muestra el valor de la ficha (X o O)
			{
				tablero[ficha.getPosf()][ficha.getPosc()]=ficha;     // se pisa el viejo objeto con el nuevo
				return(true);
			}
			else 
			{
				return(false);
			}
		
		
	}
	
	public boolean siTateti(Ficha ficha) 
	{
		System.out.println("  ");
		
		for(int f=0;f<tablero.length;f++) 
		{
			if(   (tablero[ficha.getPosf()][0]==(tablero[ficha.getPosf()][1]))  && (tablero[ficha.getPosf()][1]==(tablero[ficha.getPosf()][2])) && (!tablero[ficha.getPosf()][2].getValor().equalsIgnoreCase("_"))  )
			{
				
				return(true);
			}
		}

		
		for(int c=0;c<tablero.length;c++) 
		{
			if(   (tablero[0][ficha.getPosc()]==(tablero[1][ficha.getPosc()]))  && (tablero[1][ficha.getPosc()]==(tablero[2][ficha.getPosc()])) && (!tablero[2][ficha.getPosc()].getValor().equalsIgnoreCase("_"))  )
			{
				return(true);
			}
		}

		if(   (tablero[0][0]==(tablero[1][1]))  && (tablero[1][1]==(tablero[2][2])) && (!tablero[1][1].getValor().equalsIgnoreCase("_")) )
		{
			return(true);
		}
		if(   (tablero[0][2]==(tablero[1][1]))  && (tablero[1][1]==(tablero[2][0])) && (!tablero[1][1].getValor().equalsIgnoreCase("_")))
		{
			return(true);
		}
		
		
		return(false);
	}
	

}
