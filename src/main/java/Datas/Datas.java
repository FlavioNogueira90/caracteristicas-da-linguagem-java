package Datas;

import java.util.Date;

import static java.lang.System.currentTimeMillis;

public class Datas {
    public static void main(String[] args) {
    Long currentTimeStamp = currentTimeMillis();
    System.out.println(currentTimeStamp);

    Date data = new Date(currentTimeStamp);
        System.out.println(data);
    }

}
