public abstract class Funcionario implements Comparable<Funcionario>{

    private String codigo;
    private String nome;
    private double salario;

    public Funcionario(String codigo, String nome, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public int compareTo(Funcionario outro){
        if (getSalario()>outro.getSalario()) return 1;
        if (getSalario()<outro.getSalario()) return -1;
        return 0;
    };

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getSalarioLiquido();

    @Override
    public String toString() {
        return "Funcionario: " + nome + " - Código: " + codigo + " - Salário: " + salario;
    }
}
