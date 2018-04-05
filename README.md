## 项目所达到的愿景
> 打造一个可以用于任何spring boot项目的安全框架。
## 本模块主要功能点
- 本模块主要提供了RBAC权限校验模块数据封装
- 可以在项目中引入该模块进行权限校验 
    ```
       一、 
            <dependency>
                <groupId>cn.yichao.security.browser</groupId>
                <artifactId>security-browser</artifactId>
                <version>${yichao.security.version}</version>
            </dependency>
        二、
            在需要权限校验的地方使用spring 安全表达式进行校验
            access("@rbacService.hasPermission(request,authentication)");

        如自己写该项只需要重新实现 RbacService即可rbacService改成spring注入的类
    ```


## 项目所用框架
-     spring boot
-     spring security
-     spring social
-     spring session
-     redis缓存服务器

## 项目目前完成情况

- ✔ 表单登录(测试完成)
- ✔ 记住我实现
- ✔ 退出
- ✔ 验证码交验(测试完成)
- ✔ 手机登录(测试完成)
- ✔ QQ三方登录(测试完成)
- ✔ 微信三方登录(未测试)
- ✔ app实现表单登陆(测试完成)
- ✔ app端用手机验证码改造(测试完成)
- ✔ app端验证码改造(测试完成)
- ✔ app实现三方(简单OAuth2流程/标准流程)登陆(测试完成)
- ✔ app实现三方注册改造
- ✔ 令牌配置
- ✔ JWT替换默认令牌
- ✔ 基于Jwt的单点登录
- ✔ 授权模块对项目的集成(RBAC模块增删改查将在项目二期完成)