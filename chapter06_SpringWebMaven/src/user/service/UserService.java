package user.service;

import java.util.HashMap;
import java.util.List;

import user.bean.UserDTO;

public interface UserService {

	public void write(UserDTO userDTO);

	public List<UserDTO> getUserList(HashMap<String, String> map);

	public UserDTO checkId(String id);

	public void modify(UserDTO userDTO);

	public void delete(String id);

}
