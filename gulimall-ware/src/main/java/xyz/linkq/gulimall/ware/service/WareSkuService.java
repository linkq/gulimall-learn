package xyz.linkq.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.linkq.common.utils.PageUtils;
import xyz.linkq.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author linkq
 * @email mrlinkq@hotmail.com
 * @date 2021-04-18 22:58:34
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

