package cn.scc.mapper;

import cn.scc.entity.NursingLevel;

public interface NursingLevelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NursingLevel record);

    int insertSelective(NursingLevel record);

    NursingLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NursingLevel record);

    int updateByPrimaryKey(NursingLevel record);
}