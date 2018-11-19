package com.snapchat.kit.sdk.bitmoji.ui.viewholder;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.View.OnClickListener;
import com.snapchat.kit.sdk.bitmoji.models.TagTile;
import com.snapchat.kit.sdk.bitmoji.ui.controller.TagTilesViewController.OnTagTileSelectedListener;
import com.snapchat.kit.sdk.bitmoji.ui.view.TagTileView;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.viewholder.a */
public class C7134a extends ViewHolder {
    /* renamed from: a */
    private final TagTileView f25866a;
    /* renamed from: b */
    private TagTile f25867b;

    public C7134a(final TagTileView tagTileView, final OnTagTileSelectedListener onTagTileSelectedListener) {
        super(tagTileView);
        this.f25866a = tagTileView;
        this.f25866a.setOnClickListener(new OnClickListener(this) {
            /* renamed from: c */
            final /* synthetic */ C7134a f21699c;

            public void onClick(View view) {
                onTagTileSelectedListener.onTagTileSelected(tagTileView, this.f21699c.f25867b);
            }
        });
    }

    /* renamed from: a */
    public void m30779a(TagTile tagTile) {
        this.f25867b = tagTile;
        this.f25866a.setText(tagTile.getTag());
        this.f25866a.setBackgroundColor(tagTile.getColor());
    }
}
