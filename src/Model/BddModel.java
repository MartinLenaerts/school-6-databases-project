package Model;

import java.util.ArrayList;
import java.util.List;

public interface BddModel {

    boolean add();

    boolean remove();

    boolean find();

    boolean update();

    static ArrayList<Object> getAll(){
        return new  ArrayList<Object>();
    }

}
