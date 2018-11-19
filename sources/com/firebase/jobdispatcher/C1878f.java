package com.firebase.jobdispatcher;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.firebase.jobdispatcher.C1885m.C3493a;
import com.firebase.jobdispatcher.C1885m.C3494b;

/* renamed from: com.firebase.jobdispatcher.f */
final class C1878f {
    /* renamed from: a */
    private final C1881j f5111a = new C1881j("com.firebase.jobdispatcher.");

    /* renamed from: a */
    private static int m6592a(int i) {
        return i != 2 ? 0 : 1;
    }

    /* renamed from: b */
    private static int m6596b(int i) {
        int i2 = 2;
        if ((i & 2) == 2) {
            i2 = 0;
        }
        return (i & 1) == 1 ? 1 : i2;
    }

    C1878f() {
    }

    /* renamed from: a */
    private static void m6595a(JobParameters jobParameters, Bundle bundle, C3494b c3494b) {
        bundle.putInt("trigger_type", 1);
        if (jobParameters.isRecurring() != null) {
            bundle.putLong("period", (long) c3494b.m13274b());
            bundle.putLong("period_flex", (long) (c3494b.m13274b() - c3494b.m13273a()));
            return;
        }
        bundle.putLong("window_start", (long) c3494b.m13273a());
        bundle.putLong("window_end", (long) c3494b.m13274b());
    }

    /* renamed from: a */
    private static void m6593a(Bundle bundle) {
        bundle.putInt("trigger_type", 2);
        bundle.putLong("window_start", 0);
        bundle.putLong("window_end", 1);
    }

    /* renamed from: a */
    private static void m6594a(Bundle bundle, C3493a c3493a) {
        bundle.putInt("trigger_type", 3);
        int size = c3493a.m13272a().size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Uri[size];
        for (int i = 0; i < size; i++) {
            ObservedUri observedUri = (ObservedUri) c3493a.m13272a().get(i);
            iArr[i] = observedUri.m6576b();
            parcelableArr[i] = observedUri.m6575a();
        }
        bundle.putIntArray("content_uri_flags_array", iArr);
        bundle.putParcelableArray("content_uri_array", parcelableArr);
    }

    /* renamed from: a */
    public Bundle m6600a(JobParameters jobParameters, Bundle bundle) {
        bundle.putString("tag", jobParameters.getTag());
        bundle.putBoolean("update_current", jobParameters.shouldReplaceCurrent());
        bundle.putBoolean("persisted", jobParameters.getLifetime() == 2);
        bundle.putString("service", GooglePlayReceiver.class.getName());
        C1878f.m6598c(jobParameters, bundle);
        C1878f.m6599d(jobParameters, bundle);
        C1878f.m6597b(jobParameters, bundle);
        Bundle extras = jobParameters.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        bundle.putBundle("extras", this.f5111a.m6609a(jobParameters, extras));
        return bundle;
    }

    /* renamed from: b */
    private static void m6597b(JobParameters jobParameters, Bundle bundle) {
        jobParameters = jobParameters.getRetryStrategy();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("retry_policy", C1878f.m6592a(jobParameters.m6577a()));
        bundle2.putInt("initial_backoff_seconds", jobParameters.m6578b());
        bundle2.putInt("maximum_backoff_seconds", jobParameters.m6579c());
        bundle.putBundle("retryStrategy", bundle2);
    }

    /* renamed from: c */
    private static void m6598c(JobParameters jobParameters, Bundle bundle) {
        C1885m trigger = jobParameters.getTrigger();
        if (trigger == C1886n.f5129a) {
            C1878f.m6593a(bundle);
        } else if (trigger instanceof C3494b) {
            C1878f.m6595a(jobParameters, bundle, (C3494b) trigger);
        } else if ((trigger instanceof C3493a) != null) {
            C1878f.m6594a(bundle, (C3493a) trigger);
        } else {
            bundle = new StringBuilder();
            bundle.append("Unknown trigger: ");
            bundle.append(trigger.getClass());
            throw new IllegalArgumentException(bundle.toString());
        }
    }

    /* renamed from: d */
    private static void m6599d(JobParameters jobParameters, Bundle bundle) {
        jobParameters = Constraint.m6562a(jobParameters.getConstraints());
        boolean z = false;
        bundle.putBoolean("requiresCharging", (jobParameters & 4) == 4);
        String str = "requiresIdle";
        if ((jobParameters & 8) == 8) {
            z = true;
        }
        bundle.putBoolean(str, z);
        bundle.putInt("requiredNetwork", C1878f.m6596b(jobParameters));
    }
}
