package ExImpostos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor:");
        String num1 = leitor.next();


        Double numero1 = Double.parseDouble(num1);

        ICMS icms = new ICMS();
        Double valorIcms = icms.calculaImposto(numero1);
        System.out.println("ICMS: " + valorIcms);

        IPI ipi = new IPI();
        Double valorIpi = ipi.calculaImposto(numero1);
        System.out.println("IPI: " + valorIpi);

        COFINS cofins = new COFINS();
        Double valorCofins = cofins.calculaImposto(numero1);
        System.out.println("COFINS: " + valorCofins);

        Double total = numero1 + valorIcms + valorIpi + valorCofins;

        System.out.println("Total: " + total);

    }
}
