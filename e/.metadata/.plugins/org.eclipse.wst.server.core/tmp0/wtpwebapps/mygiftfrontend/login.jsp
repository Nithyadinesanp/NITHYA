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

	<div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title">Login</h1>
            <div class="account-wall">
               <center> <img src="resources/images/login.png" alt="Log" width="180" height="180"></center><br>
                <form class="form-signin"><center>
                <input type="text" class="form-control" placeholder="Email" required autofocus><br><br>
                <input type="password" class="form-control" placeholder="Password" required><br>
                <button class="btn btn-lg btn-primary btn-block" type="submit">
                    Sign in</button><br>
                <label class="checkbox pull-left">
                    <input type="checkbox" value="remember-me">
                    Remember me
                </label><br>
                <a href="#" class="pull-right need-help">Need help? </a><span class="clearfix"></span>
                </center></form>
            </div>
           <center> <a href="Reg.html" class="text-center new-account">Create an account </a></center>
        </div>
    </div>
</div><br>
	<!--<script type="text/javascript">
	
	</script>-->

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
             Copy right for Faploo � 2015
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
