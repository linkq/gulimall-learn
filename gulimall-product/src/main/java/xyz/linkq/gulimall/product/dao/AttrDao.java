package xyz.linkq.gulimall.product.dao;

import xyz.linkq.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author linkq
 * @email mrlinkq@hotmail.com
 * @date 2021-04-17 18:23:40
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
