package first_attemp.model;

public interface PizzeriaModel {
    boolean checkOrder(String orderName);
    void addOrder(String orderName);
    void removeOrder(String orderName);
}
