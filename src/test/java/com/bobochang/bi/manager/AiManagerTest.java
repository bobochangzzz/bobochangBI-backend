package com.bobochang.bi.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 2023/5/23 - 14:25
 *
 * @author bobochang
 * @description
 */
@SpringBootTest
class AiManagerTest {

    @Resource
    private AiManager aiManager;

    @Test
    void chat2Ai() {
        System.out.println(aiManager.chat2Ai("啵啵肠"));
    }
}