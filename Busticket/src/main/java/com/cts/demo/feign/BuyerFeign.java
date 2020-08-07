package com.cts.demo.feign;



import org.springframework.cloud.openfeign.FeignClient;



import org.springframework.web.bind.annotation.GetMapping;



import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(value = "mobile", url = "http://localhost:8012/Buyer")



public interface BuyerFeign {



 @GetMapping("/name/{name}")



 public Integer getmobile(@PathVariable(value = "name") String name);



}