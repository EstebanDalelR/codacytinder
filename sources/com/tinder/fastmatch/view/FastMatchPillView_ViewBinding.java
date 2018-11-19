package com.tinder.fastmatch.view;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class FastMatchPillView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private FastMatchPillView f38122b;

    @UiThread
    public FastMatchPillView_ViewBinding(FastMatchPillView fastMatchPillView, View view) {
        this.f38122b = fastMatchPillView;
        fastMatchPillView.likeCountText = (TextView) C0761c.b(view, R.id.fast_match_pill_count, "field 'likeCountText'", TextView.class);
        fastMatchPillView.shadowPillCount = (TextView) C0761c.b(view, R.id.shadow_fast_match_pill_count, "field 'shadowPillCount'", TextView.class);
    }

    public void unbind() {
        FastMatchPillView fastMatchPillView = this.f38122b;
        if (fastMatchPillView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f38122b = null;
        fastMatchPillView.likeCountText = null;
        fastMatchPillView.shadowPillCount = null;
    }
}
