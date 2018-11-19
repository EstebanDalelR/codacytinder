package com.tinder.reactions.navigation.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import com.tinder.reactions.navigation.view.ScrollListenerViewPagerInterface.OnScrollChangeListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J(\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0014J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/reactions/navigation/view/ScrollListenerViewPager;", "Landroid/support/v4/view/ViewPager;", "Lcom/tinder/reactions/navigation/view/ScrollListenerViewPagerInterface;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "scrollListeners", "", "Lcom/tinder/reactions/navigation/view/ScrollListenerViewPagerInterface$OnScrollChangeListener;", "addScrollListener", "", "listener", "onScrollChanged", "scrollX", "", "scrollY", "oldScrollX", "oldScrollY", "removeScrollListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ScrollListenerViewPager extends ViewPager implements ScrollListenerViewPagerInterface {
    /* renamed from: a */
    private final List<OnScrollChangeListener> f50935a = ((List) new ArrayList());

    public ScrollListenerViewPager(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        for (OnScrollChangeListener onScrollChange : this.f50935a) {
            onScrollChange.onScrollChange(this, i, i2, i3, i4);
        }
    }

    public void addScrollListener(@NotNull OnScrollChangeListener onScrollChangeListener) {
        C2668g.b(onScrollChangeListener, "listener");
        if (!this.f50935a.contains(onScrollChangeListener)) {
            this.f50935a.add(onScrollChangeListener);
        }
    }

    public void removeScrollListener(@NotNull OnScrollChangeListener onScrollChangeListener) {
        C2668g.b(onScrollChangeListener, "listener");
        this.f50935a.remove(onScrollChangeListener);
    }
}
