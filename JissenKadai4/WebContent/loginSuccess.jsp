<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Successful Login</title>
</head>
<body>
ログインに成功しました<br>
<s:property value="#session.name_key"/>さん<br>
<s:form action="HistoryAction">
<s:submit value="購入履歴"/>
</s:form>
はろーわーるど
<INPUT type="button" value="戻る" onClick="history.back()">
</body>
</html>