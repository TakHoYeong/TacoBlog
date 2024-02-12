package me.taco.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.taco.springbootdeveloper.dto.AddUserRequest;
import me.taco.springbootdeveloper.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserApiController {

    private final UserService userService;

    @PostMapping("/user")
    public String signup(AddUserRequest request){
        userService.save(request);
        return "redirect:/login";
    }
}
