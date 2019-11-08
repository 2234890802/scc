package cn.scc.dao;

import cn.scc.entity.Egress;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EgressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Egress record);

    int insertSelective(Egress record);

    Egress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Egress record);

    int updateByPrimaryKey(Egress record);
}