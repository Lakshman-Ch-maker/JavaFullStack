# JavaFullStack
Java Full Stack which include core java, servlets, and JSPs

It is a technology used for developing web applications
Servlet is an api that provides many classes and interfaces

Ways to create a servlet ?

3 ways to create a servlet

1.	Implementing servlet interface
2.	Extending GenericServlet
3.	Extending HttpServlet
Servlet
    |
GenericServlet
    |
HttpServlet


Servlet interface methods :

Init()
Service(ServletRequest request, ServletResponse response)
Destroy()
getServletConfig()
getServletInfo()

steps to develop a web application :

create a dynamic web project
src – create a package – create servlets
define all the servlets in web.xml
run on server



JSP : Java Server Pages

JSP is a technology used for developing web applications
It can be a thought of extension to servlet
JSP provides more functionality than servlets

JSP page consists of html tags and jsp tags
JSP pages are easier to maintain than servlets, because we can separate design and development

Advantages of JSP over Servlets ::

-	Extension to servlets
-	Easy to maintain
-	Fast development
-	No need to recompile and redeploy
-	Less code than servlets

Life cycle of a JSP page ::

	.jsp -> JSP translator -> servlet [.java] -> compiler -> .class file -> JRE -> servlet object -> dynamic content
