package com.tinder.paywall.paywallflow;

import android.app.Dialog;
import com.tinder.paywall.paywallflow.C10072h.C10071a;
import com.tinder.paywall.paywallflow.C10072h.C10071a.C10070a;
import rx.Observable;

/* renamed from: com.tinder.paywall.paywallflow.a */
final class C12268a extends C10071a {
    /* renamed from: a */
    private final Dialog f39688a;
    /* renamed from: b */
    private final Observable<String> f39689b;

    /* renamed from: com.tinder.paywall.paywallflow.a$a */
    static final class C12267a extends C10070a {
        /* renamed from: a */
        private Dialog f39686a;
        /* renamed from: b */
        private Observable<String> f39687b;

        C12267a() {
        }

        /* renamed from: a */
        public C10070a mo10704a(Dialog dialog) {
            this.f39686a = dialog;
            return this;
        }

        /* renamed from: a */
        public C10070a mo10705a(Observable<String> observable) {
            this.f39687b = observable;
            return this;
        }

        /* renamed from: a */
        public C10071a mo10706a() {
            String str = "";
            if (this.f39686a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" dialog");
                str = stringBuilder.toString();
            }
            if (this.f39687b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" purchaseAttemptObservable");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C12268a(this.f39686a, this.f39687b);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C12268a(Dialog dialog, Observable<String> observable) {
        this.f39688a = dialog;
        this.f39689b = observable;
    }

    /* renamed from: a */
    public Dialog mo10707a() {
        return this.f39688a;
    }

    /* renamed from: b */
    public Observable<String> mo10708b() {
        return this.f39689b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PaywallComponents{dialog=");
        stringBuilder.append(this.f39688a);
        stringBuilder.append(", purchaseAttemptObservable=");
        stringBuilder.append(this.f39689b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10071a)) {
            return false;
        }
        C10071a c10071a = (C10071a) obj;
        if (!this.f39688a.equals(c10071a.mo10707a()) || this.f39689b.equals(c10071a.mo10708b()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f39688a.hashCode() ^ 1000003) * 1000003) ^ this.f39689b.hashCode();
    }
}
