package com.company;

import java.util.*;

public class MeuExercicio {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        List<Double> temperaturasSemestre = new ArrayList<Double>();
        Integer i=1;

        while (i<7) {
            System.out.print("Entre com a temperatura do mês "+ i +" 25" +
                    "");
            Double temperaturaMes= scan.nextDouble();
            temperaturasSemestre.add(temperaturaMes);
            i++; }

        Double soma= 0d;
        Double media= 0d;
        Iterator<Double>iterator= temperaturasSemestre.iterator();
        while (iterator.hasNext()) {
            Double next= iterator.next();
            soma += next;
        }
        media= soma/ temperaturasSemestre.size();
        System.out.println("Media semestral da temperatura: "+ media);

        Integer mes= 0;
        String mesS= "1-Janeiro ";
        Iterator<Double>iterator1= temperaturasSemestre.iterator();
        while (iterator1.hasNext()){
            Double temperatura= iterator1.next();
            if (mes==1) mesS="2-Fevereiro ";
            if (mes==2) mesS="3-Março ";
            if (mes==3) mesS="4-Abril ";
            if (mes==4) mesS="5-Maio ";
            if (mes==5) mesS="6-Junho ";
            if (temperatura>media) {
                System.out.println("Temperatura acima da media no mes "+ mesS + temperatura);
            }
            mes++;
        }
    }
}

