package cn.scc.mapper;

import cn.scc.entity.Egress;

public interface EgressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Egress record);

    int insertSelective(Egress record);

    Egress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Egress record);

    int updateByPrimaryKey(Egress record);
}