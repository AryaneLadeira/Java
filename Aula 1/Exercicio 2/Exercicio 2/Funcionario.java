
public class Funcionario
{
    String nome;
    boolean temValeTransporte, trabalhaNoite, trabalhaVendas;
    double totalVendas, salarioBruto;
    int qtdeFilhos;
    
    public Funcionario(){
        nome = "";
        temValeTransporte= trabalhaNoite= trabalhaVendas = false;
        totalVendas= salarioBruto = 0;
        qtdeFilhos = 0;
    
    }
    
    public Funcionario(String pNome, boolean pTemVale, 
    boolean pTrabalhaNoite, boolean pTrabalhaVendas, double pVendas,
    double pSalarioBruto, int pQtdeFilhos){
        nome = pNome;
        temValeTransporte = pTemVale;
        trabalhaNoite = pTrabalhaNoite;
        trabalhaVendas = pTrabalhaVendas;
        totalVendas = pVendas;
        salarioBruto = pSalarioBruto;
        qtdeFilhos = pQtdeFilhos;
    }
}
