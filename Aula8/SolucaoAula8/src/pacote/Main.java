package pacote;

import pacote2.Compras;

public class Main {
    public static void main(String[] args) {
        Clientes cliente = new Clientes();
        Compras compra = new Compras();
        Subcliente subcliente = new Subcliente();

        // Teste de acesso na classe Clientes
        System.out.println(cliente.nomePublico);
        System.out.println(cliente.nomeProtegido);
        System.out.println(cliente.nomePadrao);
       // System.out.println(cliente.nomePrivado); // Acesso negado
        System.out.println(cliente.getNomePrivado());

        // Teste de acesso na classe Compras
        System.out.println(compra.itemPublico); // Acesso permitido
        // System.out.println(compra.itemProtegido); // Acesso negado
        System.out.println(compra.getItemProtegido());
        // System.out.println(compra.itemPadrao); // Acesso negado
        System.out.println(compra.getItemPadrao());
        // System.out.println(compra.itemPrivado); // Acesso negado
        System.out.println(compra.getItemPrivado());

        subcliente.testarAcessos();
    }
}
