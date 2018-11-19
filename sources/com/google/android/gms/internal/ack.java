package com.google.android.gms.internal;

final class ack implements acp {
    /* renamed from: a */
    private acp[] f22890a;

    ack(acp... acpArr) {
        this.f22890a = acpArr;
    }

    /* renamed from: a */
    public final boolean mo4196a(Class<?> cls) {
        for (acp a : this.f22890a) {
            if (a.mo4196a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final aco mo4197b(Class<?> cls) {
        for (acp acp : this.f22890a) {
            if (acp.mo4196a(cls)) {
                return acp.mo4197b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
