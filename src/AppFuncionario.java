public class AppFuncionario {

    public static void main (String args[]){

        Cadastro lista = new Cadastro();

        Funcionario g1 = new Gerente("123", "João", 10000);
        Funcionario g2 = new Gerente("124", "Paulo", 20000);

        Funcionario v1 = new Vendedor("234", "Maria", 1000);
        Funcionario v2 = new Vendedor("235", "Joana", 1200, 1200);

        //g1 = v2;


        Vendedor v3 = new Vendedor("002", "Beltrano", 1000.0, 800.0);
        //Funcionario f2 = v3;
        Gerente g3 = new Gerente("003", "Ciclano", 2000.0);
        //v3 = f2;

        lista.inclui(g1);
        lista.inclui(g2);
        lista.inclui(v1);
        lista.inclui(v2);
        lista.inclui(v3);
        lista.inclui(g3);

        int contagem = Vendedor.getContador();

        System.out.println("Lista normal");
        System.out.println(lista);

        lista.ordenaSalario2();
        System.out.println("Lista ordenada por Comparable");
        System.out.println(lista);

        lista.ordenaSalario();
        System.out.println("Lista ordenada por Comparator.comparing");
        System.out.println(lista);

        lista.ordenaSalario3();
        System.out.println("Lista ordenada por Comparator");
        System.out.println(lista);

    }
}
