package com.bdqn.Server;

import java.util.List;

import com.bdqn.pojo.User;

public interface UserService {
	/**
	 * 查询全部数据
	 * @return
	 */
   public List<User> UserList();
}
