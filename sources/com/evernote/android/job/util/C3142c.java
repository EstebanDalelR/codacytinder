package com.evernote.android.job.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import java.util.Arrays;

/* renamed from: com.evernote.android.job.util.c */
public class C3142c implements JobLogger {
    /* renamed from: c */
    private static volatile JobLogger[] f9688c = new JobLogger[0];
    /* renamed from: d */
    private static volatile boolean f9689d = true;
    /* renamed from: a */
    protected final String f9690a;
    /* renamed from: b */
    protected final boolean f9691b;

    /* renamed from: a */
    public static synchronized boolean m12114a(@NonNull JobLogger jobLogger) {
        synchronized (C3142c.class) {
            int i = 0;
            for (Object equals : f9688c) {
                if (jobLogger.equals(equals)) {
                    return false;
                }
            }
            while (i < f9688c.length) {
                if (f9688c[i] == null) {
                    f9688c[i] = jobLogger;
                    return true;
                }
                i++;
            }
            int length = f9688c.length;
            f9688c = (JobLogger[]) Arrays.copyOf(f9688c, f9688c.length + 2);
            f9688c[length] = jobLogger;
            return true;
        }
    }

    public C3142c(String str) {
        this(str, true);
    }

    public C3142c(String str, boolean z) {
        this.f9690a = str;
        this.f9691b = z;
    }

    /* renamed from: a */
    public void m12115a(@NonNull String str) {
        log(4, this.f9690a, str, null);
    }

    /* renamed from: a */
    public void m12116a(@NonNull String str, Object... objArr) {
        log(4, this.f9690a, String.format(str, objArr), null);
    }

    /* renamed from: b */
    public void m12119b(@NonNull String str) {
        log(3, this.f9690a, str, null);
    }

    /* renamed from: b */
    public void m12120b(@NonNull String str, Object... objArr) {
        log(3, this.f9690a, String.format(str, objArr), null);
    }

    /* renamed from: c */
    public void m12122c(@NonNull String str) {
        log(5, this.f9690a, str, null);
    }

    /* renamed from: c */
    public void m12123c(@NonNull String str, Object... objArr) {
        log(5, this.f9690a, String.format(str, objArr), null);
    }

    /* renamed from: a */
    public void m12118a(@NonNull Throwable th, @NonNull String str, Object... objArr) {
        log(5, this.f9690a, String.format(str, objArr), th);
    }

    /* renamed from: a */
    public void m12117a(@NonNull Throwable th) {
        String message = th.getMessage();
        String str = this.f9690a;
        if (message == null) {
            message = "empty message";
        }
        log(6, str, message, th);
    }

    /* renamed from: d */
    public void m12124d(@NonNull String str) {
        log(6, this.f9690a, str, null);
    }

    /* renamed from: d */
    public void m12125d(@NonNull String str, Object... objArr) {
        log(6, this.f9690a, String.format(str, objArr), null);
    }

    /* renamed from: b */
    public void m12121b(@NonNull Throwable th, @NonNull String str, Object... objArr) {
        log(6, this.f9690a, String.format(str, objArr), th);
    }

    public void log(int i, @NonNull String str, @NonNull String str2, @Nullable Throwable th) {
        if (this.f9691b) {
            if (f9689d) {
                String str3;
                if (th == null) {
                    str3 = "";
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append('\n');
                    stringBuilder.append(Log.getStackTraceString(th));
                    str3 = stringBuilder.toString();
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str2);
                stringBuilder2.append(str3);
                Log.println(i, str, stringBuilder2.toString());
            }
            JobLogger[] jobLoggerArr = f9688c;
            if (jobLoggerArr.length > 0) {
                for (JobLogger jobLogger : jobLoggerArr) {
                    if (jobLogger != null) {
                        jobLogger.log(i, str, str2, th);
                    }
                }
            }
        }
    }
}
