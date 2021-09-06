package javaCalendar;

import java.util.Calendar;

public class Exemplo1 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é " + agora.getTime());

        agora.add(Calendar.DATE,-15);
        System.out.println("15 dias atrás era " + agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.println("Adicionando 4 meses " + agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("Adicionando 2 anos " + agora.getTime());
    }
}
