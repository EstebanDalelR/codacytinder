package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class mj implements EtlEvent {
    /* renamed from: a */
    private String f37106a;
    /* renamed from: b */
    private String f37107b;
    /* renamed from: c */
    private Boolean f37108c;
    /* renamed from: d */
    private Number f37109d;
    /* renamed from: e */
    private Number f37110e;
    /* renamed from: f */
    private List f37111f;
    /* renamed from: g */
    private String f37112g;

    /* renamed from: com.tinder.etl.event.mj$a */
    public static class C9178a {
        /* renamed from: a */
        private mj f31325a;

        private C9178a() {
            this.f31325a = new mj();
        }

        /* renamed from: a */
        public final C9178a m38565a(String str) {
            this.f31325a.f37106a = str;
            return this;
        }

        /* renamed from: b */
        public final C9178a m38569b(String str) {
            this.f31325a.f37107b = str;
            return this;
        }

        /* renamed from: a */
        public final C9178a m38563a(Boolean bool) {
            this.f31325a.f37108c = bool;
            return this;
        }

        /* renamed from: a */
        public final C9178a m38564a(Number number) {
            this.f31325a.f37109d = number;
            return this;
        }

        /* renamed from: b */
        public final C9178a m38568b(Number number) {
            this.f31325a.f37110e = number;
            return this;
        }

        /* renamed from: a */
        public final C9178a m38566a(List list) {
            this.f31325a.f37111f = list;
            return this;
        }

        /* renamed from: a */
        public mj m38567a() {
            return this.f31325a;
        }
    }

    /* renamed from: com.tinder.etl.event.mj$b */
    public class C11398b extends fw {
        /* renamed from: a */
        final /* synthetic */ mj f37104a;

        /* renamed from: a */
        public String mo10346a() {
            return "MerchandisingPage.View";
        }

        public C11398b(mj mjVar, Map<EtlField<?>, Object> map) {
            this.f37104a = mjVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.mj$c */
    private final class C11399c implements DescriptorFactory<C11398b, mj> {
        /* renamed from: a */
        final /* synthetic */ mj f37105a;

        private C11399c(mj mjVar) {
            this.f37105a = mjVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45789a((mj) etlEvent);
        }

        /* renamed from: a */
        public final C11398b m45789a(mj mjVar) {
            Map hashMap = new HashMap();
            if (mjVar.f37106a != null) {
                hashMap.put(new ej(), mjVar.f37106a);
            }
            if (mjVar.f37107b != null) {
                hashMap.put(new lc(), mjVar.f37107b);
            }
            if (mjVar.f37108c != null) {
                hashMap.put(new iz(), mjVar.f37108c);
            }
            if (mjVar.f37109d != null) {
                hashMap.put(new mh(), mjVar.f37109d);
            }
            if (mjVar.f37110e != null) {
                hashMap.put(new mi(), mjVar.f37110e);
            }
            if (mjVar.f37111f != null) {
                hashMap.put(new jf(), mjVar.f37111f);
            }
            if (mjVar.f37112g != null) {
                hashMap.put(new ia(), mjVar.f37112g);
            }
            return new C11398b(this.f37105a, hashMap);
        }
    }

    private mj() {
    }

    /* renamed from: a */
    public static C9178a m45790a() {
        return new C9178a();
    }

    public final DescriptorFactory<C11398b, mj> getDescriptorFactory() {
        return new C11399c();
    }
}
