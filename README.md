# dubbo-demo  
dubbo demo 模拟dubbo 服务之间相互调用  
工程架构  
maven父子工程   
　父工程设置为pom  
　dubbo-api工程提供接口  
　dubbo-provider 既是生产者又是消费者  
　dubbo-provider-test 生产者  
　dubbo-customer 消费者  
调用关系  
　项目全部启动情况下访问 http://localhost:9091/hello/test  
　请求先到 dubbo-customer 之后dubbo-customer 会调用dubbo-provider 的服务,  
　dubbo-provider之中方法又调用了dubbo-provider-test 的服务  
 
