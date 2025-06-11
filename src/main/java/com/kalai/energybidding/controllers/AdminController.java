package com.kalai.energybidding.controllers;

import org.springframework.web.bind.annotation.RestController;

// import com.kalai.energybidding.service.UserService;
import com.kalai.energybidding.dto.UserRequest;
// import com.kalai.energybidding.entity.Users;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class AdminController {

    //   @Autowired
    //   UserService userService;
      
      @GetMapping("/get-all-users")
      public ResponseEntity<?> getMethodName() {
        List<Users> respone = new ArrayList<>();
        Users user = new Users();
        user.setId(101);
        user.setEmail("kalai@gmail.com");
        user.setName("Tamil Mani");
        Users user1 = new Users();
        user1.setId(102);
        user1.setEmail("mani@gmail.com");
        user1.setName("Mani");
        respone.add(0, user);
        respone.add(1, user1);

        Users user2 = new Users();
        user2.setId(102);
        user2.setEmail("dd1@gmail.com");
        user2.setName("DD");
        
        respone.add(2, user2);


        return ResponseEntity.ok(respone);
      }
      @PostMapping("/save-user")
      public ResponseEntity<?> saveUser(@RequestBody  UserRequest userRequest) {
        //   userService.saveUser(userRequest);
          
          return ResponseEntity.ok("USER CREATED");
      }
      

      
      
}
