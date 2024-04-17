import java.util.Arrays;

public class LInkedListMyRealization {
    private Node head;
    private int size;

    public void add(int value){

        if(head == null){  // Если список пустой ставим на первое место элемент
            this.head = new Node(value);
        } else {
            Node temp = head;

            while(temp.getNext() != null){ //Если у нас уже есть в нем элементы идем
                temp = temp.getNext(); // до конца
            }
            temp.setNext(new Node(value)); // и ставим последним
        }

        size++;
    }

    public String toString(){
        int [] result = new int[size];
        int idx = 0;
        Node temp = head; // создали перемменую поместиили в нее начало списка

        while(temp != null){ // идем по списку и вносим данные в массив пока список не пустой
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }

    public int get(int index) {
        Node temp = head;
        int idx = 0;

        while(temp != null){ // Идем по списку
            if(idx == index){ // если индексы совпадают  возвращаем нужное значение
                return temp.getValue();
            } else {  // если индексы не совпали итерируемся дальше по списку
                temp = temp.getNext();
                idx++;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public void remove(int index){
        Node temp = head;
        int idx = 0;

        while(temp != null){
            if((idx + 1) == index){
                temp.setNext(temp.getNext().getNext()); //присваиваем одному узлу ссылку на один больше
                size--;
                return;
            } else {
                temp = temp.getNext();
                idx++;
            }
        }
    }

    private static class Node{
        private Node next;
        private int value;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node(int value) {
        this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


}
