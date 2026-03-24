
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
        
    }
    
    public ArrayList<String> contents(String storageUnit) {
        
        ArrayList<String> content = this.storage.get(storageUnit);
        
        if (content == null) {
            return new ArrayList<>();
        }
        
        return content;
        
    }
    
    public void remove(String storageUnit, String item) {
        
        if(this.storage.containsKey(storageUnit)) {
            ArrayList<String> storageItems = this.storage.get(storageUnit);
            
            storageItems.remove(item);
            
            if(storageItems.isEmpty()) {
                this.storage.remove(storageUnit);
            }
        }
        
        
    }
    
    public ArrayList<String> storageUnits() {
        return new ArrayList<>(this.storage.keySet());
    }
}
