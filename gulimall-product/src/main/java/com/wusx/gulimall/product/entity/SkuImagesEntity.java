package com.wusx.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

    import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * sku图片
 *
 * @author wusx
 * @email wusx@yuguo.com
 * @date 2024-04-13 10:02:11
 */
@Data
@TableName("pms_sku_images")
public class SkuImagesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            /**
         * id
         */
                @TableId
            private Long id;
            /**
         * sku_id
         */
            private Long skuId;
            /**
         * 图片地址
         */
            private String imgUrl;
            /**
         * 排序
         */
            private Integer imgSort;
            /**
         * 默认图[0 - 不是默认图，1 - 是默认图]
         */
            private Integer defaultImg;
    
}
