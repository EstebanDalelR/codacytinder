package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class dj implements EtlEvent {
    /* renamed from: a */
    private Number f36484a;
    /* renamed from: b */
    private String f36485b;
    /* renamed from: c */
    private String f36486c;
    /* renamed from: d */
    private Number f36487d;
    /* renamed from: e */
    private Number f36488e;
    /* renamed from: f */
    private String f36489f;

    /* renamed from: com.tinder.etl.event.dj$a */
    public static class C9042a {
        /* renamed from: a */
        private dj f31256a;

        private C9042a() {
            this.f31256a = new dj();
        }

        /* renamed from: a */
        public final C9042a m38068a(Number number) {
            this.f31256a.f36484a = number;
            return this;
        }

        /* renamed from: a */
        public final C9042a m38069a(String str) {
            this.f31256a.f36485b = str;
            return this;
        }

        /* renamed from: b */
        public final C9042a m38071b(String str) {
            this.f31256a.f36486c = str;
            return this;
        }

        /* renamed from: a */
        public dj m38070a() {
            return this.f31256a;
        }
    }

    /* renamed from: com.tinder.etl.event.dj$b */
    public class C11251b extends fw {
        /* renamed from: a */
        final /* synthetic */ dj f36482a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.ProfileInstagramSelect";
        }

        public C11251b(dj djVar, Map<EtlField<?>, Object> map) {
            this.f36482a = djVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.dj$c */
    private final class C11252c implements DescriptorFactory<C11251b, dj> {
        /* renamed from: a */
        final /* synthetic */ dj f36483a;

        private C11252c(dj djVar) {
            this.f36483a = djVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44674a((dj) etlEvent);
        }

        /* renamed from: a */
        public final C11251b m44674a(dj djVar) {
            Map hashMap = new HashMap();
            if (djVar.f36484a != null) {
                hashMap.put(new pr(), djVar.f36484a);
            }
            if (djVar.f36485b != null) {
                hashMap.put(new ov(), djVar.f36485b);
            }
            if (djVar.f36486c != null) {
                hashMap.put(new jj(), djVar.f36486c);
            }
            if (djVar.f36487d != null) {
                hashMap.put(new ny(), djVar.f36487d);
            }
            if (djVar.f36488e != null) {
                hashMap.put(new nx(), djVar.f36488e);
            }
            if (djVar.f36489f != null) {
                hashMap.put(new kb(), djVar.f36489f);
            }
            return new C11251b(this.f36483a, hashMap);
        }
    }

    private dj() {
    }

    /* renamed from: a */
    public static C9042a m44675a() {
        return new C9042a();
    }

    public final DescriptorFactory<C11251b, dj> getDescriptorFactory() {
        return new C11252c();
    }
}
