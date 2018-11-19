package com.tinder.grandgesturessdk.common.interfaces;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/grandgesturessdk/common/interfaces/LayoutChangedInterface;", "", "getLayoutChangedObservable", "Lrx/Observable;", "Landroid/view/View;", "getView", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface LayoutChangedInterface {
    @NotNull
    Observable<View> getLayoutChangedObservable();

    @NotNull
    View getView();
}
