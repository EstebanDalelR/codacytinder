package com.foursquare.internal.network;

import com.foursquare.api.types.FoursquareType;
import com.foursquare.api.types.ResponseV2;
import com.foursquare.api.types.ResponseV2.Meta;
import java.lang.ref.WeakReference;

/* renamed from: com.foursquare.internal.network.a */
public abstract class C1919a<T extends FoursquareType> {
    /* renamed from: a */
    private String f5151a;

    /* renamed from: com.foursquare.internal.network.a$b */
    public static class C1917b {
        /* renamed from: a */
        private WeakReference<Request<?>> f5147a;
        /* renamed from: b */
        private Meta f5148b;
        /* renamed from: c */
        private String f5149c;
        /* renamed from: d */
        private int f5150d;

        public C1917b(String str, int i) {
            this.f5149c = str;
            this.f5150d = i;
        }

        /* renamed from: a */
        public void m6679a(Meta meta) {
            this.f5148b = meta;
        }

        /* renamed from: a */
        public void m6680a(Request<?> request) {
            this.f5147a = new WeakReference(request);
        }
    }

    /* renamed from: com.foursquare.internal.network.a$a */
    public static abstract class C3499a<T extends FoursquareType> extends C1919a<T> {
        public void onFail(String str, FoursquareError foursquareError, String str2, ResponseV2<T> responseV2, Request<T> request) {
        }

        public void onFinish(String str) {
        }

        public void onStart(String str) {
        }

        public void onSuccess(T t, C1917b c1917b) {
        }
    }

    public abstract void onFail(String str, FoursquareError foursquareError, String str2, ResponseV2<T> responseV2, Request<T> request);

    public abstract void onFinish(String str);

    public abstract void onStart(String str);

    public abstract void onSuccess(T t, C1917b c1917b);

    public final String getId() {
        return this.f5151a;
    }

    public final void setId(String str) {
        this.f5151a = str;
    }

    /* renamed from: a */
    void m6685a(String str) {
        onStart(str);
    }

    /* renamed from: b */
    void m6687b(String str) {
        onFinish(str);
    }

    /* renamed from: a */
    void m6684a(T t, C1917b c1917b) {
        onSuccess(t, c1917b);
    }

    /* renamed from: a */
    void m6686a(String str, FoursquareError foursquareError, String str2, ResponseV2<T> responseV2, Request<T> request) {
        onFail(str, foursquareError, str2, responseV2, request);
    }
}
