/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ishika
 */
@Entity
@Table(name = "order_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderMaster.findAll", query = "SELECT o FROM OrderMaster o"),
    @NamedQuery(name = "OrderMaster.findById", query = "SELECT o FROM OrderMaster o WHERE o.id = :id"),
    @NamedQuery(name = "OrderMaster.findByOrderId", query = "SELECT o FROM OrderMaster o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OrderMaster.findByPname", query = "SELECT o FROM OrderMaster o WHERE o.pname = :pname"),
    @NamedQuery(name = "OrderMaster.findByQty", query = "SELECT o FROM OrderMaster o WHERE o.qty = :qty"),
    @NamedQuery(name = "OrderMaster.findByPrice", query = "SELECT o FROM OrderMaster o WHERE o.price = :price"),
    @NamedQuery(name = "OrderMaster.findByTotalPrice", query = "SELECT o FROM OrderMaster o WHERE o.totalPrice = :totalPrice"),
    @NamedQuery(name = "OrderMaster.findByPaidAmount", query = "SELECT o FROM OrderMaster o WHERE o.paidAmount = :paidAmount"),
    @NamedQuery(name = "OrderMaster.findByDate", query = "SELECT o FROM OrderMaster o WHERE o.date = :date"),
    @NamedQuery(name = "OrderMaster.findByStatus", query = "SELECT o FROM OrderMaster o WHERE o.status = :status")})
public class OrderMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "pname")
    private String pname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "qty")
    private int qty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private int price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_price")
    private int totalPrice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "paid_amount")
    private String paidAmount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "pid", referencedColumnName = "pid")
    @ManyToOne(optional = false)
    private Product pid;

    public OrderMaster() {
    }

    public OrderMaster(Integer id) {
        this.id = id;
    }

    public OrderMaster(Integer id, int orderId, String pname, int qty, int price, int totalPrice, String paidAmount, Date date, String status) {
        this.id = id;
        this.orderId = orderId;
        this.pname = pname;
        this.qty = qty;
        this.price = price;
        this.totalPrice = totalPrice;
        this.paidAmount = paidAmount;
        this.date = date;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Product getPid() {
        return pid;
    }

    public void setPid(Product pid) {
        this.pid = pid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderMaster)) {
            return false;
        }
        OrderMaster other = (OrderMaster) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.OrderMaster[ id=" + id + " ]";
    }
    
}
