/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ManageBean;

import EJB.catLocal;
import Entity.Brand;


import Entity.Category;
import Entity.Product;
import Entity.Users;
import client.client;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.Part;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import org.glassfish.soteria.identitystores.hash.Pbkdf2PasswordHashImpl;


/**
 *
 * @author ishika
 */
@Named(value = "bean")
@SessionScoped
    

public class bean implements Serializable {
    @EJB catLocal ctl;
        Pbkdf2PasswordHashImpl  pb=new Pbkdf2PasswordHashImpl();
        

     client cl = new client();
     
Response rs;
List<Category> ls;
GenericType<List<Category>> gen = new GenericType<List<Category>>(){};
    int id,uid,bid;
    String category;
    String username,email,mobilenumber,password,cpassword,address,city,state,pincode,type="user";
    String brandname,brandimage;
    String auname,apassword;
    Part file,productfile;
   String folder="/home/ishika/NetBeansProjects/category/web/resource/brand";
   String pfolder="/home/ishika/NetBeansProjects/category/web/resource/product";

    public String getAuname() {
        return auname;
    }

    public void setAuname(String auname) {
        this.auname = auname;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getBrandimage() {
        return brandimage;
    }

    public void setBrandimage(String brandimage) {
        this.brandimage = brandimage;
    }
    

    

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }
    
    
    

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    

    @PersistenceContext(unitName = "categoryPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;
    

    /**
     * Creates a new instance of bean
     */
    public bean() {
    }
    public List<Category> showemp()
    {
        try
        {   
            List<Category> show=em.createNamedQuery("Category.findAll").getResultList();
            return show;
        
        }
        catch(Exception e)
        {
        
            System.out.println(e);
        }
        return null;
    
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
            public void insert()
        {
            cl.insert(category);
        }
   
    public void catdelete(int Id)
    {
        try
        {
        Category s=em.find(Category.class,Id);
        utx.begin();
        Category s1=em.merge(s);
        em.remove(s1);
        utx.commit();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
       //return "StudDisplay.xhtml";
    }
    public List<Brand> showbrand()
    {
    return  ctl.showbrand();
    
    }
    public String inserbrand()
    {
        try{
          InputStream input=file.getInputStream();
          String filename=file.getSubmittedFileName();
          ctl.brandinsert(brandname, filename);
          Files.copy(input, new File(folder,filename).toPath());
            //ctl.brandinsert(brandname, brandimage);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        brandname = "";
        
        return "admin_brand.jsf";
      
    }
    public List<Category> getcat()
    {
        return ctl.getcat();
    }
    public List<Brand> getAllbrand()
    {
        return ctl.getbrand();
    
    }
    public List<Product> showproduct()
    {
    
    return ctl.showproduct();
    }
   
   public String login()
   {
   List<Users> getloginuser =em.createNamedQuery("Users.login").setParameter("email",email).setParameter("password", password).getResultList();
   if(!getloginuser.isEmpty())
   {
       return "index.jsf";
   }
   else
   {
       return "login.jsf";
   }
       
   }
   public String adduser()
   {
       try
       {
           ctl.adduser(username, email, mobilenumber, password, cpassword, address, city, state, pincode, type);
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
       username="";
       email="";
       mobilenumber="";
       password="";
       cpassword="";
       address="";
       city="";
       state="";
       type="user";
       return "Login.jsf";
   }
    public String  searchcategory(int Id)
    {
    
    Category c=ctl.searchcategory(Id);
    id=c.getCid();
    category=c.getCategory();
        return "updatecategory.jsf";
    }
     public String  searchadmin(int Uid)
    {
    
    Users u=ctl.searchadmin(Uid);
    uid=u.getUid();
    username=u.getUsername();
    email=u.getEmail();
    mobilenumber=u.getMobilenumber();
    password=u.getMobilenumber();
    cpassword=u.getCpassword();
    address=u.getAddress();
    city=u.getCity();
    state=u.getState();
    pincode=u.getPincode();
    return "updateadmin.jsf";
    }
    public String updatecategory()
    {
    
    ctl.updatecategory(id, category);
        return "admin_category.jsf";
    
    
    }
    public String updateadmin()
    {
    
    ctl.updateadmin(uid, username, email, mobilenumber, password, cpassword, address, city, state, pincode, type);
        return "admin_detail.jsf";
    
    
    }
    public List<Users> showadmin()
    {
    
        return ctl.showadmin();
    
    }
     public List<Users> showuser()
    {
    
        return ctl.showuser();
    
    }
    public void admindelete(int Uid)
    {
        try
        {
        Users us=em.find(Users.class,Uid);
        utx.begin();
        Users s1=em.merge(us);
        em.remove(s1);
        utx.commit();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
       //return "StudDisplay.xhtml";
    }
    /**
     *
     */

    /**
     *
     */
    public void checkusernm() {
        Users gp = ctl.searchbyuser(email);
        String unm = gp.getEmail();
        String upsw = gp.getPassword();
        String pbpass = pb.generate(password.toCharArray());
//        GroupTable g = dsl.searchbypass(pbpass);
        System.out.println("password is: "+upsw);
        System.out.println("password is: "+password);
        String urole = gp.getType();
        boolean valid = true;
        int uid = gp.getUid();
        FacesMessage message = null;

        if (unm.isEmpty()) {
            valid = false;
        } else if (!(upsw.equals(password)) || !(unm.equals(email))) {
            valid = false;
        } else if (urole.equals("admin")) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("../admin/newjsf.jsf");
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", email);
            } catch (IOException e) {

            }
        } else {
            try {
                message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", email);
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", email);
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("id", uid);
                FacesContext.getCurrentInstance().getExternalContext().redirect("../index.jsf");
            } catch (IOException e) {

            }

        }

    }
    
    
     int pid,categoryid,brandid,mrp,sellingprice,qty;
    String productname,images,title,description,intgredients,howto;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public int getBrandid() {
        return brandid;
    }

    public void setBrandid(int brandid) {
        this.brandid = brandid;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
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

    public Part getProductfile() {
        return productfile;
    }

    public void setProductfile(Part productfile) {
        this.productfile = productfile;
    }
    
     public String addproduct()
    {
        try
        {
           InputStream input=productfile.getInputStream();
          String pfilename=productfile.getSubmittedFileName();
         ctl.addproduct(categoryid, productname, brandid, mrp, sellingprice, qty, pfilename, title, description, intgredients, howto);
  
          Files.copy(input, new File(pfolder,pfilename).toPath());
          
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
        
