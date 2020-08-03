import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MyArrayList <T> {

    Integer size;
    private T[] myArray;

    public MyArrayList(){
        size = 20; // default size
        myArray = (T[]) new Object[size];
    }

    public MyArrayList(int size){
        this.size = size;
        myArray = (T[]) new Object[size];
    }

    //Override?
    public Boolean add(T o){ // appends to the end of the arraylist
        //Object[] newMyArr = new T[myArray.length + 1];
        return null;
    }

    public Boolean add(int index, Object o){
        return null;
    }

    public Object get(int index){
        return null;
    }

    public Object remove(int index){
        return null;
    }

    public Object remove(Object o){
        return null;
    }

    public Object set(int index, Object o){
        return null;
    }

    public void clear(){

    }

    public Boolean isEmpty(){
        return null;
    }

    public Boolean contains(){
        return null;
    }

    public Integer size(){
        return myArray.length;
    }

}
