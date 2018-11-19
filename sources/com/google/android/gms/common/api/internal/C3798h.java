package com.google.android.gms.common.api.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.tasks.C4500a;
import com.google.android.gms.tasks.C4501b;
import com.google.android.gms.tasks.OnCompleteListener;

/* renamed from: com.google.android.gms.common.api.internal.h */
final class C3798h implements OnCompleteListener<TResult> {
    /* renamed from: a */
    private /* synthetic */ C4501b f11999a;
    /* renamed from: b */
    private /* synthetic */ C2477f f12000b;

    C3798h(C2477f c2477f, C4501b c4501b) {
        this.f12000b = c2477f;
        this.f11999a = c4501b;
    }

    public final void onComplete(@NonNull C4500a<TResult> c4500a) {
        this.f12000b.f7536b.remove(this.f11999a);
    }
}
