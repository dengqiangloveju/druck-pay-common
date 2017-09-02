package com.druck.pay.utils;

import java.util.UUID;
import java.util.regex.Pattern;

public class CommonUtils {

    /**
     * 判断是否为空
     *
     * @param obj
     * @return
     */
    public static boolean isEmpty(Object obj) {
        return null == obj || "null".equalsIgnoreCase(obj.toString()) || obj.toString().length() == 0 || "".equals(obj.toString().trim());
    }

    /**
     * 判断不为空
     *
     * @param obj
     * @return
     */
    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }

    /**
     * 身份证验证
     */
    public static boolean isIdCard(String idCard) {
        return Pattern.matches("(\\d{14}[0-9a-zA-Z])|(\\d{17}[0-9a-zA-Z])", idCard);
    }

    public static boolean checkInt(String data) {
        Pattern pattern = Pattern.compile("^[0-9]+$");
        if (pattern.matcher(data).matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkFloat(String data) {
        Pattern pattern = Pattern.compile("^[0-9]+(\\.[0-9]{2,4})?$");
        if (pattern.matcher(data).matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static String getRandNum(String m, int n) {
        StringBuffer stringBuffer = new StringBuffer();
        if (isEmpty(m)) {
            m = "";
        }
        int size = m.length();
        for (int i = 0; i < n - size; i++) {
            stringBuffer.append("0");
        }
        stringBuffer.append(m);
        return stringBuffer.toString();
    }

    /**
     * 获取去掉横线的长度为32的UUID串.
     *
     * @return uuid.
     */
    public static String get32UUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 获取带横线的长度为36的UUID串.
     *
     * @return uuid.
     */
    public static String get36UUID() {
        return UUID.randomUUID().toString();
    }
}
