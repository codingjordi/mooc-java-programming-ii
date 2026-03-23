
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
    
    private HashMap<String, ArrayList<String>> storageUnit;
    
    public StorageFacility() {
        this.storageUnit = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        
        this.storageUnit.putIfAbsent(unit, new ArrayList<>());
        this.storageUnit.get(unit).add(item);
        
    }
    
    public ArrayList<String> contents(String storageUnit) {
        
        ArrayList<String> content = this.storageUnit.get(storageUnit);
        
        if (content == null) {
            return new ArrayList<>();
        }
        
        return content;
        
    }
}
