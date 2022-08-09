package it.studio_java8.lombok.esempi.entity;

import java.math.BigDecimal;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        // @formatter:off
        Tfc1003Concorso entity = Tfc1003Concorso.builder()
                .dataCreazione(Calendar.getInstance())
                .dataDecreto(null)
                .titolo("yyy")
                .descrizione("xxx")
                .importoDirittiSegreteria(BigDecimal.ZERO)
                .addDecreto(new Tfc1018Decreto())
                .build();
        
        System.out.println(entity);
        
        Tfc1003Concorso entity2 = new Tfc1003Concorso();
        System.out.println(entity2);
        
        Main.test(
                "xx",
                "");
    }
    
    public static void test (String a, String b) {
        System.out.println("xxxxx");
        return;
    }


}
