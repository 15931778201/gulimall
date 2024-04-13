package com.wusx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wusx.common.utils.PageUtils;
import com.wusx.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author wusx
 * @email wusx@yuguo.com
 * @date 2024-04-13 10:02:11
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

