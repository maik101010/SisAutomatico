/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Michael García A
 */
public class Segundos {

    public static void main(String[] args) {
        LocalDateTime justoAhora;
        try {
            for (int i = 1; i < 4; i++) {
                justoAhora = LocalDateTime.now();
                System.out.printf("En este momento son las %d horas con %d minutos y %d segundos\n", justoAhora.getHour(),
                        justoAhora.getMinute(), justoAhora.getSecond());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }

}
