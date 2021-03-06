
import java.util.Scanner;

public class Principal
{
   public static void main(String args[]){
       System.out.println("###### Sistema Acadêmico ######");
       
       Scanner le = new Scanner(System.in);
       
       Aluno a1, a2;
       
       System.out.println("Informe o nome do aluno 1:");
       a1 = new Aluno(le.next(), 0);
       
       System.out.println("Informe a nota do aluno 1:");
       a1.setNota(le.nextDouble());
       
       if(a1.estaAprovado()){
            System.out.println("O aluno "+a1.getNome()+" está aprovado com nota "+a1.getNota()+"!");
       }else{
            System.out.println("O aluno "+a1.getNome()+" está reprovado com nota "+a1.getNota()+"!");
       }
       
       a2 = new Aluno();
       
       System.out.println("Informe o nome do aluno 2:");
       a2.setNome(le.next());
       
       System.out.println("Informe a nota do aluno 2:");
       a2.setNota(le.nextDouble());
       
       if(a2.estaAprovado()){
            System.out.println("O aluno "+a2.getNome()+" está aprovado com nota "+a2.getNota()+"!");
       }else{
            System.out.println("O aluno "+a2.getNome()+" está reprovado com nota "+a2.getNota()+"!");
       }
   }
}