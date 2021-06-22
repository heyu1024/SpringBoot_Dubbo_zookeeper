# SpringBoot_Dubbo_zookeeper

异常：

```java
Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2021-06-22 12:06:41.709 ERROR 20828 --- [           main] o.s.boot.SpringApplication               : Application run failed
​
java.lang.IllegalStateException: Failed to register dubbo://192.168.0.102:20881/com.heyu.service.StudentService?anyhost=true&application=myProvider&deprecated=false&dubbo=2.0.2&dynamic=true&generic=false&interface=com.heyu.service.StudentService&methods=getStudent&pid=20828&release=2.7.5&side=provider&timestamp=1624334801215 to registry 192.168.118.129:2181, cause: Failed to register dubbo://192.168.0.102:20881/com.heyu.service.StudentService?anyhost=true&application=myProvider&deprecated=false&dubbo=2.0.2&dynamic=true&generic=false&interface=com.heyu.service.StudentService&methods=getStudent&pid=20828&release=2.7.5&side=provider&timestamp=1624334801215 to zookeeper zookeeper://192.168.118.129:2181/org.apache.dubbo.registry.RegistryService?application=myProvider&dubbo=2.0.2&interface=org.apache.dubbo.registry.RegistryService&pid=20828&qos.enable=false&release=2.7.5&timestamp=1624334801214, cause: KeeperErrorCode = Unimplemented for /dubbo/com.heyu.service.StudentService/providers/dubbo%3A%2F%2F192.168.0.102%3A20881%2Fcom.heyu.service.StudentService%3Fanyhost%3Dtrue%26application%3DmyProvider%26deprecated%3Dfalse%26dubbo%3D2.0.2%26dynamic%3Dtrue%26generic%3Dfalse%26interface%3Dcom.heyu.service.StudentService%26methods%3DgetStudent%26pid%3D20828%26release%3D2.7.5%26side%3Dprovider%26timestamp%3D1624334801215
  at org.apache.dubbo.registry.support.FailbackRegistry.register(FailbackRegistry.java:253) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.registry.ListenerRegistryWrapper.register(ListenerRegistryWrapper.java:57) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.registry.integration.RegistryProtocol.register(RegistryProtocol.java:175) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.registry.integration.RegistryProtocol.export(RegistryProtocol.java:209) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.rpc.protocol.ProtocolListenerWrapper.export(ProtocolListenerWrapper.java:60) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.rpc.protocol.ProtocolFilterWrapper.export(ProtocolFilterWrapper.java:143) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.qos.protocol.QosProtocolWrapper.export(QosProtocolWrapper.java:64) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.rpc.Protocol$Adaptive.export(Protocol$Adaptive.java) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.config.ServiceConfig.doExportUrlsFor1Protocol(ServiceConfig.java:470) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.config.ServiceConfig.doExportUrls(ServiceConfig.java:315) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.config.ServiceConfig.doExport(ServiceConfig.java:287) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.config.ServiceConfig.export(ServiceConfig.java:205) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.config.bootstrap.DubboBootstrap.lambda$exportServices$13(DubboBootstrap.java:873) ~[dubbo-2.7.5.jar:2.7.5]
  at java.util.HashMap$Values.forEach(HashMap.java:981) ~[na:1.8.0_271]
  at org.apache.dubbo.config.bootstrap.DubboBootstrap.exportServices(DubboBootstrap.java:861) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.config.bootstrap.DubboBootstrap.start(DubboBootstrap.java:703) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.config.spring.context.DubboBootstrapApplicationListener.onContextRefreshedEvent(DubboBootstrapApplicationListener.java:52) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.config.spring.context.DubboBootstrapApplicationListener.onApplicationContextEvent(DubboBootstrapApplicationListener.java:45) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.config.spring.context.OneTimeExecutionApplicationContextEventListener.onApplicationEvent(OneTimeExecutionApplicationContextEventListener.java:40) ~[dubbo-2.7.5.jar:2.7.5]
  at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:172) ~[spring-context-5.2.3.RELEASE.jar:5.2.3.RELEASE]
  at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:165) ~[spring-context-5.2.3.RELEASE.jar:5.2.3.RELEASE]
  at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:139) ~[spring-context-5.2.3.RELEASE.jar:5.2.3.RELEASE]
  at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:403) ~[spring-context-5.2.3.RELEASE.jar:5.2.3.RELEASE]
  at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:360) ~[spring-context-5.2.3.RELEASE.jar:5.2.3.RELEASE]
  at org.springframework.context.support.AbstractApplicationContext.finishRefresh(AbstractApplicationContext.java:897) ~[spring-context-5.2.3.RELEASE.jar:5.2.3.RELEASE]
  at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:553) ~[spring-context-5.2.3.RELEASE.jar:5.2.3.RELEASE]
  at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:747) [spring-boot-2.2.4.RELEASE.jar:2.2.4.RELEASE]
  at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) [spring-boot-2.2.4.RELEASE.jar:2.2.4.RELEASE]
  at org.springframework.boot.SpringApplication.run(SpringApplication.java:315) [spring-boot-2.2.4.RELEASE.jar:2.2.4.RELEASE]
  at org.springframework.boot.SpringApplication.run(SpringApplication.java:1226) [spring-boot-2.2.4.RELEASE.jar:2.2.4.RELEASE]
  at org.springframework.boot.SpringApplication.run(SpringApplication.java:1215) [spring-boot-2.2.4.RELEASE.jar:2.2.4.RELEASE]
  at com.heyu.main.ProviderRunner.main(ProviderRunner.java:15) [classes/:na]
Caused by: org.apache.dubbo.rpc.RpcException: Failed to register dubbo://192.168.0.102:20881/com.heyu.service.StudentService?anyhost=true&application=myProvider&deprecated=false&dubbo=2.0.2&dynamic=true&generic=false&interface=com.heyu.service.StudentService&methods=getStudent&pid=20828&release=2.7.5&side=provider&timestamp=1624334801215 to zookeeper zookeeper://192.168.118.129:2181/org.apache.dubbo.registry.RegistryService?application=myProvider&dubbo=2.0.2&interface=org.apache.dubbo.registry.RegistryService&pid=20828&qos.enable=false&release=2.7.5&timestamp=1624334801214, cause: KeeperErrorCode = Unimplemented for /dubbo/com.heyu.service.StudentService/providers/dubbo%3A%2F%2F192.168.0.102%3A20881%2Fcom.heyu.service.StudentService%3Fanyhost%3Dtrue%26application%3DmyProvider%26deprecated%3Dfalse%26dubbo%3D2.0.2%26dynamic%3Dtrue%26generic%3Dfalse%26interface%3Dcom.heyu.service.StudentService%26methods%3DgetStudent%26pid%3D20828%26release%3D2.7.5%26side%3Dprovider%26timestamp%3D1624334801215
  at org.apache.dubbo.registry.zookeeper.ZookeeperRegistry.doRegister(ZookeeperRegistry.java:130) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.registry.support.FailbackRegistry.register(FailbackRegistry.java:240) ~[dubbo-2.7.5.jar:2.7.5]
  ... 31 common frames omitted
Caused by: java.lang.IllegalStateException: KeeperErrorCode = Unimplemented for /dubbo/com.heyu.service.StudentService/providers/dubbo%3A%2F%2F192.168.0.102%3A20881%2Fcom.heyu.service.StudentService%3Fanyhost%3Dtrue%26application%3DmyProvider%26deprecated%3Dfalse%26dubbo%3D2.0.2%26dynamic%3Dtrue%26generic%3Dfalse%26interface%3Dcom.heyu.service.StudentService%26methods%3DgetStudent%26pid%3D20828%26release%3D2.7.5%26side%3Dprovider%26timestamp%3D1624334801215
  at org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient.createEphemeral(CuratorZookeeperClient.java:110) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.remoting.zookeeper.support.AbstractZookeeperClient.create(AbstractZookeeperClient.java:87) ~[dubbo-2.7.5.jar:2.7.5]
  at org.apache.dubbo.registry.zookeeper.ZookeeperRegistry.doRegister(ZookeeperRegistry.java:128) ~[dubbo-2.7.5.jar:2.7.5]
  ... 32 common frames omitted
Caused by: org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented for /dubbo/com.heyu.service.StudentService/providers/dubbo%3A%2F%2F192.168.0.102%3A20881%2Fcom.heyu.service.StudentService%3Fanyhost%3Dtrue%26application%3DmyProvider%26deprecated%3Dfalse%26dubbo%3D2.0.2%26dynamic%3Dtrue%26generic%3Dfalse%26interface%3Dcom.heyu.service.StudentService%26methods%3DgetStudent%26pid%3D20828%26release%3D2.7.5%26side%3Dprovider%26timestamp%3D1624334801215
  at org.apache.zookeeper.KeeperException.create(KeeperException.java:106) ~[zookeeper-3.5.4-beta.jar:3.5.4-beta-7f51e5b68cf2f80176ff944a9ebd2abbc65e7327]
  at org.apache.zookeeper.KeeperException.create(KeeperException.java:54) ~[zookeeper-3.5.4-beta.jar:3.5.4-beta-7f51e5b68cf2f80176ff944a9ebd2abbc65e7327]
  at org.apache.zookeeper.ZooKeeper.create(ZooKeeper.java:1549) ~[zookeeper-3.5.4-beta.jar:3.5.4-beta-7f51e5b68cf2f80176ff944a9ebd2abbc65e7327]
  at org.apache.curator.framework.imps.CreateBuilderImpl$17.call(CreateBuilderImpl.java:1180) ~[curator-framework-4.2.0.jar:4.2.0]
  at org.apache.curator.framework.imps.CreateBuilderImpl$17.call(CreateBuilderImpl.java:1156) ~[curator-framework-4.2.0.jar:4.2.0]
  at org.apache.curator.connection.StandardConnectionHandlingPolicy.callWithRetry(StandardConnectionHandlingPolicy.java:64) ~[curator-client-4.2.0.jar:na]
  at org.apache.curator.RetryLoop.callWithRetry(RetryLoop.java:100) ~[curator-client-4.2.0.jar:na]
  at org.apache.curator.framework.imps.CreateBuilderImpl.pathInForeground(CreateBuilderImpl.java:1153) ~[curator-framework-4.2.0.jar:4.2.0]
  at org.apache.curator.framework.imps.CreateBuilderImpl.protectedPathInForeground(CreateBuilderImpl.java:607) ~[curator-framework-4.2.0.jar:4.2.0]
  at org.apache.curator.framework.imps.CreateBuilderImpl.forPath(CreateBuilderImpl.java:597) ~[curator-framework-4.2.0.jar:4.2.0]
  at org.apache.curator.framework.imps.CreateBuilderImpl.forPath(CreateBuilderImpl.java:575) ~[curator-framework-4.2.0.jar:4.2.0]
  at org.apache.curator.framework.imps.CreateBuilderImpl.forPath(CreateBuilderImpl.java:51) ~[curator-framework-4.2.0.jar:4.2.0]
  at org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient.createEphemeral(CuratorZookeeperClient.java:101) ~[dubbo-2.7.5.jar:2.7.5]
  ... 34 common frames omitted
```

百度了一下，主要是zookeeper的客户端和zookeeper的linux服务器的版本不匹配，如果你是zookeeper服务器是3.4的那么建议客户端用2.版本

例如
```java
       <dependency>
            <groupId>org.apache.curator</groupId>
            <artifactId>curator-framework</artifactId>
            <version>2.12.0</version>
        </dependency>
        <dependency>
            <groupId>org.apache.curator</groupId>
            <artifactId>curator-recipes</artifactId>
            <version>2.12.0</version>
        </dependency>
```

参考资料：https://www.cnblogs.com/Qu​estionsZhang/p/10411668.html





另外，如果是整合springboot和dubbo，建议不要用快速创建的方式，建议采用先创建maven工程，再引入springboot和dubbo start的依赖。

我当时的项目就是直接创建start工程，就算修改了zookeeper客户端的版本，也没有用。直接创建maven的springboot工程就可以了。

环境：springboot：2.2.4.RELEASE

dubbo：2.7.5

zookeeper服务器（linux）：3.4.6
