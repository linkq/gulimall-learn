package xyz.linkq.gulimall.coupon.dao;

import xyz.linkq.gulimall.coupon.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * 
 * @author linkq
 * @email mrlinkq@hotmail.com
 * @date 2021-04-18 22:38:47
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadderEntity> {
	
}
