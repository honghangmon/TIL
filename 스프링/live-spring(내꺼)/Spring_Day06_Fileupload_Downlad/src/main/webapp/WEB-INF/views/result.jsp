<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>
    ${fileNam}
    <a href="/img/${fileName}">${fileName}</a>
    <img src="/img?${fileName}">
    
    <a href="downLoad?fileName=${fileName}">이미지다운로드</a>

</body>
</html>