package cn.scc.dao;

import cn.scc.entity.Nursing;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NursingMapper {


    int deleteByPrimaryKey(Long nurno);

    int insert(Nursing record);

    int insertSelective(Nursing record);


    Nursing selectByPrimaryKey(Long nurno);



    int updateByPrimaryKeySelective(Nursing record);

    int updateByPrimaryKey(Nursing record);
}