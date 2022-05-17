<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IT16306 - Create User</title>
</head>
<body>
	<form:form
	method="POST"
	modelAttribute="user"
	action="/su22b1_it16306_sof3021/admin/users/store">
		<div>
			<label>Họ tên</label>
			<form:input name="hoTen" path="hoTen" />
		</div>
		<div>
			<label>Địa chỉ</label>
			<form:input name="diaChi" path="diaChi" />
		</div>
		<div>
			<label>Giới tính</label>
			<form:radiobutton name="gioiTinh" path="gioiTinh"
				value="1" label="Nam" />
			<form:radiobutton name="gioiTinh" path="gioiTinh"
				value="0" label="Nữ" />
		</div>
		<div>
			<label>Email</label>
			<form:input name="email" path="email" type="email" />
		</div>
		<div>
			<label>Password</label>
			<form:password name="password" path="password" />
		</div>
		<div>
			<label>Sđt</label>
			<form:input name="sdt" path="sdt" />
		</div>
		<div>
			<label>Avatar</label>
			<form:input name="avatar" path="avatar" />
		</div>
		<button>Save</button>
	</form:form>
</body>
</html>