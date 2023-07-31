package Entity;

import Entity.Product;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-15T14:45:14", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(OrderMaster.class)
public class OrderMaster_ { 

    public static volatile SingularAttribute<OrderMaster, Date> date;
    public static volatile SingularAttribute<OrderMaster, Integer> orderId;
    public static volatile SingularAttribute<OrderMaster, Integer> totalPrice;
    public static volatile SingularAttribute<OrderMaster, String> pname;
    public static volatile SingularAttribute<OrderMaster, Integer> price;
    public static volatile SingularAttribute<OrderMaster, Integer> qty;
    public static volatile SingularAttribute<OrderMaster, Product> pid;
    public static volatile SingularAttribute<OrderMaster, Integer> id;
    public static volatile SingularAttribute<OrderMaster, String> paidAmount;
    public static volatile SingularAttribute<OrderMaster, String> status;

}