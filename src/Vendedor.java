public class Vendedor extends Funcionario {

    private double totalVendas;
    private static int contador;

    public Vendedor(String codigo, String nome, double salario, double totalVendas) {
        super(codigo, nome, salario);
        this.totalVendas = totalVendas;
        //contador++;
        incrementaContador();
    }

    public Vendedor(String codigo, String nome, double salario) {

        super(codigo, nome, salario);
        incrementaContador();
        //contador++;
            }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void incrementaContador(){
        if (contador>=0) contador=contador+1;
        else contador=0;
    }

    public static int getContador(){
        return contador;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double getSalarioLiquido() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " Vendedor Total de vendas: " + totalVendas + " Salário Líquido: R$" + getSalarioLiquido();
    }
}
