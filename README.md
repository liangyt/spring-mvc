# spring-mvc

这是一个简单的springmvc 脚手架，用最简单的Jar实现。

使用的是 Maven 的方式实现。

提供了一个最简单的交互操作，运行 <code>mvn jetty:run</code> 后就访问 http://localhost:8080 出现一个登录页面，输入用户密码点击提交后台接收提交的数据，并返回一个 Rest 结果。

结构也特别简单
```$xslt
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── liangyt
│   │   │           ├── common
│   │   │           │   ├── IdEntity.java  // 实体类继承该类，自带ID属性
│   │   │           │   ├── message
│   │   │           │   │   └── MessageReturn.java // 返回数据结构统一包装
│   │   │           │   └── servlet
│   │   │           │       ├── BaseController.java // 控制类继承该类
│   │   │           │       └── InitSystemConfig.java // 系统全局参数设置
│   │   │           ├── controller  // 控制器业务
│   │   │           │   ├── rest
│   │   │           │   │   └── ApiController.java
│   │   │           │   └── view
│   │   │           │       ├── Index.java
│   │   │           │       └── Login.java
│   │   │           └── entity // 实体类
│   │   │               ├── Login.java
│   │   │               ├── ReturnChild.java
│   │   │               └── ReturnFather.java
│   │   ├── resources // 配置文件
│   │   │   ├── applicationContext.xml
│   │   │   └── dispatcher-servlet.xml
│   │   └── webapp
│   │       ├── WEB-INF
│   │       │   ├── views
│   │       │   │   ├── index.jsp
│   │       │   │   └── login.jsp
│   │       │   └── web.xml
│   │       └── static
│   │           └── css
│   │               
│   └── test
│       └── java
```