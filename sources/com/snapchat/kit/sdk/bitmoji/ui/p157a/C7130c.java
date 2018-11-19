package com.snapchat.kit.sdk.bitmoji.ui.p157a;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5883d;
import com.snapchat.kit.sdk.bitmoji.models.TagTile;
import com.snapchat.kit.sdk.bitmoji.ui.controller.TagTilesViewController.OnTagTileSelectedListener;
import com.snapchat.kit.sdk.bitmoji.ui.view.TagTileView;
import com.snapchat.kit.sdk.bitmoji.ui.viewholder.C7134a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.a.c */
public class C7130c extends Adapter<C7134a> {
    /* renamed from: a */
    private final OnTagTileSelectedListener f25816a;
    /* renamed from: b */
    private List<TagTile> f25817b = new ArrayList();

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m30730a((C7134a) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m30729a(viewGroup, i);
    }

    public C7130c(OnTagTileSelectedListener onTagTileSelectedListener) {
        this.f25816a = onTagTileSelectedListener;
    }

    public long getItemId(int i) {
        return (long) ((TagTile) this.f25817b.get(i)).getTag().hashCode();
    }

    /* renamed from: a */
    public C7134a m30729a(ViewGroup viewGroup, int i) {
        return new C7134a((TagTileView) LayoutInflater.from(viewGroup.getContext()).inflate(C5883d.snap_connect_bitmoji_tag_tile, viewGroup, false), this.f25816a);
    }

    /* renamed from: a */
    public void m30730a(C7134a c7134a, int i) {
        c7134a.m30779a((TagTile) this.f25817b.get(i));
    }

    public int getItemCount() {
        return this.f25817b.size();
    }

    /* renamed from: a */
    public void m30731a(List<TagTile> list) {
        this.f25817b = list;
        notifyDataSetChanged();
    }
}
