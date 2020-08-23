import javax.swing.JOptionPane;

public class Jugador
{	
	
				//describe la ficha
	private String nombre;
	private Ficha ficha;
	private Tateti t;
	
	public Jugador(String nombre, Ficha ficha, Tateti t)
	{
		
		setNombre(nombre=JOptionPane.showInputDialog(null, "Ingrese Nombre de jugadores "));
		setFicha(ficha);
		setTateti(t);
	}
	
	public void jugar() 
	{
		int f=0;
		int c=0;
		
		int opcion=Integer.parseInt(JOptionPane.showInputDialog("JUGADOR 1 "+nombre +" Tiene la ficha  "+ ficha.getValor() + ": Ingrese un numero del 1 al 9"));
		
		switch(opcion){
		
		default: System.out.println("Valor incorrecto");
		break;
		
		case 7: f=0;c=0;
		break;
		case 8: f=0;c=1;
		break;
		case 9: f=0;c=2;
		break;
		case 4: f=1;c=0;
		break;
		case 5: f=1;c=1;
		break;
		case 6: f=1;c=2;
		break;
		case 1: f=2;c=0;
		break;
		case 2: f=2;c=1;
		break;
		case 3: f=2;c=2;
		break;
		}
		ficha.setPosf(f);
		ficha.setPosc(c);
		
		 if (t.ponerFicha(ficha)==false)
		 {
			 System.out.println("Jugada invalida , pierde su turno");
		 }
	
}
	


	public Ficha getficha() {			// el getter devuelve el valor que tiene la variable setFicha que es private.
		return (ficha);
	}
	
	public Tateti getTateti() {
		return (t);
	}

	public String getNombre() {
		return (nombre);
	}	

	
	public void setFicha(Ficha ficha) {		// utilizando un metodo SETTER se le da un valor a un atributo privado, desde fuera de la clase
		this.ficha = ficha;
	}

	public void setTateti(Tateti t)
	{
		this.t=t;
	}
	



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	
}
