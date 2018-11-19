package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5882c;
import com.snapchat.kit.sdk.bitmoji.models.TagTile;
import com.snapchat.kit.sdk.bitmoji.ui.p157a.C7130c;
import com.snapchat.kit.sdk.bitmoji.ui.view.TagTileView;
import java.util.List;

public class TagTilesViewController {
    /* renamed from: a */
    private final Context f21659a;
    /* renamed from: b */
    private final View f21660b;
    /* renamed from: c */
    private final View f21661c = this.f21660b.findViewById(C5882c.snap_connect_bitmoji_no_tag_results);
    /* renamed from: d */
    private final RecyclerView f21662d = ((RecyclerView) this.f21660b.findViewById(C5882c.snap_connect_bitmoji_tag_tiles_view));
    /* renamed from: e */
    private final C7130c f21663e;

    public interface OnTagTileSelectedListener {
        void onTagTileSelected(TagTileView tagTileView, TagTile tagTile);
    }

    TagTilesViewController(Context context, View view, OnTagTileSelectedListener onTagTileSelectedListener) {
        this.f21659a = context;
        this.f21660b = view;
        this.f21663e = new C7130c(onTagTileSelectedListener);
    }

    /* renamed from: a */
    public void m25501a() {
        this.f21663e.setHasStableIds(true);
        this.f21662d.setAdapter(this.f21663e);
        this.f21662d.setLayoutManager(new LinearLayoutManager(this.f21659a, 0, false));
    }

    /* renamed from: a */
    public void m25503a(List<TagTile> list, boolean z) {
        this.f21663e.m30731a(list);
        this.f21661c.setVisibility(list.isEmpty() != null ? null : 8);
        if (z) {
            this.f21662d.scrollToPosition(0);
        }
    }

    /* renamed from: a */
    public void m25502a(int i) {
        this.f21660b.setTranslationY((float) i);
    }
}
