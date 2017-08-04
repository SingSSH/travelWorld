package com.yc.travelWorld.mapper;

import java.util.List;

import com.yc.travelWorld.bean.JsonObject;
import com.yc.travelWorld.bean.Admin;


/**
 * 数据层接口连接*mapper.xml
 * @author 乌龟
 *
 */
public interface ITarveLWorldAdminMapper {
	/**
	 * 添加管理员
	 * @param ad
	 * @return
	 */
	public int add(Admin ad);
	
	/**
	 * 管理员登录
	 * @param ad
	 * @return
	 */
	
	public Admin login(Admin ad);
	
	/**
	 * 更新管理员数据
	 * @param ad
	 * @return
	 */
	
	public Admin update(Admin ad);
	 
	/**
	 * 删除管理员
	 * @param aids
	 * @return
	 */
	public int delete(String [] aids);
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<Admin> findAll();
	/**
	 * 分页查询
	 * @param jb
	 * @return
	 */
	
	public JsonObject find(JsonObject jb);
	
	/**
	 * 获取总记录数
	 * @return
	 */
	public int total();
}
