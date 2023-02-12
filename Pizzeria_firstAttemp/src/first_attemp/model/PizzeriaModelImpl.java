package first_attemp.model;

import java.util.HashSet;
import java.util.Set;

import first_attemp.OrderLabel;
import first_attemp.OrderLabelImpl;

public class PizzeriaModelImpl implements PizzeriaModel{

    private final Set<OrderLabel> orders = new HashSet<>();

    @Override
    public boolean checkOrder(String orderName) {
        return orders.contains(new OrderLabelImpl(orderName));
    }

    @Override
    public void addOrder(String orderName) {
        orders.add(new OrderLabelImpl(orderName));
    }

    @Override
    public void removeOrder(String orderName) {
        orders.remove(new OrderLabelImpl(orderName));
    }
    
}
