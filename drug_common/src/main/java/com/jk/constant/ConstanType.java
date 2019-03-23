package com.jk.constant;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConstanType {

    /**
     * 原密码正确
     */
    public static final Boolean PASSWORD_STATUS_RIGHT  = true;

    /**
     * 密码错误
     */
    public static final Boolean PASSWORD_STATUS_WRONG = false;

    /**
     * 存入缓存
     */
    public static final String DEPOSIT_CACHE_SITE = "deposit_cache_site";

    /**
     * 普通方法存  cookie
     */

    public static final String remember_pwd="remember_pwd";
    /**
     *  json类型  存cookie
     */

    public static final String json_pwd="json_pwd";
    /**
     * 固定值
     */
    public static final String splitsperator="comjk1808";
    //验证码的缓存
    public static final String phone_code = "phone_code_";
    //判断手机号是不是多次获取验证码
    public static final String multiple_code = "multiple_code_";

    /**
     * 当前系统时间
     */
    private static SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    private static    Date  newDate= new Date();
    public static final String CURRENT_SYSTEM_TIME = date.format(newDate);
    /**
     * 审核状态 1 待审核 2.已通过 3，未通过
     */
    public static final Integer AUDIT_STATUS_ONE=1;
    public static final Integer AUDIT_STATUS_TWO=2;
    public static final Integer AUDIT_STATUS_THREE=3;
    /**
     * 商品状态 1.上架 2.下架
     */
    public static final Integer GOODS_STATE_ONE = 1;
    public static final Integer GOODS_STATE_TWO = 2;
}
