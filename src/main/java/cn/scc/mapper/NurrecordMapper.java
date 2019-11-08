package cn.scc.mapper;

import cn.scc.entity.Nursecord;

public interface NurrecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Nursecord record);

    int insertSelective(Nursecord record);

    Nursecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Nursecord record);

    int updateByPrimaryKey(Nursecord record);
}