# ShoppingMallBackend
1.启动springcloud-eureka-server、springcloud-eureka-servicesupport、springcloud-eureka-serviceconsumer、springcloud-zuul-gateway	<br/>
2.http://localhost:8081/   可以查看eureka上注册的所有服务	<br/>
3.网关端口是8084，目前就俩服务（其实是一个）<br/>
localhost:8084/service-consumer/Hello/Consumer?s=1<br/>
localhost:8084/service-provider/Hello/World?s=1<br/>
前端可以这样调用服务	<br/>
目测前端文件放在gateway的resource下

111111
