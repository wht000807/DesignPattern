package structural.facade;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/14
 * @Description :
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        System.out.println(pointsGift.getName()+"进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
