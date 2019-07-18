package com.school.demo.gen;

import com.best.transport.annotations.Bo;
import com.best.transport.annotations.GenController;
import com.best.transport.annotations.Note;
import com.best.transport.annotations.So;
import com.best.transport.annotations.TableInfo;
import com.best.transport.annotations.Vo;
import com.best.transport.enums.SoSearchType;

import java.util.Date;

/**
 * author: create by BG384513
 * version: v1.8
 * description: 学习代码生成
 * date: 2019/7/17
 */
@Note("用户")
@TableInfo(definition = "user_tb")
@Bo
@GenController
public class User {

    @Note("编号")
    @Vo
    @So({SoSearchType.IN})
    private Long id;

    @Note("用户名")
    @Vo
    @So({SoSearchType.EQUAL,SoSearchType.LIKE})
    private String name;

    @Note("密码")
    @Vo
    private String pass;
}
