import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class lesson7 {

    public static <T> void addAll(final Collection<? extends T> src,final Collection<? super T> dest){
        dest.addAll(src);
    }

    public static <T> int countContains(final Collection<? extends T> src, final Object element){
        int count = 0;
        for(final Object o: src){
            if(o.equals(element)){
                count++;
            }
        }
        return count;
    }

    public static <T>void mirror(final List<T> list){
        for(int i = 0; i< list.size()/2;++i){
            final T t = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1 , t);
        }
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);

        List<Integer> list2 = new ArrayList<>();
        addAll(list, list2);

        Integer element = 1;
        countContains(list, element);

        mirror(list);


    }
}
