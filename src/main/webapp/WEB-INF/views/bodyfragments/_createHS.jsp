<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title></title>
    <%--<link rel="stylesheet" href="design-edit-styles.css">--%>
    <link rel="stylesheet" href="<c:url value="/resources/css/design-edit-styles.css"/>">
</head>

<body>
<sf:form modelAttribute="hsFromJsp" action="saveHeterostructure">
<div class=content1>
<header class="browse-header">
    <p>Создать / редактировать гетероструктуру</p>
</header>
<div class=general-parameters-section>
    <div class=parameters>
        <div class=row1>
            <p><b>Номер образца</b>
                <sf:input type="text" path="sampleNumber"/></p>
            <p><b>Дата</b>
                <sf:input type="date" path="date" class="unstyled" name="date"/></p>
                 <p>Выполнил<sf:input class="growers" type="text" path="growersLastNames"/></p>
        </div>
        <div class=row1>
            <p>Номер пластины<sf:input type="text" path="waferNumber"/></p>
            <p>Диаметр пластины
                <sf:input path="waferSize" list="waferSizeOptions"/>
                <datalist id="waferSizeOptions">
                    <option value="2&quot;">
                    <option value="3&quot;">
                    <option value="4&quot;">
                </datalist></p>
            <p>Материал подложки<sf:input path="substrate" list="substrateTypeOptions"/>
                <datalist id="substrateTypeOptions">
                    <option value="Al2O3(0001)">
                    <option value="Si(111)">
                    <option value="6H-SiC">
                    <option value="4H-SiC">
                </datalist></p>
        </div>
    </div>
    <div class=commentSection>
        <p>Комментарии<br>
            <sf:textarea class="comments" path="comments"></sf:textarea>
        </p>
    </div>
</div>


<table id="editTab" class="sortable" border="0" align="center" onclick="rowNumbering(this.id)">
    <!-- <caption>Последовательность слоев <i>Al<sub>x</sub>In<sub>y</sub>Ga<sub>1-x-y</sub>N</i> (начиная от подложки)</caption> -->
    <tbody>
    <tr>
        <td class=table-caption colspan="10"><b>Последовательность слоев <i>Al<sub>x</sub>In<sub>y</sub>Ga<sub>1-x-y</sub>N</i></b> (начиная от подложки)</td>
    </tr>

    <tr align="center">
        <th>№<br>слоя</th>
        <th>Режим</th>
        <th>Толщина, <br> нм</th>
        <th><i>x</i></th>
        <th><i>y</i></th>
        <th>Температура,<br>C</th>
        <th>Нагрев<br>подложки, %</th>
        <th>Поток N*/NH<sub>3</sub>,<br>см<sup>3</sup>/мин</th>
        <th>Легирование</th>
        <th>Комментарии</th>
    </tr>


    <c:forEach items="${hsFromJsp.thickness}" var="value" varStatus="loop">

    <tr id="layerRow" >
        <%--<td align="center">"${hsFromJsp.layersFromJsp[0].growthMode}"</td>--%>
        <td align="center">${layer.growthMode}</td>
        <td align="center"><input type="number" name="thickness" value="${hsFromJsp.thickness[loop.index]}" size="7"/></td>
            <%--<td align="center"><sf:input type="text" path="layer.growthMode" size="7"/></td>--%>


 <%--       a
        <td align="center">
            <sf:select id="mode" name="growthMode" path="growthMode" multiple="false" value="${layer.growthMode}">
                <sf:option value="1">NH<sub>3</sub></sf:option>
                <sf:option value="2">N*</sf:option>
            </sf:select>
        </td>
        <td align="center"><sf:input path="thickness" type="number" value="" min="0"/></td>
        <td align="center"><sf:input type="text" path="x" value="" size="7"/></td>
        <td align="center"><sf:input type="text" path="y" value="" size="7"/></td>
        <td align="center"><sf:input type="text" path="temperature" value="" size="7"/></td>
        <td align="center"><sf:input type="text" path="heat" value="" size="7"/></td>
        <td align="center"><sf:input type="text" path="Nflow" value="" size="7"/></td>
        <td align="center"><sf:select path="dopant" multiple="false">
            <option value="no">нет</option>
            <option value="Si">Si</option>
            <option value="Mg">Mg</option>
        </sf:select>
        </td>
        <td align="center"><sf:input type="text" path="layerComment" value="" size="7"/></td>

        a--%>
        <td id="buttonsCells" align="center">
            <div style="display: block; margin: 0 auto; width: 4.5em;">
                <input type="button" name="addButton" id="addLayerButton" value="+" style="color:#008000" onclick="addLayer(this.parentNode.parentNode.parentNode.rowIndex)">
                <input type="button" name="modifyButton" id="addLayerButton" value="—" style="color:#800000" onclick="deleteLayer(this.parentNode.parentNode.parentNode.rowIndex)">
            </div>
        </td>


    </tr>
    </c:forEach>

    </tbody></table>
<div class=submit>
    <%--<form id="save" action="saveHeterostructure">--%>
        <input class="main-button1" type="submit" name="create" value="Сохранить гетероструктуру">
    <%--</form>--%>
</div>

</div>
</sf:form>



</body>
<%--<script src="tab.js"></script>--%>
<script src="<c:url value="/resources/js/tab.js"/>"></script>
</html>
