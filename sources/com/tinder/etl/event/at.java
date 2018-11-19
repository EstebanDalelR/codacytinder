package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class at implements EtlEvent {
    /* renamed from: a */
    private Boolean f36205a;
    /* renamed from: b */
    private String f36206b;
    /* renamed from: c */
    private Boolean f36207c;
    /* renamed from: d */
    private Number f36208d;

    /* renamed from: com.tinder.etl.event.at$a */
    public static class C8980a {
        /* renamed from: a */
        private at f31225a;

        private C8980a() {
            this.f31225a = new at();
        }

        /* renamed from: a */
        public final C8980a m37841a(Boolean bool) {
            this.f31225a.f36205a = bool;
            return this;
        }

        /* renamed from: b */
        public final C8980a m37844b(Boolean bool) {
            this.f31225a.f36207c = bool;
            return this;
        }

        /* renamed from: a */
        public final C8980a m37842a(Number number) {
            this.f31225a.f36208d = number;
            return this;
        }

        /* renamed from: a */
        public at m37843a() {
            return this.f31225a;
        }
    }

    /* renamed from: com.tinder.etl.event.at$b */
    public class C11186b extends fw {
        /* renamed from: a */
        final /* synthetic */ at f36203a;

        /* renamed from: a */
        public String mo10346a() {
            return "App.Close";
        }

        public C11186b(at atVar, Map<EtlField<?>, Object> map) {
            this.f36203a = atVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.at$c */
    private final class C11187c implements DescriptorFactory<C11186b, at> {
        /* renamed from: a */
        final /* synthetic */ at f36204a;

        private C11187c(at atVar) {
            this.f36204a = atVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44168a((at) etlEvent);
        }

        /* renamed from: a */
        public final C11186b m44168a(at atVar) {
            Map hashMap = new HashMap();
            if (atVar.f36205a != null) {
                hashMap.put(new jq(), atVar.f36205a);
            }
            if (atVar.f36206b != null) {
                hashMap.put(new pe(), atVar.f36206b);
            }
            if (atVar.f36207c != null) {
                hashMap.put(new ux(), atVar.f36207c);
            }
            if (atVar.f36208d != null) {
                hashMap.put(new vt(), atVar.f36208d);
            }
            return new C11186b(this.f36204a, hashMap);
        }
    }

    private at() {
    }

    /* renamed from: a */
    public static C8980a m44169a() {
        return new C8980a();
    }

    public final DescriptorFactory<C11186b, at> getDescriptorFactory() {
        return new C11187c();
    }
}
