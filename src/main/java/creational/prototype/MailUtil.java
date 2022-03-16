package creational.prototype;

import java.text.MessageFormat;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/12
 * @Description :
 */
public class MailUtil {

    public static void sendMail(Mail mail) {
        String outPutContent = "向{0}同学,邮件地址：{1},邮件内容{2}发送邮件";
        System.out.println(MessageFormat.format(outPutContent,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }
    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originMail记录,内容是:"+mail.getContent());
    }

}
