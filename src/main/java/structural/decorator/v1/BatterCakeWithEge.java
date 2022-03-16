package structural.decorator.v1;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/14
 * @Description :
 */
public class BatterCakeWithEge extends Battercake{

    @Override
    public String getDesc() {
        return super.getDesc()+"加一个蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
