package com.sky.controller.user;

import com.sky.result.Result;
import com.sky.service.ShopService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 沈佳栋
 * @Description: TODO
 * @DateTime: 2023/8/8 16:07
 **/

@RestController("userShopController")
@RequestMapping("/user/shop")
@Slf4j
@Api(tags = "商铺相关接口")
public class ShopController {

    @Autowired
    private RedisTemplate redisTemplate;

    public static final String KEY = "SHOP_STATUS";

    /**
     * 获取商铺状态
     * @return
     */
    @GetMapping("/status")
    @ApiOperation(value = "获取商铺状态")
    public Result<Integer> getStatus() {
        Integer status = (Integer) redisTemplate.opsForValue().get(KEY);
        log.info("获取商铺状态为：{}", status == 1 ? "营业中" : "休息中");
        return Result.success(status);
    }
}
