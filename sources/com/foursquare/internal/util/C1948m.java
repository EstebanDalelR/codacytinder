package com.foursquare.internal.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.foursquare.internal.util.m */
public class C1948m {
    /* renamed from: a */
    public static final String f5228a = "m";

    @Nullable
    /* renamed from: a */
    public static byte[] m6843a(@NonNull String str) {
        Object gZIPOutputStream;
        if (str.length() == 0) {
            return null;
        }
        Object byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(str.getBytes());
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                str = byteArrayOutputStream.toByteArray();
                C1946h.m6836a(byteArrayOutputStream);
                C1946h.m6836a(gZIPOutputStream);
                return str;
            } catch (IOException e) {
                str = e;
                try {
                    str.printStackTrace();
                    C1946h.m6836a(byteArrayOutputStream);
                    C1946h.m6836a(gZIPOutputStream);
                    return null;
                } catch (Throwable th) {
                    str = th;
                    C1946h.m6836a(byteArrayOutputStream);
                    C1946h.m6836a(gZIPOutputStream);
                    throw str;
                }
            }
        } catch (IOException e2) {
            str = e2;
            gZIPOutputStream = null;
            str.printStackTrace();
            C1946h.m6836a(byteArrayOutputStream);
            C1946h.m6836a(gZIPOutputStream);
            return null;
        } catch (Throwable th2) {
            str = th2;
            gZIPOutputStream = null;
            C1946h.m6836a(byteArrayOutputStream);
            C1946h.m6836a(gZIPOutputStream);
            throw str;
        }
    }

    /* renamed from: a */
    public static String m6842a(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @NonNull
    /* renamed from: b */
    public static String m6844b(@NonNull String str) {
        return C1948m.m6841a(str, "    ");
    }

    @NonNull
    /* renamed from: a */
    public static String m6841a(@NonNull String str, @NonNull String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str3 : str.split("\n")) {
            stringBuilder.append(str2);
            stringBuilder.append(str3);
            stringBuilder.append('\n');
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
