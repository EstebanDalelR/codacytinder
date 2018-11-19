package com.tinder.recsads.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.recsads.NativeCardListener;
import com.tinder.recsads.model.C16464a;
import com.tinder.recsads.p466a.C16428a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
final class NativeDisplayRecCardView$a implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ NativeDisplayRecCardView f46337a;
    /* renamed from: b */
    final /* synthetic */ C16428a f46338b;

    NativeDisplayRecCardView$a(NativeDisplayRecCardView nativeDisplayRecCardView, C16428a c16428a) {
        this.f46337a = nativeDisplayRecCardView;
        this.f46338b = c16428a;
    }

    public final void onClick(View view) {
        for (NativeCardListener nativeCardListener : NativeDisplayRecCardView.a(this.f46337a)) {
            C16464a c16464a = (C16464a) this.f46338b.getItem();
            C2668g.a(c16464a, "recCard.item");
            nativeCardListener.onClickthroughClicked(c16464a);
        }
    }
}
