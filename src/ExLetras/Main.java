package ExLetras;

public class Main {
    public static void main(String[] args) {
        String str1 = "Na minha máquina funciona";
        System.out.println("String original: "+str1);
        System.out.println("Comprimento da última palavra da string acima: "+comprimento_ult_palavra(str1));

        String str2 = "Eu posso pular o teste";
        System.out.println("String original: "+str2);
        System.out.println("Comprimento da última palavra da string acima: "+comprimento_ult_palavra(str2));

        String str3 = "Isso não deve demorar";
        System.out.println("String original: "+str3);
        System.out.println("Comprimento da última palavra da string acima: "+comprimento_ult_palavra(str3));
    }

    public static int comprimento_ult_palavra(String str1) {
        int length_word = 0;
        String[] words = str1.split(" ");
        if(words.length>0) {
            length_word = words[words.length-1].length();
        } else {
            length_word = 0;
        }
        return length_word;
    }
}
