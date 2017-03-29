import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Никита on 27.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        //Демонстрация конструктора
        OwnArrayList<Integer> list = new OwnArrayList<>();

        System.out.println("Демонстрация add(); get(index)");
        list.add(1);
        list.add(2);
        list.add(3);
        for(int i = 0; i < list.listSize(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println("Демонстрация add(index)");
        list.add(4, 1);
        for(int i = 0; i < list.listSize(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println("Демонстрация remove(index)");
        System.out.println(list.remove(2));
        for(int i = 0; i < list.listSize(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println("Демонстрация clear()");
        list.clear();
        System.out.println(list.listSize());
        System.out.println();




        //Сравнение быстродействия
        long timeStart = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            OwnArrayList<Integer> list1 = new OwnArrayList<>();
        }
        long timeEnd = System.nanoTime();
        System.out.println("OwnArrayList() - " + ((double)(timeEnd - timeStart) / 1000000) + "ms");

        timeStart = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            List<Integer> list2 = new ArrayList<>();
        }
        timeEnd = System.nanoTime();
        System.out.println("ArrayList() - " + ((double)(timeEnd - timeStart) / 1000000) + "ms");
        System.out.println();



        OwnArrayList<Integer> list1 = new OwnArrayList<>();
        List<Integer> list2 = new ArrayList<>();



        timeStart = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            list1.add(i);
        }
        timeEnd = System.nanoTime();
        System.out.println("OwnArrayList.add() - " + ((double)(timeEnd - timeStart) / 1000000) + "ms");

        timeStart = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            list2.add(i);
        }
        timeEnd = System.nanoTime();
        System.out.println("ArrayList.add() - " + ((double)(timeEnd - timeStart) / 1000000) + "ms");
        System.out.println();



        timeStart = System.nanoTime();
        for(int i = 0; i < 100; i++){
            list1.add(i, i);
        }
        timeEnd = System.nanoTime();
        System.out.println("OwnArrayList.add(index) - " + ((double)(timeEnd - timeStart) / 1000000) + "ms");

        timeStart = System.nanoTime();
        for(int i = 0; i < 100; i++){
            list2.add(i, i);
        }
        timeEnd = System.nanoTime();
        System.out.println("ArrayList.add(index) - " + ((double)(timeEnd - timeStart) / 1000000) + "ms");
        System.out.println();



        timeStart = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            list1.clear();
        }
        timeEnd = System.nanoTime();
        System.out.println("OwnArrayList.clear() - " + ((double)(timeEnd - timeStart) / 1000000) + "ms");

        timeStart = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            list2.clear();
        }
        timeEnd = System.nanoTime();
        System.out.println("ArrayList.clear() - " + ((double)(timeEnd - timeStart) / 1000000) + "ms");
    }
}
