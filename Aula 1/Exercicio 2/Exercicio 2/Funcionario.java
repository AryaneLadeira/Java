
public class Funcionario
{
    private String nome;
    private boolean temValeTransporte, trabalhaNoite, trabalhaVendas;
    private double totalVendas, salarioBruto;
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
    
    //Métodos
    public double calcularSalarioLiquido(){
        return salarioBruto - descontoINSS() - descontoValeTransporte()
        + bonusPorFilho() + bonusTrabalhaNoite() + bonusVendedor();
    }
    
    private double descontoINSS(){
        return salarioBruto - (salarioBruto * 0.13);
    }
    
    private double bonusPorFilho(){
        return (qtdeFilhos <= 3)? qtdeFilhos * 50 : 150;
    }
    
    private double descontoValeTransporte(){
        return (temValeTransporte)? salarioBruto * 0.03 : 0;
    }
    
    private double bonusTrabalhaNoite(){
        return (trabalhaNoite)? salarioBruto * 0.05 : 0;
    }
    
    private double bonusVendedor(){
        return (trabalhaVendas)? totalVendas * 0.02 : 0;
    }
    
    
    // Get e Set
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
        if(novaQtdeFilhos >= 0){
            qtdeFilhos = novaQtdeFilhos;
        }
    }
    
    public int getQtdeFilhos(){
        return qtdeFilhos;
    }
}
