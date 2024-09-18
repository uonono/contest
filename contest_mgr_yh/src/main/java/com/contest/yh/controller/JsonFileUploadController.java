package com.contest.yh.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/upload")
public class JsonFileUploadController {

//    @Autowired
//    private JsonDataInsertService jsonDataInsertService;

    // 通过 JSON 字符串上传并处理数据
    @PostMapping("/json")
    public ResponseEntity<String> uploadJson(@RequestBody String jsonString) {
        try {
            // 使用 FastJSON 解析 JSON 字符串为 JSON 对象
            JSONObject jsonObject = JSON.parseObject(jsonString);

            // 调用服务层根据 JSON 对象插入数据
//            jsonDataInsertService.insertDataFromJson(jsonObject);

            return ResponseEntity.ok("JSON 数据处理成功");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("处理失败: " + e.getMessage());
        }
    }
}
