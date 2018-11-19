package com.firebase.jobdispatcher;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.firebase.jobdispatcher.C1885m.C3493a;
import com.firebase.jobdispatcher.C1885m.C3494b;
import com.google.android.gms.gcm.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.firebase.jobdispatcher.a */
public class C3486a implements JobValidator {
    /* renamed from: a */
    private final Context f10525a;

    public C3486a(Context context) {
        this.f10525a = context;
    }

    /* renamed from: a */
    private static int m13237a(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        bundle.writeToParcel(obtain, 0);
        bundle = obtain.dataSize();
        obtain.recycle();
        return bundle;
    }

    @Nullable
    /* renamed from: a */
    private static List<String> m13240a(@Nullable List<String> list, @Nullable List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        list.addAll(list2);
        return list;
    }

    @Nullable
    /* renamed from: a */
    private static List<String> m13239a(@Nullable List<String> list, String str) {
        if (str == null) {
            return list;
        }
        if (list == null) {
            return C3486a.m13245c(str);
        }
        Collections.addAll(list, new String[]{str});
        return list;
    }

    @Nullable
    /* renamed from: a */
    private static List<String> m13241a(boolean z, List<String> list, String str) {
        return z ? C3486a.m13239a((List) list, str) : list;
    }

    @Nullable
    @CallSuper
    public List<String> validate(JobParameters jobParameters) {
        List a = C3486a.m13240a(C3486a.m13240a(null, validate(jobParameters.getTrigger())), validate(jobParameters.getRetryStrategy()));
        if (jobParameters.isRecurring() && jobParameters.getTrigger() == C1886n.f5129a) {
            a = C3486a.m13239a(a, "ImmediateTriggers can't be used with recurring jobs");
        }
        a = C3486a.m13240a(a, C3486a.m13244c(jobParameters.getExtras()));
        if (jobParameters.getLifetime() > 1) {
            a = C3486a.m13240a(a, C3486a.m13242b(jobParameters.getExtras()));
        }
        return C3486a.m13240a(C3486a.m13240a(a, C3486a.m13243b(jobParameters.getTag())), m13246a(jobParameters.getService()));
    }

    @Nullable
    @CallSuper
    public List<String> validate(C1885m c1885m) {
        return (c1885m == C1886n.f5129a || (c1885m instanceof C3494b) || (c1885m instanceof C3493a) != null) ? null : C3486a.m13245c("Unknown trigger provided");
    }

    @Nullable
    @CallSuper
    public List<String> validate(RetryStrategy retryStrategy) {
        int a = retryStrategy.m6577a();
        int b = retryStrategy.m6578b();
        retryStrategy = retryStrategy.m6579c();
        boolean z = false;
        boolean z2 = (a == 1 || a == 2) ? false : true;
        retryStrategy = C3486a.m13241a(300 > retryStrategy ? true : null, C3486a.m13241a(retryStrategy < b, C3486a.m13241a(z2, null, "Unknown retry policy provided"), "Maximum backoff must be greater than or equal to initial backoff"), "Maximum backoff must be greater than 300s (5 minutes)");
        if (b < 30) {
            z = true;
        }
        return C3486a.m13241a(z, retryStrategy, "Initial backoff must be at least 30s");
    }

    @Nullable
    /* renamed from: b */
    private static List<String> m13242b(Bundle bundle) {
        List<String> list = null;
        if (bundle != null) {
            for (String a : bundle.keySet()) {
                list = C3486a.m13239a((List) list, C3486a.m13238a(bundle, a));
            }
        }
        return list;
    }

    @Nullable
    /* renamed from: c */
    private static List<String> m13244c(Bundle bundle) {
        if (bundle == null || C3486a.m13237a(bundle) <= 10240) {
            return null;
        }
        return C3486a.m13245c(String.format(Locale.US, "Extras too large: %d bytes is > the max (%d bytes)", new Object[]{Integer.valueOf(C3486a.m13237a(bundle)), Integer.valueOf(Task.EXTRAS_LIMIT_BYTES)}));
    }

    @Nullable
    /* renamed from: a */
    private static String m13238a(Bundle bundle, String str) {
        bundle = bundle.get(str);
        String str2 = null;
        if (!(bundle == null || (bundle instanceof Integer) || (bundle instanceof Long) || (bundle instanceof Double) || (bundle instanceof String))) {
            if (!(bundle instanceof Boolean)) {
                Locale locale = Locale.US;
                String str3 = "Received value of type '%s' for key '%s', but only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean";
                Object[] objArr = new Object[2];
                if (bundle != null) {
                    str2 = bundle.getClass();
                }
                objArr[0] = str2;
                objArr[1] = str;
                return String.format(locale, str3, objArr);
            }
        }
        return null;
    }

    @VisibleForTesting
    /* renamed from: a */
    List<String> m13246a(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                if (this.f10525a == null) {
                    return C3486a.m13245c("Context is null, can't query PackageManager");
                }
                PackageManager packageManager = this.f10525a.getPackageManager();
                if (packageManager == null) {
                    return C3486a.m13245c("PackageManager is null, can't validate service");
                }
                StringBuilder stringBuilder;
                Intent intent = new Intent("com.firebase.jobdispatcher.ACTION_EXECUTE");
                intent.setClassName(this.f10525a, str);
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null) {
                    if (!queryIntentServices.isEmpty()) {
                        for (ResolveInfo resolveInfo : queryIntentServices) {
                            if (resolveInfo.serviceInfo != null && resolveInfo.serviceInfo.enabled) {
                                return null;
                            }
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(" is disabled.");
                        return C3486a.m13245c(stringBuilder.toString());
                    }
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Couldn't find a registered service with the name ");
                stringBuilder.append(str);
                stringBuilder.append(". Is it declared in the manifest with the right intent-filter? If not, the job won't be started.");
                Log.e("FJD.GooglePlayReceiver", stringBuilder.toString());
                return null;
            }
        }
        return C3486a.m13245c("Service can't be empty");
    }

    /* renamed from: b */
    private static List<String> m13243b(String str) {
        if (str == null) {
            return C3486a.m13245c("Tag can't be null");
        }
        return str.length() > 100 ? C3486a.m13245c("Tag must be shorter than 100") : null;
    }

    @NonNull
    /* renamed from: c */
    private static List<String> m13245c(String str) {
        List arrayList = new ArrayList();
        arrayList.add(str);
        return arrayList;
    }
}
