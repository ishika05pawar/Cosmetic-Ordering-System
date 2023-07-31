/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package EJB;

import Entity.Brand;
import Entity.Category;
import Entity.Product;
import Entity.Users;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ishika
 */
@Local
public interface catLocal {
    void insert(String category);

  List<Brand> showbrand();

    void brandinsert(String brandname,String brandimage);

    List<Category> getcat();

    List<Brand> getbrand();

//   
    List<Product> showproduct();

    String adduser(String username,String email,String mobilenumber,String password,String cpassword,String address,String city,String state,String pincode,String type);

    Category searchcategory(int Id);

    String updatecategory(int Id,String category);

    List<Users> showadmin();

    String updateadmin(int uid,String username,String email,String mobilenumber,String password,String cpassword,String address,String city,String state,String pincode,String type);

    Users searchadmin(int uid);

    List<Users> showuser();

    Users searchbyuser(String username);

   String saySecureHello();

    String addproduct(int categoryid,String productname,int brandid,int mrp,int sellingprice,int qty,String images,String title,String description,String intgredients,String howto);

    

    

    
  

    
    
}
