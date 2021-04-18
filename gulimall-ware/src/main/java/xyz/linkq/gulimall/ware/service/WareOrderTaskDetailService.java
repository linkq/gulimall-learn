package xyz.linkq.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.linkq.common.utils.PageUtils;
import xyz.linkq.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author linkq
 * @email mrlinkq@hotmail.com
 * @date 2021-04-18 22:58:35
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

