package cn.scc.mapper;

import cn.scc.entity.Meals;

public interface MealsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Meals record);

    int insertSelective(Meals record);

    Meals selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Meals record);

    int updateByPrimaryKey(Meals record);
}