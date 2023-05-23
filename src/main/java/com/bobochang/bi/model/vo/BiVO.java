package com.bobochang.bi.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 2023/5/23 - 14:58
 *
 * @author bobochang
 * @description 返回 BiResponse 数据
 */
@Data
public class BiVO implements Serializable {
    /**
     * 生成的图表数据
     */
    private String genChart;

    /**
     * 生成的分析结论
     */
    private String genResult;

    /**
     * 生成的图表 id
     */
    private Long chartId;
}
