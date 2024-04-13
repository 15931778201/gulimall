package com.wusx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wusx.common.utils.PageUtils;
import com.wusx.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author wusx
 * @email wusx@yuguo.com
 * @date 2024-04-13 10:02:11
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

