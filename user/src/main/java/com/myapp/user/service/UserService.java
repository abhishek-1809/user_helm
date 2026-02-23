package com.myapp.user.service;

import com.myapp.user.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    RestTemplate restTemplate = new RestTemplate();

    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public User getUser() {
        try {
             User user= restTemplate.getForObject("https://fakestoreapi.com/users/1", User.class);
            System.out.println(user);
            return user;
        }
        catch (Exception e) {
            System.out.println("There is problem in fetching: " + e.getMessage());
        }
        return null;
    }
}
