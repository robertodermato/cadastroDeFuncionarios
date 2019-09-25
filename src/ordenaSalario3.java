import java.util.Comparator;

public class ordenaSalario3 implements Comparator<Funcionario> {


    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        if (f1.getSalario()>f2.getSalario()) return 1;
        if (f1.getSalario()<f2.getSalario()) return -1;
        return 0;
    }
}
