package com.wusx.gulimall.product.dao;

import com.wusx.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author wusx
 * @email wusx@yuguo.com
 * @date 2024-04-13 10:02:11
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
