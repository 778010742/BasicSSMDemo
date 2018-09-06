1:搭建MyBatis开发环境
	1.1：创建数据库表并填写一条数据
	1.2：创建对应实体类
	1.3：编写dao层mapper接口及mapper.xml
	1.4：创建mybatis配置文件，编写数据源，注册mapper.xml
	1.5:使用junit4进行单元测试

2：搭建spring开发环境
	2.1：创建spring配置文件
	2.2：添加bean java,util.Date
	2.3:使用junit4测试加载spring环境依赖注入date
		正确输出时间，则spring环境搭建成功

3:搭建spring和MyBatis整合
	3.1：编写spring配置文件
		3.1.1：配置数据源
		3.1.2：配置SessionFactory
		3.1.3：配置事务管理器tx aop 生成声明事物
		3.1.4：扫描mapper接口生成动态代理对象并交给spring管理
		3.1.5：配置注解扫描
	3.2:创建service接口与实现类，完成CURD方法
	3.3：使用junit4进行单元测试

4:搭建springmvc并集成SSM
    4.1:创建springmvc配置文件
        4.1.1:扫描controller包
        4.1.2:开启mvc注解驱动
        4.1.3:配置视图解析器
    4.2:创建controller并编写query方法，将结果显示在query.jsp
    4.3:配置web.xml
        4.3.1:springmvc核心控制器
        4.3.2:spring监听器（spring与web集成）
        4.3.3:配置编码过滤器
    4.4:运行访问成功则SSM搭建成功




打开项目根目录
git init 初始化仓库
添加过滤文件
git add .  将文件添加到暂存区
git commit -m "完成SSM框架搭建"
开发项目
git add .  将文件添加到暂存区
git commit -m "完成项目"
项目打压缩包保留
git log 查询git提交版本
git reset --hard 版本号      版本回退
接着开发