package cn.scc.dao;

import cn.scc.entity.Bed;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BedMapper {
    int deleteByPrimaryKey(Long bedid);

    int insert(Bed record);

    int insertSelective(Bed record);

    Bed selectByPrimaryKey(Long bedid);

    int updateByPrimaryKeySelective(Bed record);

    int updateByPrimaryKey(Bed record);
}