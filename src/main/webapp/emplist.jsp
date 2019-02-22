<%@page isELIgnored="false" pageEncoding="UTF-8"
        contentType="text/html; UTF-8" %>
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br/>
                    安全退出
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome!
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        ID
                    </td>
                    <td>
                        Name
                    </td>
                    <td>
                        Salary
                    </td>
                    <td>
                        Age
                    </td>
                    <td>
                        Operation
                    </td>
                </tr>
                <tr class="row1">
                    <td>
                        1
                    </td>
                    <td>
                        陈培松
                    </td>
                    <td>
                        20000000
                    </td>
                    <td>
                        18
                    </td>
                    <td>
                        <a href="emplist.jsp">delete emp</a>&nbsp;<a href="updateEmp.jsp">update emp</a>
                    </td>
                </tr>
                <tr class="row2">
                    <td>
                        2
                    </td>
                    <td>
                        杨宁博
                    </td>
                    <td>
                        20000000
                    </td>
                    <td>
                        18
                    </td>
                    <td>
                        <a href="emplist.jsp">delete emp</a>&nbsp;<a href="updateEmp.jsp">update emp</a>
                    </td>
                </tr>
            </table>
            <p>
                <input type="button" class="button" value="Add Employee" onclick="location='addEmp.html'"/>
            </p>
        </div>
        <a href="">1</a>
        <a href="">2</a>
        <a href="">3</a>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
