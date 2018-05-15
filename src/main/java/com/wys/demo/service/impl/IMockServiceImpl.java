package com.wys.demo.service.impl;

import com.wys.demo.entity.Mock;
import com.wys.demo.mapper.MockMapper;
import com.wys.demo.service.IMockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @program: ssm-shiro-demo
 * @description: IMockService的实现类
 * @author: godShan
 * @create: 2018-05-15 10:43
 **/
@Service("iMockService")
public class IMockServiceImpl implements IMockService{

    @Autowired
    private MockMapper mockMapper;

    @Override
    public List<Mock> selectAll() {
        List<Mock> mockList = mockMapper.selectAll();
        mockList.stream().forEach(mock -> {
            String data = mock.getDATA();
            Integer max = 100;
            if (!StringUtils.isEmpty(data) && data.length() > max) {
                mock.setDATA(mock.getDATA().substring(0,99));
            }
        });
        return mockList;
    }
}
