
public class Principal
{
   public static void main(String args[]){
       System.out.println("###### Sistema Acadêmico ######");
       
       Aluno a1, a2;
       
       a1 = new Aluno("Zezin", 9);
       
       if(a1.estaAprovado()){
            System.out.println("O aluno "+a1.getNome()+" está aprovado!");
       }else{
            System.out.println("O aluno "+a1.getNome()+" está reprovado!");
       }
       
       a2 = new Aluno("Pedrin", 4);
       
       if(a2.estaAprovado()){
            System.out.println("O aluno "+a2.getNome()+" está aprovado!");
       }else{
            System.out.println("O aluno "+a2.getNome()+" está reprovado!");
       }
   }
}
