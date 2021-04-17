package xyz.linkq.gulimall.product.dao;

import xyz.linkq.gulimall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author linkq
 * @email mrlinkq@hotmail.com
 * @date 2021-04-17 18:23:40
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
