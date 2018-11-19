package com.tinder.views;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;

public class ab extends ItemDecoration {
    /* renamed from: a */
    private int f52906a;

    public ab(int i) {
        this.f52906a = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(view) == null) {
            rect.top = this.f52906a;
            rect.bottom = this.f52906a / 2;
        } else if (recyclerView.getChildAdapterPosition(view) == recyclerView.getAdapter().getItemCount() - 1) {
            rect.top = this.f52906a / 2;
            rect.bottom = this.f52906a;
        } else {
            rect.top = this.f52906a / 2;
            rect.bottom = this.f52906a / 2;
        }
    }
}
