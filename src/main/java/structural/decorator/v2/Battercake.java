package structural.decorator.v2;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/14
 * @Description :
 */
public class Battercake extends ABattercake{
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
