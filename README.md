# logging-demo
日志框架


## LogBack,Slf4j,Log4j之间的关系
　　
Slf4j是The Simple Logging Facade for Java的简称，是一个简单日志门面抽象框架，它本身只提供了日志Facade API和一个简单的日志类实现，一般常配合Log4j，LogBack，java.util.logging使用。Slf4j作为应用层的Log接入时，程序可以根据实际应用场景动态调整底层的日志实现框架(Log4j/LogBack/JdkLog...)；

LogBack和Log4j都是开源日记工具库，LogBack是Log4j的改良版本，比Log4j拥有更多的特性，同时也带来很大性能提升。详细数据可参照下面地址：Reasons to prefer logback over log4j

LogBack官方建议配合Slf4j使用，这样可以灵活地替换底层日志框架。