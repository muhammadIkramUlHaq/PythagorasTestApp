<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Ikram
  Date: 10/02/2018
--%>
<html>
<head>
    <title>Pythagoras Test Application</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <link href="/webapp/css/main.css" rel="stylesheet"/>
</head>
<body>
<div id="wrapper">
    <div class="welcome"> Pythagoras Test Application</div>
    <p></p>
    <div id="column1">
        <h2 style=" text-align : center"> Building Information Menu </h2>
        <div class="col_div">
            <p></p>
            <p></p>
            <img src="/webapp/images/building.png" width="200px" height="200px" alt="" srcset="">
        </div>

        <div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align:center;">
            <input class="btn_click" type="button" onclick="location.href='/api/building'" value="Building Menu">
        </div>
    </div>
    <div id="column2">
        <h2 style=" text-align : center"> Floor Information Menu </h2>
        <div class="col_div">
            <div class="col_div">
                <p></p>
                <p></p>
                <img src="/webapp/images/floor.png" width="200px" height="200px" alt="" srcset="">
            </div>

        </div>
        <div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align:center;">
            <input class="btn_click" type="button" onclick="location.href='/api/floor'" value="Floor Menu">
        </div>
    </div>
</div>
</body>
</html>
