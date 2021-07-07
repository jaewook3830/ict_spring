<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
div {
	text-align: center;
	margin: auto;
}

table {
	width: 500px;
	margin: auto;
	text-align: center;
}

table, th, td {
	border: 3px solid skyblue;
	border-collapse: collapse;
	padding: 2px;
}

input {
	padding: 10px;
}
</style>
<script type="text/javascript">
	function list_go(f) {
		f.action = "index.jsp";
		f.submit();
	}
</script>
</head>
<body>
	<div>
		<h1>인원 추가</h1>
		<form action="join_ok.jsp" method="post">
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>PW</th>
					<th>NAME</th>
					<th>AGE</th>
					<th>ADDR</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="text" name="id" required></td>
					<td><input type="text" name="pw" required></td>
					<td><input type="text" name="name" required></td>
					<td><input type="number" name="age" required></td>
					<td><input type="text" name="addr" required></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="5">
						<input type="submit" value="인원추가">
						<input type="button" value="리스트" onclick="list_go(this.form)">
					</td>
				</tr>
			</tfoot>
		</table>
		</form>
	</div>
</body>
</html>