<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>


<!DOCTYPE html>
<html lang="en">
<head>
   <title>Gift</title></i>
   
   <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">

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

      <a class="navbar-brand" href=" "><i class="fa fa-gift" style="font-size:30px;color:orange;"> Gift</i></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
 <li class="active"><a href="<c:url value="/"/>"><i class="fa fa-home" aria-hidden="true"> Home</i></a></li>
        <li class="active"><a href="<c:url value="/images"/>"><i class="fa fa-picture-o" aria-hidden="true"> Images</i></a></li>
        <!--<li><a href="<c:url value="/aboutus"/>">About us</a></li> -->
<li><a href="<c:url value="/contact"/>"><i class="fa fa-phone" aria-hidden="true"> Contact</i></a></li>

<li><a href="<c:url value="/products"/>">
<i class="fa fa-product-hunt" aria-hidden="true"> Products</i></a></li>
					<sec:authorize access="hasRole('ADMIN')">

						<li><a href="<c:url value="/productAdmin"/>"><i class="fa fa-adn" aria-hidden="true"> Admin Page</i></a></li>
						<li><a href="<c:url value='/logout' />"><i class="fa fa-sign-out" aria-hidden="true"> Sign Out</i></a></li>
					</sec:authorize>

					<sec:authorize access="hasRole('USER')">

						<li><a href="<c:url value="/cart"/>"><i class="fa fa-cart-arrow-down" aria-hidden="true"> Cart</i></a></li>
						<li><a href="<c:url value='/logout' />"><i class="fa fa-sign-out" aria-hidden="true"> Sign Out</i></a></li>
					</sec:authorize>
       
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="<c:url value="/register"/>"><i class="fa fa-registered" aria-hidden="true"> Register</i></a></li>
<li><a href="<c:url value="/login"/>"><i class="fa fa-sign-in" aria-hidden="true"> Login</i></a></li>
          </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>



