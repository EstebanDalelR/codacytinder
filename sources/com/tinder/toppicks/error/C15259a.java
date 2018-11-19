package com.tinder.toppicks.error;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.error.a */
final class C15259a implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ Function1 f47375a;

    C15259a(Function1 function1) {
        this.f47375a = function1;
    }

    public final /* synthetic */ void onClick(View view) {
        C2668g.a(this.f47375a.invoke(view), "invoke(...)");
    }
}
