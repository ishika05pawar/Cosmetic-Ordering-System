/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package EJB;

import Entity.Brand;

import Entity.Category;
import Entity.Product;
import Entity.Users;

import java.util.List;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.glassfish.soteria.identitystores.hash.Pbkdf2PasswordHashImpl;


/**
 *
 * @author ishika
 */
@Stateless
@DeclareRoles({"admin","user"})
public class cat implements catLocal {
    Pbkdf2PasswordHashImpl  pb=new Pbkdf2PasswordHashImpl();
    @PersistenceContext(unitName = "categoryPU")
    private EntityManager em;

   
    
   
       
       @Override
    public void insert(String category) {
       Category c=new Category();
       c.setCategory(category);
       em.persist(c);
    
       
     }
    
    @Override
    public List<Brand> showbrand() {
//        return null;
        List<Brand> lb = em.createNamedQuery("Brand.findAll").getResultList();
        return lb;
    }
    
    @Override
    public void brandinsert(String brandname,String brandimage) {
        Brand br=new Brand();
        br.setBrandname(brandname);
        br.setBrandimage(brandimage);
        em.persist(br);
    }
    
    

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public List<Category> getcat() {
        List<Category> lc=em.createNamedQuery("Category.findAll").getResultList();
        return lc;
    }

    @Override
    public List<Brand> getbrand() {
         List<Brand> lb=em.createNamedQuery("Brand.findAll").getResultList();
        return lb;
    }

    @Override
    public List<Product> showproduct() {
        List<Product> lp=em.createNamedQuery("Product.findAll").getResultList();
        return lp;
    }

    @Override
    public String adduser(String username,String email,String mobilenumber,String password,String cpassword,String address,String city,String state,String pincode,String type) {
        Users u = new Users();
        String pass = pb.generate(password.toCharArray());
        String cpass = pb.generate(cpassword.toCharArray());
        u.setUsername(username);
        u.setEmail(email);
        u.setMobilenumber(mobilenumber);
        u.setPassword(pass);
        u.setCpassword(cpass);
        u.setAddress(address);
        u.setCity(city);
        u.setState(state);
        u.setPincode(pincode);
        u.setType(type);
        em.persist(u);
        return "inserted";
    }

    @Override
    public Category searchcategory(int Id) {
        try{
            Category c =em.find(Category.class, Id);
            return c;
        
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        
        }
        
    }

    @Override
    public String updatecategory(int Id,String category) {
        try{
            Category c=em.find(Category.class,Id);
            c.setCategory(category);
            em.merge(c);
            return "category update";
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        
        }
       
    }

    @Override
    public List<Users> showadmin() {
       
        List<Users> as=em.createNamedQuery("Users.admin").getResultList();
        if(!as.isEmpty())
        {
         return as;
        }
        return null;
       
      
    }
    

   
    public void persist1(Object object) {
        em.persist(object);
    }

    @Override
    public String updateadmin(int uid,String username,String email,String mobilenumber,String password,String cpassword,String address,String city,String state,String pincode,String type) {
        
       try{
            Users c=em.find(Users.class,uid);
            c.setUsername(username);
            c.setEmail(email);
            c.setMobilenumber(mobilenumber);
            c.setPassword(password);
            c.setCpassword(cpassword);
            c.setAddress(address);
            c.setCity(city);
            c.setState(state);
            c.setPincode(pincode);
            c.setType(type);
            em.merge(c);
            return "admin update";
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        
        }
    }

    @Override
    public Users searchadmin(int uid) {
         try{
            Users u =em.find(Users.class,uid);
            return u;
        
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        
        }
    }

    @Override
    public List<Users> showuser() {
        List<Users> as=em.createNamedQuery("Users.user").getResultList();
        if(!as.isEmpty())
        {
         return as;
        }
        return null;
    }

    @Override
    public Users searchbyuser(String username) {
        Users us = (Users)em.createNamedQuery("Users.findByUsername").setParameter("username", username).getSingleResult();
        return us;
        
        
    }

    

    
    
@RolesAllowed("admin")  
//@PermitAll  
 //@DenyAll   
public String saySecureHello()
{
    return "Secure Hello from Secure Bean";
}

    @Override
    public String addproduct(int categoryid,String productname,int brandid,int mrp,int sellingprice,int qty,String images,String title,String description,String intgredients,String howto) {
        Product pr=new Product();
        Category ct=em.find(Category.class,categoryid);
        Brand b= em.find(Brand.class,brandid);
        pr.setCategory(ct);
        pr.setProductName(productname);
        pr.setBrand(b);
        pr.setMrp(mrp);
        pr.setSellingPrice(sellingprice);
        pr.setQty(qty);
        pr.setImages(images);
        pr.setTitle(title);
        pr.setDescription(description);
        pr.setIntgredients(intgredients);
        pr.setHowto(howto);
        em.persist(pr);
        return "inserted";
        
    }
    
   
  

    
    

}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

