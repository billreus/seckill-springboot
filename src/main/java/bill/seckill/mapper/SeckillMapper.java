package bill.seckill.mapper;

import bill.seckill.entity.Seckill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface SeckillMapper {

    /**
     * 查询所有秒杀商品的记录信息
     */
    List<Seckill> findAll();

    /**
     * 根据主键id查询当前秒杀商品的数据
     */
    Seckill findById(long id);

    /**
     * 减库存
     */
    int reduceStock(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);
}
