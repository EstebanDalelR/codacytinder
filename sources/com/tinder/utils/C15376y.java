package com.tinder.utils;

import android.support.annotation.NonNull;
import java.security.MessageDigest;

/* renamed from: com.tinder.utils.y */
public class C15376y {
    /* renamed from: a */
    public static String m57708a(@NonNull String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("sha1");
            instance.update(str.getBytes("UTF-8"));
            str = instance.digest();
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : str) {
                stringBuilder.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return stringBuilder.toString();
        } catch (String str2) {
            ad.a("NoSuchAlgorithmException while doing sha1", str2);
            return null;
        } catch (String str22) {
            ad.a("UnsupportedEncodingException while doing sha1", str22);
            return null;
        }
    }

    /* renamed from: b */
    public static String m57709b(@NonNull String str) {
        if (str != null) {
            if (str.length() >= 8) {
                int length = (str.length() / 2) - 1;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str.substring(Math.max(0, str.length() - 5)));
                stringBuilder.append("613");
                stringBuilder.append(str.substring(0, 2));
                stringBuilder.append("125");
                stringBuilder.append(str.substring(length - 3, length));
                stringBuilder.append("1125");
                stringBuilder.append(str.substring(length, length + 4));
                String stringBuilder2 = stringBuilder.toString();
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(str);
                stringBuilder3.append(stringBuilder2);
                return C15376y.m57708a(stringBuilder3.toString());
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m57710c(@NonNull String str) {
        try {
            str = MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8"));
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : str) {
                String toHexString = Integer.toHexString(b & 255);
                if (toHexString.length() == 1) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(toHexString);
            }
            return stringBuffer.toString();
        } catch (String str2) {
            throw new RuntimeException(str2);
        }
    }
}
