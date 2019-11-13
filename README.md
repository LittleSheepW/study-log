# study-log
学习日志框架相关知识

>- 无法运行项目时，加入缺少的Jar包即可。  
JdkLog不需要pom依赖、不需要配置文件。  
Log4j2Log pom依赖和对应配置文件在类中已声明。  
LogbackLog pom依赖和对应配置文件在类中已声明。
Slf4jLogInterface 各种配套pom依赖和对应配置文件在类中都已经声明。

> - JDKLog、Log4J、LogBack 这几个常用的日志记录框架，它们都有各自的优缺点，适合在不同的场景下使用。可能简单的项目直接用 JDKLog 就可以了，
而复杂的项目需要用上 Log4J。很多时候我们做项目都是从简单到复杂，也就是我们很可能一开始使用的是 JDKLog，之后业务复杂了需要使用 Log4J，
这时候我们如何将原来写好的日志用新的日志框架输出呢？一个最死板的方法就是一行行代码修改，把之前用 JDKLog 的日志代码全部修改成 Log4J 
的日志接口。但是这种方式不仅效率低下，而且做的工作都是重复性的工作，这怎么能忍呢。正是因为在实际的项目应用中，有时候可能会从一个日志框架
切换到另外一个日志框架的需求，这时候往往需要在代码上进行很大的改动。`为了避免切换日志组件时要改动代码，这时候一个叫做 
SLF4J（Simple Logging Facade for Java，即Java简单日志记录接口集）的东西出现了。`
> - `SLF4J是一个日志的接口规范，它对用户提供了统一的日志接口，屏蔽了不同日志组件的差异。这样我们在编写代码的时候只需要看 
SLF4J 这个接口文档即可，不需要去理会不同日之框架的区别。而当我们需要更换日志组件的时候，我们只需要更换一个具体的日志组件Jar包就可以了`。

> - `commons-logging和slf4j都是日志的接口，供用户使用，而没有提供实现。log4j，logback等才是日志的真正实现。
日志是接口+具体实现的方式来使用。`目前应用比较广泛的是Log4j2和logback，而logback作为后起之秀，以替代log4j为目的，
整体性能比log4j较佳，当然log4j的升级版log4j2也是有诸多亮点。  
> - `logback是Spring Boot默认的日志系统，假如对日志没有特殊要求，可以完全零配置(当然也可以自定义logback-spring.xml)
使用 SLF4J（Simple Logging Facade For Java）的logback来输出日志。` 

> - 现在最流的日志框架解决方案莫过于`SLF4J + LogBack`。原因有下面几点：  
> 1、LogBack 自身实现了 SLF4J 的日志接口，不需要 SLF4J 去做进一步的适配。  
> 2、LogBack 自身是在 Log4J 的基础上优化而成的，其运行速度和效率都比 LOG4J 高。  
> 3、SLF4J + LogBack 支持占位符，方便日志代码的阅读，而 LOG4J 则不支持。