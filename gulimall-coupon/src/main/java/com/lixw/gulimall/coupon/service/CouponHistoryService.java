package com.lixw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lixw.gulimall.common.utils.PageUtils;
import com.lixw.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author 夏沫止水
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:35:30
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

