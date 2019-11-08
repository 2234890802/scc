package cn.scc.dao;

import cn.scc.entity.Checkin;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckinMapper {
     int deleteByPrimaryKey(Long id);

    int insert(Checkin record);

    int insertSelective(Checkin record);

     Checkin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Checkin record);

    int updateByPrimaryKey(Checkin record);
}