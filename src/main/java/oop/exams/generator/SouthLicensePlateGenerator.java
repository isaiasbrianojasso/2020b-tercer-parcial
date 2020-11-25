package oop.exams.generator;

import java.util.*;

public class SouthLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        int i;
        Random r = new Random();
        int random2 = r.nextInt(5-2);

        String aux="4";

        switch ((int) random2){
            case 2:
                aux=aux+state;
                for(i=0;i<3;i++) {
                    Random r2 = new Random();
                    int random = r2.nextInt(9-0);
                    aux=aux+random;
                }
                    break;
            case 3:
                Random r2 = new Random();
                int random = r2.nextInt(9-0);
                aux=aux+random;
                aux=aux+state;
                Random r3 = new Random();
                int random1 = r3.nextInt(9-0);
                aux=aux+random1;
                Random r4 = new Random();
                int random4 = r4.nextInt(9-0);
                aux=aux+random4;
                break;
            case 4:
                for(i=0;i<3;i++) {
                    Random r5 = new Random();
                    int random5 = r5.nextInt(9-0);
                    aux=aux+random5;
                }
                aux=aux+state;
                break;


        }


        return aux;
    }
}
