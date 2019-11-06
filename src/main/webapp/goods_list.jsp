<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="goods_add.jsp"><input type="button" value="添加"></a>
	<table>
		<c:forEach items="${list }" var="g">
			<tr>
				<td>
					<img alt="xxx" height="100px" width="150px" src="lookImg?path=${g.gimg }"><br>
					${g.gname }<br>
					${g.price }<br>
					${g.gsname }<br>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>