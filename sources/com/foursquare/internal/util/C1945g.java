package com.foursquare.internal.util;

import android.support.annotation.NonNull;
import android.support.v4.util.C0559j;
import android.util.Pair;

/* renamed from: com.foursquare.internal.util.g */
public final class C1945g {
    @NonNull
    /* renamed from: a */
    private static final Func1 f5225a = new C35011();
    @NonNull
    /* renamed from: b */
    private static final Func2 f5226b = new C35022();
    @NonNull
    /* renamed from: c */
    private static final Func2 f5227c = new C35033();

    /* renamed from: com.foursquare.internal.util.g$1 */
    class C35011 implements Func1 {
        public Object call(Object obj) {
            return obj;
        }

        C35011() {
        }
    }

    /* renamed from: com.foursquare.internal.util.g$2 */
    class C35022 implements Func2 {
        C35022() {
        }

        public Object call(Object obj, Object obj2) {
            return new C0559j(obj, obj2);
        }
    }

    /* renamed from: com.foursquare.internal.util.g$3 */
    class C35033 implements Func2 {
        C35033() {
        }

        public Object call(Object obj, Object obj2) {
            return new Pair(obj, obj2);
        }
    }

    @NonNull
    /* renamed from: a */
    public static <T> Func1<T, T> m6834a() {
        return f5225a;
    }
}
