<%--
  Created by IntelliJ IDEA.
  User: 吴华春
  Date: 2019/2/14
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>科室列表</title>
    <link rel="stylesheet" href="../css/index.css">
    <link rel="stylesheet" href="../css/bootstrap.min.css">
</head>

<body>
<header>
    <div class="container">
        <c:forEach items="${SectionClassify}" var="sectionClassify">
        <nav>
            <a href="../sectionList/list.do?id=${sectionClassify.id}" >${sectionClassify.name}</a>
        </nav>
        </c:forEach>
       <%-- <nav>
            <a href="" >内科</a>
        </nav>
        <nav>
            <a href="" >外科</a>
        </nav>--%>
        <nav>
            <a href="../sectionClassify/main.do" >分类</a>
        </nav>

    </div>
</header>
<section class="banner">
    <div class="container">
        <div>
            <h1>科室</h1>
            <p>科室列表</p>
        </div>
    </div>
</section>
<section class="main">
    <div class="container">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>名称</th>
                <th>分类</th>
                <th>创建时间</th>
                <th>最后修改时间</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${SectionClassify}" var="sectionClass">
                <tr>
                    <td>${sectionClass.name}</td>
                    <td>${sectionClass.id}</td>
                    <td><fmt:formatDate  value="${sectionClass.createTime}" pattern="yyyy-MM-dd: HH:mm:ss"/></td>
                    <td><fmt:formatDate value="${sectionClass.lastUpdateTime}" pattern="yyyy-MM-dd: HH:mm:ss"/></td>
                    <td>
                        <a href="../sectionClassify/toEdit.do?id=${sectionClass.id}">修改</a>&nbsp;&nbsp;
                        <a href="../sectionClassify/remove.do?id=${sectionClass.id}">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</section>
<section class="page">
    <div class="container">
        <div id="fatie">
            <a href="../sectionClassify/toAdd.do"><button>新建</button></a>
        </div>
    </div>
</section>
<footer>
    copy@慕课网
</footer>
</body>
</html>