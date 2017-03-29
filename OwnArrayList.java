import java.util.Arrays;

public class OwnArrayList<T> {

    private static final int defArrayLength = 10;

    private static final Object[] defArray = {};

    private Object[] array;

    private int size;

    public OwnArrayList(){
        this.array = defArray;
        this.array = Arrays.copyOf(this.array, defArrayLength);
    }

    private void incLength() {
        array = Arrays.copyOf(array, array.length*2);
    }

    public int listSize() {
        return size;
    }

    public void add(T element) {
        if(size == array.length) incLength();
        array[size++] = element;
    }

    public void sdvig(int index){
        if(listSize() == array.length) incLength();
        for(int i = size; i > index - 1; i--){
            array[i+1] = array[i];
        }
        size++;
    }

    public T remove(int index){
        T result = (T)array[index];
        for(int i = index; i < size; i++){
            array[i] = array[i + 1];
        }
        size--;
        return result;
    }

    public void add(T element, int index){
        if(listSize() == array.length) incLength();
        sdvig(index);
        array[index] = element;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public T get(int index){
        return (T) array[index];
    }
}
