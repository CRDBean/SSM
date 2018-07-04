package com.imooc.service.impl;

import com.imooc.entity.Employee;
import com.imooc.mapper.EmployeeMapper;
import com.imooc.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Bean
 * @since 2018-07-02
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
