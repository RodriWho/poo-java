package aula12polimorfismosobreposicao;

public class Aula12 {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(35.5f);
		System.out.println("Peso: " + m.getPeso());
		m.setCorPelo("Marrom");
		System.out.println("Cor Pelo: " + m.getCorPelo());
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		r.locomover();
		p.locomover();
		a.locomover();
		
		Canguru can = new Canguru();
		Cachorro ca = new Cachorro();
		Cobra co = new Cobra();
		Tartaruga tar = new Tartaruga();
		GoldFish gold = new GoldFish();
		Arara e = new Arara();
		
		can.locomover();
		ca.locomover();
		can.emitirSom();
		ca.emitirSom();
		
	}

}
