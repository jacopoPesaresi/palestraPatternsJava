package first_attemp.control;

public interface PizzeriaViewObserver {
    void newOrder(String orderName);
    void completeOrder(String orderName);
}
