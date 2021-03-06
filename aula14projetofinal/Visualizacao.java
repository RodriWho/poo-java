package aula14projetofinal;

public class Visualizacao {
	private Gafanhoto espectador;
	private Video filme;
	
	public Visualizacao(Gafanhoto espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
		this.filme.setViwes(this.filme.getViwes() + 1);
	}
	
	public Gafanhoto getEspectador() {
		return espectador;
	}
	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}
	public Video getFilme() {
		return filme;
	}
	public void setFilme(Video filme) {
		this.filme = filme;
	}
	
	
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	public void avaliar(float porc) {
		int tot = 0;
		if(porc <= 20) {
			tot = 3;
		} else if(porc <= 50) {
			tot = 5;
		} else if(porc <= 90) {
			tot = 80;
		} else {
			tot = 10;
		}
	}
	
	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}

}
