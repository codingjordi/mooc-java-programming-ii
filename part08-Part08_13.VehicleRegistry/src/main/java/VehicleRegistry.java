
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> register;

    public VehicleRegistry() {
        this.register = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.register.containsKey(licensePlate)) {
            this.register.put(licensePlate, owner);

            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (this.register.get(licensePlate) != null) {
            return this.register.get(licensePlate);

        }

        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.register.get(licensePlate) != null) {
            this.register.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : register.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        HashSet<String> owners = new HashSet<>(this.register.values());

        for (String owner : owners) {
            System.out.println(owner);
        }
    }

}
