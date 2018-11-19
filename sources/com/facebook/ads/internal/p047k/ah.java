package com.facebook.ads.internal.p047k;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.StringTokenizer;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.internal.k.ah */
public class ah {
    /* renamed from: a */
    public static final String m5180a(String str) {
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, " ", true);
            if (str.length() > 90 && (str.length() > 93 || !str.endsWith("..."))) {
                StringBuilder stringBuilder;
                int i = 0;
                while (stringTokenizer.hasMoreTokens()) {
                    int length = stringTokenizer.nextToken().length() + i;
                    if (length < 90) {
                        i = length;
                    }
                }
                if (i == 0) {
                    stringBuilder = new StringBuilder();
                    str = str.substring(0, 90);
                } else {
                    stringBuilder = new StringBuilder();
                    str = str.substring(0, i);
                }
                stringBuilder.append(str);
                stringBuilder.append("...");
                return stringBuilder.toString();
            }
        }
        return str;
    }

    /* renamed from: a */
    public static final String m5181a(Throwable th) {
        if (th == null) {
            return null;
        }
        Writer stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static final String m5182a(StackTraceElement[] stackTraceElementArr) {
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }
}
