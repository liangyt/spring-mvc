<%--
  Created by IntelliJ IDEA.
  User: liangyt
  Date: 17/6/22
  Time: 下午10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh-cn">

<head>
    <meta charset="utf-8">
    <meta name="keywords" content=" " />
    <meta name="description" content=" " />
    <meta http-equiv="x-ua-compatible" content="IE=Edge, chrome=1" />
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no" />
    <title>login</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/bootstrap/css/bootstrap.min.css" />

    <style type="text/css">
        html, body {
            height: 100%;
        }
        .container {
            position: relative;
            top: 50%;
            margin-top: -100px;
        }

        .login-form {
            width: 400px;
            margin: 0 auto;
        }
    </style>
</head>

<body>
<div class="container">
    <form class="form-horizontal login-form" role="form" method="post" action="/api/login">
        <div class="form-group">
            <label for="firstname" class="col-sm-4 control-label">登录名:</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" name="name" id="name" placeholder="请输入名字">
            </div>
        </div>
        <div class="form-group">
            <label for="lastname" class="col-sm-4 control-label">密码:</label>
            <div class="col-sm-8">
                <input type="password" class="form-control" name="password" id="password" placeholder="请输入密码">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-4 col-sm-8">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="rememberMe" value="yes"> 请记住我
                    </label>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-4 col-sm-8">
                <button type="submit" class="btn btn-default">登录</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>