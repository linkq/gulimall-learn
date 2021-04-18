package xyz.linkq.gulimall.member.dao;

import xyz.linkq.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author linkq
 * @email mrlinkq@hotmail.com
 * @date 2021-04-18 22:51:46
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
