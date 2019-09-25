import java.util.ArrayList;

public class Cadastro {

    private ArrayList<Funcionario> lista;
    private int contador;

    public Cadastro(ArrayList<Funcionario> lista) {
        lista = new ArrayList<Funcionario>();
        contador=0;
    }

    public void inclui (Funcionario f){
        lista.add(f);
    }

    public boolean exclui (String codigo){
        lista.remove(funcionario);
        return false;
    }

    public String geraRelatorio(){
        return "";
    }
}
