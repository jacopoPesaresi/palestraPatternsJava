package first_attemp.view;

import javax.swing.JButton;

import first_attemp.OrderLabel;

public class LabeledOrder extends JButton {

    private final OrderLabel myOrder;

    public LabeledOrder(OrderLabel connected){
        super();
        this.myOrder = connected;
    }

    public OrderLabel getMyOrder() {
        return myOrder;
    }
    
}
