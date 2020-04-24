package user.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import user.bean.UserDTO;

@Repository("userDAO")
@Transactional
public class UserDAOMybatis implements UserDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void write(UserDTO userDTO) {
		sqlSession.insert("userSQL.write",userDTO);
		
	}

	public List<UserDTO> getUserList(HashMap<String, String>map) {
		System.out.println("searchOption: "+map.get("searchOption"));
		System.out.println("searchText: "+map.get("searchText"));
		return sqlSession.selectList("userSQL.getUserList", map);
		
	}

	@Override
	public UserDTO getUser(String id) {
		return sqlSession.selectOne("userSQL.getUser", id);
	}

	@Override
	public void modify(UserDTO userDTO) {
		sqlSession.update("userSQL.userUpdate",userDTO);
		
	}

	@Override
	public void delete(String id) {
		sqlSession.update("userSQL.userDelete", id);
		
	}

	
	

}
