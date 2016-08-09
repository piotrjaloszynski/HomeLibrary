<%--
  Created by IntelliJ IDEA.
  User: jalos
  Date: 07.08.2016
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

    <head>
        <title>Homelibrary login</title>

        <script src="https://code.jquery.com/jquery.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    </head>

<body>
<jsp:include page="menu.jsp"/>
<!--login modal-->
<div tabindex="-1" class="modal show" id="loginModal" role="dialog" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button class="close" aria-hidden="true" type="button" data-dismiss="modal">×</button>
                <h1 class="text-center">Login</h1>
            </div>
            <div class="modal-body">
                <form class="form col-md-12 center-block">
                    <div class="form-group">
                        <input class="form-control input-lg" type="text" placeholder="Email">
                    </div>
                    <div class="form-group">
                        <input class="form-control input-lg" type="password" placeholder="Password">
                    </div>
                    <div class="form-group">
                        <button class="btn btn-primary btn-lg btn-block">Sign In</button>
                        <span class="pull-right"><a href="#">Register</a></span><span><a href="#">Need help?</a></span>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <div class="col-md-12">
                    <button class="btn" aria-hidden="true" data-dismiss="modal">Cancel</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
