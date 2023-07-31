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
import javax.persistence.Lob;
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
@Table(name = "user_order_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserOrderDetail.findAll", query = "SELECT u FROM UserOrderDetail u"),
    @NamedQuery(name = "UserOrderDetail.findByOid", query = "SELECT u FROM UserOrderDetail u WHERE u.oid = :oid"),
    @NamedQuery(name = "UserOrderDetail.findByUid", query = "SELECT u FROM UserOrderDetail u WHERE u.uid = :uid"),
    @NamedQuery(name = "UserOrderDetail.findByFullName", query = "SELECT u FROM UserOrderDetail u WHERE u.fullName = :fullName"),
    @NamedQuery(name = "UserOrderDetail.findByEmail", query = "SELECT u FROM UserOrderDetail u WHERE u.email = :email"),
    @NamedQuery(name = "UserOrderDetail.findByCity", query = "SELECT u FROM UserOrderDetail u WHERE u.city = :city"),
    @NamedQuery(name = "UserOrderDetail.findByState", query = "SELECT u FROM UserOrderDetail u WHERE u.state = :state"),
    @NamedQuery(name = "UserOrderDetail.findByPincode", query = "SELECT u FROM UserOrderDetail u WHERE u.pincode = :pincode"),
    @NamedQuery(name = "UserOrderDetail.findByPaymentMode", query = "SELECT u FROM UserOrderDetail u WHERE u.paymentMode = :paymentMode"),
    @NamedQuery(name = "UserOrderDetail.findByPaidAmount", query = "SELECT u FROM UserOrderDetail u WHERE u.paidAmount = :paidAmount")})
public class UserOrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "oid")
    private Integer oid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uid")
    private int uid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "full_name")
    private String fullName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "pincode")
    private String pincode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "payment_mode")
    private String paymentMode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "paid_amount")
    private String paidAmount;

    public UserOrderDetail() {
    }

    public UserOrderDetail(Integer oid) {
        this.oid = oid;
    }

    public UserOrderDetail(Integer oid, int uid, String fullName, String email, String address, String city, String state, String pincode, String paymentMode, String paidAmount) {
        this.oid = oid;
        this.uid = uid;
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.paymentMode = paymentMode;
        this.paidAmount = paidAmount;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oid != null ? oid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserOrderDetail)) {
            return false;
        }
        UserOrderDetail other = (UserOrderDetail) object;
        if ((this.oid == null && other.oid != null) || (this.oid != null && !this.oid.equals(other.oid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.UserOrderDetail[ oid=" + oid + " ]";
    }
    
}
