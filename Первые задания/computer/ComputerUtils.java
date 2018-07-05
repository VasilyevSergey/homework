package computer;

import java.util.ConcurrentModificationException;
import java.util.Optional;

public class ComputerUtils {

    public static void printAll( Computer... comps){
        if(comps.length == 0){
            System.out.println("Нет аргументов");
            return;
        }

        for(int i = 0; i < comps.length; i++){
            if(comps[i].getModel() != null) {
                System.out.println(comps[i].getModel());
            }
        }
    }

    public static Computer findComp(int ramAmount, Computer... comps){
        System.out.println("Успех");
        Computer resultComp = null;
        if(comps.length == 0){
            System.out.println("Нет компов");
            return  null;
        }

        for(int i = 0; i < comps.length; i++){
            if(comps[i].getRamAmount() == ramAmount){
                resultComp = comps[i];
                System.out.println("Успех");
            }
        }
        return resultComp;
    }
}
