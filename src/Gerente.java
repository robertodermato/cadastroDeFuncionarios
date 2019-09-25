public class Gerente extends Funcionario{

    private double bonus;

    public Gerente(String codigo, String nome, double salario) {
        super(codigo, nome, salario);
            }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalarioLiquido() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " Gerente bônus: " + bonus + " Salário Líquido: R$" + getSalarioLiquido();
    }
}
