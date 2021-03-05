
public class Aluno //Aluno se torna um tipo de dado
{
    //Atributos
   String nome;
   double nota;
   
   //Metodos
   public boolean estaAprovado(){
        if(nota >=7){
            return true;
        }else{
            return false;
        }
    }
}
