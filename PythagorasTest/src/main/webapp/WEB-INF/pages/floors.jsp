<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Floor Information</title>

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="/webapp/css/main.css" rel="stylesheet"/>
</head>

<body>

<div class="wrapper">
    <div class="welcome"> Floor Information</div>
    <p></p>
    <div class="cur_body">
        <form:form method="post" action="/api/floor/add" commandName="floor" class="form-horizontal">
        <div>
            <form:label cssClass="control-label" path="building">Select Building:</form:label>
            <div>
                <form:select path="building" class="slt_item">
                    <form:option value="NONE" label=" -- SELECT BUILDING NAME --"/>
                    <<form:options items="${buildings}"/>
                </form:select>
            </div>
        </div>
        <p></p>
        <div class="control-group">
            <form:label cssClass="control-label" path="name">Name:</form:label>
            <div class="controls">
                <form:input path="name"/>
            </div>
        </div>
        <p></p>
        <div class="control-group">
            <form:label cssClass="control-label" path="area">Area:</form:label>
            <div class="controls">
                <form:input path="area"/>
            </div>
        </div>
        <p></p>
        <div class="control-group">
            <div class="controls">
                <input type="submit" value="Add Floor" class="pat_btn_click"/>
            </div>
        </div>
        </form:form>
        <p></p>
        <div class="control-group">
            <div class="controls">
                <input type="button" class="pat_btn_click" onclick="location.href='/welcome'" value="Back">
            </div>
        </div>
        <p></p>
    </div>

    <div class="cur_tab_body">
        <c:if test="${!empty floors}">
            <h2 style="margin-top:10px"> Floors </h2>
            <table>
                <thead>
                <tr>
                    <th class="tab_th">Floor Name</th>
                    <th class="tab_th">Area</th>
                    <th class="tab_th">Building Name</th>
                    <th>&nbsp;</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${floors}" var="floor">
                    <tr>
                        <td class="tab_td"> ${floor.name} </td>
                        <td class="tab_td"> ${floor.area} </td>
                        <td class="tab_td"> ${floor.building} </td>
                        <td class="tab_td">
                            <form action="/api/floor/delete/${floor.id}" method="post"><input type="submit"
                                                                                              class="btn btn-danger btn-mini"
                                                                                              value="Delete"/></form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
</div>
</div>
</div>

</body>
</html>