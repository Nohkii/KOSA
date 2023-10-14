<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 테스트</title>
</head>
<body>
<h2>EL 변수</h2>
<hr>
name 변수의 값 : ${name}<br>
<% String name="듀크"; %>
name 변수의 값(표현식 태그) : <%= name %><br> 
<!-- name이라는 이름으로 보관되어있는 객체를 
pageScope -> requestScope -> session,, 순서대로 찾아본다 -->
<!-- 
위에서 값을 넣어도 나오지 않음 
el에서는 name이라는 이름으로 보관되어있는 객체인데 위에서는 name이라는 변수를 만들었을 뿐,,
-->
name 변수의 값(EL) : ${name}<br>
<% pageContext.setAttribute("name", "자바");  %> <!-- 페이지 스코프 -->
name 변수의 값 : ${name}<br><!-- 여기에서 자바가 추출됨 -->
pageScope.name 변수의 값 : ${pageScope.name}<br>
<hr>
<% pageContext.setAttribute("number", 100); %>
number 변수의 값 : ${number}<br>
pageScope.number 변수의 값 : ${pageScope.number}<br>
number 변수의 값에 23을 더한 값 : ${ number + 23 }
</body>
</html>