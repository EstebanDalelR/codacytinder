package com.google.android.m4b.maps.p113m;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Binder;

/* renamed from: com.google.android.m4b.maps.m.g */
public final class C5480g {
    /* renamed from: a */
    public static String m23842a(Context context) {
        int callingPid = Binder.getCallingPid();
        Context<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == callingPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m23841a(int i, int i2) {
        i = Thread.currentThread().getStackTrace();
        StringBuffer stringBuffer = new StringBuffer();
        int i3 = 3;
        i2 += 3;
        while (i3 < i2) {
            String str;
            int i4 = i3 + 4;
            if (i4 >= i.length) {
                str = "<bottom of call stack>";
            } else {
                StackTraceElement stackTraceElement = i[i4];
                String valueOf = String.valueOf(stackTraceElement.getClassName());
                String valueOf2 = String.valueOf(stackTraceElement.getMethodName());
                i4 = stackTraceElement.getLineNumber();
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 13) + String.valueOf(valueOf2).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(".");
                stringBuilder.append(valueOf2);
                stringBuilder.append(":");
                stringBuilder.append(i4);
                str = stringBuilder.toString();
            }
            stringBuffer.append(str);
            stringBuffer.append(" ");
            i3++;
        }
        return stringBuffer.toString();
    }
}
