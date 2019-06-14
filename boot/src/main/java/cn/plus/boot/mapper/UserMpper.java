package cn.plus.boot.mapper;

import java.util.List;

import cn.plus.boot.entity.User;

public interface UserMpper {
	User selectById(Long id);
	
	int deleteById(Long id);
	
	int insert(User user);
	
	List<User> findAll();
} 
