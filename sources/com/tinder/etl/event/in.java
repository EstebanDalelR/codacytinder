package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class in implements EtlEvent {
    /* renamed from: a */
    private Number f36907a;
    /* renamed from: b */
    private String f36908b;
    /* renamed from: c */
    private Number f36909c;
    /* renamed from: d */
    private String f36910d;
    /* renamed from: e */
    private Number f36911e;
    /* renamed from: f */
    private Number f36912f;
    /* renamed from: g */
    private List f36913g;
    /* renamed from: h */
    private Number f36914h;
    /* renamed from: i */
    private String f36915i;
    /* renamed from: j */
    private List f36916j;

    /* renamed from: com.tinder.etl.event.in$a */
    public static class C9126a {
        /* renamed from: a */
        private in f31299a;

        private C9126a() {
            this.f31299a = new in();
        }

        /* renamed from: a */
        public final C9126a m38418a(Number number) {
            this.f31299a.f36907a = number;
            return this;
        }

        /* renamed from: a */
        public final C9126a m38419a(String str) {
            this.f31299a.f36908b = str;
            return this;
        }

        /* renamed from: b */
        public final C9126a m38422b(Number number) {
            this.f31299a.f36909c = number;
            return this;
        }

        /* renamed from: b */
        public final C9126a m38423b(String str) {
            this.f31299a.f36910d = str;
            return this;
        }

        /* renamed from: c */
        public final C9126a m38425c(Number number) {
            this.f31299a.f36911e = number;
            return this;
        }

        /* renamed from: d */
        public final C9126a m38427d(Number number) {
            this.f31299a.f36912f = number;
            return this;
        }

        /* renamed from: a */
        public final C9126a m38420a(List list) {
            this.f31299a.f36913g = list;
            return this;
        }

        /* renamed from: e */
        public final C9126a m38428e(Number number) {
            this.f31299a.f36914h = number;
            return this;
        }

        /* renamed from: c */
        public final C9126a m38426c(String str) {
            this.f31299a.f36915i = str;
            return this;
        }

        /* renamed from: b */
        public final C9126a m38424b(List list) {
            this.f31299a.f36916j = list;
            return this;
        }

        /* renamed from: a */
        public in m38421a() {
            return this.f31299a;
        }
    }

    /* renamed from: com.tinder.etl.event.in$b */
    public class C11342b extends fw {
        /* renamed from: a */
        final /* synthetic */ in f36905a;

        /* renamed from: a */
        public String mo10346a() {
            return "Gold.Select";
        }

        public C11342b(in inVar, Map<EtlField<?>, Object> map) {
            this.f36905a = inVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.in$c */
    private final class C11343c implements DescriptorFactory<C11342b, in> {
        /* renamed from: a */
        final /* synthetic */ in f36906a;

        private C11343c(in inVar) {
            this.f36906a = inVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45445a((in) etlEvent);
        }

        /* renamed from: a */
        public final C11342b m45445a(in inVar) {
            Map hashMap = new HashMap();
            if (inVar.f36907a != null) {
                hashMap.put(new bq(), inVar.f36907a);
            }
            if (inVar.f36908b != null) {
                hashMap.put(new ej(), inVar.f36908b);
            }
            if (inVar.f36909c != null) {
                hashMap.put(new kf(), inVar.f36909c);
            }
            if (inVar.f36910d != null) {
                hashMap.put(new lc(), inVar.f36910d);
            }
            if (inVar.f36911e != null) {
                hashMap.put(new pk(), inVar.f36911e);
            }
            if (inVar.f36912f != null) {
                hashMap.put(new pl(), inVar.f36912f);
            }
            if (inVar.f36913g != null) {
                hashMap.put(new rm(), inVar.f36913g);
            }
            if (inVar.f36914h != null) {
                hashMap.put(new sk(), inVar.f36914h);
            }
            if (inVar.f36915i != null) {
                hashMap.put(new wr(), inVar.f36915i);
            }
            if (inVar.f36916j != null) {
                hashMap.put(new ws(), inVar.f36916j);
            }
            return new C11342b(this.f36906a, hashMap);
        }
    }

    private in() {
    }

    /* renamed from: a */
    public static C9126a m45446a() {
        return new C9126a();
    }

    public final DescriptorFactory<C11342b, in> getDescriptorFactory() {
        return new C11343c();
    }
}
