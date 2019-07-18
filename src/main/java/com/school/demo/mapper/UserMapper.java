package com.school.demo.mapper;

import com.best.transport.dao.BaseMapper;
import com.school.demo.bo.UserBo;
import com.best.transport.dao.BaseBoMapper;
import com.school.demo.vo.UserVo;
import com.best.transport.dao.BaseVoMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 生成的Dao类
 * @author code-gen
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper, BaseBoMapper<UserBo>, BaseVoMapper<UserVo> {

}