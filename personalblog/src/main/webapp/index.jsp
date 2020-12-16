<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="../css/index/index.css">
    <script type="text/javascript" href="../js/index/index.js"></script>
</head>
<body>
    <div class="wrap">
        <div class="header">

        </div>
        <div class="navi">

        </div>
        <div class="container">
            <div class="sidebar">
                <div class="info-form">
                    <h4>
                        카페정보
                    </h4>
                    <div class="infoImage">
                    </div>
                    <h3>도탁스(DOTAX)</h3>
                    <p>레전드(공개) ></p>
                    <a href="#">공지게시판</a><br>
                    <a href="#">게임게시판</a><br>
                    <a href="#">자유게시판</a><br>
                    <a href="#">출석체크</a><br>
                    
                </div>
              
            </div>
            <div class="content">
                <c:choose>
                <c:when test="${sessionScope.loginUser!=null}">
                <form action="/user/mypageFrm.do" method="post">
                	<button>마이페이지</button>
                </form>
                <a href="/user/delete.do">회원탈퇴</a>
                <a href="/user/selectAll.do">전체회원조회</a>
                <a href="/user/login.do">로그아웃</a>
                </c:when>
                <c:otherwise>
                	<a href="/user/joinFrm.do">회원가입</a>
                	<a href="/user/login.do">로그인</a>
                </c:otherwise>
                </c:choose>
            </div>
        </div>
    </div>
</body>
</html>