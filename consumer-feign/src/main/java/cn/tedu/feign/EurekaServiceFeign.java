package cn.tedu.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="provider-user")	//跟提供者关联
public interface EurekaServiceFeign {
	@RequestMapping("hello/{name}")
	//请求变量名也要写全
	public String hello(@PathVariable("name") String name);
}
