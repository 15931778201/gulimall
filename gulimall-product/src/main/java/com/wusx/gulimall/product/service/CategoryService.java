package com.wusx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wusx.common.utils.PageUtils;
import com.wusx.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author wusx
 * @email wusx@yuguo.com
 * @date 2024-04-13 10:02:12
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

