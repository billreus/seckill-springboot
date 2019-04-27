package bill.seckill.service;

import bill.seckill.entity.Seckill;
import bill.seckill.exception.RepeatKillException;
import bill.seckill.exception.SeckillCloseException;
import bill.seckill.exception.SeckillException;
import bill.seckill.dto.Exposer;
import bill.seckill.dto.SeckillExecution;

import java.math.BigDecimal;
import java.util.List;

public interface SeckillService {

    /**
     * 获取所有的秒杀商品列表
     */
    List<Seckill> findAll();

    /**
     * 获取某一条商品秒杀信息
     */
    Seckill findById(long seckillId);

    /**
     * 秒杀开始时输出暴露秒杀的地址
     * 否则输出系统时间和秒杀时间
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀的操作
     */
    SeckillExecution executeSeckill(long seckillId, BigDecimal money, long userPhone, String md5)
            throws SeckillException, RepeatKillException, SeckillCloseException;

}
