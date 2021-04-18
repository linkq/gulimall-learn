package xyz.linkq.gulimall.ware.dao;

import xyz.linkq.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author linkq
 * @email mrlinkq@hotmail.com
 * @date 2021-04-18 22:58:34
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
