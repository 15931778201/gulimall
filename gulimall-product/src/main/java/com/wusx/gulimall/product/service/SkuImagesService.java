package com.wusx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wusx.common.utils.PageUtils;
import com.wusx.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wusx
 * @email wusx@yuguo.com
 * @date 2024-04-13 10:02:11
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

