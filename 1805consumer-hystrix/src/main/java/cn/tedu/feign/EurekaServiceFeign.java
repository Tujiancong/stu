package cn.tedu.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="provider-user")
public interface EurekaServiceFeign {
	//请求变量名也要写全
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name);
}