package oop.exams.generator;

import java.util.Random;

public class DefaultLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        int i;
        String aux="5";

        for(i=0;i<7;i++){
            Random r = new Random();
            int random = r.nextInt(9-0);
            aux = aux + String.valueOf(random);
        }
        return aux;
    }
}
