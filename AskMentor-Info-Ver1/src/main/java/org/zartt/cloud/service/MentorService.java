package org.zartt.cloud.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.zartt.cloud.entity.Mentor;
import org.zartt.cloud.entity.QueryDTO;
import org.zartt.cloud.mapper.MentorMapper;

/**
 * @author: zartt
 * @description: TODO
 */

public interface MentorService {
    IPage<Mentor> selectPage(QueryDTO queryDTO);
}