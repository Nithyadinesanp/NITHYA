package com.niit.mygiftbackend.dao;

import java.util.List;

import com.niit.mygiftbackend.model.User;

public interface UserDAO {

	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(int userid);

	public User getUserById(int userid);

	public User getUserByUsername(String username);

	public List<User> listUsers();

}