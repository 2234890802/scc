package cn.scc.mapper;

import cn.scc.entity.Nursing;

public interface NursingMapper {
    int deleteByPrimaryKey(Long nursingNo);

    int insert(Nursing record);

    int insertSelective(Nursing record);

    Nursing selectByPrimaryKey(Long nursingNo);

    int updateByPrimaryKeySelective(Nursing record);

    int updateByPrimaryKey(Nursing record);
}