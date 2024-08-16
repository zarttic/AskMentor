package org.zartt.cloud.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.zartt.cloud.entity.Mentor;
import org.zartt.cloud.entity.QueryDTO;
import org.zartt.cloud.mapper.MentorMapper;
import org.zartt.cloud.service.MentorService;

/**
 * @author: zartt
 * @description: TODO
 */
@Service
public class MentorServiceImpl extends ServiceImpl<MentorMapper, Mentor> implements MentorService {

    @Override
    public IPage<Mentor> selectPage(QueryDTO queryDTO) {
        Page<Mentor> page = new Page<>(queryDTO.getPageIndex(), queryDTO.getPageSize());
        QueryWrapper<Mentor> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotEmpty(queryDTO.getName())) {
            queryWrapper.like("name", queryDTO.getName());
        }
        if (StringUtils.isNotEmpty(queryDTO.getSchool())) {
            queryWrapper.like("school", queryDTO.getSchool());

        }
        if (StringUtils.isNotEmpty(queryDTO.getMajor())) {
            queryWrapper.like("major", queryDTO.getMajor());
        }

        return  baseMapper.selectPage(page,queryWrapper);
    }
}
