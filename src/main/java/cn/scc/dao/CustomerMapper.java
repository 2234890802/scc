package cn.scc.dao;

import cn.scc.entity.Customer;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
    int deleteByPrimaryKey(Long cusid);

    int insert(Customer record);

    int insertSelective(Customer record);

     Customer selectByPrimaryKey(Long cusid);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}