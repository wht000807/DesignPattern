package structural.facade;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/14
 * @Description :
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName()+"积分资格通过，库存数不通过");
        return true;
    }

}
