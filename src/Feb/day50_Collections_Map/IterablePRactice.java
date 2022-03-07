package Feb.day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePRactice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,7,2,4,1,6));

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) < 4) {
                list.remove(i);
                i --;
            }
        }

        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,7,2,4,1));

        Iterator<Integer> it = list2.iterator();

        while (it.hasNext()){
            if (it.next() < 4 ){
                it.remove();
            }

        }

        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,7,2,4,1));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext();){

            if (i.next() < 4){
                i.remove();
            }
        }

        System.out.println("list3 = " + list3);

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,7,2,4,1));

        list4.removeIf( each -> each < 4); // lambda expression, each is just a variable

        System.out.println("list4 = " + list4);

    }
}
