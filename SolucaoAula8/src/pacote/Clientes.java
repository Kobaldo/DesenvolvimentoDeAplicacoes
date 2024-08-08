package pacote;

public class Clientes {
    public String nomePublico = "Nome Público";
    protected String nomeProtegido = "Nome Protegido";
    String nomePadrao = "Nome Padrão";
    private String nomePrivado = "Nome Privado";

    public String getNomePrivado() {
        return nomePrivado;
    }
    public void setNomePrivado(String nomePrivado) {
        this.nomePrivado = nomePrivado;
    }
}

