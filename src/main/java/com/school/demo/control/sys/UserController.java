package com.school.demo.control.sys;

import static com.best.transport.constant.UrlSuffix.*;

import com.best.transport.annotations.AntiOverride;
import com.best.transport.base.BaseVo;
import com.best.transport.base.PageList;
import com.school.demo.so.UserSo;
import com.school.demo.utils.ReturnVO;
import com.school.demo.vo.UserVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.school.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

/**
 * 系统生成Controller
 * @author code-gen
 */
@Api(tags = "用户")
@RestController
@RequestMapping("/api/school/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("创建用户")
    @PostMapping(CREATE)
    @AntiOverride
    public BaseVo create(@RequestBody UserVo userVo) {
        Long id = userService.create(userVo);
        return BaseVo.ofId(id);
    }

    @ApiOperation("根据Id查找用户")
    @GetMapping(FIND)
    @AntiOverride
    public ReturnVO find(Long id) {
        return new ReturnVO(userService.find(id));
    }

    @ApiOperation("分页查询用户")
    @PostMapping(LIST_PAGINATION)
    public ReturnVO listPagination(@RequestBody UserSo userSo) {
        return new ReturnVO(userService.listPagination(userSo));
    }
}
