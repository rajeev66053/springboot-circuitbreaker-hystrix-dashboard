# Springboot circuit breaker-hystrix-dashboard

* Include `spring-boot-starter-actuator` and `spring-cloud-starter-netflix-hystrix` and `spring-cloud-netflix-hystrix-dashboard` dependency in pom.xml
* Annotate `@EnableHystrixDashboard` in main class to enable the hystrix dashboard.
* Add hystrix related configuration in application.properties or application.yaml file.
* Launch `localhost:8085/hystrix.stream` to see whether the hystrix stream is working or not.
* If hystrix.stream is working then run `localhost:8085/hystrix' where we need to provide `localhost:8085/hystrix.stream` and application name and hit enter. We will see the succeed, failed data in user interface.
