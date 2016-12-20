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
    background:url("resources/images/white-background-wallpaper-004.jpg");
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



    .glyphicon { margin-right:5px; }
.thumbnail
{
    margin-bottom: 20px;
    padding: 0px;
    -webkit-border-radius: 0px;
    -moz-border-radius: 0px;
    border-radius: 0px;
}

.item.list-group-item
{
    float: none;
    width: 100%;
    background-color: #fff;
    margin-bottom: 10px;
}
.item.list-group-item:nth-of-type(odd):hover,.item.list-group-item:hover
{
    background: #428bca;
}

.item.list-group-item .list-group-image
{
    margin-right: 10px;
}
.item.list-group-item .thumbnail
{
    margin-bottom: 0px;
}
.item.list-group-item .caption
{
    padding: 9px 9px 0px 9px;
}
.item.list-group-item:nth-of-type(odd)
{
    background: #eeeeee;
}

.item.list-group-item:before, .item.list-group-item:after
{
    display: table;
    content: " ";
}

.item.list-group-item img
{
    float: left;
}
.item.list-group-item:after
{
    clear: both;
}
.list-group-item-text
{
    margin: 0 0 11px;
}

    </style>
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        window.alert = function(){};
        var defaultCSS = document.getElementById('bootstrap-css');
        function changeCSS(css){
            if(css) $('head > link').filter(':first').replaceWith('<link rel="stylesheet" href="'+ css +'" type="text/css" />'); 
            else $('head > link').filter(':first').replaceWith(defaultCSS); 
        }
        $( document ).ready(function() {
          var iframe_height = parseInt($('html').height()); 
          window.parent.postMessage( iframe_height, 'http://bootsnipp.com');
        });
    </script>
</head>
<body>
		<div class="bgimg">
		<center>
              	<i class="fa fa-gift" style="font-size:60px;color:orange;"></i>

		<h1>
		<font size="40"; color="orange">GIFTS GALORE</font>
		</h1>
		<p>
		<font size="5">THRISSUR</font>
		</p>
		</center>
		</div><br>
	
<br>
<nav class="navbar navbar-default navbar-inverse" role="navigation">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href=" ">Home</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="images">Images</a></li>
        <li><a href="aboutus">About us</a></li>
<li><a href="contact">Contact</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Product <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="prodect">About us</a></li>
            <li><a href="prodect">Contact action</a></li>
            <li><a href="prodect">Address</a></li>
            <li class="divider"></li>
            <li><a href="#"></a></li>
            
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="register">Register</a></li>
<li><a href="login">Login</a></li>
          </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<br><br>



	<div class="container">
    <div class="well well-sm">
        <strong>Category Title</strong>
        <div class="btn-group">
            <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
            </span>List</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                class="glyphicon glyphicon-th"></span>Grid</a>
        </div>
    </div>


<div class="newphead">Combos &amp; Hampers
       
             <a href="#">View All &gt;</a>
      
          </div> 
      


    <div id="products" class="row list-group">
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="resources/images/brithday_personlised_gift.jpg" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        BIRTHDAY PERSONALISED WOODEN PLAQUE</h4>
                    <p class="group inner list-group-item-text">
                        Express love for your dear one in the most special way as you present her or him this personalised plaque. A perfect way to make your dear one''s birthday special, this wooden plaque is sure to make for a cherished keepsake for your loved one.Please note that the product can be personalised with a photograph only.</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                <img src="resources/images/rupee-red-sm.png"> 499.000</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="resources/images/Embellished_Slipper_Gift.jpg" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        EMBELLISHED SLIPPER PENDANT WITH CHAIN</h4>
                    <p class="group inner list-group-item-text">
                       Be a style diva as you team this stylish slipper pendant with chain with your western outfits. This neckpiece adorned gracefully with stones will not only be a distinct addition to your collection, but a wonderful gifting option too.</p>
                    <br>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                <img src="resources/images/rupee-red-sm.png"> 210.000</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="resources/images/Love_You_Personalised_Birthday_Card_PERCARD02_0_c9b894ce.jpg" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        LOVE YOU PERSONALISED BIRTHDAY CARD</h4>
                    <p class="group inner list-group-item-text">
                        Let your love for your sweetheart be expressed with a personal touch as you gift her or him this personalised birthday card. This beautiful card which can be customised with receiver's name and your photograph will be lovely way to tell her how much she means to you.
					</p>
						<br>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                               <img src="resources/images/rupee-red-sm.png"> 210.000</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
       </div>



        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="resources/images/Modish_Brown_Mens_Wrist_Watch_Watch.jpg" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        MODISH BROWN MENS WRIST WATCH</h4>
                    <p class="group inner list-group-item-text">
                        Indulge yourself in a timeless and classic style statement with this finely crafted watch. Work it with your trousers and a casual shirt for a smart look.</p>
                    <br><br><br>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                <img src="resources/images/rupee-red-sm.png"> 210.000</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="resources/images/Stun_Fortune_Wallet_ACMEN.jpg" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                       STUN FORTUNE MEN WALLET</h4>
                    <p class="group inner list-group-item-text">
                       </p>
                       <br><br><br><br><br><br>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                <img src="resources/images/rupee-red-sm.png"> 210.000</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="resources/images/Happy_Birthday_Personalised_Wooden_Plaque.jpg" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        PERSONALISED HAPPY BIRTHDAY WOODEN PLAQUE</h4>
                    <p class="group inner list-group-item-text">
                        Say Happy Birthday in a unique and thoughtful way as you surprise your dear one with this personalised plaque. A lovely way to make your dear one''s day extra special, this wooden desk decorative is sure to make her or him remember you forever.
Please note that the product can be personalised with a photograph only.</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                               <img src="resources/images/rupee-red-sm.png"> 210.000</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>






        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="resources/images/Love_You_Mom_Photo_Frame.jpg" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        LOVE YOU MOM PHOTO FRAME</h4>
                    <p class="group inner list-group-item-text">
                        Thank mommy for all her love and support as you gift he this trendy wooden photo frame on any occasion. A perfect way to tell her that she''s the heart of the family, this frame is sure to bring a smile on her face.
					</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                <img src="resources/images/rupee-red-sm.png"> 210.000</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="resources/images/My_Mom_Is_The_Best_Mug_MOM.jpg" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        MY MOM IS THE BEST MUG</h4>
                    <p class="group inner list-group-item-text">
                        Show your mom how much you love and care for her as you surprise her with this trendy mug with ''''''''''''''''''''''''''''''''My mom is the best'''''''''''''''''''''''''''''''' quoted on it. This stylish mug will not only make for a perfect surprise for her on mother''''''''''''''''''''''''''''''''s day, but will also be cherished by her forever.
					</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                <img src="resources/images/rupee-red-sm.png"> 210.000</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="resources/images/Despiteful_Mom_Hamper_BDY.jpg" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        DESPITEFUL MOM HAMPER</h4>
                    <p class="group inner list-group-item-text">
                        Glow your mom’s face with smile blow. Present her this Despiteful Mom Hamper and let her rejoice in joy. Express your love through simple and sweet gesture. This hamper have one box full of handmade chocolates and one flower glass quotation for your lovable mom.
                    </p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                <img src="resources/images/rupee-red-sm.png"> 210.000</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>





        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="resources/images/Dad_Photo_Frame.jpg" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        DAD PHOTO FRAME </h4>
                    <p class="group inner list-group-item-text">
                        Make sure your dad knows that he holds a special place in your heart as you surprise him with this trendy photo frame. Adorned beautifully with a family picture, this frame is sure to make him remember you every time he''ll glance at this picture frame.</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                <img src="resources/images/rupee-red-sm.png"> 21.000</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="resources/images/Love_You_Papa_Personalised_Mug.jpg" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        LOVE YOU PAPA PERSONALISED MUG </h4>
                    <p class="group inner list-group-item-text">
                        Bring a smile on your dad''s face by gifting him this ''Love you papa'' personalised photo mug on Father''s Day. A lovely way to make the day memorable for him, this mug beautified with a picture of you and your dad is sure to be treasured by him forever.
Please note that the product can be personalised with a photograph. 
					</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                <img src="resources/images/rupee-red-sm.png"> 21.000</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="resources/images/Happy_Birthday_Dad_Greeting_Cad.jpg" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        HAPPY BIRTHDAY DAD GREETING CAD</h4>
                    <p class="group inner list-group-item-text">
                        Show love for your adorable dad as you gift him this beautiful floral card on his birthday. The beautiful card will not only make him feel extra special on his special day, but will also be cherished by him forever.</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                <img src="resources/images/rupee-red-sm.png"> 21.000</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

	




	<script type="text/javascript">
	$(document).ready(function() {
    $('#list').click(function(event){event.preventDefault();$('#products .item').addClass('list-group-item');});
    $('#grid').click(function(event){event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');});
});
	</script>




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