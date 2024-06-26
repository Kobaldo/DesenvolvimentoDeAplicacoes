public class Main {
    public static void main(String[] args) {
        Leitura ler = new Leitura();
        ler.receberFrase();
        ler.receberInteiro();
        ler.fecharScanner();

        Escrita escreva = new Escrita();
        escreva.escrever();

        OperacoesBasicas op = new OperacoesBasicas();
        System.out.println("O resultado da soma é: "+ op.adicionar(5, 10));

        LacosDeRepeticao lacos = new LacosDeRepeticao();
        lacos.executarFor();

    }
}