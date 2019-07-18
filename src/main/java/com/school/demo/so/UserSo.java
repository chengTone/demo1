package com.school.demo.so;

import com.best.transport.base.AbstractSo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 代码生成器生成代码，请勿修改
 * 用户 查询对象
 * @author code-gen
 */
@ApiModel("用户查询")
@EqualsAndHashCode(callSuper = true)
@Data
public class UserSo extends AbstractSo {
    @ApiModelProperty(value = "在编号列表中", position = 1)
    private List<Long> inIdList;
    
    @ApiModelProperty(value = "用户名", position = 2)
    private String name;
    
    @ApiModelProperty(value = "用户名像", position = 3)
    private String likeName;
    
    public UserSo withInIdList(List<Long> inIdList) {
        this.inIdList = inIdList;
        return this;
    }
    
    public UserSo withName(String name) {
        this.name = name;
        return this;
    }
    
    public UserSo withLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }
    
}