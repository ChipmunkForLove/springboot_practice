package org.springboot.book.practice.web;
import org.springboot.book.practice.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path="/helloYunyeong")
    public String getRequest(){
        return "hello yunyeong";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new HelloResponseDto(name,amount);
    }
}


