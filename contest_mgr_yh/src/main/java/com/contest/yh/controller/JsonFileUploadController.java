package com.contest.yh.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.contest.yh.domain.R;
import com.contest.yh.entity.GblSettingWechat;
import com.contest.yh.entity.GblSettingWechatForMongoDB;
import com.contest.yh.service.GblSettingWechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/upload")
public class JsonFileUploadController {

    @Autowired
    private GblSettingWechatService gblSettingWechatService;


    // 通过 JSON 字符串上传并处理数据
    @PostMapping("/json")
    public Mono<R<JSONArray>> uploadJson(@RequestBody String jsonString) {
        // 使用 FastJSON 解析 JSON 字符串为 JSON 对象
        JSONObject jsonObject = JSON.parseObject(jsonString);
        List<GblSettingWechat> gblSettingWechats = new ArrayList<>();

        for (Object o : jsonObject.getJSONObject("Returns").getJSONArray("ReturnT")) {
            JSONObject gblSettingWechatSource = JSONObject.parseObject(o.toString());
            GblSettingWechat gblSettingWechat = new GblSettingWechat();

            gblSettingWechat.setU_IsKeyNum(gblSettingWechatSource.getBoolean("u_IsKeyNum"));
            gblSettingWechat.setStrTemp(gblSettingWechatSource.getString("StrTemp"));
            gblSettingWechat.setPiority(gblSettingWechatSource.getInteger("Piority"));
            gblSettingWechat.setKeyNum(gblSettingWechatSource.getString("KeyNum"));
            gblSettingWechat.setIsActive(gblSettingWechatSource.getBoolean("IsActive"));
            gblSettingWechat.setRedisConditionValus(gblSettingWechatSource.getString("RedisConditionValus"));
            gblSettingWechat.setRowStatus(gblSettingWechatSource.getInteger("RowStatus"));
            gblSettingWechat.setIsSelected(gblSettingWechatSource.getBoolean("IsSelected"));
            gblSettingWechat.setU_IsSetValue(gblSettingWechatSource.getBoolean("u_IsSetValue"));
            gblSettingWechat.setBaseTable(gblSettingWechatSource.getString("BaseTable"));
            gblSettingWechat.setModiTime(gblSettingWechatSource.getString("ModiTime"));
            gblSettingWechat.setDescribtion(gblSettingWechatSource.getString("Describtion"));
            gblSettingWechat.set_ountryName(gblSettingWechatSource.getString("_ountryName"));
            gblSettingWechat.setU_IsGUIDNull(gblSettingWechatSource.getBoolean("u_IsGUIDNull"));
            gblSettingWechat.setU_isNotPatIDNull(gblSettingWechatSource.getBoolean("u_isNotPatIDNull"));
            gblSettingWechat.setStrTemp1(gblSettingWechatSource.getString("StrTemp1"));
            gblSettingWechat.setU_IsExplain(gblSettingWechatSource.getBoolean("u_IsExplain"));
            gblSettingWechat.setHisType(gblSettingWechatSource.getInteger("HisType"));
            gblSettingWechat.setExplain(gblSettingWechatSource.getString("Explain"));
            gblSettingWechat.setHospitalId(gblSettingWechatSource.getInteger("HospitalId"));
            gblSettingWechat.setInputTime(gblSettingWechatSource.getString("InputTime"));
            gblSettingWechat.setGUID(gblSettingWechatSource.getString("GUID"));
            gblSettingWechat.setSystemId(gblSettingWechatSource.getString("SystemId"));
            gblSettingWechat.setSortOrder(gblSettingWechatSource.getInteger("SortOrder"));
            gblSettingWechat.setInsertTime(gblSettingWechatSource.getString("InsertTime"));
            gblSettingWechat.setModiOperName(gblSettingWechatSource.getString("ModiOperName"));
            gblSettingWechat.setIsModify(gblSettingWechatSource.getBoolean("IsModify"));
            gblSettingWechat.setU_IsBasetable(gblSettingWechatSource.getBoolean("u_IsBasetable"));
            gblSettingWechat.setDiagMeetingLocId(gblSettingWechatSource.getString("DiagMeetingLocId"));
            gblSettingWechat.setIsMutiselect(gblSettingWechatSource.getBoolean("IsMutiselect"));
            gblSettingWechat.setU_IsHasRecord(gblSettingWechatSource.getBoolean("u_IsHasRecord"));
            gblSettingWechat.setSetValue(gblSettingWechatSource.getString("SetValue"));
            gblSettingWechat.setU_IsNoRecord(gblSettingWechatSource.getBoolean("u_IsNoRecord"));
            gblSettingWechat.setModiOperId(gblSettingWechatSource.getString("ModiOperId"));

            gblSettingWechats.add(gblSettingWechat);
        }

        // 调用服务层根据 JSON 对象插入数据，并返回结果
        return gblSettingWechatService.findAll()
                .then(Mono.just(R.success(jsonObject.getJSONObject("Returns").getJSONArray("ReturnT"), "JSON 数据处理成功")))
                .onErrorResume(e -> Mono.just(R.fail("处理失败: " + e.getMessage())));

    }
}

