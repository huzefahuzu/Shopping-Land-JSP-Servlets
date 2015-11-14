<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${sessionScope.admin==null}">
	<c:redirect url="index.jsp"></c:redirect>
</c:if>
<header class="navbar navbar-inverse">
	<div class="navbar-inner remove-radius remove-box-shadow">
		<div class="container-fluid">

			<strong
				style="color: #FFFFFF; margin-left: 100px; font-size: 25px; margin-top: 100px;">Admin
				Panel For Shopping Expo</strong>

			<ul id="widgets" class="nav pull-right">


				<li class="dropdown dropdown-user"><a href="javascript:void(0)"
					class="dropdown-toggle" data-toggle="dropdown"><img
						src="img/template/avatar.png" alt="avatar"> <b class="caret"></b></a>
					<ul class="dropdown-menu">

						<li><a href="al"><i class="icon-lock"></i> Log out</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
</header>
