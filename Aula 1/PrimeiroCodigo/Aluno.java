
public class Aluno //Aluno se torna um tipo de dado
{
    //Atributos
   private String nome;
   private double nota;
   
   //Método Construtor
   public Aluno(String pNome, double pNota){
       nome = pNome;
       nota = pNota;
   }
   
   public Aluno(){
       nome = "";
       nota = 0;
   }
   
   //Métodos de Acesso
   public void setNota(double novaNota){
       if (novaNota >= 0 && novaNota <= 10){
            nota = novaNota;
        }
   }
   
   public double getNota(){
        return nota;
   }
   
   public void setNome(String novoNome){
       nome = novoNome; 
   }
   
   public String getNome(){
       return nome.toUpperCase();
   }
   
   
   //Métodos
   public boolean estaAprovado(){
       
       return nota >= 6;
       //retorna um true ou false
   }
}
