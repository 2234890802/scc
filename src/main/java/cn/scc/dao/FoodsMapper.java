package cn.scc.dao;

import cn.scc.entity.Foods;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodsMapper {
    int deleteByPrimaryKey(Long foodid);

    int insert(Foods record);

    int insertSelective(Foods record);

    Foods selectByPrimaryKey(Long foodid);

    int updateByPrimaryKeySelective(Foods record);

    int updateByPrimaryKey(Foods record);
}