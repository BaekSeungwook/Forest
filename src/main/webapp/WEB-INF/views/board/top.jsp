<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		
		<meta charset="UTF-8" name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
		
		<style type="text/css">@-ms-viewport{width: device-width}</style>
		<style type="text/css">html,body,div,span,applet,object,iframe,h1,h2,h3,h4,h5,h6,p,blockquote,pre,a,abbr,acronym,address,big,cite,code,del,dfn,em,img,ins,kbd,q,s,samp,small,strike,strong,sub,sup,tt,var,b,u,i,center,dl,dt,dd,ol,ul,li,fieldset,form,label,legend,table,caption,tbody,tfoot,thead,tr,th,td,article,aside,canvas,details,embed,figure,figcaption,footer,header,hgroup,menu,nav,output,ruby,section,summary,time,mark,audio,video{margin:0;padding:0;border:0;font-size:100%;font:inherit;vertical-align:baseline}article,aside,details,figcaption,figure,footer,header,hgroup,menu,nav,section{display:block}body{line-height:1}ol,ul{list-style:none}blockquote,q{quotes:none}blockquote:before,blockquote:after,q:before,q:after{content:'';content:none}table{border-collapse:collapse;border-spacing:0}body{-webkit-text-size-adjust:none}</style>
		<style type="text/css">*,*:before,*:after{-moz-box-sizing:border-box;-webkit-box-sizing:border-box;box-sizing:border-box}</style>
		
		<title>For Rest : 휴양림 예약 사이트</title>
		
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="/controller/resources/js/jquery.min.js"></script>
		<script src="/controller/resources/js/jquery.dropotron.min.js"></script>
		
		<style type="text/css">.\31 2u{width:100%}.\31 1u{width:91.6666666667%}.\31 0u{width:83.3333333333%}.\39 u{width:75%}.\38 u{width:66.6666666667%}.\37 u{width:58.3333333333%}.\36 u{width:50%}.\35 u{width:41.6666666667%}.\34 u{width:33.3333333333%}.\33 u{width:25%}.\32 u{width:16.6666666667%}.\31 u{width:8.3333333333%}.\-11u{margin-left:91.6666666667%}.\-10u{margin-left:83.3333333333%}.\-9u{margin-left:75%}.\-8u{margin-left:66.6666666667%}.\-7u{margin-left:58.3333333333%}.\-6u{margin-left:50%}.\-5u{margin-left:41.6666666667%}.\-4u{margin-left:33.3333333333%}.\-3u{margin-left:25%}.\-2u{margin-left:16.6666666667%}.\-1u{margin-left:8.3333333333%}</style>
		<style type="text/css">.row>*{float:left}.row:after{content:'';display:block;clear:both;height:0}.row:first-child>*{padding-top:0!important}</style>
		
		<link rel="stylesheet" type="text/css" href="/controller/resources/css/style.css">
		<link rel="stylesheet" type="text/css" href="/controller/resources/css/style-wide.css">
		<link rel="stylesheet" type="text/css" href="/controller/resources/css/style-normal.css">
		
		<style type="text/css">body{min-width:95%}.container{margin-left:auto;margin-right:auto;width:95%}.container.small{width:71.25%}.container.big{width:100%;max-width:118.75%;min-width:95%}</style>
		<style type="text/css">.row>*{padding-left:25px}.row+.row>*{padding:25px 0 0 25px}.row{margin-left:-25px}.row.flush>*{padding-left:0}.row+.row.flush>*{padding:0}.row.flush{margin-left:0}.row.half>*{padding-left:12.5px}.row+.row.half>*{padding:12.5px 0 0 12.5px}.row.half{margin-left:-12.5px}.row.quarter>*{padding-left:6.25px}.row+.row.quarter>*{padding:6.25px 0 0 6.25px}.row.quarter{margin-left:-6.25px}.row.oneandhalf>*{padding-left:37.5px}.row+.row.oneandhalf>*{padding:37.5px 0 0 37.5px}.row.oneandhalf{margin-left:-37.5px}.row.double>*{padding-left:50px}.row+.row.double>*{padding:50px 0 0 50px}.row.double{margin-left:-50px}</style>
		<style type="text/css">.not-global,.not-wide,.not-normal,.not-narrow{display:none!important}.only-narrower,.only-mobile{display:none!important}</style>
		
		<script src="/controller/resources/js/skel.min.js"></script>
		<script src="/controller/resources/js/skel-layers.min.js"></script>
		<script src="/controller/resources/js/init.js"></script>
		
		<noscript>
			<link rel="stylesheet" href="/controller/resources/css/skel.css" />
			<link rel="stylesheet" href="/controller/resources/css/style.css" />
		</noscript>
		
	</head>
	<body class="homepage">

		<!-- Header Wrapper -->
			<div class="wrapper style1">
			
			<!-- Header -->
				<div id="header">					
					<div class="container">							
						<!-- Logo -->
							<h1><a href="#" id="logo">FORREST</a></h1>
						
						<!-- Nav -->
							<nav id="nav">
								<ul>
									<li class="active"><a href="hometest">Home</a></li>
									<li><a href="${pageContext.request.contextPath}/forest/list">통합 예약</a></li>
									<li>
										<a href="#">여행 정보</a>
										<ul>
											<li><a href="${pageContext.request.contextPath}/travelInformation">여행 정보</li>
										</ul>
									</li>
									<li>
										<a href="">공지/문의</a>
										<ul>
											<li><a href="#">공지 사항</a></li>
											<li><a href="${pageContext.request.contextPath}/list">자주 묻는 질문</a></li>
											<li><a href="#">1 대 1 문의</a></li>								
										</ul>
									</li>
									<li><a href="#">마이 페이지</a></li>
								</ul>
							</nav>	
					</div>
				</div>
		</div>
	</body>
</html>