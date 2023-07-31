/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ishika
 */
@Entity
@Table(name = "product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findByPid", query = "SELECT p FROM Product p WHERE p.pid = :pid"),
    @NamedQuery(name = "Product.findByProductName", query = "SELECT p FROM Product p WHERE p.productName = :productName"),
    @NamedQuery(name = "Product.findByMrp", query = "SELECT p FROM Product p WHERE p.mrp = :mrp"),
    @NamedQuery(name = "Product.findBySellingPrice", query = "SELECT p FROM Product p WHERE p.sellingPrice = :sellingPrice"),
    @NamedQuery(name = "Product.findByQty", query = "SELECT p FROM Product p WHERE p.qty = :qty"),
    @NamedQuery(name = "Product.findByImages", query = "SELECT p FROM Product p WHERE p.images = :images"),
    @NamedQuery(name = "Product.findByTitle", query = "SELECT p FROM Product p WHERE p.title = :title"),
    @NamedQuery(name = "Product.findByDescription", query = "SELECT p FROM Product p WHERE p.description = :description"),
    @NamedQuery(name = "Product.findByIntgredients", query = "SELECT p FROM Product p WHERE p.intgredients = :intgredients"),
    @NamedQuery(name = "Product.findByHowto", query = "SELECT p FROM Product p WHERE p.howto = :howto")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pid")
    private Integer pid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "productname")
    private String productName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mrp")
    private int mrp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sellingprice")
    private int sellingPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "qty")
    private int qty;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "images")
    private String images;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "intgredients")
    private String intgredients;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "howto")
    private String howto;
    @JoinColumn(name = "categoryid", referencedColumnName = "cid")
    @ManyToOne(optional = false)
    private Category category;
    @JoinColumn(name = "brandid", referencedColumnName = "bid")
    @ManyToOne(optional = false)
    private Brand brand;

    public Product() {
    }

    public Product(Integer pid) {
        this.pid = pid;
    }

    public Product(Integer pid, String productName, int mrp, int sellingPrice, int qty, String images, String title, String description, String intgredients, String howto) {
        this.pid = pid;
        this.productName = productName;
        this.mrp = mrp;
        this.sellingPrice = sellingPrice;
        this.qty = qty;
        this.images = images;
        this.title = title;
        this.description = description;
        this.intgredients = intgredients;
        this.howto = howto;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getMrp() {
        return mrp;
    }

    public void setMrp(int mrp) {
        this.mrp = mrp;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Product[ pid=" + pid + " ]";
    }
    
}
