package cn.scc.dao;

import cn.scc.entity.Retreat;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RetreatMapper {


    int deleteByPrimaryKey(Long id);

    int insert(Retreat record);

    int insertSelective(Retreat record);


    Retreat selectByPrimaryKey(Long id);



    int updateByPrimaryKeySelective(Retreat record);

    int updateByPrimaryKey(Retreat record);
}