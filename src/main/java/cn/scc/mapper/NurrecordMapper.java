package cn.scc.mapper;

import cn.scc.entity.Nurrecord;

public interface NurrecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Nurrecord record);

    int insertSelective(Nurrecord record);

    Nurrecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Nurrecord record);

    int updateByPrimaryKey(Nurrecord record);
}