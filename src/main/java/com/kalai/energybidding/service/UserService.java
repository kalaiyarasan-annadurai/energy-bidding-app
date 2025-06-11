// package com.kalai.energybidding.service;

// import java.util.List;

// import org.springframework.beans.BeanUtils;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.kalai.energybidding.dto.UserRequest;
// import com.kalai.energybidding.entity.Users;
// import com.kalai.energybidding.repository.UserRepository;

// @Service
// public class UserService {
//     @Autowired
//     UserRepository userRepository;

//     public List<Users> getAllUsers(){
//        return userRepository.findAll();
//     }

//     public void saveUser(UserRequest userRequest) {
//         Users user = new Users();
//         BeanUtils.copyProperties(userRequest, user);
//         userRepository.save(user);

//     }
// }
