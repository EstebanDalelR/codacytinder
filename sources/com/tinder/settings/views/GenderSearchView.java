package com.tinder.settings.views;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindInt;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.tinder.R;
import com.tinder.managers.ManagerApp;
import com.tinder.settings.adapters.MoreGenderSearchAdapter;
import com.tinder.settings.listeners.MoreGenderSearchOnClickListener;
import com.tinder.settings.presenter.C18076p;
import com.tinder.settings.targets.MoreGenderSearchViewTarget;
import com.tinder.utils.av;
import java.util.List;
import javax.inject.Inject;

public class GenderSearchView extends LinearLayout implements MoreGenderSearchOnClickListener, MoreGenderSearchViewTarget {
    @Inject
    /* renamed from: a */
    C18076p f51608a;
    /* renamed from: b */
    private MoreGenderSearchAdapter f51609b;
    /* renamed from: c */
    private Unbinder f51610c;
    @Nullable
    /* renamed from: d */
    private OnGenderSelectedListener f51611d;
    /* renamed from: e */
    private String f51612e;
    @BindView(2131362967)
    RecyclerView mGenderList;
    @BindView(2131362614)
    SearchView mGenderSearch;
    @BindInt(2131427350)
    int mMaxSearchChars;
    @BindView(2131362613)
    ProgressBar mProgressBar;
    @BindString(2131822059)
    String mSearchHint;
    @BindView(2131363528)
    TextView mSearchText;

    public interface OnGenderSelectedListener {
        void moreGenderSelected(@Nullable String str);
    }

    /* renamed from: com.tinder.settings.views.GenderSearchView$1 */
    class C166851 implements OnQueryTextListener {
        /* renamed from: a */
        final /* synthetic */ GenderSearchView f51607a;

        C166851(GenderSearchView genderSearchView) {
            this.f51607a = genderSearchView;
        }

        public boolean onQueryTextSubmit(String str) {
            this.f51607a.mGenderSearch.clearFocus();
            return true;
        }

        public boolean onQueryTextChange(String str) {
            this.f51607a.mProgressBar.setVisibility(0);
            this.f51607a.f51609b.m62052a();
            this.f51607a.f51608a.m65598a(str);
            return true;
        }
    }

    /* renamed from: com.tinder.settings.views.GenderSearchView$a */
    private static class C18080a extends LinearLayoutManager {
        C18080a(Context context) {
            super(context);
        }
    }

    public GenderSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ManagerApp.e().inject(this);
        inflate(context, R.layout.view_more_gender_search, this);
    }

    @OnClick({2131361916})
    public void onCancelClicked() {
        if (this.f51611d != null) {
            this.f51611d.moreGenderSelected(null);
        }
        av.a(this.mSearchText.getWindowToken(), (Activity) getContext());
    }

    public void setGenderList(@NonNull List<String> list) {
        this.f51609b.m62055a((List) list);
        this.mProgressBar.setVisibility(8);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f51610c = ButterKnife.a(this);
        m62162a();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51608a.a(this);
    }

    public void onGenderSelected(String str) {
        this.f51612e = str;
        if (this.f51611d != null) {
            this.f51611d.moreGenderSelected(this.f51612e);
        }
        av.a(this.mSearchText.getWindowToken(), (Activity) getContext());
    }

    /* renamed from: a */
    private void m62162a() {
        this.mGenderSearch.setQueryHint(this.mSearchHint);
        this.mGenderSearch.requestFocus();
        this.mGenderSearch.setIconifiedByDefault(false);
        this.mGenderSearch.setOnQueryTextListener(new C166851(this));
        this.mGenderSearch.setFocusable(true);
        this.f51609b = new MoreGenderSearchAdapter();
        this.f51609b.m62054a((MoreGenderSearchOnClickListener) this);
        this.mGenderList.setLayoutManager(new C18080a(getContext()));
        this.mGenderList.setAdapter(this.f51609b);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51608a.a();
        if (this.f51610c != null) {
            this.f51610c.unbind();
        }
    }

    public void setListener(@Nullable OnGenderSelectedListener onGenderSelectedListener) {
        this.f51611d = onGenderSelectedListener;
    }
}
