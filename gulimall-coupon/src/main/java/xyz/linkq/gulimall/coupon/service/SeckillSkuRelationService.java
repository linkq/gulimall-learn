package xyz.linkq.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.linkq.common.utils.PageUtils;
import xyz.linkq.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author linkq
 * @email mrlinkq@hotmail.com
 * @date 2021-04-18 22:38:47
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

