package Entity;

import Entity.Product;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-15T14:45:14", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> category;
    public static volatile ListAttribute<Category, Product> productList;
    public static volatile SingularAttribute<Category, Integer> cid;

}