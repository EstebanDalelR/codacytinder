package com.tinder.cardstack.cardgrid.view;

import android.support.v7.widget.RecyclerView.ViewHolder;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 9})
final class SimpleCardItemAnimator$animateChange$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ C12646f f43507a;
    /* renamed from: b */
    final /* synthetic */ ViewHolder f43508b;
    /* renamed from: c */
    final /* synthetic */ ViewHolder f43509c;

    SimpleCardItemAnimator$animateChange$1(C12646f c12646f, ViewHolder viewHolder, ViewHolder viewHolder2) {
        this.f43507a = c12646f;
        this.f43508b = viewHolder;
        this.f43509c = viewHolder2;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53189a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53189a() {
        this.f43508b.setIsRecyclable(true);
        this.f43509c.setIsRecyclable(true);
        this.f43507a.dispatchAnimationFinished(this.f43508b);
        this.f43507a.dispatchAnimationFinished(this.f43509c);
    }
}
