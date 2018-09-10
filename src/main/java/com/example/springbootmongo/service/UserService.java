package com.example.springbootmongo.service;

import com.example.springbootmongo.config.datasource.TargetDataSource;
import com.example.springbootmongo.entity.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {

    List<com.example.springbootmongo.entity.User> getUserList();

    void deleteById(Integer id);

    void addUser(User user);

    User getUserById(Integer id);

    void editUserById(User user);

    Page<User> getUserPage(Integer pageOffset, Integer pageSize);

    void deleteBath(List<Integer> brandIds);
}
