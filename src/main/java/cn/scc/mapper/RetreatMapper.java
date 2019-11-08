package cn.scc.mapper;

import cn.scc.entity.Retreat;

public interface RetreatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Retreat record);

    int insertSelective(Retreat record);

    Retreat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Retreat record);

    int updateByPrimaryKey(Retreat record);
}