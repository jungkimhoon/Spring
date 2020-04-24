package user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import user.bean.UserDTO;
import user.service.UserService;

@Controller
//@RequestMapping(/user)
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/writeForm", method=RequestMethod.GET)
	public String writeForm() {
		return "/user/writeForm";
	}
	
	@RequestMapping(value="/user/write", method=RequestMethod.POST)
	@ResponseBody
	public void write(@ModelAttribute UserDTO userDTO) {
		userService.write(userDTO);
	}
	@RequestMapping(value = "/user/list")
	public String list() {
		return "/user/list";
	}
	@RequestMapping(value="/user/getUserList", method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView getUserList(@RequestParam(value="searchOption", required=false, defaultValue="")String searchOption, 
									@RequestParam(value="searchText",required = false, defaultValue = "")String searchText) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("searchOption", searchOption);
		map.put("searchText", searchText);
		List<UserDTO> list = userService.getUserList(map);
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",list);
		mav.setViewName("jsonView");
		return mav;
	}
	
//	@RequestMapping(value="/user/getUserList", method=RequestMethod.POST)
//	@ResponseBody
//	public JSONObject getUserList() {
//		List<UserDTO> list = userService.getUserList();
//		JSONObject json = new JSONObject();
//		if(list!=null) {
//			JSONArray array = new JSONArray();
//			JSONObject temp = new JSONObject();
//			
//			for(UserDTO userDTO:list) {
//				temp.put("name", userDTO.getName());
//				temp.put("id", userDTO.getId());
//				temp.put("pwd", userDTO.getPwd());
//				array.add(0, temp);
//				json.put("list", array);
//			}
//		}
//		System.out.println(json);
//		
//		return json;
//	}
//	@RequestMapping(value="/user/getUserList", method=RequestMethod.POST)
//	@ResponseBody
//	public Map getUserList() {
//		List<UserDTO> list = userService.getUserList();
//		JSONArray array = JSONArray.fromObject(list);
//		Map map = new HashMap();
//		map.put("list", array);
//		return map;
//	}
//}
	@RequestMapping(value="/user/checkId", method=RequestMethod.POST)
	@ResponseBody
	public String checkId(String id) {
		UserDTO userDTO = userService.checkId(id);
		if(userDTO != null) {
			return "exist";
		}
		return "non_exist";
	}
	
	@RequestMapping(value="/user/modifyForm", method=RequestMethod.GET)
	public String modifyForm() {
		return "/user/modifyForm";
	}
	@RequestMapping(value="/user/searchId", method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView searchId(String id) {
		UserDTO userDTO = userService.checkId(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("userDTO",userDTO);
		mav.setViewName("jsonView");
		return mav;
	}
	
	@RequestMapping(value="/user/modify", method=RequestMethod.POST)
	@ResponseBody
	public void modify(@ModelAttribute UserDTO userDTO) {
		userService.modify(userDTO);
	}
	
	@RequestMapping(value="/user/deleteForm", method=RequestMethod.GET)
	public String deleteForm() {
		return "/user/deleteForm";
	}
	
	@RequestMapping(value="/user/delete", method=RequestMethod.POST)
	@ResponseBody
	public void delete(@RequestParam(value="id")String id) {
		userService.delete(id);
	}
}
