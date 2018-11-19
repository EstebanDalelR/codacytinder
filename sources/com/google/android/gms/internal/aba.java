package com.google.android.gms.internal;

import java.io.IOException;

public abstract class aba<MessageType extends aaz<MessageType, BuilderType>, BuilderType extends aba<MessageType, BuilderType>> implements zzfhf {
    /* renamed from: a */
    public abstract BuilderType mo7505a();

    /* renamed from: a */
    protected abstract BuilderType mo7506a(MessageType messageType);

    /* renamed from: a */
    public abstract BuilderType mo7507a(abk abk, abq abq) throws IOException;

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo7505a();
    }

    public /* synthetic */ zzfhf zzb(abk abk, abq abq) throws IOException {
        return mo7507a(abk, abq);
    }

    public final /* synthetic */ zzfhf zzd(zzfhe zzfhe) {
        if (zzcxq().getClass().isInstance(zzfhe)) {
            return mo7506a((aaz) zzfhe);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
