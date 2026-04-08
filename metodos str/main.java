import java.util.Scanner;

import java.util.Scanner;
public class main { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nome = "Henrique Dias Pastor";
    String substring = nome.substring(5,10);
    System.out.println(nome);
    System.out.println(substring);
    String trim = nome.trim();
    System.out.println(trim);
    System.out.println(nome.charAt(0));

    Pessoa p = new Pessoa("Halison", "1234", "rua x", "93434", "34324");
    System.out.println(p.getTelefoneComercial());

    p.setTelefoneComercial("fsdfdsfsd");
    p.setTelefone(new Telefone("54545","676767"));



    System.out.println(p.getTelefone().getTelefonePessoal());












    }
}
