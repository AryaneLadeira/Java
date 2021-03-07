
public class Funcionario
{
    String nome;
    private boolean temValeTransporte, trabalhaNoite, trabalhaVendas;
    private double totalVendas, salarioBruto, salarioLiquido;
    private int qtdeFilhos;
    
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
    
    public double calcularSalarioLiquido(){
        salarioLiquido = salarioBruto - (salarioBruto * 0.13);
        
        if(qtdeFilhos > 0){
            if(qtdeFilhos <= 3){
                salarioLiquido += 50 * qtdeFilhos;
            }else{
                salarioLiquido += 150;
            }
        }
        
        if(temValeTransporte){
            salarioLiquido -= salarioLiquido * 0.03;
        }
        
        if(trabalhaNoite){
            salarioLiquido += salarioLiquido * 0.05;
        }
        
        if(trabalhaVendas){
            salarioLiquido += totalVendas * 0.02;
        }
        
        return salarioLiquido;
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
