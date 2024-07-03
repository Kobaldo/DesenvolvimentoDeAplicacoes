public class ManipularString {
    void manipularStrings(String entrada) {
        System.out.println("A string avaliada é: "+ entrada);
        System.out.println("Seu tamanho é: "+ entrada.length());
        System.out.println("Na posição 2 ela tem o char: "+ entrada.charAt(2));
        System.out.println("A partir da posição 2 ela tem: "+ entrada.substring(2));
        System.out.println("Entre a posição 2 e 4 ela tem: "+ entrada.substring(2,4));
        System.out.println("Adicionando 'maravilhoso' no fim, ela fica assim: "+ entrada.concat("Maravilhoso"));
        System.out.println("A primeira letra 'a' ocorre na posição "+ entrada.indexOf('a'));
        System.out.println("O primeiro 'bo' a partir da posição 1 ocorre em "+ entrada.indexOf("bo",1));
        System.out.println("O último 'bo' ocorre em "+ entrada.lastIndexOf("bo"));
        System.out.println("A palavra é IGUAL a 'aboboda'? "+ entrada.equals("aboboda"));
        System.out.println("Ignorando maíusculas, a palavra é IGUAL a 'aboboda'? "+ entrada.equalsIgnoreCase("AboBoda"));
        System.out.println("Em miniscula, ela fica "+ entrada.toLowerCase());
        System.out.println("Em maiuscula, ela fica "+ entrada.toUpperCase());
        System.out.println("Cortando os espaços em branco, temos: "+ entrada.trim());
        System.out.println("Substituindo 'O' por 7, temos "+ entrada.replace('o','7'));
        System.out.println("A comparação com 'cardume' gera a saída "+ entrada.compareTo("cardume"));
    }
}
