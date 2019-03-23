package com.jk.utils;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092700608619";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCG3H9eCY/3g49RrPybftbJ7HhxFsZPDz3YGQD7SjkN+MTq8DJ+WRMBSY18/88RjjEHfKkZpITV2NM++iRixGZHAqxXuzwYxxhEqoMBgeM7VTvaYtdKCDnEcznZg2IrtnB/IZ+5nU/z2Qv0nNeZgmY7fus+QkbVLke3xRgK0OvItb7n+IS0d9eUWbXHBBnLSF/t/UYon6hn5d/rrP0vAcsjbH0IuJnoPoKgdqMDsYkuuvLKUNQlOILd1Sk0za24/iv9EWXqabAlY2QPNgG5Y6lnjvD/yTwoRPxYs1BzAeHPjWybUgSx3fHxug5B7JCaRXE05jr8CC0lTsJxPdJQpWljAgMBAAECggEAXdVHbYebuuy3qG2DKTHcgoxc1Nqyyklhj1z+WNmwzu7bHFhZ2Z1iYs/peSKH0cAsjvgGtEfLAPunJ7dl366lNx0+CqDE1LyaPxSgqEjWcO8CARYqk2EbyHsfsh7/DEkZBuu/Nael/JV1AxKp1C5tsVHCngQBQsy7q7qf2s64b2I6zEe8GyNfPXhZ2F1vogicydxcAjvKVlaOIzIpl9vgb05DZb8l/zAGr0L10ZBXmkNP0HLICYbo8B97OQ8N/OWDrUy6dw2TLaKdxXPxdvk275VZ4zmxOan2pJGVtPjlYwCs7Sr/WI05qowvYYMWkA8Tw5J8I2tYgg6QIRFtDSEhCQKBgQC6bFizk0DRdF/6cCe6/cRwUf1zVrZ9jrLWbi0o1ub2oJwCxv/WGioJeI8XspEv6SIJm5qjlk9jhvneBZ6vbeer/eMwdmEYev6ocvOBnmzRrAdVMLPfKuT1Pibj8EWxlnhk2PT4DSKbV5A3v6xwDh0LjFA8EJkSWqe/v11NOqi3twKBgQC5MbX9nIb5GGeA79KVuTUka0pASu+0ZQPUn4OKpxC3pcfyGiOMLwOO+2t82hU1lEqcGfbKAK/9eXieB4d6UlJcTCMZhiflTAgooZ91yXcdkXSiwBoDzR1f7vyr+zHZDuFTBgUmt9m0PIUloX2bfEnhhSMAqoxnxUvL10li1K6jtQKBgAcz0Gl/su1ktaCTXLWYwFImmMgv/XT0YmxubUg6pUm6As0IqzG2aRFcmwqrV3imZS5B2MOhNwf9WwH87ZiRgnXepTxmFnI/rj8L0eScHlAreU0NSKXCnn3rHM2JpuepjJU43J4Iw+GEjIna2eqqYOzlSuRHL+LJpdl+pzgooAQZAoGAC98E5HnpKQSIdfppjFFv96KtAswK64xiH3oOK5AkATGuTHWie7TzzHGPZVRxcZrM4Y7EhBRhM6Vatv6Sj6PBRctXoKY53nfuOfSKTTmZ2hpd2KTpxf6a+HBQYBHdEyXiCblkESRN30DV5CCi9ZmU/tDS+pL0Jx69ihaFzMEHZNUCgYBXqka17hfNYvFaOuKUWMCYcHUJXw31DX4ndsj7Hi9urnie5kr484WSoSgKS/PgEo4Adgj22wP0viKtyFDKYG0jyVtDFycCjN2iPbIpCgkU9obfm4CNMXwMuKZhJpGu85s5g2jzUWEmmxhG0QgU0mGuIb+atMJyrj4X62by1mnbqg==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1dOWeQEfvvRxWkAJXdK9oOBc3EjKZYwPMlqowHUmKOevbwfUSRqf9oqktG5MBYrVUovgDwUDiuCoCGkVrOhskr2FJHKMEu0gvV2mZLXN/VR+fImt0mdNktX9n650DuDH/+U0/NA0xVCPpqeG80G8Nq+vSjBEF5OscwaUdPovM5ITWjrWHkQc4UR0gJPrhgaHz2gfqFwyDkdc6/v9RI271EQ6EYlw8fUxx199NpdyEIpre6T918lzsAEgYgzj6dekZjisq/jxundRofkTIXw/HlHqVCMiGx4TAFLyOjA2blgUBa3IWvhaUHATGEiAa+ronsiC7YbD4poqLVLUlQt5dQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://yangjian.free.idcfengye.com/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://yangjian.free.idcfengye.com/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
