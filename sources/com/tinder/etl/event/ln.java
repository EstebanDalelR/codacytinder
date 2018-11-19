package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ln implements EtlEvent {
    /* renamed from: a */
    private Boolean f37028a;
    /* renamed from: b */
    private String f37029b;
    /* renamed from: c */
    private Boolean f37030c;
    /* renamed from: d */
    private Boolean f37031d;

    /* renamed from: com.tinder.etl.event.ln$a */
    public static class C9162a {
        /* renamed from: a */
        private ln f31317a;

        private C9162a() {
            this.f31317a = new ln();
        }

        /* renamed from: a */
        public final C9162a m38519a(Boolean bool) {
            this.f31317a.f37028a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9162a m38520a(String str) {
            this.f31317a.f37029b = str;
            return this;
        }

        /* renamed from: b */
        public final C9162a m38522b(Boolean bool) {
            this.f31317a.f37030c = bool;
            return this;
        }

        /* renamed from: a */
        public ln m38521a() {
            return this.f31317a;
        }
    }

    /* renamed from: com.tinder.etl.event.ln$b */
    public class C11381b extends fw {
        /* renamed from: a */
        final /* synthetic */ ln f37026a;

        /* renamed from: a */
        public String mo10346a() {
            return "Match.KeepPlaying";
        }

        public C11381b(ln lnVar, Map<EtlField<?>, Object> map) {
            this.f37026a = lnVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ln$c */
    private final class C11382c implements DescriptorFactory<C11381b, ln> {
        /* renamed from: a */
        final /* synthetic */ ln f37027a;

        private C11382c(ln lnVar) {
            this.f37027a = lnVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45667a((ln) etlEvent);
        }

        /* renamed from: a */
        public final C11381b m45667a(ln lnVar) {
            Map hashMap = new HashMap();
            if (lnVar.f37028a != null) {
                hashMap.put(new ev(), lnVar.f37028a);
            }
            if (lnVar.f37029b != null) {
                hashMap.put(new ll(), lnVar.f37029b);
            }
            if (lnVar.f37030c != null) {
                hashMap.put(new xh(), lnVar.f37030c);
            }
            if (lnVar.f37031d != null) {
                hashMap.put(new yh(), lnVar.f37031d);
            }
            return new C11381b(this.f37027a, hashMap);
        }
    }

    private ln() {
    }

    /* renamed from: a */
    public static C9162a m45668a() {
        return new C9162a();
    }

    public final DescriptorFactory<C11381b, ln> getDescriptorFactory() {
        return new C11382c();
    }
}
