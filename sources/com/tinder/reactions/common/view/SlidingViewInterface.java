package com.tinder.reactions.common.view;

import android.view.View;
import com.tinder.reactions.drawer.model.C14635a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/reactions/common/view/SlidingViewInterface;", "", "getSlidingViewSingle", "Lrx/Single;", "Lcom/tinder/reactions/drawer/model/SlidingView;", "getView", "Landroid/view/View;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface SlidingViewInterface {
    @NotNull
    Single<C14635a> getSlidingViewSingle();

    @NotNull
    View getView();
}
