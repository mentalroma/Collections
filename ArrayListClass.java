import java.util.ArrayList;
import java.util.Random;
/*
*  ArrayList хорошо подходит для добавления данных в конец списка и извлечения данных
* */
public class ArrayListClass {
    private ArrayList<Integer> arrayList;
    private Random rand;

    ArrayListClass(){
        arrayList = new ArrayList();
        rand = new Random();
    }

    public void setList(){
        for (int i = 0; i < 10; i++) {
            arrayList.add(rand.nextInt(20));
        }
    }

    public void getList(){
        for(int var : arrayList){
            System.out.print(var + " ");
        }
    }
}
