package com.bobochang.bi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bobochang.bi.model.entity.Chart;
import com.bobochang.bi.service.ChartService;
import com.bobochang.bi.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author m1372
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-05-21 15:47:54
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




