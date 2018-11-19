package com.tinder.match.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.match.adapter.C3941d;
import com.tinder.match.p293e.C12050a;
import com.tinder.match.presenter.C13431s;
import com.tinder.match.target.NewMatchesTarget;
import com.tinder.match.viewmodel.NewMatchListItem;
import com.tinder.module.MatchesListComponentProvider;
import java.util.List;
import javax.inject.Inject;

public class NewMatchesView extends LinearLayout implements NewMatchesTarget {
    @Inject
    /* renamed from: a */
    C13431s f39270a;
    /* renamed from: b */
    private C3941d f39271b;
    @BindDimen(2131166204)
    int listLeftMargin;
    @BindView(2131362992)
    TextView newMatchesCount;
    @BindView(2131362993)
    RecyclerView newMatchesRecyclerView;

    /* renamed from: com.tinder.match.views.NewMatchesView$a */
    private static class C13467a extends LinearLayoutManager {
        C13467a(Context context, int i, boolean z) {
            super(context, i, z);
        }
    }

    public NewMatchesView(Context context) {
        super(context);
        ((MatchesListComponentProvider) context).provideMatchesListComponent().inject(this);
        inflate(context, R.layout.new_matches_list, this);
        ButterKnife.a(this);
        m48232a();
    }

    public void displayNewMatches(@NonNull List<NewMatchListItem> list) {
        this.f39271b.a(list);
    }

    public void displayFastMatchPreview(NewMatchListItem newMatchListItem) {
        this.f39271b.a(0, newMatchListItem);
    }

    public void displayUntouchedMatchCount(@NonNull String str) {
        this.newMatchesCount.setVisibility(0);
        this.newMatchesCount.setText(str);
    }

    public void hideUntouchedMatchCount() {
        this.newMatchesCount.setVisibility(8);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39270a.a(this);
        if (this.f39271b.getItemCount() == 0) {
            this.f39270a.m51922b();
        }
        this.f39270a.m51923c();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39270a.a();
    }

    /* renamed from: a */
    private void m48232a() {
        setOrientation(1);
        this.f39271b = new C3941d();
        this.newMatchesRecyclerView.setItemAnimator(new DefaultItemAnimator());
        this.newMatchesRecyclerView.setLayoutManager(new C13467a(getContext(), 0, false));
        this.newMatchesRecyclerView.setAdapter(this.f39271b);
        this.newMatchesRecyclerView.addItemDecoration(new C12050a(this.listLeftMargin));
    }
}
