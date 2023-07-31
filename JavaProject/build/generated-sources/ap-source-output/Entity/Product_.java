package Entity;

import Entity.Brand;
import Entity.Category;
import Entity.OrderMaster;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-15T14:45:14", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Date> date;
    public static volatile SingularAttribute<Product, String> images;
    public static volatile SingularAttribute<Product, String> howto;
    public static volatile ListAttribute<Product, OrderMaster> orderMasterList;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, Integer> pid;
    public static volatile SingularAttribute<Product, Long> mrp;
    public static volatile SingularAttribute<Product, String> title;
    public static volatile SingularAttribute<Product, String> productName;
    public static volatile SingularAttribute<Product, String> intgredients;
    public static volatile SingularAttribute<Product, Long> sellingPrice;
    public static volatile SingularAttribute<Product, Integer> qty;
    public static volatile SingularAttribute<Product, Category> category;
    public static volatile SingularAttribute<Product, Brand> brand;
    public static volatile SingularAttribute<Product, String> status;

}