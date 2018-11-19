package com.google.android.gms.internal;

public abstract class abc<MessageType extends zzfhe> implements zzfhk<MessageType> {
    /* renamed from: a */
    private static final abq f22873a = abq.m18839a();

    public final /* synthetic */ Object zzc(abk abk, abq abq) throws zzfge {
        zzfhe zzfhe = (zzfhe) zze(abk, abq);
        if (zzfhe == null || zzfhe.isInitialized()) {
            return zzfhe;
        }
        zzfim zzfim = zzfhe instanceof aaz ? new zzfim((aaz) zzfhe) : zzfhe instanceof abb ? new zzfim((abb) zzfhe) : new zzfim(zzfhe);
        throw zzfim.m20329a().m20323a(zzfhe);
    }
}
