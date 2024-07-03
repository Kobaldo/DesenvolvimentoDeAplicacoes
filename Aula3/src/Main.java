import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) throws Exception {
        byte[] byteArr = {104, 101, 108, 108, 111}; // 'hello' em ASCII
        char[] charArr = {'w', 'o', 'r', 'l', 'd'};

        // Usando String(byte[] byte_arr)
        String str1 = new String(byteArr);
        System.out.println(str1); // Saída: hello

        // Usando String(byte[] byte_arr, Charset char_set)
        Charset charset = Charset.forName("UTF-8");
        String str2 = new String(byteArr, charset);
        System.out.println(str2); // Saída: hello

        // Usando String(byte[] byte_arr, String char_set_name)
        try{
            String str3 = new String(byteArr, "UTF-8");
            System.out.println(str3); // Saída: hello
        }catch (Exception e){
            throw new Exception(e);
        }

        // Usando String(byte[] byte_arr, int start_index, int length)
        String str4 = new String(byteArr, 1, 3);
        System.out.println(str4); // Saída: ell

        // Usando String(byte[] byte_arr, int start_index, int length, String char_set_name)
        String str5 = new String(byteArr, 1, 3, "UTF-8");
        System.out.println(str5); // Saída: ell

        // Usando String(char[] char_arr)
        String str6 = new String(charArr);
        System.out.println(str6); // Saída: world

        ManipularString manipularString = new ManipularString();
        manipularString.manipularStrings("AbObobofs");
    }
}
