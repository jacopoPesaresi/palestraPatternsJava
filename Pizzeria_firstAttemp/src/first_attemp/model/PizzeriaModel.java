package first_attemp.model;

import first_attemp.OrderLabel;

public interface PizzeriaModel {
    boolean checkOrder(String orderName);
    OrderLabel addOrder(String orderName);
    void removeOrder(String orderName);
}
