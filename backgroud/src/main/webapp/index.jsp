<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Signin Template for Bootstrap</title>
	<base href="${pageContext.request.contextPath}/">
    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.css" rel="stylesheet">
    <link href="/js/signin.css" rel="stylesheet">

  </head>

  <body>
	
    <div class="container">

      <form class="form-signin" action="login/login" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">USER_ACCOUNT</label>
        <input type="text" id="userAccount" name = "userAccount" class="form-control" placeholder="USER_ACCOUNT" required autofocus>
        <label for="inputPassword" class="sr-only">USER_PASSWORD</label>
        <input type="password" id="userPassword" name="userPassword" class="form-control" placeholder="USER_PASSWORD" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" id="login" type="submit">Sign in</button>
      </form>
	<input type="hidden" id="msg" name="msg" value="${MSG}"/>
    </div> <!-- /container -->


    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/views/admin/login.js"></script>
  </body>
</html>
