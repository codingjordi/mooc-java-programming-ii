
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jordi
 */
public class BoxWithMaxWeight extends Box {
    
    private int maxWeight;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
    }

    @Override
    public void add(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isInBox(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
