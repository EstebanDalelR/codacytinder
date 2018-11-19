package com.tinder.chat.adapter;

import com.tinder.chat.view.model.C8498n;
import com.tinder.domain.message.Gif;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class GifSelectorAdapter$onBindViewHolder$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ C10520e f43515a;
    /* renamed from: b */
    final /* synthetic */ Gif f43516b;
    /* renamed from: c */
    final /* synthetic */ int f43517c;

    GifSelectorAdapter$onBindViewHolder$1(C10520e c10520e, Gif gif, int i) {
        this.f43515a = c10520e;
        this.f43516b = gif;
        this.f43517c = i;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53206a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53206a() {
        this.f43515a.f34203b.onNext(new C8498n(this.f43516b, this.f43517c));
    }
}
