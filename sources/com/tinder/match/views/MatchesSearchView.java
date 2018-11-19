package com.tinder.match.views;

import android.content.Context;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.match.presenter.C9872m;
import com.tinder.match.target.MatchesSearchViewTarget;
import com.tinder.module.MatchesListComponentProvider;
import javax.inject.Inject;

public class MatchesSearchView extends FrameLayout implements MatchesSearchViewTarget {
    @Inject
    /* renamed from: a */
    C9872m f39265a;
    @BindView(2131363517)
    ImageView closeButton;
    @BindColor(2131100237)
    int disabledTextColor;
    @BindColor(2131099907)
    int enabledTextColor;
    @BindColor(2131099834)
    int grey;
    @BindView(2131362933)
    SearchView searchEntry;
    @BindString(2131821376)
    String searchHint;

    public enum State {
        SEARCH_ON,
        SEARCHING,
        SEARCH_OFF
    }

    /* renamed from: com.tinder.match.views.MatchesSearchView$1 */
    class C121041 implements OnQueryTextListener {
        /* renamed from: a */
        final /* synthetic */ MatchesSearchView f39264a;

        C121041(MatchesSearchView matchesSearchView) {
            this.f39264a = matchesSearchView;
        }

        public boolean onQueryTextSubmit(String str) {
            this.f39264a.f39265a.m40626e();
            return true;
        }

        public boolean onQueryTextChange(String str) {
            this.f39264a.f39265a.m40622a(str);
            return true;
        }
    }

    public MatchesSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((MatchesListComponentProvider) context).provideMatchesListComponent().inject(this);
        inflate(context, R.layout.matches_tab_search, this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Deadshot.take(this, this.f39265a);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void clearSearchState() {
        this.searchEntry.setQuery("", false);
        clearFocus();
    }

    public void clearSearchFocus() {
        clearFocus();
    }

    public void updateSearchQueryHint(long j) {
        this.searchEntry.setQueryHint(String.format(this.searchHint, new Object[]{Long.valueOf(j)}));
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
            this.f39265a.m40627f();
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public void setSearchListeners() {
        setClipToPadding(false);
        setClipChildren(false);
        this.searchEntry.setOnQueryTextFocusChangeListener(new C9895j(this));
        this.searchEntry.setOnQueryTextListener(new C121041(this));
        this.closeButton.setOnClickListener(new C9896k(this));
        this.searchEntry.setIconifiedByDefault(false);
        this.searchEntry.setIconified(false);
        this.searchEntry.setFocusable(false);
        clearFocus();
    }

    /* renamed from: a */
    final /* synthetic */ void m48225a(View view, boolean z) {
        if (z) {
            this.f39265a.m40625d();
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m48224a(View view) {
        this.f39265a.m40627f();
    }
}
