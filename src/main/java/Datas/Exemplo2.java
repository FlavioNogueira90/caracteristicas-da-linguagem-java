package Datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo2 {
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:SSS");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
    }
}
