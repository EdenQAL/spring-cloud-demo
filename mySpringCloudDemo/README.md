版本说明：
master版：包含基本的springcloud框架,包括springcloud config注册中心
、eureka服务注册中心、zuul网关中心的实现；

basic-20190313： 完成feign整合，ribbon由于在feign中已存在，此处不再单独整合;
完成hystrics-dashboard的整合，验证完成




各模块端口：

eureka：7070

config：7071

zuul：8888

servicea： 9091

serviceb：9092


项目启动顺序：

eureka-> config -> servicea、serviceb... -> zuul 

访问：
