package TrabAp2;

public class Aluno {
	int idade; 
	String nome;
	int matricula;
	double av1;
	double av2;
	double media ;
	public Aluno() {
		this.idade = idade;
		this.nome = nome;
		this.matricula = matricula;
		this.av1=av1;
		this.av2=av2;
		this.media = media;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getAv1() {
		return av1;
	}
	public void setAv1(double av1) {
		this.av1 = av1;
	}
	public double getAv2() {
		return av2;
	}
	public void setAv2(double av2) {
		this.av2 = av2;
	}
	public void setMedia(double media) {
		this.media=media;
	}
	public double getMedia() {
		media = (av1+av2)/2;
		return media;
	}
	
}
