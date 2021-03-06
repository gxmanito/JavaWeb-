package com.gx.dao;

import java.util.List;

import com.gx.entity.Category;

public interface CategoryDao {

	List<Category> findAll() throws Exception;

	void save(Category category) throws Exception;

	void del(String cid) throws Exception;
	
	Category getUpdId(String cid) throws Exception;

	void upd(Category category) throws Exception;

}
