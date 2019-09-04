package com.test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api("打招呼")
@RestController
@RequestMapping("/")
public class HelloController {

    @ApiOperation("向世界问好")
    @GetMapping(value = "hello")
    public String hello(){
        return "hello";
    }

    @ApiOperation("向指定人员问好")
    @ApiImplicitParam(name="name",value = "人员姓名",dataType = "String")
    @PostMapping("hi")
    public String hi(@RequestParam("name") String name){
        return "hi:"+ name;
    }
}
