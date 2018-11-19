package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public interface MediationAdapter {

    /* renamed from: com.google.android.gms.ads.mediation.MediationAdapter$a */
    public static class C2417a {
        /* renamed from: a */
        private int f7333a;

        /* renamed from: a */
        public final Bundle m8765a() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.f7333a);
            return bundle;
        }

        /* renamed from: a */
        public final C2417a m8766a(int i) {
            this.f7333a = 1;
            return this;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
