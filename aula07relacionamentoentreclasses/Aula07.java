package aula07relacionamentoentreclasses;

public class Aula07 {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[5];
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 65.9f, 11, 2, 1 );
		l[1] = new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
		l[2] = new Lutador("Van Der Dead", "Holanda", 30, 1.81f, 90.2f, 10, 4, 1);
		l[3] = new Lutador("Franguito", "Cuba", 28, 180f, 65.5f, 3, 2, 9);
		l[4] = new Lutador("Carlito", "Mexico", 37, 1.70f, 119.7f, 5, 4, 3);
		l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
			
		l[0].status();
		l[1].status();
		l[2].status();
		l[3].status();
		
	}

}
