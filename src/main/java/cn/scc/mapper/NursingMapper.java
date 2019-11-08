package cn.scc.mapper;

import cn.scc.entity.Nursing;

public interface NursingMapper {
    int deleteByPrimaryKey(Long nurno);

    int insert(Nursing record);

    int insertSelective(Nursing record);

    Nursing selectByPrimaryKey(Long nurno);

    int updateByPrimaryKeySelective(Nursing record);

    int updateByPrimaryKey(Nursing record);
}