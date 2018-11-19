package com.tinder.recs.view;

import com.tinder.profile.view.BasicInfoView.OnExitClickListener;
import com.tinder.recs.view.RecProfileView.OnRecProfileExitClickedListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/recs/view/RecProfileView$onAttachedToWindow$1$onGlobalLayout$1", "Lcom/tinder/profile/view/BasicInfoView$OnExitClickListener;", "(Lcom/tinder/recs/view/RecProfileView$onAttachedToWindow$1;)V", "onExitViewClick", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecProfileView$onAttachedToWindow$1$onGlobalLayout$1 implements OnExitClickListener {
    final /* synthetic */ RecProfileView$onAttachedToWindow$1 this$0;

    RecProfileView$onAttachedToWindow$1$onGlobalLayout$1(RecProfileView$onAttachedToWindow$1 recProfileView$onAttachedToWindow$1) {
        this.this$0 = recProfileView$onAttachedToWindow$1;
    }

    public void onExitViewClick() {
        OnRecProfileExitClickedListener access$getOnRecProfileExitClickedListener$p = this.this$0.this$0.onRecProfileExitClickedListener;
        if (access$getOnRecProfileExitClickedListener$p != null) {
            access$getOnRecProfileExitClickedListener$p.onRecProfileExitClicked(this.this$0.this$0.getBoundData());
        }
        this.this$0.this$0.exit();
    }
}
