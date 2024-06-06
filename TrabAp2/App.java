package TrabAp2;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			ArrayList<Aluno>alunos = new ArrayList<Aluno>();
		for(int i = 0; i<5;i++) {
			Aluno aluno = new Aluno();
		
			System.out.println("Digite o nome do aluno: ");
			aluno.setNome(sc.nextLine());
			System.out.println("Digite a idade do aluno: ");
			aluno.setIdade(sc.nextInt());
			System.out.println("Digite a matricula do aluno: ");
			aluno.setMatricula(sc.nextInt());
			System.out.println("Digite a nota da av1 do aluno: ");
			aluno.setAv1(sc.nextDouble());
			System.out.println("Digite a nota da av2 do aluno: ");
			aluno.setAv2(sc.nextDouble());
			
			 sc.nextLine(); 
			
			alunos.add(aluno);
		}	
			
		
		boolean mensagem = false;
		 System.out.println("A turma é composta por : ");
		 for(Aluno turma : alunos) {
	    	 System.out.println(turma.getNome() + ","+ "idade: " + turma.getIdade() + ", matrícula: "+ turma.getMatricula());
	     }
		 System.out.println("-----------");
		 System.out.println("Nome e media :");
	     for(Aluno turma : alunos) {
	    	 System.out.println(turma.getNome() + ", media: "+ turma.getMedia());
	     }
	    System.out.println("-----------");
	    System.out.println("Primeira letra do nome + matrícula");
	     
	     for(Aluno turma : alunos) {
	    	 System.out.println(turma.getNome().charAt(0) + ": " + turma.getMatricula());
	     }
	     System.out.println("-----------");
	     System.out.println("Matrícula dos alunos com média maior que 7: ");
	     for(Aluno turma : alunos) {  	
		     if(turma.getMedia()>7.0) {
	      	   System.out.println("Matricula: " + turma.getMatricula());
	      	   mensagem=true;
		     }
	       }
	     	
	         if (mensagem==false) {
	        	 System.out.println("Nenhum aluno com média maior que 7 foi encontrado");
	         }
	       
	        
	    
	}
}
