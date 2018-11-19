package com.facebook.ads.internal.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.p041h.C1427q;

/* renamed from: com.facebook.ads.internal.view.d */
public interface C1604d {

    /* renamed from: com.facebook.ads.internal.view.d$a */
    public interface C1603a {
        /* renamed from: a */
        void mo1645a(View view);

        /* renamed from: a */
        void mo1646a(String str);

        /* renamed from: a */
        void mo1647a(String str, C1427q c1427q);
    }

    /* renamed from: a */
    void mo1823a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity);

    /* renamed from: a */
    void mo1824a(Bundle bundle);

    /* renamed from: h */
    void mo1825h();

    /* renamed from: i */
    void mo1826i();

    void onDestroy();

    void setListener(C1603a c1603a);
}
