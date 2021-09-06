package Datas;

import java.time.LocalDateTime;

public class Exemplo3 {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        LocalDateTime dataDesafio = LocalDateTime.of(2010,05,15,10,00,00);
        System.out.println(dataDesafio);

        LocalDateTime futuro = dataDesafio.plusYears(4).minusMonths(6).plusHours(13);
        System.out.println(futuro);
    }
}
