package user.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
	@Override
	public void write(UserDTO userDTO) {
		System.out.println("userSErviceImpl");
		userDAO.write(userDTO);
	}
	@Override
	public UserDTO checkId(String id) {
		return userDAO.getUser(id);
	}
	@Override
	public void modify(UserDTO userDTO) {
		userDAO.modify(userDTO);
		
	}
	@Override
	public List<UserDTO> getUserList(HashMap<String, String> map) {
		return userDAO.getUserList(map);
	}
	@Override
	public void delete(String id) {
		userDAO.delete(id);
		
	}
     
}
