<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<style>
  @import url('https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Alfa+Slab+One&family=Comforter&family=Gasoek+One&family=Oi&family=Sigmar&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Anton+SC&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Grand+Hotel&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Oswald:wght@200..700&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Belanosima&family=Rubik+Vinyl&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Grand+Hotel&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Kaushan+Script&display=swap');

        html
        {
            scroll-behavior: smooth;
        }
        body
        {
            margin: 0;
            display: flex;
            width: 100%;
            height: 100%;
            flex-direction: column;
            font-family: "Poppins", sans-serif;
            background-image: linear-gradient(to right, #6a11cb 0%, #2575fc 100%);
            overflow-x: hidden;
            
        }
        .spectacledcoder-navbar
        {
            position: fixed;
            width: 100%;
            height: 60px;
            display: flex;
            z-index: 100;
            background-image: linear-gradient(to right, #6a11cb 0%, #2575fc 100%);
            backdrop-filter: blur(20px);
        }
        .spectacledcoder-navbar .brand
        {
            margin: auto;
            width: fit-content;
            height: 60px;
            margin-left: 20px;
            margin-top: 5px;
            display: flex;

        }
        .spectacledcoder-navbar .brand h1
        {
            font-family: "Comforter", cursive;
            margin: auto;
            color: rgb(255, 255, 255);
        }
        .spectacledcoder-navbar ul
        {
            width: 50%;
            height: 100%;
            margin: auto;
            margin-left: 0px;
            display: flex;


        }
        .spectacledcoder-navbar ul li
        {
            margin: auto;
            margin-left: 0px;
            list-style: none;
            font-weight: 400;
        }
        .rect
        {
            margin: auto;
            margin-left: 0px;
            width: 0%;
            height: 2px;
            background-color: rgb(255, 255, 255);
        }
        .spectacledcoder-navbar ul li:hover .rect
        {
            width: 100%;
            transition: all 0.5s;
        }
        .spectacledcoder-navbar ul li a
        {
            font-family: "Poppins", sans-serif;
            font-size: smaller;
            text-decoration: none;
            color: rgb(255, 255, 255);
        }

        .spectacledcoder-navbar .navbar-toggler
        {
            margin: auto;
            width: 50px;
            height: 40%;
            display: none;
            flex-direction: column;
            cursor: pointer;
            transition: all 0.5s;
            margin-right: 20px;

        }
        .spectacledcoder-navbar .navbar-toggler .line1, .spectacledcoder-navbar .navbar-toggler .line2
        {
            margin: auto;
            width: 20px;
            height: 1px;
            background-color: rgb(255, 255, 255);

        }
        .overlay-dropdown
        {
            display: none;
        }
        .overlay-dropdown ul li
        {
            display: none;
        }
       

        #intro-div, #about-div, #services-div, #careers-div, #contact-div
        {
            margin: auto;
            width: 100%;
            height: 100vh;
            display: flex;
        }
        #intro-div h2, #about-div h2, #services-div h2, #careers-div h2, #contact-div h2
        {
            margin: auto;
            font-size: 7vw;
            color: rgb(255, 255, 255);
        }


        @media only screen and (max-width: 1000px)
        {
            .spectacledcoder-navbar ul
            {
                display: none;
            }
            .spectacledcoder-navbar .navbar-toggler
            {
                display: flex;
            }
            .overlay-dropdown
        {
            position: absolute;
            width: 100%;
            height: 100%;
            margin: auto;
            display: none;
            flex-direction: column;
            background-color: rgb(255, 255, 255);
        }
        .overlay-dropdown .brand
        {
           margin: auto;
           height: 60px;
           margin-left: 20px;
           margin-top: 12px;
        }
        .overlay-dropdown .brand h1
        {
            font-family: "Comforter", cursive;
            margin: auto;
        }
        .overlay-dropdown ul
        {
            width: 50%;
            height: 60%;
            margin: auto;
            display: flex;
            flex-direction: column;
            margin-left: -16px;
            margin-top: 20px;
        }
        .overlay-dropdown ul li
        {
            display: flex;
            list-style-type: none;
            margin-left: 20px;

        }
        .overlay-dropdown ul li a
        {
            text-decoration: none;
            color: black;
            font-size: 50px;
        }
        }

        .disclaimer
        { 
            margin: auto; 
            margin-bottom: 20px;
            width: fit-content;
            color: rgb(255, 255, 255);
            text-align: center;
            font-family: 'Belanosima', sans-serif;
        }
        .disclaimer a
        {
            text-decoration: none;
            color: #ffffff;
            font-family: "Kaushan Script", cursive;
            font-weight: 900;
        }
        .disclaimer a:hover
        {
            text-decoration: overline;
        }
</style>
<body>

 <div class="overlay-dropdown" id="overlay">
        <div class="brand">
            <h1>SpectacledCoder</h1>
        </div>
        <ul>
            <li><a href="#intro-div" onclick="navigation()">Home</a></li>
            <li><a href="#about-div" onclick="navigation()">About</a></li>
            <li><a href="#services-div" onclick="navigation()">Services</a></li>
            <li><a href="#careers-div" onclick="navigation()">Careers</a></li>
            <li><a href="#contact-div" onclick="navigation()">Contact</a></li>
        </ul>

    </div>

    <div class="spectacledcoder-navbar">
        <div class="brand">
            <h1>SpectacledCoder</h1>
        </div>
        <ul>
            <li><a href="#intro-div">Home</a><div class="rect"></div></li>
            <li><a href="#about-div">About</a><div class="rect"></div></li>
            <li><a href="#services-div">Services</a><div class="rect"></div></li>
            <li><a href="#careers-div">Careers</a><div class="rect"></div></li>
            <li><a href="#contact-div">Contact</a><div class="rect"></div></li>
        </ul>

        <div class="navbar-toggler" id="toggler" onclick="mobilenav()">
            <div class="line1" id="ln1"></div>
            <div class="line2" id="ln2"></div>
        </div>

    </div>

    <div id="intro-div"><h2>HOME</h2></div>
    <div id="about-div"><h2>ABOUT</h2></div>
    <div id="services-div"><h2>SERVICES</h2></div>
    <div id="careers-div"><h2>CAREERS</h2></div>
    <div id="contact-div"><h2>CONTACT</h2></div>
    <p class="disclaimer">Designed & Created by SpectacledCoder</p>
    <script>
    var toggler = document.getElementById("toggler");
    var overlay = document.getElementById("overlay");
    var ln1 = document.getElementById("ln1");
    var ln2 = document.getElementById("ln2");
    var toggleflag = 0;

    var intro = document.getElementById('intro-div');
    var about = document.getElementById('about-div');
    var services = document.getElementById('services-div');
    var careers = document.getElementById('careers-div');
    var contact = document.getElementById('contact-div');

    
    function mobilenav()
    {
        if (toggleflag == 0)
        {
            overlay.style.display = "flex";
            ln1.style.transform = "rotate(50deg)";
            ln2.style.transform = "rotate(-50deg)";
            toggler.style.height = "1px";
            intro.style.display = 'none';
            about.style.display = 'none';
            services.style.display = 'none';
           
            careers.style.display = 'none';
            contact.style.display = 'none';
            toggleflag = 1;
        }
        else
        {
            overlay.style.display = "none";
            ln1.style.transform = "rotate(0deg)";
            ln2.style.transform = "rotate(0deg)";
            toggler.style.height = "40%";
            intro.style.display = 'flex';
            about.style.display = 'flex';
            services.style.display = 'flex';
          
            careers.style.display = 'flex';
            contact.style.display = 'flex';
            toggleflag = 0;
        }
    }

    function navigation()
    {
        overlay.style.display = "none";
        ln1.style.transform = "rotate(0deg)";
        ln2.style.transform = "rotate(0deg)";
        toggler.style.height = "40%";
        intro.style.display = 'flex';
        about.style.display = 'flex';
        services.style.display = 'flex';
       
        careers.style.display = 'flex';
        contact.style.display = 'flex';
        toggleflag = 0;
    }
    </script>
</body>
</html>
