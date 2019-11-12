package cn.scc.mapper;

import cn.scc.entity.NursingRecord;

public interface NursingRecordMapper {
    int deleteByPrimaryKey(Long nursingRecordId);

    int insert(NursingRecord record);

    int insertSelective(NursingRecord record);

    NursingRecord selectByPrimaryKey(Long nursingRecordId);

    int updateByPrimaryKeySelective(NursingRecord record);

    int updateByPrimaryKey(NursingRecord record);
}