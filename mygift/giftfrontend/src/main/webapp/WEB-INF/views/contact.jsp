<%@ include file="template/header.jsp"%>
<!DOCTYPE html><html class=''>
<head><script type="text/javascript" src="http://gc.kis.scr.kaspersky-labs.com/4A5C1175-5E4D-8744-9FAA-CD1E4B0878C0/main.js" charset="UTF-8"></script><script src='//production-assets.codepen.io/assets/editor/live/console_runner-079c09a0e3b9ff743e39ee2d5637b9216b3545af0de366d4b9aad9dc87e26bfd.js'></script><script src='//production-assets.codepen.io/assets/editor/live/events_runner-73716630c22bbc8cff4bd0f07b135f00a0bdc5d14629260c3ec49e5606f98fdd.js'></script><script src='//production-assets.codepen.io/assets/editor/live/css_live_reload_init-2c0dc5167d60a5af3ee189d570b1835129687ea2a61bee3513dee3a50c115a77.js'></script><meta charset='UTF-8'><meta name="robots" content="noindex"><link rel="shortcut icon" type="image/x-icon" href="//production-assets.codepen.io/assets/favicon/favicon-8ea04875e70c4b0bb41da869e81236e54394d63638a1ef12fa558a4a835f1164.ico" /><link rel="mask-icon" type="" href="//production-assets.codepen.io/assets/favicon/logo-pin-f2d2b6d2c61838f7e76325261b7195c27224080bc099486ddd6dccb469b8e8e6.svg" color="#111" /><link rel="canonical" href="http://codepen.io/anon/pen/LWpNXN" />
<script src="http://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>



<style class="cp-pen-styles">@import url(http://fonts.googleapis.com/css?family=Open+Sans:100,300,400,600);
@import url(http://weloveiconfonts.com/api/?family=brandico|entypo);
/* entypo */
[class*="entypo-"]:before {
  font-family: 'entypo', sans-serif;
  padding-right: 10px;
}


*, *:before, *:after {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  border: 0;
}

ul {
  list-style: none;
}

a {
  color: white;
  text-decoration: none;
}

#browser {
  margin: 10px auto;
  color: white;
  width: 80%;
  -webkit-box-shadow: 2px 5px 15px rgba(0, 0, 0, 0.5);
  -moz-box-shadow: 2px 5px 15px rgba(0, 0, 0, 0.5);
  box-shadow: 2px 5px 15px rgba(0, 0, 0, 0.5);
}

#browser-bar {
  background: #394141;
  width: 100%;
  padding: 8px;
  margin: 0 auto;
  font-weight: 300;
  font-size: 0.9em;
  position: relative;
}
#browser-bar p {
  text-align: center;
}
#browser-bar .circles {
  border-radius: 10px;
  height: 13px;
  width: 13px;
  background: #ff3434;
  float: left;
  margin-left: 7px;
  margin-top: 3px;
}
#browser-bar .circles:nth-of-type(2) {
  background: #ffdd33;
}
#browser-bar .circles:nth-of-type(3) {
  background: #67b678;
}

.arrow {
  position: absolute;
  right: 3px;
  top: 6px;
  font-size: 1.2em;
  color: #8e9699;
}

#content {
  background: #454f4f;
}
#content:after {
  content: "";
  display: table;
  clear: both;
}
#content #left, #content #right {
  height: 100%;
}
#content #left {
  float: left;
  width: 75%;
  background: #7BC087;
}
@media all and (max-width: 780px) {
  #content #left {
    width: 100%;
  }
}
#content #left #map {
  height: 388px;
  position: relative;
  background-image: url("http://f.cl.ly/items/452R3S1440221Z3m372j/israel.png");
  background-size: cover;
}
#content #left #map p {
  text-transform: uppercase;
  padding-top: 20px;
  padding-left: 30px;
  font-size: 0.9em;
  font-weight: 600;
}
#content #left #map .zoom {
  position: absolute;
  right: 25px;
  top: 25px;
  width: 2px;
  height: 70px;
  background: white;
}
#content #left #map .zoom:before, #content #left #map .zoom:after {
  text-align: center;
  font-weight: 600;
  position: absolute;
  color: #7BC087;
  background: white;
  width: 20px;
}
#content #left #map .zoom:before {
  content: '+';
  top: -10px;
  right: -8px;
}
#content #left #map .zoom:after {
  content: '-';
  bottom: -10px;
  right: -8px;
}
#content #left #map .map-locator {
  position: absolute;
  top: 40%;
  left: 30%;
  border-radius: 15px;
  height: 30px;
  width: 30px;
  background: rgba(0, 0, 0, 0.4);
  border: solid 2px white;
}
#content #left #map .map-locator:before {
  content: '';
  position: absolute;
  top: 9px;
  left: 9px;
  width: 8px;
  height: 8px;
  background: white;
  border-radius: 5px;
}
#content #left #map .map-locator .tooltip {
  position: absolute;
  color: #394141;
  left: 50px;
  top: -10px;
  background: white;
  font-size: 0.8em;
  font-weight: 600;
  -webkit-box-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5);
  -moz-box-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5);
  box-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5);
}
#content #left #map .map-locator .tooltip:before {
  content: '';
  position: absolute;
  left: -10px;
  top: 14px;
  border-right: solid white 10px;
  border-top: solid transparent 8px;
  border-bottom: solid transparent 8px;
}
#content #left #map .map-locator .tooltip [class*="entypo-"] {
  min-width: 25px;
  display: inline-block;
  text-align: center;
  border-right: solid thin #CCC;
  margin-right: 5px;
}
#content #left #map .map-locator .tooltip li {
  border-bottom: solid thin #CCC;
  padding: 10px;
  white-space: nowrap;
}
#content #left #map .map-locator .tooltip li a {
  color: #51B2D6;
}
#content #left #map .map-locator .tooltip li:hover [class*="entypo-"] {
  color: #51B2D6;
}
#content #left ul#location-bar {
  width: 100%;
  text-align: center;
  display: table;
}
#content #left ul#location-bar li {
  display: table-cell;
  padding: 15px;
  background: #5FA269;
  border-right: solid thin #7fb587;
}
#content #left ul#location-bar li:last-of-type {
  border-right: 0;
}
#content #left ul#location-bar li:hover {
  background: #4c8254;
}
#content #left ul#location-bar .active {
  background: #4c8254;
}
#content #right {
  float: left;
  width: 25%;
  background: #454f4f;
  font-size: 0.75em;
  padding: 15px;
}
@media all and (max-width: 780px) {
  #content #right {
    width: 100%;
  }
}
#content #right p {
  margin-bottom: 10px;
  text-transform: uppercase;
}
#content #right a:hover {
  color: #51B2D6;
}
#content #right #social {
  display: table;
  width: 100%;
}
#content #right .social {
  display: table-cell;
  text-align: center;
}
#content #right form {
  border-top: solid thin #8e9699;
  border-bottom: solid thin #8e9699;
  margin: 20px 0;
  padding: 20px 0;
}
#content #right form input,
#content #right form textarea {
  background: #394141;
  padding: 8px;
  margin-bottom: 8px;
  width: 100%;
  color: white;
}
#content #right form input:last-of-type,
#content #right form textarea:last-of-type {
  margin-bottom: 0;
}
#content #right form input[type='submit'],
#content #right form textarea[type='submit'] {
  text-transform: uppercase;
  background: #7BC087;
  width: 50%;
  color: white;
  margin-top: 5px;
}
#content #right form input[type='submit']:hover,
#content #right form textarea[type='submit']:hover {
  background: #58b068;
  -webkit-box-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5);
  -moz-box-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5);
  box-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5);
}
#content #right form input[type='textarea'],
#content #right form textarea[type='textarea'] {
  min-height: 75px;
  vertical-align: text-top;
}
#content #right p.other {
  font-size: 0.7;
  margin-bottom: 5px;
  text-transform: lowercase;
  font-weight: 100;
}
#content #right p.other,
#content #right p.other a {
  color: #8e9699;
}
</style></head><body>
<div id='browser'>
  <div id='browser-bar'>
    <div class='circles'></div>
    <div class='circles'></div>
    <div class='circles'></div>
    <p>Contact Us</p>
    <span class='arrow entypo-resize-full'></span>
  </div>
  <div id='content'>
    <div id='left'>
      <div id='map'>
        <p>Where To Find Us</p>
        <div class='map-locator'>
          <div class='tooltip'>
            <ul>
              <li>
                <span class='entypo-location'></span>
                <span class='selectedLocation'>India</span>
              </li>
              <li>
                <span class='entypo-mail'></span>
                <a href='#'>giftgallery@gmail.com</a>
              </li>
              <li>
                <span class='entypo-phone'></span>
                (+91) 9977235890
              </li>
            </ul>
          </div>
        </div>
        <div class='zoom'></div>
      </div>
      <ul id='location-bar'>
        <li>
          <a class='location' data-location='Israel' href='http://f.cl.ly/items/452R3S1440221Z3m372j/israel.png'></a>
        </li>
        <li>
          <a class='location' data-location='USA' href='http://f.cl.ly/items/0n0o01382l0p1u271D43/usa.png'></a>
        </li>
        <li>
          <a class='location' data-location='The Netherlands' href='http://f.cl.ly/items/0g0l283X3h1T3H270V0A/netherlands.png'></a>
        </li>
        <li>
          <a class='location' data-location='Singapore' href='http://f.cl.ly/items/1i2Y262H020X141R3h0k/singapore.png'>India</a>
        </li>
      </ul>
    </div>
    <div id='right'>
      <p>Connect</p>
      <div id='social'>
        <a class='social'>
          <span class='entypo-facebook'></span>
        </a>
        <a class='social'>
          <span class='entypo-twitter'></span>
        </a>
        <a class='social'>
          <span class='entypo-linkedin'></span>
        </a>
        <a class='social'>
          <span class='entypo-gplus'></span>
        </a>
        <a class='social'>
          <span class='entypo-instagrem'></span>
        </a>
      </div>
      <form>
        <p>Get in Contact</p>
        <input placeholder='Email' type='email'>
        <input placeholder='Subject' type='text'>
        <textarea placeholder='Message' rows='4'></textarea>
        <input placeholder='Send' type='submit'>
      </form>
      <p>other way</p>
      <p class='other entypo-mail'>
        <a href='#'>giftgallery@gmail.com</a>
      </p>
      <p class='other entypo-phone'>(+91) 9977235890</p>
    </div>
  </div>
</div>
<script src='//production-assets.codepen.io/assets/common/stopExecutionOnTimeout-b2a7b3fe212eaa732349046d8416e00a9dec26eb7fd347590fbced3ab38af52e.js'></script><script src='//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script>//Inspired by a dribbble by Bluroon
//https://dribbble.com/shots/1356864-Contact-Us

//Capture the click event on a location
$("#location-bar a").click(function(event){
  event.preventDefault();
  
  var $this = $(this),
      $li = $this.parent(),
      selectedMap = $this.attr("href"),
      selectedLocation = $this.data('location');
 
  $li.addClass('active').siblings('li').removeClass('active');

  //Update #map bkimage with the image from the location
  $('#map').css('background-image', 'url(' + selectedMap + ')');  
  //update tooltip 'address'
  $('.selectedLocation').text(selectedLocation);
});
//# sourceURL=pen.js
</script>
</body></html>
<%@ include file="template/footer.jsp"%>