public class Produto {
    String nomeProduto;

    public void adicionarProduto(){
        System.out.println("Digite o nome do produto a ser adicionado: ");
        this.nomeProduto = Main.scanner.nextLine();
        System.out.println("Funcionario "+ nomeProduto +" registrado com sucesso!" );
    }

    public void removerProduto(){
        System.out.println("Digite o nome do produto a ser removido: ");
        String produtoDelete = Main.scanner.nextLine();
        if(produtoDelete.equals(nomeProduto)){
            this.nomeProduto = "";
            System.out.println("Produto "+ produtoDelete +" deletado com sucesso!" );
        } else {
            System.out.println("Produto "+ produtoDelete +" não encontrado!" );
        }
    }
}
