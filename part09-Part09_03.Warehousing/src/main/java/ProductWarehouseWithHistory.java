/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jordi
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();

        super.addToWarehouse(initialBalance);

        this.history.add(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);

        this.history.add(this.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double amountReceived = super.takeFromWarehouse(amount);

        this.history.add(this.getBalance());

        return amountReceived;
    }
}
