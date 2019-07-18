package com.school.demo.bo;

import com.best.transport.base.AbstractBo;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 代码生成器生成代码，请勿修改
 * @author code-gen
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserBo extends AbstractBo {
    /**
     * 编号
     */
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String pass;

    public UserBo withId(Long id) {
        this.id = id;
        return this;
    }
    
    public UserBo withName(String name) {
        this.name = name;
        return this;
    }
    
    public UserBo withPass(String pass) {
        this.pass = pass;
        return this;
    }
    
}