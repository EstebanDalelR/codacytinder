package com.tinder.recs.presenter;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "photoUrl", "", "call"}, k = 3, mv = {1, 1, 10})
final class RecsStatusPresenter$loadUserImage$2<T> implements Action1<String> {
    final /* synthetic */ RecsStatusPresenter this$0;

    RecsStatusPresenter$loadUserImage$2(RecsStatusPresenter recsStatusPresenter) {
        this.this$0 = recsStatusPresenter;
    }

    public final void call(@Nullable String str) {
        if (str != null) {
            this.this$0.getTarget$Tinder_release().showPhotoUrl(str);
        } else {
            this.this$0.getTarget$Tinder_release().showPlaceholderImage(this.this$0.placeholderImage());
        }
    }
}
