package aula07relacionamentoentreclasses;

public class Lutador {
	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitoria;
	private int derrota;
	private int empate;
	
	//Construtor
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrota,
			int empate) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		setPeso(peso);
		this.vitoria = vitoria;
		this.derrota = derrota;
		this.empate = empate;
	}
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getNacionalidade() {
		return nacionalidade;
	}



	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}



	public float getPeso() {
		return peso;
	}



	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}



	public String getCategoria() {
		return categoria;
	}



	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "Invalido";
		} else if(this.peso <= 70.3) {
			this.categoria = "Leve";
		}else if(this.peso <= 83.5) {
			this.categoria = "Médio";
		}else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Invalido";
		}
	}



	public int getVitoria() {
		return vitoria;
	}



    public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}



	public int getDerrota() {
		return derrota;
	}



	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}



	public int getEmpate() {
		return empate;
	}



	public void setEmpate(int empate) {
		this.empate = empate;
	}



	//Metodos 
	public void apresentar() {
		System.out.println("Lutado: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Peso: " + this.getPeso() + " Kg");
		System.out.println("Ganhou: " + this.getVitoria());
		System.out.println("Perdeu: " + this.getDerrota());
		System.out.println("Empatou: " + this.getEmpate());
	}
	
	public void status() {
		System.out.println(this.getNome());
		System.out.println("É um peso " + this.getCategoria());
		System.out.println(this.getVitoria() + " Vitorias");
		System.out.println(this.getDerrota() + " Derrotas");
		System.out.println(this.getEmpate() + " Empates");
	}
	
	public void ganharLuta() {
		this.setVitoria(this.getVitoria() +1);
	}
	
	public void perderLuta() {
		this.setDerrota(this.getDerrota() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpate(this.getEmpate() + 1);
	}

}
