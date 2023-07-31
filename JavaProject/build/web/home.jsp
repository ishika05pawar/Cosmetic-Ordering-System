<%-- 
    Document   : home
    Created on : 13-Dec-2022, 4:42:58 PM
    Author     : ishika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
       <link rel="stylesheet" href="header.css"/> 
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"/>

<link rel="icon" type="image/x-icon" href="/images/favicon.ico"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
	<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
<script type="text/javascript">
	// for search product//
	function active() {
		var sb = document.getElementById('searchbox');
		if(sb.value == 'Search...')
		{
			sb.value = ''
			sb.placeholder = 'Search...'
		}
	}
	function inactive() {
		var sb = document.getElementById('searchbox');
		if(sb.value == 'Search...')
		{
			sb.value = ''
			sb.placeholder = 'Search...'
		}
	}

</script>
<style type="text/css">
	*{
	box-sizing: border-box;
}
	body
	{
		font-family: sans-serif;
		background-image: url(image/cool-background.png);
		background-size: cover;
		padding-top: 50px;
		
	}
	.header .sky
	{
		float: left;
		margin-left: 50px;
		color: black;
		text-shadow: 4px 2px 5px red;
		font-size: 30px;
		font-family: cursive;
		margin-top: 5px;
		font-weight: bold;

		animation-name: sky;
		animation-duration: 5s;
		animation-iteration-count: infinite;
		animation-direction: alternate;
	}
	@keyframes sky
	{
		from{color: black;}
		to{color: white;}
	}
	.header
	{
			position: fixed;
			width : 100%;
			background: purple;
			text-align: center;
			top: 0;
			border-bottom: 1px dotted lavenderblush; 
		/*	overflow:hidden;
			z-index: 10;*/
	}
	@media screen and (max-width: 500px){
		.header  ul{
			float: none;
			display: block;
			text-align: left;
		}
	}
	.header ul
	{
		display: inline-flex;
		float: right;
		list-style: none;
	}
	.header ul li
	{
		margin-top: 15px;
		margin-bottom: 8px ;
		margin-left: 10px;
		margin-right: 10px;
	}
	.header ul li a
	{
		text-decoration: none;
		color: lavenderblush;
		font-size: 17px;
		font-weight: bold;
	}
	.header ul li a:hover
	{
		color: lightcyan;	
	}
 .menu
 	{
 	 display: none;
 	}
.header ul li:hover .menu 
 {
 	display:block;
 	background-color: lavenderblus;
 	margin-top: 5px;
 	margin-left: -80px;
 	position: fixed;
 }
 .header ul li:hover .menu ul
 {
 	display: block;
 	margin: 5px
 }
 .header ul li .menu ul li a
 {
 	color: black;
 }
 .header ul li .menu ul li a:hover{
 	color: darkmagenta;
 }
 .header ul li:hover .menu ul li 
 {
 	width: 150px;
 	padding:10px;
 	margin: 0px;
 	/*border-top: 1px dotted darkred;*/
 	border-bottom: 1px dotted darkred;
 	color: darkmagenta;
 	background: lavender;
 	text-align: center;
 	box-shadow: 4px 4px 10px purple;

 }
 .header ul li:hover .menu ul li:last-child
 {
 	border-bottom: none;
 }
 .header .search
 {
 	float: right;
 	font-size: 16px;
 	margin-top: 12px;
 	margin-left: 15px;
 	margin-right: 15px;
 }
 .search button
{
	background-color: pink;
	color: black;
}

.header ul li .badge{
  position: absolute;
/*top: 5px;*/
  right: 8px;
 /* padding: 5px 10px; */
  border-radius: 50%;
  background-color: darkred;
  color: white;

}

 .logout
 	{
 	 display: none;
 	}
.header .name:hover .logout 
{
	display:block;
 	background-color: lavenderblus;
 	margin-top: 5px;
 	margin-left: -80px;
 	position: fixed;
}
.header .name:hover .logout ul 
{
	display: block;
 	margin: 5px
}
.header .name .logout ul li a
{
	color: black;
}
.header .name .logout ul li a:hover
{
		color: darkmagenta;
}
.header .name .logout ul li
{
	width: 150px;
 	padding:10px;
 	margin: 0px;
/* 	border-top: 1px dotted darkred;*/
 	border-bottom: 1px dotted darkred;
 	color: darkmagenta;
 	background: lavender;
 	text-align: center;
 	box-shadow: 4px 4px 10px purple;
}

body{
	/*	margin: 0;
		padding: 0;
	*/}
	.footer 
	{
		margin-top :  20px;
	}
	.inner-footer
	{
		height: 150px;
		margin: 0;
		padding: 0;
		background: black;
	}
	.social-links
	{
		display: flex;
	}
	.social-links ul{
		padding: 20px;
		display: flex;
		width: 300px;
		height: 30px;
		margin: auto;
	}
	.social-items
	{
		display: flex;

	}
	.social-items a
	{
		padding: 10px 20px;
		font-size: 35px;
		color: aquamarine;
		text-decoration: none;
		transition: all .25s;
	}
	.social-items a:hover
	{
		color: plum;
	}
	.quick-links
	{
		display: flex;
		width: 100%;
		height: 100px;
		text-align: center;
		padding: 50px;
		justify-content: center;

	}
	.quick-links ul
	{
		display: flex;
	}
	.quick-items{
		list-style: none;
	}
	.quick-items a
	{
		text-decoration: none;
		padding: 0px 15px;
		font-size: 18px;
		color: white;
	}
	.quick-items a:hover
	{
		color: plum;
	}
	.outer-footer
	{
		padding: 5px;
		text-align: center;
		color: white;
		font-size: 18px;
		background-color: darkgray;
	}
	




 


  *{
    box-sizing: border-box;
  }
  body{
    background-image: url(image/cool-background.png);
    background-size: cover;
  }
  .section
  {
    padding-top: 50px;
  }
</style>

</head>
<body align="center">
  <div>
  <header>
   <div class="header">
						<div class="sky"> <!--<img src="image/Free_Sample_By_Wix(1).jpeg">-->  SKY Fashion </div>
						<ul>
							<li> <a href="index.jsf"> Home </a> </li>
							<li> <a href="#"> Categories </a>
									<div class="menu">
										<ul>
									    <li> <a href="makeup.jsf"> Makeup </a> </li> 
 							        	<li> <a href="skin.jsf">  Skin  </a> </li> 
							       		<li> <a href="">  Hair  </a> </li>
							        	<li> <a href="parfume.php">  Fragrance </a> </li>
							        	<li> <a href="">  Tools And Appliences </a> </li>
							      		</ul>									
									</div>
							</li>
							<li> <a href="brand.jsf"> Brands </a> </li>
							<li> <a href="about.jsf"> About Us </a> </li>
							

					  	<div class="search">
					  		<form method="GET" id="searchform"> 
                				<input type="search" placeholder="" name="search" id="searchbox" value="Search..." autocomplete="off" onmousedown="active();" onmouseup="inactive();"/> 
                   			<button type="submit" name="Search" value="Search..." onmousedown="active();" onmouseup="inactive();"> <i class="fa fa-search"></i> </button>
                </form>
      				</div> 

      						<li>  

      						
      								<div class="name"> <a href=""><span class="glyphicon glyphicon-user"> </span><%=request.getAttribute("user")%> </a> 
      					  			<div class="logout">
      					  				<ul>
      					  					<li>
      					  					<a href ="user_profile.php" name="profile"><i style='font-size:18px' class='far'>&#xf2c2;</i> My Profile </a>	</li>
      					  					<li>
      					  					<a href ="wishlist_products.php" name="profile"><i style='font-size:20px' class='far'>&#xf004;</i> WishList </a>	</li>
      					  					<li>
      					  			 		<a href ="logout.php"><i style='font-size:18px' class='fas'>&#xf011;</i> LogOut </a> 
      					  					</li>
      					  				</ul>
      					  			</div> 
      					  		</div>
      					 
      					  	<a href="login.jsf"> <span class="glyphicon glyphicon-user"> </span> Account </a>
      					  
													    									
     							</li>	



    							
    							<li>  <a href="cart.php"><span class="glyphicon glyphicon-shopping-cart" style="font-size: 25px; margin-right: 15px; margin-left: 25px;">
    							</span><sup> <span class="badge"> <?php /*if(isset($count)) {echo mysqli_num_rows($count);}else{*/ echo $count; ?> </span>
    							</sup> 
    							
    								</a>

    						
<!--    						  <li>  <a href="cart.php"><span class="glyphicon glyphicon-shopping-cart" style="font-size: 25px; margin-right: 15px; margin-left: 25px;">
    							</span>
    						  <sup> <span class="badge"> <?php echo '0'; ?> </span>
    							</sup> 
    							
    								</a>
    							<?php } ?>
    						
    							
                                                  </li> -->
                                                        
                                                        </li>
    				</ul>
    			</div>
	

        
      
  </header>
  </div>


<div class="section"> 
    <div>
      <a href="festive_finds.php"><img class="img" src="image/festive.gif" style="margin-top: 30px; width: 100%;"></a>
      <div style="margin-top : 20px; background-color: lavenderblush; padding: 10px; font-size: 18px; font-weight: bold;">
      <div> IN THE SPOTLIGHT </div>
    </div>
        <a href="mac_product.php"><img class="img" src="image/mac/mac_slide.jpg" style="margin-top:10px"></a>
        <a href="key_product.php"><img class="img" src="image/kay/key_slide.jpg" style="margin-top:10px"></a>
    </div>

    <div>
      <a href="inter1.php"> <img src="image/inter.gif" style="margin-top: 10px;"></a>
      <a href="inter1.php"> <img src="image/inter1.gif" style="margin-top: 10px;"></a>
    </div>

    <div style="margin-top: 10px; margin-bottom: 10px;" >
        <a href="maybelline_product.php"><img src="image\maybelline\m_small.jpg"></a>
        <a href="lakme.php"><img src="image/lakme/l_small.jpg"></a>
    </div>

    <div>
      <div class="ship" style="background-color: lavenderblush; padding: 20px;">
        <div class="" style="font-weight: bold;"> <img src="image/free_ship.png" height="25px" width="25px" > Free Shipping Above &#8377 499  &nbsp; &nbsp; &nbsp;  &nbsp;  &nbsp;  100% Authentic Product Sourced Directly  </div>
    </div>



    <div style="margin-top: 10px;">
      <div style="background-color:lavenderblush; font-size: 18px;  padding: 8px; font-weight: bold;  margin-bottom: 10px;" > FRAGRENCE </div>
      <a href=""> <img src="image/fragrance/fragrance.jpg" style="margin-bottom: 10px;"></a>
      <a href="parfume.php"> <img src="image/fragrance/frag.gif" > </a>
    </div>


    <div style="margin-top: 10px;" >
    <div  style="margin-top : 10px; background-color: lavenderblush; padding: 10px; font-size: 18px; font-weight: bold;"> FEATURED BRANDS </div>
      <a href="huda_product.php"><img class="img" src="image/huda/huda_slide4.jpg" style="margin-top: 10px;"></a>
      <a href="sugar.php"><img src="image/sugar/sugar_slide.jpg" style="margin-top: 10px;"></a>
      <a href="revolution.php"><img src="image/revolution/revolution.jpg" style="margin-top: 10px;"></a>
      <a href="#"><img src="image/loreal/loreal1.jpg" style="margin-top: 10px;"></a>
      <a href="#"><img src="image/plam/plam.jpg" style="margin-top: 10px;"></a>
      <a href="mac_product.php"><img src="image/mac/m_small.gif" style="margin-top: 10px;" ></a>
      <a href="key_product.php"><img src="image/kay/k_small.jpg" style="margin-top: 10px;" ></a>
      <a href="charlotte.php"><img src="image/charlotte/c_small.jpg" style="margin-top: 10px;" ></a>

    </div>

    
  </div>
    </div>
<footer class="footer">
	<div class="inner-footer">
		<div class="social-links">
			<ul>
				<li class="social-items"><a href="#" class="fa fa-facebook"></a></li>
				<li class="social-items"><a href=" " class="fa fa-twitter"></a></li>
				<li class="social-items"><a href="#" class="fa fa-youtube"></a></li>
				<li class="social-items"><a href="" class="fa fa-instagram"></a></li>
			</ul>
		</div>

		<div class="quick-links">
			<ul>
				<li class="quick-items"> <a href="about.php"> About Us </a> </li> &nbsp;&nbsp;&nbsp;&nbsp;
				<li class="quick-items"> <a href="#"> Terms and Conditions </a> </li>&nbsp;&nbsp;&nbsp;&nbsp;
				<li class="quick-items"> <a href="#"> Services </a> </li>&nbsp;&nbsp;&nbsp;&nbsp;
				<li class="quick-items"> <a href="#"> Privacy policy </a> </li>&nbsp;&nbsp;&nbsp;&nbsp;
				<li class="quick-items"> <a href="#"> Cancelation policy </a> </li>&nbsp;&nbsp;&nbsp;&nbsp;
			</ul>
		</div>
	</div>

	<div class="outer-footer">
		copyright &copy; <?php echo date("Y") ?>  All Rights Reserved
	</div>
	
</footer>


</body>
</html>
