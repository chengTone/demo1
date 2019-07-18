package com.school.demo.dao.impl;

import com.best.transport.dao.BaseDaoImpl;
import com.school.demo.bo.UserBo;
import com.best.transport.dao.BaseBoDaoImpl;
import com.school.demo.vo.UserVo;
import com.best.transport.dao.BaseVoDaoImpl;
import com.school.demo.mapper.UserMapper;
import com.school.demo.dao.UserDao;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.experimental.Delegate;

/**
 * 生成的Dao类
 * @author code-gen
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Delegate
    private BaseDaoImpl baseDao;

    @Delegate
    private BaseBoDaoImpl<UserBo> baseBoDao;

    @Delegate
    private BaseVoDaoImpl<UserVo> baseVoDao;

    @Autowired
    public UserDaoImpl(UserMapper mapper) {
        this.baseDao = new BaseDaoImpl(mapper);
        this.baseBoDao = new BaseBoDaoImpl<>(mapper);
        this.baseVoDao = new BaseVoDaoImpl<>(mapper);
    }

}
