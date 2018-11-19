package com.tinder.chat.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class GifSelector_ViewBinding implements Unbinder {
    /* renamed from: b */
    private GifSelector f34352b;

    @UiThread
    public GifSelector_ViewBinding(GifSelector gifSelector, View view) {
        this.f34352b = gifSelector;
        gifSelector.gifRecycler = (RecyclerView) C0761c.b(view, R.id.gif_recycler, "field 'gifRecycler'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        GifSelector gifSelector = this.f34352b;
        if (gifSelector == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34352b = null;
        gifSelector.gifRecycler = null;
    }
}
