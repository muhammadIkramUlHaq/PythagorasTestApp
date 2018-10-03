<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Pythagoras Test Application</title>

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="/webapp/css/main.css" rel="stylesheet"/>
</head>

<body>

<div class="wrapper">
    <div class="welcome"> Buildings Information</div>
    <p></p>
    <div class="cur_body">
        <form:form method="post" action="/api/building/add" commandName="building" class="form-horizontal">
        <div class="control-group">
            <form:label cssClass="control-label" path="name">Name :</form:label>
            <div class="controls">
                <form:input path="name"/>
            </div>
        </div>
        <p></p>
        <div class="control-group">
            <div class="controls">
                <input type="submit" value="Add Building" class="pat_btn_click"/>
            </div>
        </div>
        </form:form>
        <p></p>
        <div class="control-group">
            <div class="controls">
                <input type="button" class="pat_btn_click" style="width : 30%;" onclick="location.href='/welcome'"
                       value="Back">
            </div>
        </div>
        <p></p>
    </div>

    <div class="cur_tab_body">
        <c:if test="${!empty buildings}">
            <h2> Buildings </h2>
            <table>
                <thead>
                <tr>
                    <th class="tab_th"> Id</th>
                    <th class="tab_th"> Name</th>

                    <th>&nbsp;</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${buildings}" var="building">
                    <tr>
                        <td class="tab_td"> ${building.id} </td>
                        <td class="tab_td"> ${building.name} </td>
                        <td class="tab_td">
                            <form action="/api/building/delete/${building.id}" method="post"><input type="submit"
                                                                                                      class="btn btn-danger btn-mini"
                                                                                                      value="Delete"/>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
</div>

</body>
</html>