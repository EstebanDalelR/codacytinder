package com.tinder.recsads.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.recsads.C14760n.C14758d;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
final class NativeVideoAdRecCard$b implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ NativeVideoAdRecCard f46341a;

    NativeVideoAdRecCard$b(NativeVideoAdRecCard nativeVideoAdRecCard) {
        this.f46341a = nativeVideoAdRecCard;
    }

    public final void onClick(View view) {
        view = view != null ? Integer.valueOf(view.getId()) : null;
        int i = C14758d.ads_card_play_pause_button;
        if (view != null) {
            if (view.intValue() == i) {
                this.f46341a.c();
                return;
            }
        }
        i = C14758d.ads_card_mute_button;
        if (view != null) {
            if (view.intValue() == i) {
                this.f46341a.d();
                return;
            }
        }
        i = C14758d.ads_card_click_through;
        if (view != null) {
            if (view.intValue() == i) {
                this.f46341a.b();
            }
        }
    }
}
