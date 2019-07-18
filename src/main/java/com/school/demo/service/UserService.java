package com.school.demo.service;

import com.best.transport.base.PageList;
import com.school.demo.so.UserSo;
import com.school.demo.vo.UserVo;

/**
 * 系统生成Service类
 * @author gen
 */
public interface UserService {

    /**
     * 新增
     * @param userVo 新增对象
     * @return 新增对象的id
     */
    Long create(UserVo userVo);

    /**
     * 单个查询
     * @param id 查询对象id
     * @return 查询结果
     */
    UserVo find(Long id);

    /**
     * 按条件查询
     * @param userSo 查询条件
     * @return 查询结果
     */
    PageList<UserVo> listPagination(UserSo userSo);


}
