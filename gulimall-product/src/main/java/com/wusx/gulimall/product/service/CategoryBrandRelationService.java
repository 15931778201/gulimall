package com.wusx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wusx.common.utils.PageUtils;
import com.wusx.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author wusx
 * @email wusx@yuguo.com
 * @date 2024-04-13 10:02:12
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

