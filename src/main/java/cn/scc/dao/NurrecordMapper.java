package cn.scc.dao;

import cn.scc.entity.Nurrecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NurrecordMapper {


    int deleteByPrimaryKey(Long id);

    int insert(Nurrecord record);

    int insertSelective(Nurrecord record);


    Nurrecord selectByPrimaryKey(Long id);



    int updateByPrimaryKeySelective(Nurrecord record);

    int updateByPrimaryKey(Nurrecord record);
}