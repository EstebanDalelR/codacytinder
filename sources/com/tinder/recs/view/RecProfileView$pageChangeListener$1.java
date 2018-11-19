package com.tinder.recs.view;

import com.tinder.base.view.listener.OnPhotoPageChangeListener;
import com.tinder.recs.view.RecProfileView.Listener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"com/tinder/recs/view/RecProfileView$pageChangeListener$1", "Lcom/tinder/base/view/listener/OnPhotoPageChangeListener;", "(Lcom/tinder/recs/view/RecProfileView;)V", "onPhotoPageChange", "", "photoUrl", "", "position", "", "totalCount", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecProfileView$pageChangeListener$1 implements OnPhotoPageChangeListener {
    final /* synthetic */ RecProfileView this$0;

    RecProfileView$pageChangeListener$1(RecProfileView recProfileView) {
        this.this$0 = recProfileView;
    }

    public void onPhotoPageChange(@NotNull String str, int i, int i2) {
        C2668g.b(str, "photoUrl");
        Listener access$getListener$p = this.this$0.listener;
        if (access$getListener$p != null) {
            access$getListener$p.onPhotoChanged(i, i2, this.this$0.getBoundData());
        }
        this.this$0.getPlaceholderImageView().loadImageUrl(str);
        this.this$0.getPlaceholderImageView().updateActivePage(i);
    }
}
