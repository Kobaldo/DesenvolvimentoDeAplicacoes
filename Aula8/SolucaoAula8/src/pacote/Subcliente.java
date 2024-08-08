package pacote;

public class Subcliente extends Clientes {
    public void testarAcessos() {
        // Acesso a atributos
        System.out.println(nomePublico);     // Acesso permitido
        System.out.println(nomeProtegido);   // Acesso permitido
        System.out.println(nomePadrao);      // Acesso permitido
        // System.out.println(nomePrivado);  // Acesso negado
        System.out.println(getNomePrivado());
    }
}
