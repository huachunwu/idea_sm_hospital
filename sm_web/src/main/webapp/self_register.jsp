<%--
  Created by IntelliJ IDEA.
  User: 吴华春
  Date: 2019/2/16
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>新建用户</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/add.css">
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="sectionClassify/main.do">
                慕课网用户注册
            </a>
        </div>
    </div>
</nav>
<div class="container">
    <div class="jumbotron">
        <h1>Hello, ${USER.name}!</h1>
        <p>请小心的注册用户，要是建了一个错误的就不好了。。。</p>
    </div>
    <div class="page-header">
        <h3><small>注册</small></h3>
    </div>
    <form class="form-horizontal" action="register.do" method="post">
        <div class="form-group">
            <label for="name" class="col-sm-2 control-label">姓名 ：</label>
            <div class="col-sm-8">
                <input name="name" class="form-control" id="name">
            </div><br><br><br>
            <label for="name2" class="col-sm-2 control-label">性别 ：</label>
            <div class="col-sm-8">
                <input name="sex" class="form-control" id="name2">
            </div><br><br><br>
            <label for="name3" class="col-sm-2 control-label">账户 ：</label>
            <div class="col-sm-8">
                <input name="account" class="form-control" id="name3">
            </div><br><br><br>
            <label for="name4" class="col-sm-2 control-label">身份证号 ：</label>
            <div class="col-sm-8">
                <input name="idNumber" class="form-control" id="name4">
            </div><br><br><br>
            <label for="name5" class="col-sm-2 control-label">密码 ：</label>
            <div class="col-sm-8">
                <input name="password1" class="form-control" id="name5" type="password">
            </div><br><br><br>
            <label for="name55" class="col-sm-2 control-label">确认密码 ：</label>
            <div class="col-sm-8">
                <input name="password2" class="form-control" id="name55" type="password">
            </div><br><br><br>
            <label for="name6" class="col-sm-2 control-label">生日 ：</label>
            <div class="col-sm-8">
                <input name="bornDate" class="form-control" id="name6">
            </div><br><br><br>
            <label for="name7" class="col-sm-2 control-label">备注 ：</label>
            <div class="col-sm-8">
                <input name="info" class="form-control" id="name7">
            </div><br><br><br>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary">保存</button>&nbsp;&nbsp;&nbsp;
            </div>
        </div>
    </form>
</div>
<footer class="text-center" >
    copy@imooc
</footer>
</body>
</html>

