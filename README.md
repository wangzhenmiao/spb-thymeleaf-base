# spb-thymeleaf-base


一、th:href 可以发送请求到controller
比如：

    <a th:href="@{regexptest?loginName=jack&amp;password=123456}">测试表达式访问数据</a><br/><br/>

可以发送一个到 @RequestMapping("/regexptest") 这个注解的请求

二、controller中，可以把变量存放在变量中

比如：request，session,application等三个变量

ThymeleafController，controller中代码如下：

        // 保存数据到request作用范围域当中
        request.setAttribute("book", "疯狂Spring Boot讲义");
        // 保存数据到session作用范围域当中
        session.setAttribute("school", "疯狂软件");
        // 保存数据到ServletContext（application）作用范围域当中
        request.getServletContext().setAttribute("name", "Thymeleaf模板引擎");
       
三、thymeleaf中访问不同变量中的数据

1、${param.x}将返回一个名为x的请求参数

2、${x}将返回存储在Thymeleaf上下文中的变量x或作为请求Request作用范围域中的属性。

3、${session.x}将返回一个名为x的会话HttpSession作用范围域中的属性。

4、${application.x}将返回一个名为x的全局ServletContext上下文作用范围域中的属性

success1.html中代码如下：

     <div class="col-md-4">
            <p><font color="red">${param.x}将返回一个名为x的请求参数</font></p><br/>
            访问页面传递的参数：<span th:text="${param.loginName[0]}">登录名</span>&nbsp;<span th:text="${param.password[0]}">密码</span>
            <p><font color="red">${x}将返回存储在Thymeleaf上下文中的变量x或作为请求Request作用范围域中的属性。</font></p><br/>
            访问request作用范围域中的变量：<span th:text="${book}">图书信息</span><br/>
            <p><font color="red">${session.x}将返回一个名为x的会话HttpSession作用范围域中的属性。</font></p><br/>
            访问session作用范围域中的变量：<span th:text="${session.school}">培训中心</span><br/>
            <p><font color="red">${application.x}将返回一个名为x的全局ServletContext上下文作用范围域中的属性。</font></p><br/>
            访问application作用范围域中的变量：<span th:text="${application.name}">动态页面模板</span><br/>
        </ div>

四、th:if th:unless th:switch 表达式

详细见sccess2.html,

if时，表达式为真，则显示标签。

unless，逻辑和if相反

五、th:each 遍历

controller中是list的数据，th中遍历。适合表格显示数据！

见success3.html,既第三个链接。