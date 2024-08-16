package org.zartt.cloud.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zartt.cloud.entity.Mentor;
import org.zartt.cloud.entity.QueryDTO;
import org.zartt.cloud.mapper.MentorMapper;
import org.zartt.cloud.resp.ResultData;
import org.zartt.cloud.service.MentorService;

/**
 * @author: zartt
 * @description: TODO
 */
@RestController
@Slf4j
public class MentorController {
    @Resource
    private MentorService mentorService;
    @GetMapping("/info")
    public ResultData<String> getInfo(){
        return ResultData.success("success");
    }
    @GetMapping("/list")
    public ResultData<IPage<Mentor>> getList(@RequestBody QueryDTO queryDTO){
        return ResultData.success(mentorService.selectPage(queryDTO));
    }


}
