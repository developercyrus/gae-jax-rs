<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.google.appengine.api.rdbms.AppEngineDriver" %>

<html>
    <body>
<%
	Connection c = null;
	c = DriverManager.getConnection("jdbc:google:rdbms://p67769767:cloudsql/guestbook");
	ResultSet rs = c.createStatement().executeQuery("SELECT guestName, content, id FROM guestbook"); 
%>

    <table style="border: 1px solid black">
        <tbody>
			<tr>
				<th width="35%" style="background-color: #CCFFCC; margin: 5px">Name</th>
				<th style="background-color: #CCFFCC; margin: 5px">Message</th>
				<th style="background-color: #CCFFCC; margin: 5px">ID</th>
			</tr> 
			<%
			    while (rs.next()) {
				    String guestName = rs.getString("guestName");
				    String content = rs.getString("content");
				    int id = rs.getInt("id"); 
			%>
					<tr>
					<td><%= guestName %></td>
					<td><%= content %></td>
					<td><%= id %></td>
					</tr>
            <% 
				}
				c.close(); 
            %>

        </tbody>
    </table>
    </body>
</html>