package TrabAp2;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			ArrayList<Aluno>alunos = new ArrayList<Aluno>(5);
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
	     for(Aluno aluno : alunos) {
	    	 System.out.println(aluno.getNome() + ", media: "+ aluno.getMedia());
	    	 System.out.println(aluno.getNome().charAt(0) + ": " + aluno.getMatricula());
	    	
	     }
	     for(Aluno aluno : alunos) {  	
		     if(aluno.getMedia()>7.0) {
	      	   System.out.println("Matricula: " + aluno.getMatricula());
	      	   mensagem=true;
		     }
	        }
	     	
	         if (mensagem==false) {
	        	 System.out.println("Nenhum aluno com média maior que 7 foi encontrado");
	         }
	       
	        
	    
	}
}
