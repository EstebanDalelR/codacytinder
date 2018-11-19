package com.tinder.recs;

import com.tinder.recs.view.BaseUserRecCardView;
import com.tinder.recs.view.TappyUserRecCardView.OnUserContentClickListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onUserContentClick"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.RecCardViewHolderFactory$TappyOnCardAtTopOfStackListener$onMovedToTop$1 */
final class C16391xd68f29e4 implements OnUserContentClickListener {
    final /* synthetic */ BaseUserRecCardView $view;
    final /* synthetic */ TappyOnCardAtTopOfStackListener this$0;

    C16391xd68f29e4(TappyOnCardAtTopOfStackListener tappyOnCardAtTopOfStackListener, BaseUserRecCardView baseUserRecCardView) {
        this.this$0 = tappyOnCardAtTopOfStackListener;
        this.$view = baseUserRecCardView;
    }

    public final void onUserContentClick() {
        this.this$0.getRecsView().onUserRecCardViewClick(this.$view);
    }
}
