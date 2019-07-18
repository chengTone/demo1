package com.school.demo.vo;

import com.best.transport.base.AbstractVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 代码生成器生成代码，请勿修改
 * @author code-gen
 */
@ApiModel("用户")
@EqualsAndHashCode(callSuper = true)
@Data
public class UserVo extends AbstractVo {
    @ApiModelProperty(value = "编号", position = 1)
    private Long id;

    @ApiModelProperty(value = "用户名", position = 2)
    private String name;

    @ApiModelProperty(value = "密码", position = 3)
    private String pass;

    public UserVo withId(Long id) {
        this.id = id;
        return this;
    }

    public UserVo withName(String name) {
        this.name = name;
        return this;
    }

    public UserVo withPass(String pass) {
        this.pass = pass;
        return this;
    }

}