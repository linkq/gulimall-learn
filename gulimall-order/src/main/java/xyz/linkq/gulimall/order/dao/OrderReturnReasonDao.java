package xyz.linkq.gulimall.order.dao;

import xyz.linkq.gulimall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author linkq
 * @email mrlinkq@hotmail.com
 * @date 2021-04-18 22:55:09
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
