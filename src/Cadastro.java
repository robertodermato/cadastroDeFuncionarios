import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cadastro {

    private ArrayList<Funcionario> lista;
    private int contador;

    public Cadastro() {
        lista = new ArrayList<Funcionario>();
        contador=0;
    }

    public void inclui (Funcionario f){
        lista.add(f);
    }

    public boolean exclui (String codigo){

        return false;
    }

    public void ordenaNome(){
        lista.sort(Comparator.comparing(Funcionario::getNome));
    }

    public void ordenaCodigo(){
        lista.sort(Comparator.comparing(Funcionario::getCodigo));
    }

    public void ordenaSalario(){
        lista.sort(Comparator.comparing(Funcionario::getSalario));
    }

    public void ordenaSalario2(){
        Collections.sort(lista);
    }

    public void ordenaSalario3(){
        Collections.sort(lista, new ordenaSalario3());
    }

    public String toString(){
        String listaStr ="";
        for (Funcionario f: lista){
            listaStr = listaStr + f + "\n";
        }
        return listaStr;
    }
}
