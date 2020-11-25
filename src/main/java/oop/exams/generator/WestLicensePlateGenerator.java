package oop.exams.generator;

import java.util.Random;

public class WestLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        int i;
        String aux="2";
        Random r = new Random();
        int random = r.nextInt(9-0);
        aux = aux + String.valueOf(random);
        aux=aux+state;
        return aux;
    }
}