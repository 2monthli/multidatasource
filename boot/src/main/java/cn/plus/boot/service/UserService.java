package cn.plus.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.plus.boot.entity.User;
import cn.plus.boot.mapper.UserMpper;


@Service
public class UserService {
	@Autowired
	UserMpper userMapper;
	
	public User get(Long id){
		return userMapper.selectById(id);
	}
	
}
