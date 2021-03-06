
public class Aluno //Aluno se torna um tipo de dado
{
    //Atributos
   String nome;
   double nota;
   
   //Método Construtor
   public Aluno(String pNome, double pNota){
       nome = pNome;
       nota = pNota;
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
   
   
   //Metodos
   public boolean estaAprovado(){
       
       return nota >= 6;
       //retorna um true ou false
   }
}
