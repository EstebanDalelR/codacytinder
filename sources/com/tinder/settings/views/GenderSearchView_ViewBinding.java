package com.tinder.settings.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class GenderSearchView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private GenderSearchView f51615b;
    /* renamed from: c */
    private View f51616c;

    @UiThread
    public GenderSearchView_ViewBinding(final GenderSearchView genderSearchView, View view) {
        this.f51615b = genderSearchView;
        genderSearchView.mGenderSearch = (SearchView) C0761c.b(view, R.id.gender_search, "field 'mGenderSearch'", SearchView.class);
        genderSearchView.mGenderList = (RecyclerView) C0761c.b(view, R.id.more_gender_list, "field 'mGenderList'", RecyclerView.class);
        genderSearchView.mProgressBar = (ProgressBar) C0761c.b(view, R.id.gender_progress, "field 'mProgressBar'", ProgressBar.class);
        genderSearchView.mSearchText = (TextView) C0761c.b(view, R.id.search_src_text, "field 'mSearchText'", TextView.class);
        View a = C0761c.a(view, R.id.back_container, "method 'onCancelClicked'");
        this.f51616c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ GenderSearchView_ViewBinding f51614b;

            public void doClick(View view) {
                genderSearchView.onCancelClicked();
            }
        });
        view = view.getContext().getResources();
        genderSearchView.mMaxSearchChars = view.getInteger(R.integer.search_gender_max_chars);
        genderSearchView.mSearchHint = view.getString(R.string.type_to_search_more_gender);
    }

    @CallSuper
    public void unbind() {
        GenderSearchView genderSearchView = this.f51615b;
        if (genderSearchView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51615b = null;
        genderSearchView.mGenderSearch = null;
        genderSearchView.mGenderList = null;
        genderSearchView.mProgressBar = null;
        genderSearchView.mSearchText = null;
        this.f51616c.setOnClickListener(null);
        this.f51616c = null;
    }
}
