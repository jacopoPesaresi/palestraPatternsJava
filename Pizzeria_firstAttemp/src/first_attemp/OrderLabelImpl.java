package first_attemp;

public class OrderLabelImpl implements OrderLabel {
    
    private final String orderName;

    public OrderLabelImpl(String orderName){
        super();
        this.orderName = orderName;
    }

    @Override
    public String getNameAboutOrder() {
        return orderName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((orderName == null) ? 0 : orderName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderLabelImpl other = (OrderLabelImpl) obj;
        if (orderName == null) {
            if (other.orderName != null)
                return false;
        } else if (!orderName.equals(other.orderName))
            return false;
        return true;
    }
    
}
