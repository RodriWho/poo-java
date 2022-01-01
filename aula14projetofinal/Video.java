package aula14projetofinal;

public class Video  implements AcoesVideo {
	//Atributos
	private String titulo;
	private int avaliacao;
	private int viwes;
	private int curtida;
	private boolean reproduzindo;
	
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.viwes = 0;
		this.curtida = 0;
		this.reproduzindo = false;
	}
	//Metodos Getters Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		int nova;
		nova = (int) ((this.avaliacao + avaliacao) / this.viwes);
		this.avaliacao = nova;
	}
	public int getViwes() {
		return viwes;
	}
	public void setViwes(int viwes) {
		this.viwes = viwes;
	}
	public int getCurtida() {
		return curtida;
	}
	public void setCurtida(int curtida) {
		this.curtida = curtida;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	@Override
	public void play() {
		if(this.isReproduzindo() == false) {
			this.setReproduzindo(true);
		}
	}
	@Override
	public void pause() {
		if(this.isReproduzindo() == true) {
			this.setReproduzindo(false);
		}
	}
	@Override
	public void like() {
		this.setCurtida(++curtida);
	}
	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao 
				+", viwes=" + viwes + ", curtida=" + curtida
				+ ", reproduzindo=" + reproduzindo + "]";
	}	

}
