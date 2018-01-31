<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<meta name="description" content="">
<meta name="author" content="">

<title>goodsInfo</title>
<base href="${pageContext.request.contextPath}/">

<link href="/css/bootstrap.css" rel="stylesheet">

<link href="/css/zTreeStyle/zTreeStyle.css" rel="stylesheet">

</head>

<body>

	<div class="container">

		<div class="masthead">
			<h3 class="text-muted">goodsInfo</h3>
			<nav>
				<ul class="nav nav-justified">
					<li class="active"><a class="option" value="Home" >Home</a></li>
					<li><a class="option" value="Projects">Projects</a></li>
					<li><a class="option" value="Services">Services</a></li>
					<li><a class="option" value="Downloads">Downloads</a></li>
					<li><a class="option" value="About">About</a></li>
					<li><a class="option" value="Contact">Contact</a></li>
				</ul>
			</nav>
		</div>

		
		
		<Iframe id="view_frame" src="goodsInfo/list"; width="100%" height="500" scrolling="no" frameborder="0"></iframe>
			
	
		<footer class="footer">
			<p>&copy; 2018 Company, Inc.</p>
		</footer>

	</div>



	<script type="text/javascript"  src="/js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript"  src="/js/bootstrap.min.js"></script>
	<script type="text/javascript"  src="/js/views/goods/operation.js"></script>
	<script src="/js/views/tree/sortTree.js"></script>
</body>
</html>
