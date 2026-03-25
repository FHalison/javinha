public class ContaBanc {
   private String Titular;
   private   double  Saldo;
    static double taxa = 0.02;
    ContaBanc(String Titular, double Saldo){
        this.Titular = Titular;
        this.Saldo = Saldo;
    }
    void depositar(double valor){
        Saldo = Saldo + valor;
    }
    void sacar(double valor){
        Saldo = Saldo - valor;
    }
    void aplicarTaxa(){
        Saldo -= Saldo*taxa;
    }
    static void alterarTaxa(double novaTaxa){
taxa=novaTaxa;
    }
    void mostrarDados(){
        System.out.println("Nome:" + Titular +"\n" +
                            "Saldo:" + Saldo );
    }
    public void setTitular(String Titular){
        this.Titular=Titular;
    }
    public String getTitular(){
        return Titular;
    }








}

