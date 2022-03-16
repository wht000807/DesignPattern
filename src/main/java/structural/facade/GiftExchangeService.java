package structural.facade;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/14
 * @Description :
 */
public class GiftExchangeService {

    private QualifyService qualifyService;
    private ShippingService shippingService;
    private PointsPaymentService pointsPaymentService;

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
        this.pointsPaymentService = pointsPaymentService;
    }

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            if(pointsPaymentService.pay(pointsGift)) {
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号是"+shippingOrderNo);
            }
        }
    }
}
