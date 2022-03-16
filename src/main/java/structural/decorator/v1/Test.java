package structural.decorator.v1;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/14
 * @Description :
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+"销售价格"+battercake.cost());
        System.out.println("-------------------------------------------");
        BatterCakeWithEge batterCakeWithEge = new BatterCakeWithEge();
        System.out.println(batterCakeWithEge.getDesc()+"销售价格"+batterCakeWithEge.cost());
        System.out.println("-------------------------------------------");
        BatterCakeWithEgeSausage batterCakeWithEgeSausage = new BatterCakeWithEgeSausage();
        System.out.println(batterCakeWithEgeSausage.getDesc()+"销售价格"+batterCakeWithEgeSausage.cost());
    }
}
