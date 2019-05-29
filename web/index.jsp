<%--
  Created by IntelliJ IDEA.
  User: dcros
  Date: 5/28/2019
  Time: 8:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Daleks Command Central</title>
  </head>
  <body>
  <H1>Dan Crosby CIT 360 Daleks Command Central</H1>
  <H2>Featuring Apache TomCat Servlets</H2>


  <BR><BR>
  <fieldset>
    <form action="Servlet" method="post">

      <span>
        <img src="img/daleksec.jpg" width="100px" height="100px">
        <input type="checkbox" id="d1" name="d1">
        <label for="d1">Dalek Sec</label>
      </span>

      <span>
        <img src="img/dalekwarriors.jpg" width="100px" height="100px">
        <input type="checkbox" id="d2" name="d2">
        <label for="d2">Dalek Warriors</label>
      </span>

      <span>
        <img src="img/supremecouncil.jpg" width="100px" height="100px">
        <input type="checkbox" id="d3" name="d3">
        <label for="d3">Dalek Supreme Council</label>
      </span>
      <br><BR>
      <label for="myTarget"><h3>Select Attack Destination</h3></label>
      <select id="myTarget" name="myTarget">
        <option value="1">Dallas, Texas</option>
        <option value="2">Earth's Moon</option>
        <option value="3">BYU Idaho</option>
      </select>
      <br>
      <input type="submit" value="Go to battle!">
    </form>
  </fieldset>

  </body>
</html>
