package com.tinder.places.card.view;

import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.views.CustomTextView;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "alpha", "", "dy", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlaceCardExpanded$toolbarCollapser$1 extends Lambda implements Function2<Float, Integer, C15813i> {
    /* renamed from: a */
    final /* synthetic */ C14184e f44951a;

    PlaceCardExpanded$toolbarCollapser$1(C14184e c14184e) {
        this.f44951a = c14184e;
        super(2);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        m53868a(((Number) obj).floatValue(), ((Number) obj2).intValue());
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53868a(float f, int i) {
        int i2 = 0;
        Object obj = f < ((float) null) ? 1 : null;
        CustomTextView customTextView = (CustomTextView) this.f44951a.m53897a(C6248a.titleTextMini);
        C2668g.a(customTextView, "titleTextMini");
        if (customTextView.getVisibility() == 0) {
            i2 = 1;
        }
        float f2 = 1.0f;
        if (obj != null) {
            CustomTextView customTextView2 = (CustomTextView) this.f44951a.m53897a(C6248a.titleTextMini);
            C2668g.a(customTextView2, "titleTextMini");
            if (i <= 0) {
                f2 = Math.max(-f, 0.2f);
            }
            customTextView2.setAlpha(f2);
            if (i2 == 0) {
                this.f44951a.m53892c();
                this.f44951a.m53896e();
                return;
            }
            return;
        }
        if (i >= 0) {
            f2 = Math.max(f, 0.2f);
        }
        CustomTextView customTextView3 = (CustomTextView) this.f44951a.m53897a(C6248a.titleTextViewExpanded);
        C2668g.a(customTextView3, "titleTextViewExpanded");
        customTextView3.setAlpha(f2);
        TextView textView = (TextView) this.f44951a.m53897a(C6248a.visitorCountTextViewExpanded);
        C2668g.a(textView, "visitorCountTextViewExpanded");
        textView.setAlpha(f2);
        if (i2 != 0) {
            this.f44951a.m53894d();
            this.f44951a.m53896e();
        }
    }
}
