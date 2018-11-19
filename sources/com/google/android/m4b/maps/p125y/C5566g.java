package com.google.android.m4b.maps.p125y;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.m4b.maps.y.g */
public class C5566g {
    /* renamed from: a */
    private final String f20562a;

    /* renamed from: com.google.android.m4b.maps.y.g$a */
    public static final class C5565a {
        /* renamed from: a */
        private final C5566g f20560a;
        /* renamed from: b */
        private final String f20561b;

        private C5565a(C5566g c5566g, String str) {
            this.f20560a = c5566g;
            this.f20561b = (String) C5571j.m24292a((Object) str);
        }

        /* renamed from: a */
        public final StringBuilder m24264a(StringBuilder stringBuilder, Iterator<? extends Entry<?, ?>> it) {
            try {
                C5571j.m24292a((Object) stringBuilder);
                if (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    stringBuilder.append(this.f20560a.mo5818a(entry.getKey()));
                    stringBuilder.append(this.f20561b);
                    stringBuilder.append(this.f20560a.mo5818a(entry.getValue()));
                    while (it.hasNext()) {
                        stringBuilder.append(this.f20560a.f20562a);
                        entry = (Entry) it.next();
                        stringBuilder.append(this.f20560a.mo5818a(entry.getKey()));
                        stringBuilder.append(this.f20561b);
                        stringBuilder.append(this.f20560a.mo5818a(entry.getValue()));
                    }
                }
                return stringBuilder;
            } catch (StringBuilder stringBuilder2) {
                throw new AssertionError(stringBuilder2);
            }
        }
    }

    /* renamed from: a */
    public static C5566g m24266a(String str) {
        return new C5566g(str);
    }

    /* renamed from: a */
    public static C5566g m24265a(char c) {
        return new C5566g(String.valueOf(c));
    }

    private C5566g(String str) {
        this.f20562a = (String) C5571j.m24292a((Object) str);
    }

    private C5566g(C5566g c5566g) {
        this.f20562a = c5566g.f20562a;
    }

    /* renamed from: a */
    public final String m24269a(Iterable<?> iterable) {
        return m24272a(new StringBuilder(), iterable.iterator()).toString();
    }

    /* renamed from: a */
    public final String m24271a(Object[] objArr) {
        return m24269a(Arrays.asList(objArr));
    }

    /* renamed from: b */
    public C5566g mo5819b(final String str) {
        C5571j.m24292a((Object) str);
        return new C5566g(this, this) {
            /* renamed from: b */
            private /* synthetic */ C5566g f25401b;

            /* renamed from: a */
            final CharSequence mo5818a(Object obj) {
                return obj == null ? str : this.f25401b.mo5818a(obj);
            }

            /* renamed from: b */
            public final C5566g mo5819b(String str) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    /* renamed from: c */
    public final C5565a m24274c(String str) {
        return new C5565a(str);
    }

    /* renamed from: a */
    CharSequence mo5818a(Object obj) {
        C5571j.m24292a(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* renamed from: a */
    public final StringBuilder m24272a(StringBuilder stringBuilder, Iterator<?> it) {
        try {
            C5571j.m24292a((Object) stringBuilder);
            if (it.hasNext()) {
                stringBuilder.append(mo5818a(it.next()));
                while (it.hasNext()) {
                    stringBuilder.append(this.f20562a);
                    stringBuilder.append(mo5818a(it.next()));
                }
            }
            return stringBuilder;
        } catch (StringBuilder stringBuilder2) {
            throw new AssertionError(stringBuilder2);
        }
    }

    /* renamed from: a */
    public final String m24270a(final Object obj, final Object obj2, final Object... objArr) {
        C5571j.m24292a((Object) objArr);
        return m24269a(new AbstractList<Object>() {
            public final int size() {
                return objArr.length + 2;
            }

            public final Object get(int i) {
                switch (i) {
                    case 0:
                        return obj;
                    case 1:
                        return obj2;
                    default:
                        return objArr[i - 2];
                }
            }
        });
    }
}
