package com.tinder.views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tinder.R;
import com.tinder.managers.ManagerApp;

public class MatchListLayout extends FrameLayout {
    /* renamed from: a */
    private boolean f47789a = false;
    /* renamed from: b */
    private boolean f47790b = false;
    /* renamed from: c */
    private boolean f47791c = false;
    /* renamed from: d */
    private boolean f47792d = false;
    /* renamed from: e */
    private RecyclerView f47793e;

    public MatchListLayout(Context context) {
        super(context);
        m57906a();
    }

    public MatchListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m57906a();
    }

    public MatchListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m57906a();
    }

    /* renamed from: a */
    private void m57906a() {
        ManagerApp.e().inject(this);
        inflate(getContext(), R.layout.custom_match_list, this);
        this.f47793e = (RecyclerView) findViewById(R.id.match_list);
    }

    public RecyclerView getMatchList() {
        return this.f47793e;
    }
}
