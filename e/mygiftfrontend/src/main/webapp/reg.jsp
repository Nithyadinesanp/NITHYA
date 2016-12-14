<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Bootstrap Example</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
	</head>
<style type="text/css">
.bgimg
{
background-image:url("resources/images/images.jpg");
}
body
{ 
    background:url("resources/images/back.jpg");
}
#footer {
    border-top: 5px solid #CDB380;background-image:url("resources/images/bgb.jpg");
    
    padding-top: 30px;
    margin-top: 60px;
    clear: both;
    color: #AAA;
    display: block;
}

#footer .widgettitle {
    margin: 0px;
    padding: 0px 0px 15px;
    border-bottom: medium none;
}
#footer h4 {
    color: #FFF;
}

#footer ul {
    list-style: outside none none;
}

#footer li {
    padding: 7px 0px;
    border-bottom: 1px dotted rgba(255, 255, 255, 0.2);
    margin: 0px;
}

#footer li a {
    color:blue;
}

#sub-floor {
    color: #AAA;
    background: #031634 none repeat scroll 0% 0%;
    padding: 10px 0px;
}



    </style>

	<body>

<div class="bgimg">
		<center>
              	<i class="fa fa-gift" style="font-size:80px;color:orange;"></i>

		<h1 style="color:orange";font-size="50";>GIFTS GALORE</h1>
		<p><font size="5">THRISSUR</font></p></center>
		</div><br>
	
<br>
<div class="container">
  <div class="btn-group btn-group-justified">
    <a href="bootstrap[1].html" class="btn btn-warning"><i class="fa fa-home" aria-hidden="true"> Home</i></a>
    <a href="images.html" class="btn btn-warning"><i class="fa fa-picture-o" aria-hidden="true"> Image</i></a>
    <a href="prodectlist.html" class="btn btn-warning"><i class="fa fa-product-hunt" aria-hidden="true"> Prodect</i></a>
    <a href="#" class="btn btn-warning"><span class="glyphicon glyphicon-earphone"> Contact</span></a>
    <a href="#" class="btn btn-warning">About us</a>
    <a href="Log.html" class="btn btn-warning"><span class="glyphicon glyphicon-log-in"> Login</span></a>
    <a href="Reg.html" class="btn btn-warning"><i class="fa fa-sign-in" aria-hidden="true"> Register</i></a>

  </div>
</div>


	<center>
	<div class="container text-center" id="wrap">
	  <div class="row">
        <div class="col-md-6 col-md-offset-3">

            <form action="" method="post" accept-charset="utf-8" class="form" role="form">   <legend>Sign Up</legend>
                    
		<div class="imgcontainer">
    			<img src="resources/images/login.png" alt="Log" width="180" height="180">
 		 </div><br>

                    <div class="row">
                        <div class="col-xs-6 col-md-6">
                            <input type="text" name="firstname" value="" class="form-control input-lg" placeholder="First Name"/></div>
                       <div class="col-xs-6 col-md-6">
                            <input type="text" name="lastname" value="" class="form-control input-lg" placeholder="Last Name"/></div>
                    </div><br>
                    <input type="text" name="email" value="" class="form-control input-lg" placeholder="Your Email" /><br><br>
                    <input type="password" name="password" value="" class="form-control input-lg" placeholder="Password"  /><br><br>
                     <input type="password" name="confirm_password" value="" class="form-control input-lg" placeholder="Confirm Password"/><br><br>

						<div class="row">
                        <!--<div class="col-xs-4 col-md-4">-->
                           <label>Birth Date :</label><select>
<option value="01">Jan</option>
<option value="02">Feb</option>
<option value="03">Mar</option>
<option value="04">Apr</option>
<option value="05">May</option>
<option value="06">Jun</option>
<option value="07">Jul</option>
<option value="08">Aug</option>
<option value="09">Sep</option>
<option value="10">Oct</option>
<option value="11">Nov</option>
<option value="12">Dec</option>
</select>                        
                            <select>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>
</select>
                
                            <select>
<option value="1935">1935</option>
<option value="1936">1936</option>
<option value="1937">1937</option>
<option value="1938">1938</option>
<option value="1939">1939</option>
<option value="1940">1940</option>
<option value="1941">1941</option>
<option value="1942">1942</option>
<option value="1943">1943</option>
<option value="1944">1944</option>
<option value="1945">1945</option>
<option value="1946">1946</option>
<option value="1947">1947</option>
<option value="1948">1948</option>
<option value="1949">1949</option>
<option value="1950">1950</option>
<option value="1951">1951</option>
<option value="1952">1952</option>
<option value="1953">1953</option>
<option value="1954">1954</option>
<option value="1955">1955</option>
<option value="1956">1956</option>
<option value="1957">1957</option>
<option value="1958">1958</option>
<option value="1959">1959</option>
<option value="1960">1960</option>
<option value="1961">1961</option>
<option value="1962">1962</option>
<option value="1963">1963</option>
<option value="1964">1964</option>
<option value="1965">1965</option>
<option value="1966">1966</option>
<option value="1967">1967</option>
<option value="1968">1968</option>
<option value="1969">1969</option>
<option value="1970">1970</option>
<option value="1971">1971</option>
<option value="1972">1972</option>
<option value="1973">1973</option>
<option value="1974">1974</option>
<option value="1975">1975</option>
<option value="1976">1976</option>
<option value="1977">1977</option>
<option value="1978">1978</option>
<option value="1979">1979</option>
<option value="1980">1980</option>
<option value="1981">1981</option>
<option value="1982">1982</option>
<option value="1983">1983</option>
<option value="1984">1984</option>
<option value="1985">1985</option>
<option value="1986">1986</option>
<option value="1987">1987</option>
<option value="1988">1988</option>
<option value="1989">1989</option>
<option value="1990">1990</option>
<option value="1991">1991</option>
<option value="1992">1992</option>
<option value="1993">1993</option>
<option value="1994">1994</option>
<option value="1995">1995</option>
<option value="1996">1996</option>
<option value="1997">1997</option>
<option value="1998">1998</option>
<option value="1999">1999</option>
<option value="2000">2000</option>
<option value="2001">2001</option>
<option value="2002">2002</option>
<option value="2003">2003</option>
<option value="2004">2004</option>
<option value="2005">2005</option>
<option value="2006">2006</option>
<option value="2007">2007</option>
<option value="2008">2008</option>
<option value="2009">2009</option>
<option value="2010">2010</option>
<option value="2011">2011</option>
<option value="2012">2012</option>
<option value="2013">2013</option>
</select>
                    </div><br>
                     <label>Gender : </label><label class="radio-inline">
                        <input type="radio" name="gender" value="M" id=male />Male
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="gender" value="F" id=female />Female
                    </label>
                    <br><br>
              <span class="help-block">By clicking Create my account,you agree to our Terms and <br>that you have read our Data Use Policy, including our Cookie Use.</span>
                   <br> <br><button class="btn btn-lg btn-primary btn-block signup-btn" type="submit">
                        Create my account</button>
	

            </form>
          </div>
</div>
</div>
</div>
	<script type="text/javascript">

	</script>
	</center>


<footer id="footer" class="clearfix">
      <div id="footer-widgets">

        <div class="container">

        <div id="footer-wrapper">

          <div class="row">
            <div class="col-sm-6 col-md-2">
              <div id="meta-3" class="widget widgetFooter widget_meta">
              <h4 class="widgettitle">Importent Page :</h4>
              <ul>
    		  <li><a href="#"><i class="fa fa-home fa-fw"></i> Home</a></li>
			  <li><a href="privacypolicy.php"><i class="fa fa-link"></i>&nbsp;&nbsp; Privacy Policy</a></li>
			  <li><a href="#"><i class="fa fa-envelope fa-fw"></i> Contact Us</a></li>
             </ul>
</div>      </div> <!-- end widget1 -->

            <div class="col-sm-6 col-md-2">
              		<div id="recent-posts-3" class="widget widgetFooter widget_recent_entries">
                    <h4 class="widgettitle">Our social media :</h4>
                    <ul>
					<li>
				     <a href="https://www.facebook.com/mr.dauod" target="_blank"><i class="fa fa-facebook"></i> Facebook</a>
					</li>
					<li>
				      <a href="https://www.twitter.com/ayatquranCom" target="_blank"><i class="fa fa-twitter"></i> Twitter</a>
					</li>
					<li>
				      <a href="http://www.youtube.com/user/sonsofye" target="_blank"><i class="fa fa-youtube"></i> Youtube</a>
				   </li>
				</ul>
		</div>            </div> <!-- end widget1 -->

            <div class="col-sm-6 col-md-4">
              <div id="meta-4" class="widget widgetFooter widget_meta">
              <h4 class="widgettitle">Subscribe :</h4>

              <div class="form-group">
                <div class="input-group">
                  <span class="input-group-addon">E-mail :</span>
                  <input class="form-control" placeholder="Write your email .." type="text">
                </div>
              </div>

              <div class="form-group">
                <div class="input-group">
                  <span class="input-group-addon">Phone  :</span>
                  <input class="form-control" placeholder="+96777000000" type="text">
                   <span class="input-group-btn">
                    <button class="btn btn-primary" type="button">Subscribe !</button>
                  </span>
                </div>
              </div>


              </div>
             </div> <!-- end widget1 -->

            <div class="col-sm-6 col-md-4">
              <div id="search-3" class="widget widgetFooter widget_search"><h4 class="widgettitle">Search in Faploo :</h4>

                <div class="form-group">
                                <label class="control-label">Write what you want to search for it  :</label>
                                <div class="input-group">
                                  <span class="input-group-addon">Keyword :</span>
                                  <input class="form-control" placeholder="Keyword for search ..." type="text">
                                   <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">Search !</button>
                                  </span>
                                </div>
                              </div>

                </div>            </div> <!-- end widget1 -->

          </div> <!-- end .row -->

        </div> <!-- end #footer-wrapper -->

        </div> <!-- end .container -->
      </div> <!-- end #footer-widgets -->

      <div id="sub-floor">
        <div class="container">
          <div class="row">
            <div class="col-md-4 copyright">
             Copy right for Faploo © 2015
            </div>
            <div class="col-md-4 col-md-offset-4 attribution">
             Developer by  <a target="_blank" href="#">Faploo team</a> .
            </div>
          </div> <!-- end .row -->
        </div>
      </div>

    </footer>
	
</body>
</html>
