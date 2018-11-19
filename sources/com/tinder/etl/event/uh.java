package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class uh implements EtlEvent {
    /* renamed from: a */
    private String f37537a;
    /* renamed from: b */
    private String f37538b;
    /* renamed from: c */
    private String f37539c;
    /* renamed from: d */
    private Boolean f37540d;
    /* renamed from: e */
    private String f37541e;
    /* renamed from: f */
    private String f37542f;
    /* renamed from: g */
    private String f37543g;
    /* renamed from: h */
    private String f37544h;
    /* renamed from: i */
    private String f37545i;
    /* renamed from: j */
    private String f37546j;

    /* renamed from: com.tinder.etl.event.uh$a */
    public static class C9290a {
        /* renamed from: a */
        private uh f31381a;

        private C9290a() {
            this.f31381a = new uh();
        }

        /* renamed from: a */
        public final C9290a m38841a(String str) {
            this.f31381a.f37541e = str;
            return this;
        }

        /* renamed from: b */
        public final C9290a m38843b(String str) {
            this.f31381a.f37542f = str;
            return this;
        }

        /* renamed from: c */
        public final C9290a m38844c(String str) {
            this.f31381a.f37543g = str;
            return this;
        }

        /* renamed from: d */
        public final C9290a m38845d(String str) {
            this.f31381a.f37544h = str;
            return this;
        }

        /* renamed from: a */
        public uh m38842a() {
            return this.f31381a;
        }
    }

    /* renamed from: com.tinder.etl.event.uh$b */
    public class C11518b extends fw {
        /* renamed from: a */
        final /* synthetic */ uh f37535a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.Report";
        }

        public C11518b(uh uhVar, Map<EtlField<?>, Object> map) {
            this.f37535a = uhVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.uh$c */
    private final class C11519c implements DescriptorFactory<C11518b, uh> {
        /* renamed from: a */
        final /* synthetic */ uh f37536a;

        private C11519c(uh uhVar) {
            this.f37536a = uhVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46498a((uh) etlEvent);
        }

        /* renamed from: a */
        public final C11518b m46498a(uh uhVar) {
            Map hashMap = new HashMap();
            if (uhVar.f37537a != null) {
                hashMap.put(new C11401o(), uhVar.f37537a);
            }
            if (uhVar.f37538b != null) {
                hashMap.put(new bp(), uhVar.f37538b);
            }
            if (uhVar.f37539c != null) {
                hashMap.put(new eq(), uhVar.f37539c);
            }
            if (uhVar.f37540d != null) {
                hashMap.put(new hj(), uhVar.f37540d);
            }
            if (uhVar.f37541e != null) {
                hashMap.put(new ov(), uhVar.f37541e);
            }
            if (uhVar.f37542f != null) {
                hashMap.put(new oq(), uhVar.f37542f);
            }
            if (uhVar.f37543g != null) {
                hashMap.put(new qb(), uhVar.f37543g);
            }
            if (uhVar.f37544h != null) {
                hashMap.put(new th(), uhVar.f37544h);
            }
            if (uhVar.f37545i != null) {
                hashMap.put(new uv(), uhVar.f37545i);
            }
            if (uhVar.f37546j != null) {
                hashMap.put(new uw(), uhVar.f37546j);
            }
            return new C11518b(this.f37536a, hashMap);
        }
    }

    private uh() {
    }

    /* renamed from: a */
    public static C9290a m46499a() {
        return new C9290a();
    }

    public final DescriptorFactory<C11518b, uh> getDescriptorFactory() {
        return new C11519c();
    }
}
