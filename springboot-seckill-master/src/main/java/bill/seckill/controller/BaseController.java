package bill.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面映射跳转的控制层
 */
@Controller
public class BaseController {

    /**
     * 跳转到秒杀商品页
     */
    @RequestMapping("/seckill")
    public String seckillGoods() {
        return "redirect:/seckill/list";
    }

}
