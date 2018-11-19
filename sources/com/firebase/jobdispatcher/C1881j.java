package com.firebase.jobdispatcher;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.firebase.jobdispatcher.C1885m.C3493a;
import com.firebase.jobdispatcher.C1885m.C3494b;
import com.firebase.jobdispatcher.C3492k.C1883a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.firebase.jobdispatcher.j */
final class C1881j {
    /* renamed from: a */
    private final String f5113a;

    C1881j(String str) {
        this.f5113a = str;
    }

    @NonNull
    /* renamed from: a */
    Bundle m6609a(@NonNull JobParameters jobParameters, @NonNull Bundle bundle) {
        if (bundle == null) {
            throw new IllegalArgumentException("Unexpected null Bundle provided");
        }
        Bundle extras = jobParameters.getExtras();
        if (extras != null) {
            bundle.putAll(extras);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5113a);
        stringBuilder.append("persistent");
        bundle.putInt(stringBuilder.toString(), jobParameters.getLifetime());
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5113a);
        stringBuilder.append("recurring");
        bundle.putBoolean(stringBuilder.toString(), jobParameters.isRecurring());
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5113a);
        stringBuilder.append("replace_current");
        bundle.putBoolean(stringBuilder.toString(), jobParameters.shouldReplaceCurrent());
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5113a);
        stringBuilder.append("tag");
        bundle.putString(stringBuilder.toString(), jobParameters.getTag());
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5113a);
        stringBuilder.append("service");
        bundle.putString(stringBuilder.toString(), jobParameters.getService());
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5113a);
        stringBuilder.append("constraints");
        bundle.putInt(stringBuilder.toString(), Constraint.m6562a(jobParameters.getConstraints()));
        m6606a(jobParameters.getTrigger(), bundle);
        m6605a(jobParameters.getRetryStrategy(), bundle);
        return bundle;
    }

    /* renamed from: a */
    C3492k m6610a(@NonNull Bundle bundle) {
        if (bundle == null) {
            Log.e("FJD.ExternalReceiver", "Unexpected null Bundle provided");
            return null;
        }
        Bundle bundle2 = bundle.getBundle("extras");
        if (bundle2 == null) {
            return null;
        }
        C1883a b = m6611b(bundle2);
        bundle = bundle.getParcelableArrayList("triggered_uris");
        if (bundle != null) {
            b.m6626a(new C1887o(bundle));
        }
        return b.m6630a();
    }

    @Nullable
    /* renamed from: b */
    public C1883a m6611b(@NonNull Bundle bundle) {
        if (bundle == null) {
            throw new IllegalArgumentException("Unexpected null Bundle provided");
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle = new StringBuilder();
        bundle.append(this.f5113a);
        bundle.append("recurring");
        boolean z = bundle2.getBoolean(bundle.toString());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5113a);
        stringBuilder.append("replace_current");
        boolean z2 = bundle2.getBoolean(stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.f5113a);
        stringBuilder2.append("persistent");
        int i = bundle2.getInt(stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(this.f5113a);
        stringBuilder3.append("constraints");
        int[] a = Constraint.m6563a(bundle2.getInt(stringBuilder3.toString()));
        C1885m c = m6607c(bundle2);
        RetryStrategy d = m6608d(bundle2);
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(this.f5113a);
        stringBuilder4.append("tag");
        String string = bundle2.getString(stringBuilder4.toString());
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(this.f5113a);
        stringBuilder5.append("service");
        String string2 = bundle2.getString(stringBuilder5.toString());
        if (!(string == null || string2 == null || c == null)) {
            if (d != null) {
                C1883a c1883a = new C1883a();
                c1883a.m6627a(string);
                c1883a.m6631b(string2);
                c1883a.m6625a(c);
                c1883a.m6624a(d);
                c1883a.m6628a(z);
                c1883a.m6622a(i);
                c1883a.m6629a(a);
                c1883a.m6632b(z2);
                if (TextUtils.isEmpty(this.f5113a) == null) {
                    bundle = bundle2.keySet().iterator();
                    while (bundle.hasNext()) {
                        if (((String) bundle.next()).startsWith(this.f5113a)) {
                            bundle.remove();
                        }
                    }
                }
                c1883a.m6623a(bundle2);
                return c1883a;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: c */
    private C1885m m6607c(Bundle bundle) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5113a);
        stringBuilder.append("trigger_type");
        switch (bundle.getInt(stringBuilder.toString())) {
            case 1:
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.f5113a);
                stringBuilder.append("window_start");
                int i = bundle.getInt(stringBuilder.toString());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(this.f5113a);
                stringBuilder2.append("window_end");
                return C1886n.m6643a(i, bundle.getInt(stringBuilder2.toString()));
            case 2:
                return C1886n.f5129a;
            case 3:
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.f5113a);
                stringBuilder.append("observed_uris");
                return C1886n.m6642a(Collections.unmodifiableList(C1881j.m6604a(bundle.getString(stringBuilder.toString()))));
            default:
                if (Log.isLoggable("FJD.ExternalReceiver", 3) != null) {
                    Log.d("FJD.ExternalReceiver", "Unsupported trigger.");
                }
                return null;
        }
    }

    /* renamed from: a */
    private void m6606a(C1885m c1885m, Bundle bundle) {
        if (c1885m == C1886n.f5129a) {
            c1885m = new StringBuilder();
            c1885m.append(this.f5113a);
            c1885m.append("trigger_type");
            bundle.putInt(c1885m.toString(), 2);
        } else if (c1885m instanceof C3494b) {
            C3494b c3494b = (C3494b) c1885m;
            r0 = new StringBuilder();
            r0.append(this.f5113a);
            r0.append("trigger_type");
            bundle.putInt(r0.toString(), 1);
            r0 = new StringBuilder();
            r0.append(this.f5113a);
            r0.append("window_start");
            bundle.putInt(r0.toString(), c3494b.m13273a());
            r0 = new StringBuilder();
            r0.append(this.f5113a);
            r0.append("window_end");
            bundle.putInt(r0.toString(), c3494b.m13274b());
        } else if (c1885m instanceof C3493a) {
            r0 = new StringBuilder();
            r0.append(this.f5113a);
            r0.append("trigger_type");
            bundle.putInt(r0.toString(), 3);
            c1885m = C1881j.m6603a(((C3493a) c1885m).m13272a());
            r0 = new StringBuilder();
            r0.append(this.f5113a);
            r0.append("observed_uris");
            bundle.putString(r0.toString(), c1885m);
        } else {
            throw new IllegalArgumentException("Unsupported trigger.");
        }
    }

    /* renamed from: d */
    private RetryStrategy m6608d(Bundle bundle) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5113a);
        stringBuilder.append("retry_policy");
        int i = bundle.getInt(stringBuilder.toString());
        if (i != 1 && i != 2) {
            return RetryStrategy.f5100a;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.f5113a);
        stringBuilder2.append("initial_backoff_seconds");
        int i2 = bundle.getInt(stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(this.f5113a);
        stringBuilder3.append("maximum_backoff_seconds");
        return new RetryStrategy(i, i2, bundle.getInt(stringBuilder3.toString()));
    }

    /* renamed from: a */
    private void m6605a(RetryStrategy retryStrategy, Bundle bundle) {
        if (retryStrategy == null) {
            retryStrategy = RetryStrategy.f5100a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5113a);
        stringBuilder.append("retry_policy");
        bundle.putInt(stringBuilder.toString(), retryStrategy.m6577a());
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5113a);
        stringBuilder.append("initial_backoff_seconds");
        bundle.putInt(stringBuilder.toString(), retryStrategy.m6578b());
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5113a);
        stringBuilder.append("maximum_backoff_seconds");
        bundle.putInt(stringBuilder.toString(), retryStrategy.m6579c());
    }

    @NonNull
    /* renamed from: a */
    private static String m6603a(@NonNull List<ObservedUri> list) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (ObservedUri observedUri : list) {
            jSONArray.put(observedUri.m6576b());
            jSONArray2.put(observedUri.m6575a());
        }
        try {
            jSONObject.put("uri_flags", jSONArray);
            jSONObject.put("uris", jSONArray2);
            return jSONObject.toString();
        } catch (List<ObservedUri> list2) {
            throw new RuntimeException(list2);
        }
    }

    @NonNull
    /* renamed from: a */
    private static List<ObservedUri> m6604a(@NonNull String str) {
        List<ObservedUri> arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            str = jSONObject.getJSONArray("uri_flags");
            JSONArray jSONArray = jSONObject.getJSONArray("uris");
            int length = str.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(new ObservedUri(Uri.parse(jSONArray.getString(i)), str.getInt(i)));
            }
            return arrayList;
        } catch (String str2) {
            throw new RuntimeException(str2);
        }
    }
}
