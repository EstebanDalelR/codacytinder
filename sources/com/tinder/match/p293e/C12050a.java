package com.tinder.match.p293e;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;

/* renamed from: com.tinder.match.e.a */
public class C12050a extends ItemDecoration {
    /* renamed from: a */
    private int f39190a;

    public C12050a(int i) {
        this.f39190a = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(view) == null) {
            rect.left += this.f39190a;
        }
    }
}
