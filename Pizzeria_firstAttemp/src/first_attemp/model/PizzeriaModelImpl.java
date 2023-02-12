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
    public OrderLabel addOrder(String orderName) {
        OrderLabel tmp = new OrderLabelImpl(orderName);
        orders.add(tmp);
        return tmp;
    }

    @Override
    public void removeOrder(String orderName) {
        orders.remove(new OrderLabelImpl(orderName));
    }
    
}
