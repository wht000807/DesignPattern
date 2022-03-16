package structural.facade;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/14
 * @Description :
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        System.out.println("支付"+pointsGift.getName()+"积分成功");
        return true;
    }

}
