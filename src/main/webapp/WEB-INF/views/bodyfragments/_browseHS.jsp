<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Browse heterostructure</title>
    <%--<link rel="stylesheet" href="browse-heterostructure/browse-heterostructures-style.css">--%>
    <link rel="stylesheet" href="<c:url value="/resources/css/browse-heterostructures-style.css"/>">
</head>
<body>
<header class="browse-header">
    <p>Журнал гетероструктур</p>
</header>
<section style="overflow: hidden;">
    <div style="width: 1000%;">
        <div class="recently-viewed">
            <p><a href="B057" class="viewed-button">B057</a></p>
            <!-- <p><a href="B072" class="viewed-button">B072</a></p> -->
        </div>
        <div class="main-frame">
            <div style="overflow: hidden;">
                <div class="main-buttons">
                    <div id="search-form">
                        <form action="searchHeterostructure" >
                            <input class="heterostructure-name" type="text" name="nameHeterostructure" placeholder="Введите номер образца">
                            <input class="main-button1" type="submit" name="search" value="Найти">
                        </form>
                    </div>
                    <!-- <a href="newHeterostructure" class="main-button">Создать гетероструктуру</a> -->
                    <div id="new-heterostructure">
                        <form action="newHeterostructure">
                            <input class="main-button1" type="submit" name="create" value="Создать гетероструктуру">
                        </form>
                    </div>
                    <div class="end-div"> </div>
                </div>
            </div>
            <div class="main-window">
                <div class="svg-structure">
                    <object type="image/svg+xml" data="<c:url value="/resources/svg/design.svg"/>" width="600px">>Your browser does not support SVG</object>
                </div>
                <div class="text-info">
                    <p class="head-info">Описание гетероструктуры</p>
                    <p>Дата: 1.05.2018<br> Выполнил: Ржеуцкий</p>
                </div>

            </div>

        </div>
    </div>
</section>

</body>
</html>
