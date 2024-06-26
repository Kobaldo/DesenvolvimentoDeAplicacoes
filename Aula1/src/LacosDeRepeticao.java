public class LacosDeRepeticao {
    void executarFor(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
    void executarWhile (){
        int x = 0;
        while (x<10){
            System.out.println("x= "+x);
            x++;
        }
    }
    void executarDoWhile (){
        int x = 10;
        do{
            System.out.println("x= "+x);
            x--;
        } while (x>0);
    }

    void executarSwitch(){
        int x = 5;
        switch (x){
            case 0:
                System.out.println("X é nulo");
                break;
            case 1:
                System.out.println("X vale 1");
                break;
            case 5:
                System.out.println(("X vale cinco"));
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
