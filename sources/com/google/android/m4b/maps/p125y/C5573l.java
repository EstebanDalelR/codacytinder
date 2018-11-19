package com.google.android.m4b.maps.p125y;

import java.io.Serializable;
import java.util.Collection;

/* renamed from: com.google.android.m4b.maps.y.l */
public final class C5573l {
    /* renamed from: a */
    private static final C5566g f20570a = C5566g.m24265a(',');

    /* renamed from: com.google.android.m4b.maps.y.l$a */
    static class C6851a<T> implements C5572k<T>, Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final Collection<?> f25402a;

        private C6851a(Collection<?> collection) {
            this.f25402a = (Collection) C5571j.m24292a((Object) collection);
        }

        /* renamed from: a */
        public final boolean mo5815a(T r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = 0;
            r1 = r2.f25402a;	 Catch:{ NullPointerException -> 0x0009, ClassCastException -> 0x0008 }
            r3 = r1.contains(r3);	 Catch:{ NullPointerException -> 0x0009, ClassCastException -> 0x0008 }
            return r3;
        L_0x0008:
            return r0;
        L_0x0009:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.y.l.a.a(java.lang.Object):boolean");
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C6851a)) {
                return null;
            }
            return this.f25402a.equals(((C6851a) obj).f25402a);
        }

        public final int hashCode() {
            return this.f25402a.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Predicates.in(");
            stringBuilder.append(this.f25402a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.y.l$b */
    static class C6852b<T> implements C5572k<T>, Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final T f25403a;

        private C6852b(T t) {
            this.f25403a = t;
        }

        /* renamed from: a */
        public final boolean mo5815a(T t) {
            return this.f25403a.equals(t);
        }

        public final int hashCode() {
            return this.f25403a.hashCode();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C6852b)) {
                return null;
            }
            return this.f25403a.equals(((C6852b) obj).f25403a);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Predicates.equalTo(");
            stringBuilder.append(this.f25403a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.y.l$c */
    static class C6853c<T> implements C5572k<T>, Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private C5572k<T> f25404a;

        C6853c(C5572k<T> c5572k) {
            this.f25404a = (C5572k) C5571j.m24292a((Object) c5572k);
        }

        /* renamed from: a */
        public final boolean mo5815a(T t) {
            return this.f25404a.mo5815a(t) == null ? true : null;
        }

        public final int hashCode() {
            return this.f25404a.hashCode() ^ -1;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C6853c)) {
                return null;
            }
            return this.f25404a.equals(((C6853c) obj).f25404a);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Predicates.not(");
            stringBuilder.append(this.f25404a.toString());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.y.l$d */
    enum C6854d implements C5572k<Object> {
        ALWAYS_TRUE {
            /* renamed from: a */
            public final boolean mo5815a(Object obj) {
                return true;
            }

            public final String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE {
            /* renamed from: a */
            public final boolean mo5815a(Object obj) {
                return false;
            }

            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL {
            /* renamed from: a */
            public final boolean mo5815a(Object obj) {
                return obj == null;
            }

            public final String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL {
            /* renamed from: a */
            public final boolean mo5815a(Object obj) {
                return obj != null;
            }

            public final String toString() {
                return "Predicates.notNull()";
            }
        };
    }

    /* renamed from: a */
    public static <T> C5572k<T> m24305a(C5572k<T> c5572k) {
        return new C6853c(c5572k);
    }

    /* renamed from: a */
    public static <T> C5572k<T> m24307a(Collection<? extends T> collection) {
        return new C6851a(collection);
    }

    /* renamed from: a */
    public static <T> C5572k<T> m24306a(T t) {
        if (t == null) {
            return C6854d.IS_NULL;
        }
        return new C6852b(t);
    }
}
