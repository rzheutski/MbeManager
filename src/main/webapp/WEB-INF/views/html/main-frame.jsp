<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page isELIgnored="false"%>
<html lang="ru" encoding="UTF-8">
<head>
    <meta charset=utf-8>
    <title>MBE126</title>
    <link rel="stylesheet" href="main-frame/styles.css">
</head>
<body>
	<header class="main-header">
		<div class="mbe-header">
			<img src="main-frame/mbe-setup.jpg" height=100% align=right>
			<h1>MBE 126</h1>
			<div id="spacer"></div>
			<p>Электронный журнал Стенда для роста нитридных гетероструктур</p>
		</div>
	</header>
	<section >
		<div id="main-section">
			<div style="width: 1000%;">
			<div id="main-button-group">
				<form action="third">
					<div><button class="main-button">
					Конструкции <br> гетероструктур
				</button>
				</div>
				<div>
				<button class="main-button">
					Журнал <br> установки
				</button>
				</div>
				<div><button class="main-button">
					Журнал расхода <br> жидкого азота
				</button>
				</div>
				<div><button class="main-button">
					Журнал учета <br> материалов
				</button>
				</div>
				</form>
			</div>
			<div id="content">

				<c:import url="${requestScope.internalPage}" charEncoding="utf-8"/>

			</div>
			</div>
		</div>
	</section>
	<footer>
		<p>Электронный журнал Стенда для роста нитридных гетероструктур, 2018 г.</p>		
	</footer>
</body>
</html>