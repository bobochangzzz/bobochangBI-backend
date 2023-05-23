package com.bobochang.bi.manager;

import com.yupi.yucongming.dev.client.YuCongMingClient;
import com.yupi.yucongming.dev.common.BaseResponse;
import com.yupi.yucongming.dev.model.DevChatRequest;
import com.yupi.yucongming.dev.model.DevChatResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 2023/5/23 - 14:23
 *
 * @author bobochang
 * @description
 */
@Service
public class AiManager {

    @Resource
    private YuCongMingClient yuCongMingClient;

    public String chat2Ai(Long modelId, String msg) {
        DevChatRequest devChatRequest = new DevChatRequest();
        devChatRequest.setModelId(modelId);
        devChatRequest.setMessage(msg);
        BaseResponse<DevChatResponse> response = yuCongMingClient.doChat(devChatRequest);
        return response.getData().getContent();
    }
}
