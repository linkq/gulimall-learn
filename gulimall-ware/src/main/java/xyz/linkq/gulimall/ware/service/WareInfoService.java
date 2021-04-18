package xyz.linkq.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.linkq.common.utils.PageUtils;
import xyz.linkq.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author linkq
 * @email mrlinkq@hotmail.com
 * @date 2021-04-18 22:58:35
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

