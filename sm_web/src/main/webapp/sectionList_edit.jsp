<%--
  Created by IntelliJ IDEA.
  User: 吴华春
  Date: 2019/2/16
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>修改</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/add.css">
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="/dept/list.do">
                慕课网科室管理
            </a>
        </div>
    </div>
</nav>
<div class="container">
    <div class="jumbotron">
        <h1>Hello,${USER.name}!</h1>
        <p>请小心的修改分类，要是建了一个错误的就不好了。。。</p>
    </div>
    <div class="page-header">
        <h3><small>修改</small></h3>
    </div>
    <form class="form-horizontal" action="edit.do" method="post">
        <input name="id" value="${SectionList.id}" type="hidden">
        <div class="form-group">
            <label for="name" class="col-sm-2 control-label">名称 ：</label>
            <div class="col-sm-8">
                <input name="name" class="form-control" id="name"  value="${SectionList.name}">
            </div>
            <br>
            <br>
            <br>
            <label for="name" class="col-sm-2 control-label">科室 ：</label>
            <div class="col-sm-8">
               <%-- <input name="name" class="form-control"   value="${SectionList.name}">--%>
                <select name="Scid" >
                    <c:forEach items="${SectionClassify}" var="sectionClassify">
                        <c:if test="${sectionClassify.id==SectionList.scid}">
                            <option  value="${sectionClassify.id}" selected="selected">${sectionClassify.name}</option>
                        </c:if>
                        <c:if test="${sectionClassify.id!=SectionList.scid}">
                            <option value="${sectionClassify.id}">${sectionClassify.name}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>
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
