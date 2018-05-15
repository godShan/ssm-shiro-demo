package com.wys.demo.mapper;

import com.wys.demo.entity.Mock;

import java.util.List;

/**
 *@author wys
 *@date 10:18 2018/5/15/015
 *@description mock的mapper
 */

public interface MockMapper{

	/**
	 * 查询所有的mock数据
	 * @return
	 */
	List<Mock> selectAll();

}