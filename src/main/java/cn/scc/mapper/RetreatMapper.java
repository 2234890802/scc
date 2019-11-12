package cn.scc.mapper;

import cn.scc.entity.Retreat;

public interface RetreatMapper {
    int deleteByPrimaryKey(Long retreatId);

    int insert(Retreat record);

    int insertSelective(Retreat record);

    Retreat selectByPrimaryKey(Long retreatId);

    int updateByPrimaryKeySelective(Retreat record);

    int updateByPrimaryKey(Retreat record);
}