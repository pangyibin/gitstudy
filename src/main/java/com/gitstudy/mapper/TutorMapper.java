package com.gitstudy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gitstudy.entity.Tutor;

public interface TutorMapper extends BaseMapper<Tutor> {
    Tutor findTutorById(int i);

}
