import javax.swing.*;
import java.util.ArrayList;

import static javax.swing.UIManager.put;

class Box<T> {
    ArrayList<T> frut = new ArrayList<>();
    public void put(T fruties){

        frut.add(fruties);
    }

    public ArrayList<T> getFrut() {
        return frut;
    }
    public static Box<Fruit> getFruitBox(String [] a) {
        return frut;
    }
}