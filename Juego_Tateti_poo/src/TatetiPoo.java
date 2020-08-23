

public class TatetiPoo {

	public static void main(String[] args) {
		Tateti t1= new Tateti();
		
		
		t1.generarTablero();
		t1.mostrarTablero();
		Ficha f1= new Ficha("X", 0 ,0);
		Ficha f2=new Ficha("O", 0 , 0);
		Jugador j1= new Jugador("Jugador1",f1, t1);
		Jugador j2= new Jugador("Jugador2", f2 , t1);
		j1.jugar();
		t1.mostrarTablero();
		System.out.println(t1.siTateti(f1));
		j2.jugar();
		t1.mostrarTablero();
		System.out.println(t1.siTateti(f2));


		boolean ganador=false;
		
		 
		 while(ganador==false)
		{
		 t1.mostrarTablero();
		 j1.jugar();
		 t1.mostrarTablero();;
		 
		 if(false==t1.siTateti(f1))
		 {
			 j2.jugar();
			 t1.mostrarTablero();
		 }
		 
		 	ganador=t1.siTateti(f2); 
		 }
		
			if (ganador==true)
			{
				System.out.println("GANO !");
		
			}
			
		
				
		
		
	}

}
