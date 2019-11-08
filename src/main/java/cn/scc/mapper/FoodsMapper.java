package cn.scc.mapper;

import cn.scc.entity.Foods;

public interface FoodsMapper {
    int deleteByPrimaryKey(Long foodId);

    int insert(Foods record);

    int insertSelective(Foods record);

    Foods selectByPrimaryKey(Long foodId);

    int updateByPrimaryKeySelective(Foods record);

    int updateByPrimaryKey(Foods record);
}