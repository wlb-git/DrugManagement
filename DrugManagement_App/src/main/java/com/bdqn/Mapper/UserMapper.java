package com.bdqn.Mapper;

import java.util.List;

import com.bdqn.pojo.User;

public interface UserMapper {
	/**
	 * 查询全部员工信息
	 * @return
	 */
   public List<User> UserList();
}
