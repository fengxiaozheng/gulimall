package com.lixw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lixw.gulimall.common.utils.PageUtils;
import com.lixw.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author 夏沫止水
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:35:30
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

