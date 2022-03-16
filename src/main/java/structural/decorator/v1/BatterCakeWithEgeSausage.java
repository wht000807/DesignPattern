package structural.decorator.v1;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/14
 * @Description :
 */
public class BatterCakeWithEgeSausage extends BatterCakeWithEge{
    @Override
    public String getDesc() {
        return super.getDesc()+"加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
