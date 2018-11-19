package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class tz implements EtlEvent {
    /* renamed from: a */
    private Boolean f37381a;
    /* renamed from: b */
    private String f37382b;
    /* renamed from: c */
    private String f37383c;
    /* renamed from: d */
    private String f37384d;
    /* renamed from: e */
    private String f37385e;
    /* renamed from: f */
    private String f37386f;

    /* renamed from: com.tinder.etl.event.tz$a */
    public static class C9272a {
        /* renamed from: a */
        private tz f31372a;

        private C9272a() {
            this.f31372a = new tz();
        }

        /* renamed from: a */
        public final C9272a m38753a(Boolean bool) {
            this.f31372a.f37381a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9272a m38754a(String str) {
            this.f31372a.f37382b = str;
            return this;
        }

        /* renamed from: b */
        public final C9272a m38756b(String str) {
            this.f31372a.f37384d = str;
            return this;
        }

        /* renamed from: a */
        public tz m38755a() {
            return this.f31372a;
        }
    }

    /* renamed from: com.tinder.etl.event.tz$b */
    public class C11499b extends fw {
        /* renamed from: a */
        final /* synthetic */ tz f37379a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.Listen";
        }

        public C11499b(tz tzVar, Map<EtlField<?>, Object> map) {
            this.f37379a = tzVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.tz$c */
    private final class C11500c implements DescriptorFactory<C11499b, tz> {
        /* renamed from: a */
        final /* synthetic */ tz f37380a;

        private C11500c(tz tzVar) {
            this.f37380a = tzVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46254a((tz) etlEvent);
        }

        /* renamed from: a */
        public final C11499b m46254a(tz tzVar) {
            Map hashMap = new HashMap();
            if (tzVar.f37381a != null) {
                hashMap.put(new as(), tzVar.f37381a);
            }
            if (tzVar.f37382b != null) {
                hashMap.put(new ba(), tzVar.f37382b);
            }
            if (tzVar.f37383c != null) {
                hashMap.put(new ov(), tzVar.f37383c);
            }
            if (tzVar.f37384d != null) {
                hashMap.put(new wv(), tzVar.f37384d);
            }
            if (tzVar.f37385e != null) {
                hashMap.put(new ze(), tzVar.f37385e);
            }
            if (tzVar.f37386f != null) {
                hashMap.put(new zf(), tzVar.f37386f);
            }
            return new C11499b(this.f37380a, hashMap);
        }
    }

    private tz() {
    }

    /* renamed from: a */
    public static C9272a m46255a() {
        return new C9272a();
    }

    public final DescriptorFactory<C11499b, tz> getDescriptorFactory() {
        return new C11500c();
    }
}
