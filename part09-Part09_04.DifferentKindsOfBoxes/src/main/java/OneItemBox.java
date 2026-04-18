
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
public class OneItemBox extends Box{
    
    private ArrayList<Item> items;
     
    public OneItemBox() {
        this.items = new ArrayList<>();
    }
    
    public OneItemBox(Item item) {
        if(item instanceof Item) {
            this.items = new ArrayList<>();
            this.items.add(item);
        }
    }

    @Override
    public void add(Item item) {
        if(this.items.isEmpty() && item != null) {
            this.items.add(item);
        } 
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
