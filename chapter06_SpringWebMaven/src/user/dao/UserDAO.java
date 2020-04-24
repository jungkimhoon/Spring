package user.dao;

import java.util.HashMap;
import java.util.List;

import user.bean.UserDTO;

public interface UserDAO {
    public void write(UserDTO userDTO);

	public List<UserDTO> getUserList(HashMap<String, String> map);
	public UserDTO getUser(String id);

	public void modify(UserDTO userDTO);

	public void delete(String id);
}
