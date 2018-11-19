package com.facebook.ads.internal.p043j.p045b;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.facebook.ads.AudienceNetworkActivity;
import java.io.Closeable;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;

/* renamed from: com.facebook.ads.internal.j.b.m */
public class C1468m {
    /* renamed from: a */
    static String m5136a(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        Object fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        return TextUtils.isEmpty(fileExtensionFromUrl) ? null : singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
    }

    /* renamed from: a */
    private static String m5137a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    static void m5138a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable e) {
                Log.e("ProxyCache", "Error closing resource", e);
            }
        }
    }

    /* renamed from: a */
    static void m5139a(byte[] bArr, long j, int i) {
        C1463j.m5120a((Object) bArr, "Buffer must be not null!");
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z = false;
        C1463j.m5121a(i2 >= 0, "Data offset must be positive!");
        if (i >= 0 && i <= bArr.length) {
            z = true;
        }
        C1463j.m5121a(z, "Length must be in range [0..buffer.length]");
    }

    /* renamed from: b */
    static String m5140b(String str) {
        try {
            return URLEncoder.encode(str, AudienceNetworkActivity.WEBVIEW_ENCODING);
        } catch (Throwable e) {
            throw new RuntimeException("Error encoding url", e);
        }
    }

    /* renamed from: c */
    static String m5141c(String str) {
        try {
            return URLDecoder.decode(str, AudienceNetworkActivity.WEBVIEW_ENCODING);
        } catch (Throwable e) {
            throw new RuntimeException("Error decoding url", e);
        }
    }

    /* renamed from: d */
    public static String m5142d(String str) {
        try {
            return C1468m.m5137a(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
