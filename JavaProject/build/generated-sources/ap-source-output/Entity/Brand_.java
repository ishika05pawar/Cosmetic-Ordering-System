package Entity;

import Entity.Product;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-15T14:45:14", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Brand.class)
public class Brand_ { 

    public static volatile SingularAttribute<Brand, Integer> bid;
    public static volatile SingularAttribute<Brand, String> brand;
    public static volatile ListAttribute<Brand, Product> productList;

}