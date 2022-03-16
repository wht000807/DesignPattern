package structural.adapter;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/14
 * @Description :
 */
public class PowerAdapter implements OU5{
    IN220 in220 = new IN220();

    @Override
    public int OutPut5() {
        int i = in220.inputPower();
        int o = i/44;
        System.out.println("转换成"+o+"V电流");
        return o;
    }
}
