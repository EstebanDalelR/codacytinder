package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class vf implements EtlEvent {
    /* renamed from: a */
    private Number f37608a;
    /* renamed from: b */
    private String f37609b;
    /* renamed from: c */
    private String f37610c;
    /* renamed from: d */
    private String f37611d;
    /* renamed from: e */
    private String f37612e;

    /* renamed from: com.tinder.etl.event.vf$a */
    public static class C9302a {
        /* renamed from: a */
        private vf f31387a;

        private C9302a() {
            this.f31387a = new vf();
        }

        /* renamed from: a */
        public final C9302a m38895a(Number number) {
            this.f31387a.f37608a = number;
            return this;
        }

        /* renamed from: a */
        public final C9302a m38896a(String str) {
            this.f31387a.f37609b = str;
            return this;
        }

        /* renamed from: b */
        public final C9302a m38898b(String str) {
            this.f31387a.f37610c = str;
            return this;
        }

        /* renamed from: c */
        public final C9302a m38899c(String str) {
            this.f31387a.f37612e = str;
            return this;
        }

        /* renamed from: a */
        public vf m38897a() {
            return this.f31387a;
        }
    }

    /* renamed from: com.tinder.etl.event.vf$b */
    public class C11531b extends fw {
        /* renamed from: a */
        final /* synthetic */ vf f37606a;

        /* renamed from: a */
        public String mo10346a() {
            return "SMSValidation.Action";
        }

        public C11531b(vf vfVar, Map<EtlField<?>, Object> map) {
            this.f37606a = vfVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.vf$c */
    private final class C11532c implements DescriptorFactory<C11531b, vf> {
        /* renamed from: a */
        final /* synthetic */ vf f37607a;

        private C11532c(vf vfVar) {
            this.f37607a = vfVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46623a((vf) etlEvent);
        }

        /* renamed from: a */
        public final C11531b m46623a(vf vfVar) {
            Map hashMap = new HashMap();
            if (vfVar.f37608a != null) {
                hashMap.put(new fv(), vfVar.f37608a);
            }
            if (vfVar.f37609b != null) {
                hashMap.put(new fx(), vfVar.f37609b);
            }
            if (vfVar.f37610c != null) {
                hashMap.put(new gw(), vfVar.f37610c);
            }
            if (vfVar.f37611d != null) {
                hashMap.put(new wy(), vfVar.f37611d);
            }
            if (vfVar.f37612e != null) {
                hashMap.put(new aaj(), vfVar.f37612e);
            }
            return new C11531b(this.f37607a, hashMap);
        }
    }

    private vf() {
    }

    /* renamed from: a */
    public static C9302a m46624a() {
        return new C9302a();
    }

    public final DescriptorFactory<C11531b, vf> getDescriptorFactory() {
        return new C11532c();
    }
}
