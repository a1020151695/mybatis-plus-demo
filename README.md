# 运行

测试类中有运行代码

# 配置说明



## 初始化项目

选择mybatis-plus、mysql-connector-java



## 配置文件

application.properties



## mapper.java

首先，是个接口

然后，添加注解@Mapper，之后即可自动装载



## mapper.xml

1.rescources下新建mapper文件夹及xml文件

2.mapper - namespace 对应到dao中的mapper.java



## entity（要用BaseMapper才需要）

```java
@Data  // 使得数据库取出来的数据能够化成String等形式，而不是内存地址@5eb2172
@TableName // 使用BaseMapper需要entity，并注解tablename，注意引入baomidou的包，而不是mybatis的
```







