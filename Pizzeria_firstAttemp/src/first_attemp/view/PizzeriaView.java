package first_attemp.view;

import first_attemp.OrderLabel;
import first_attemp.control.PizzeriaViewObserver;

public interface PizzeriaView{

    void setObserver(PizzeriaViewObserver toSet);
    void start();

    void newOrder(OrderLabel orderAdded);
    void completeOrder(String orderName);
}