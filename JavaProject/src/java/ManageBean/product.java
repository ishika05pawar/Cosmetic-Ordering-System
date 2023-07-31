/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ManageBean;

import EJB.catLocal;
import Entity.Brand;
import Entity.Category;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ishika
 */
@Named(value = "product")
@SessionScoped
public class product implements Serializable {
     @EJB catLocal ctl;
     
    List<Brand> lsb=null;
    List<Category> lct=null;

    public List<Brand> getLsb() {
        return lsb;
    }

    public void setLsb(List<Brand> lsb) {
        this.lsb = lsb;
    }

    public List<Category> getLct() {
        return lct;
    }

    public void setLct(List<Category> lct) {
        this.lct = lct;
    }
    
    int pid,category,brand,mrp,sellingprice,qty;
    String productname,images,title,description,intgredients,howto;
    @PersistenceContext(unitName = "categoryPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public int getMrp() {
        return mrp;
    }

    public void setMrp(int mrp) {
        this.mrp = mrp;
    }

    public int getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(int sellingprice) {
        this.sellingprice = sellingprice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    
    
    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIntgredients() {
        return intgredients;
    }

    public void setIntgredients(String intgredients) {
        this.intgredients = intgredients;
    }

    public String getHowto() {
        return howto;
    }

    public void setHowto(String howto) {
        this.howto = howto;
    }
    

    /**
     * Creates a new instance of product
     */
    public product() {
    }

    public void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }
    public String addproduct()
    {
        try
        {
            ctl.addproduct(category, productname, brand, mrp, sellingprice, qty, images, title, description, intgredients, howto);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        productname="";
        images="";
        title="";
        description="";
        intgredients="";
        howto="";
         return "admin_product_detail.jsf";
    }
    
}
