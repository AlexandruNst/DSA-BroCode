package _05_ArrayList_DynamicArrays;

public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[this.capacity];
    }

    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[this.capacity];
    }

    public void add(Object data){
        if(this.size >= this.capacity){
            grow();
        }
        this.array[this.size] = data;
        this.size++;
    }

    public void insert(int index, Object data){
        if(this.size >= this.capacity){
            grow();
        }
        for(int i = this.size; i > index; i--){
            this.array[i] = this.array[i-1];
        }

        this.array[index] = data;
        this.size++;
    }

    public void delete(Object data){
        for(int i = 0; i < this.size; i++){
            if(this.array[i] == data){
                for(int j = i; j < (this.size - 1); j++){
                    this.array[j] = this.array[j + 1];
                }
                this.array[this.size - 1] = null;
                this.size--;
                if(this.size <= (int) (this.capacity / 3)) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data){
        for(int i = 0; i < this.size; i++){
            if(this.array[i] == data){
                return i;
            }
        }
        return -1;
    }

    private void grow(){
        int newCapacity = (int) (this.capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < this.size; i++){
            newArray[i] = this.array[i];
        }

        this.capacity = newCapacity;
        this.array = newArray;
    }

    private void shrink(){
        int newCapacity = (int) (this.capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < this.size; i++){
            newArray[i] = this.array[i];
        }

        this.capacity = newCapacity;
        this.array = newArray;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < this.size; i++){
            stringBuilder.append(this.array[i]).append(", ");
        }

        if(!stringBuilder.isEmpty()) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }
        stringBuilder.insert(0, "[");
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    public void details(){
        System.out.println(this.toString());
        System.out.println("size: " + this.size);
        System.out.println("capacity: " + this.capacity);
        System.out.println("empty: " + this.isEmpty());
        System.out.println();
    }
}
