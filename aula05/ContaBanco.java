package aula05;

import java.util.Scanner;

public class ContaBanco {
	public int numeroConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	Scanner ler = new Scanner(System.in);
	
	public void estadoAtual() {
		System.out.println("");
		System.out.println("Conta: " + this.getNumeroConta());
		System.out.println("Tipo: " + this.getTipo() );
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	public void setNumeroConta(int n) {
		this.numeroConta = n;
	}

	public int getNumeroConta() {
		return this.numeroConta;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public String getDono() {
		return this.dono;
	}

	public void setSaldo(double s) {
		this.saldo = s;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setStatus(boolean s) {
		this.status = s;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);

		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta Aberta! ");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Para Fechar Conta, necessita sacar todo o valor de Saldo da Conta! ");
		} else if (this.getSaldo() < 0) {
			System.out.println("Para Fechar Conta, necessita quitar todas as pendencias da Conta! ");
		} else {
			this.setStatus(false);
			System.out.println("Conta Fechada com sucesso! ");
		}
	}

	public void depositar(double v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depositado na conta de " + this.getDono());
		} else {
			System.out.println("Conta não encontrada! ");
		}
	}

	public void sacar(double v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.print("Saldo unsuficiente para saque");
			}
		} else {
			System.out.println("Impossivel sacar de uma conta fechada! ");
		}
	}

	public void pagarMensal() {
		int v;
		if (this.getTipo() == "CC") {
			v = 12;
		} else {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade para com sucesso por " + getDono());
		} else {
			System.out.println("Impossivel pagar uma conta fechada! ");
		}
	}

}
