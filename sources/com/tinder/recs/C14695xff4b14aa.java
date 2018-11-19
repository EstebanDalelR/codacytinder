package com.tinder.recs;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.recs.view.BaseUserRecCardView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.RecCardViewHolderFactory$OnCardAtTopOfCardStackListener$onMovedToTop$1 */
final class C14695xff4b14aa implements OnClickListener {
    final /* synthetic */ BaseUserRecCardView $view;
    final /* synthetic */ OnCardAtTopOfCardStackListener this$0;

    C14695xff4b14aa(OnCardAtTopOfCardStackListener onCardAtTopOfCardStackListener, BaseUserRecCardView baseUserRecCardView) {
        this.this$0 = onCardAtTopOfCardStackListener;
        this.$view = baseUserRecCardView;
    }

    public final void onClick(View view) {
        this.this$0.getRecsView().onUserRecCardViewClick(this.$view);
    }
}
