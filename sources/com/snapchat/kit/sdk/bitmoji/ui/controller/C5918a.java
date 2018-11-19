package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5880a;
import javax.inject.Inject;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.a */
public class C5918a implements OnLayoutChangeListener {
    /* renamed from: a */
    private final Context f21666a;
    /* renamed from: b */
    private final int f21667b;

    @Inject
    C5918a(Context context) {
        this.f21666a = context;
        this.f21667b = context.getResources().getDimensionPixelSize(C5880a.snap_connect_bitmoji_sticker_min_width);
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        RecyclerView recyclerView = (RecyclerView) view;
        i7 -= i5;
        i3 -= i;
        if (recyclerView.getLayoutManager() == 0 || i7 != i3) {
            m25505b(recyclerView);
        }
    }

    /* renamed from: a */
    public void m25504a(final RecyclerView recyclerView) {
        recyclerView.addOnLayoutChangeListener(this);
        recyclerView.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C5918a f21665b;

            public void run() {
                this.f21665b.m25505b(recyclerView);
            }
        });
    }

    /* renamed from: b */
    public void m25505b(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new GridLayoutManager(this.f21666a, Math.max(recyclerView.getWidth() / this.f21667b, 4)));
    }
}
