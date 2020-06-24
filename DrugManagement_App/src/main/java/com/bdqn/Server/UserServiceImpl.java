package com.bdqn.Server;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.Mapper.UserMapper;
import com.bdqn.pojo.User;
@Service
public class UserServiceImpl implements UserService {
    
	@Resource
	private UserMapper userMapper; 
	
	@Override
	public List<User> UserList() {
		// TODO Auto-generated method stub
		return userMapper.UserList();
	}

}
