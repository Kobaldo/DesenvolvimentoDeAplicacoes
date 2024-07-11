class Loja {
    Produto[][] produtos = new Produto[3][100]; // 3 seções com até 100 produtos cada
    int[] quantidadeDeProdutosPorSecao = {0, 0, 0};

    void adicionarProduto(int secao, int codigo, String nome, int quantidade, double preco) {
        Produto novoProduto = new Produto();
        novoProduto.codigo = codigo;
        novoProduto.nome = nome;
        novoProduto.quantidade = quantidade;
        novoProduto.preco = preco;
        produtos[secao][quantidadeDeProdutosPorSecao[secao]] = novoProduto;
        quantidadeDeProdutosPorSecao[secao]++;
    }

    void removerProduto(int secao, int codigo) {
        for (int i = 0; i < quantidadeDeProdutosPorSecao[secao]; i++) {
            if (produtos[secao][i].codigo == codigo) {
                produtos[secao][i] = produtos[secao][quantidadeDeProdutosPorSecao[secao] - 1];
                produtos[secao][quantidadeDeProdutosPorSecao[secao] - 1] = null;
                quantidadeDeProdutosPorSecao[secao]--;
                break;
            }
        }
    }

    void visualizarProdutos(int secao) {
        for (int i = 0; i < quantidadeDeProdutosPorSecao[secao]; i++) {
            System.out.println("Código: " + produtos[secao][i].codigo);
            System.out.println("Nome: " + produtos[secao][i].nome);
            System.out.println("Quantidade: " + produtos[secao][i].quantidade);
            System.out.println("Preço: " + produtos[secao][i].preco);
            System.out.println();
        }
    }
}