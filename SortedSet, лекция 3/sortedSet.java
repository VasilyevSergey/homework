import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedSet {
    SortedSet<Integer> mySortSet = new TreeSet<>();

    void addSomeVars() {
        for(int i = 1; i < 11; i++){
            mySortSet.add(i);
        }
    }

    public Integer getNextElem(Integer elem) {
        Iterator<Integer> iterator = mySortSet.iterator();
        Integer element = elem;
        boolean elemFounded = false;
        while((iterator.hasNext())&&(elemFounded == false)){
            element = iterator.next();
            if(element == elem){
                elemFounded = true;
                if(iterator.hasNext()){
                    element = iterator.next();
                    if (element == 5){
                        element = 6;
                    }
                }else{
                    System.out.println("Вы ввели последний элемент");
                    element = elem;
                }
            }
        }
        if(elemFounded == false){
            System.out.println("Введенный элемент не отсутствует");
            element = elem;
        }
        return element;
    }

    public void getPrevElems(Integer elem) {
        Iterator<Integer> iterator = mySortSet.iterator();
        Integer element = elem;
        boolean elemFounded = false;

        //сначала проверяем наличие введенного элемента в кллекции
        while((iterator.hasNext())&&(elemFounded == false)){
            element = iterator.next();
            if (element == elem){
                elemFounded = true;
            }
        }
        if (elemFounded == true){
            Iterator<Integer> iteratorPrev = mySortSet.iterator();
            elemFounded = false;
            while((iterator.hasNext())&&(elemFounded == false)){
                element = iteratorPrev.next();
                if (element == elem){
                    elemFounded = true;
                }else{
                    System.out.println(element);
                }
            }

        }else{
            System.out.println("Введенный элемент отсутствут");
        }
    }

    public static void main(String[] args) {
        sortedSet set = new sortedSet();
        set.addSomeVars();

        System.out.println("Введите искомый элемент");
        Scanner in = new Scanner(System.in);
        Integer var = in.nextInt();

        System.out.println(set.getNextElem(var));

        System.out.println("Введите искомый элемент");
        in = new Scanner(System.in);
        var = in.nextInt();
        set.getPrevElems(var);
    }
}