package cn.scc.dao;

import cn.scc.entity.Meals;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MealsMapper {


    int deleteByPrimaryKey(Long id);

    int insert(Meals record);

    int insertSelective(Meals record);


    Meals selectByPrimaryKey(Long id);



    int updateByPrimaryKeySelective(Meals record);

    int updateByPrimaryKey(Meals record);
}