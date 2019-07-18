package com.school.demo.service.impl;

import com.school.demo.bo.UserBo;
import com.best.transport.utils.CopyUtil;
import com.school.demo.so.UserSo;
import com.school.demo.vo.UserVo;
import com.school.demo.dao.UserDao;
import com.school.demo.service.UserService;
import com.best.transport.base.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Objects;

/**
 * @author code-gen
 */
@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Long create(UserVo userVo) {
        return userDao.insert(CopyUtil.map(userVo, UserBo.class));
    }

    @Override
    public UserVo find(Long id) {
        UserVo  userVo=  userDao.findVo(id);
        if (Objects.isNull(userVo)) {
            return null;
        }
        return userVo;
    }

    @Override
    public PageList<UserVo> listPagination(UserSo userSo) {
        List<UserVo> voList = userDao.listPaginationVoBySo(userSo);
        int count = userDao.countBySo(userSo);
        PageList<UserVo> pageList = new PageList<>();
        pageList.setCount(count);
        pageList.setList(voList);
        return pageList;
    }


}
