package com.tinder.fastmatch.view;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class FastMatchPreviewRowView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private FastMatchPreviewRowView f38126b;
    /* renamed from: c */
    private View f38127c;

    @UiThread
    public FastMatchPreviewRowView_ViewBinding(final FastMatchPreviewRowView fastMatchPreviewRowView, View view) {
        this.f38126b = fastMatchPreviewRowView;
        fastMatchPreviewRowView.matchCount = (TextView) C0761c.b(view, R.id.fast_match_likes_count, "field 'matchCount'", TextView.class);
        view = C0761c.a(view, R.id.new_match_row_container, "method 'onFastMatchPreviewClick'");
        this.f38127c = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ FastMatchPreviewRowView_ViewBinding f38125b;

            public void doClick(View view) {
                fastMatchPreviewRowView.onFastMatchPreviewClick();
            }
        });
    }

    public void unbind() {
        FastMatchPreviewRowView fastMatchPreviewRowView = this.f38126b;
        if (fastMatchPreviewRowView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f38126b = null;
        fastMatchPreviewRowView.matchCount = null;
        this.f38127c.setOnClickListener(null);
        this.f38127c = null;
    }
}
