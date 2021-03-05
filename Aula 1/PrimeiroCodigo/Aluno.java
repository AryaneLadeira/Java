
public class Aluno //Aluno se torna um tipo de dado
{
    //Atributos
   String nome;
   double nota;
   
   public Aluno(String pNome, double pNota){
       nome = pNome;
       nota = pNota;
   }
   
   //Metodos
   public boolean estaAprovado(){
       
       return nota >= 6;
       //retorna um true ou false
   }
}
