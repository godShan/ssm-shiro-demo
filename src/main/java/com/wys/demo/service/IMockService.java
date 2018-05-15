package com.wys.demo.service;

import com.wys.demo.entity.Mock;

import java.util.List;

/**
 * @author weiyushan
 * @date 2018/5/15/015 10:39.
 */
public interface IMockService {

    /**
     * 查询所有的mock数据
     * @return
     */
    List<Mock> selectAll();

}
