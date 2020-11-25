package oop.exams.generator;

import java.util.Random;

public class EastLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        int i;
        String aux="3";
        for(i=0;i<2;i++){
            Random r = new Random();
            int random = r.nextInt(9-0);
            aux = aux + String.valueOf(random);
        }
        aux=aux+"Z";
        return aux;
    }
}
