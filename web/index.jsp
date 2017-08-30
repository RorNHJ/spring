<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>

<div  style="position: absolute; top: 30%;left:40%;width: 220px">
    <div style="width: 220px" align="center">
        <label style="font-size: 30px;font-family: Arial;font-weight: bold;color: #FF9A00">W</label>
        <label style="font-size: 30px;font-family: Arial;font-weight: bold;color: #363636">ELCOME</label>
    </div>
    <form action="#" method="post">
        <div id="loginBox" align="center">
            <input class="indexInput" type="text" name="loginId" placeholder="아이디" size="10"/><br>
            <input class="indexInput" type="password" size="10" name="loginPw" placeholder="패스워드" style="margin-top: 10px" />
        </div>
        <div style="margin-top: 10px;width: 220px" align="center" >
            <button type="submit">LOGIN</button>&nbsp;&nbsp;
            <button button onclick="javascript:window.location ='join.jsp'">JOIN</button>
        </div>
    </form>

</div>
</body>
</html>