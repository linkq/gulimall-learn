package xyz.linkq.gulimall.coupon.dao;

import xyz.linkq.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author linkq
 * @email mrlinkq@hotmail.com
 * @date 2021-04-18 22:38:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
