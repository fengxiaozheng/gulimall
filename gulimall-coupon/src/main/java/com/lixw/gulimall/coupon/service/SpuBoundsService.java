package com.lixw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lixw.gulimall.common.utils.PageUtils;
import com.lixw.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author 夏沫止水
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:35:30
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

