package com.tinder.recs.view;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/recs/view/RecProfileView$onAttachedToWindow$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Lcom/tinder/recs/view/RecProfileView;)V", "onGlobalLayout", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecProfileView$onAttachedToWindow$1 implements OnGlobalLayoutListener {
    final /* synthetic */ RecProfileView this$0;

    RecProfileView$onAttachedToWindow$1(RecProfileView recProfileView) {
        this.this$0 = recProfileView;
    }

    public void onGlobalLayout() {
        this.this$0.getProfileView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View profilePhotosView = this.this$0.getProfileView().getProfilePhotosView();
        C2668g.a(profilePhotosView, "profileView.profilePhotosView");
        profilePhotosView.setVisibility(4);
        this.this$0.getProfileView().setOnExitClickListener(new RecProfileView$onAttachedToWindow$1$onGlobalLayout$1(this));
        this.this$0.getProfileView().setOnPhotoPageChangeListener(this.this$0.pageChangeListener);
    }
}
