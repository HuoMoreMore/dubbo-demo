# dubbo-demo  
dubbo demo 模拟dubbo 服务之间相互调用  
工程架构  
maven父子工程   
&emsp;父工程设置为pom  
&emsp;dubbo-api工程提供接口  
&emsp;dubbo-provider 既是生产者又是消费者  
&emsp;dubbo-provider-test 生产者  
&emsp;dubbo-customer 消费者  
调用关系  
&emsp;项目全部启动情况下访问 http://localhost:9091/hello/test  
&emsp;请求先到 dubbo-customer 之后dubbo-customer 会调用dubbo-provider 的服务,  
&emsp;dubbo-provider之中方法又调用了dubbo-provider-test 的服务  
 
