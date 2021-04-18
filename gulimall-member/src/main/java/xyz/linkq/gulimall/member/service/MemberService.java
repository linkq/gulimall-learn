package xyz.linkq.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.linkq.common.utils.PageUtils;
import xyz.linkq.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author linkq
 * @email mrlinkq@hotmail.com
 * @date 2021-04-18 22:51:46
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

