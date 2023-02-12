package first_attemp;

import first_attemp.control.PizzeriaViewObserver;
import first_attemp.model.PizzeriaModel;
import first_attemp.model.PizzeriaModelImpl;
import first_attemp.view.PizzeriaView;
import first_attemp.view.PizzeriaViewImpl;

public class PizzeriaControlImpl implements PizzeriaViewObserver {
    
    private final PizzeriaView view;
    private final PizzeriaModel model;
    //private final 

    public PizzeriaControlImpl(int dim){
        view = new PizzeriaViewImpl(dim);
        view.setObserver(this);
        model = new PizzeriaModelImpl();
    }

    @Override
    public void newOrder(String orderName) {
        view.newOrder(model.addOrder(orderName));
    }

    @Override
    public void completeOrder(String orderName) {
        // TODO Auto-generated method stub
        
    }

    public static void main(String args[]){
        new PizzeriaControlImpl(5);
    }

    
}
