package com.example.springsecurity.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void deleteById(Long id);
}
