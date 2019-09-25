public class Vendedor extends Funcionario {

    private double totalVendas;

    public Vendedor(String codigo, String nome, double salario, double totalVendas) {
        super(codigo, nome, salario);
        this.totalVendas = totalVendas;
    }

    public Vendedor(String codigo, String nome, double salario) {
        super(codigo, nome, salario);
            }

    public double getTotalVendas() {
        return totalVendas;
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
