package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: 沈佳栋
 * @Description: TODO
 * @DateTime: 2023/8/4 14:22
 **/

@Mapper
public interface SetmealDishMapper {

    /**
     * 批量新增套餐菜品
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);

    /**
     * 根据套餐id删除套餐菜品
     * @param setmealId
     */
    void deleteBySetmealId(Long setmealId);

    /**
     * 根据菜品id查询套餐id
     * @param dishIds
     * @return
     */

    List<Long> getSetmealDishIds(List<Long> dishIds);

    /**
     * 根据套餐id查询套餐菜品
     * @param id
     * @return
     */
    List<SetmealDish> getSetmealDishId(Long id);
}
