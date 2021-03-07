
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
    
    public void setNome(String novoNome){
        nome = novoNome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setTemValeTransporte(boolean novoTemVale){
        temValeTransporte = novoTemVale;
    }
    
    public boolean getTemValeTransporte(){
        return temValeTransporte;
    }
    
    public void setTrabalhaNoite(boolean novoTrabalhaNoite){
        trabalhaNoite = novoTrabalhaNoite;
    }
    
    public boolean getTrabalhaNoite(){
        return trabalhaNoite;
    }
    
    public void setTotalVendas(double novoTotalVendas){
        totalVendas = novoTotalVendas;
    }
    
    public double getTotalVendas(){
        return totalVendas;
    }
    
    public void setSalarioBruto(double novoSalarioBruto){
        salarioBruto = novoSalarioBruto;
    }
    
    public double getSalarioBruto(){
        return salarioBruto;
    }
    
    public void setQtdeFilhos(int novaQtdeFilhos){
        qtdeFilhos = novaQtdeFilhos;
    }
    
    public int setQtdeFilhos(){
        return qtdeFilhos;
    }
}
