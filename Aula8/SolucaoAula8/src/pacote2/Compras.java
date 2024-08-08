package pacote2;

import pacote.Clientes;

public class Compras {
    public String itemPublico = "Item Público";
    protected String itemProtegido = "Item Protegido";
    String itemPadrao = "Item Padrão";
    private String itemPrivado = "Item Privado";

    public String getItemProtegido() {
        return itemProtegido;
    }

    public void setItemProtegido(String itemProtegido) {
        this.itemProtegido = itemProtegido;
    }

    public String getItemPadrao() {
        return itemPadrao;
    }

    public void setItemPadrao(String itemPadrao) {
        this.itemPadrao = itemPadrao;
    }

    public String getItemPrivado() {
        return itemPrivado;
    }

    public void setItemPrivado(String itemPrivado) {
        this.itemPrivado = itemPrivado;
    }

}
