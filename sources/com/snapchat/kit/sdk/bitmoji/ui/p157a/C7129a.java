package com.snapchat.kit.sdk.bitmoji.ui.p157a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5883d;
import com.snapchat.kit.sdk.bitmoji.models.Sticker;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5886c;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5889h;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5891c;
import com.snapchat.kit.sdk.bitmoji.ui.viewholder.StickerViewHolder;
import com.snapchat.kit.sdk.bitmoji.ui.viewholder.StickerViewHolder.OnStickerClickListener;
import com.snapchat.kit.sdk.bitmoji.ui.viewholder.StickerViewHolder.OnStickerLoadListener;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import javax.inject.Inject;
import javax.inject.Named;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.a.a */
public class C7129a extends Adapter<StickerViewHolder> implements OnStickerClickListener, OnStickerLoadListener {
    /* renamed from: a */
    private final C5886c f25808a;
    /* renamed from: b */
    private final C5891c f25809b;
    /* renamed from: c */
    private final C5891c f25810c;
    /* renamed from: d */
    private final Picasso f25811d;
    /* renamed from: e */
    private List<Sticker> f25812e = new ArrayList();
    /* renamed from: f */
    private WeakHashMap<StickerViewHolder, Void> f25813f = new WeakHashMap();
    /* renamed from: g */
    private C5889h f25814g = C5889h.POPULAR;
    /* renamed from: h */
    private String f25815h;

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m30727a((StickerViewHolder) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m30724a(viewGroup, i);
    }

    public /* synthetic */ void onViewRecycled(ViewHolder viewHolder) {
        m30726a((StickerViewHolder) viewHolder);
    }

    @Inject
    C7129a(C5886c c5886c, @Named("perceived:first_render") C5891c c5891c, @Named("perceived:first_render_grid") C5891c c5891c2, Picasso picasso) {
        this.f25808a = c5886c;
        this.f25809b = c5891c;
        this.f25810c = c5891c2;
        this.f25811d = picasso;
    }

    /* renamed from: a */
    public void m30726a(StickerViewHolder stickerViewHolder) {
        this.f25813f.remove(stickerViewHolder);
        stickerViewHolder.m30776b();
    }

    /* renamed from: a */
    public StickerViewHolder m30724a(ViewGroup viewGroup, int i) {
        return new StickerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C5883d.snap_connect_bitmoji_sticker, viewGroup, false), this.f25811d, this, this);
    }

    /* renamed from: a */
    public void m30727a(StickerViewHolder stickerViewHolder, int i) {
        stickerViewHolder.m30775a((Sticker) this.f25812e.get(i));
    }

    public int getItemCount() {
        return this.f25812e.size();
    }

    public long getItemId(int i) {
        return (long) ((Sticker) this.f25812e.get(i)).hashCode();
    }

    public void onStickerClick(StickerViewHolder stickerViewHolder, Sticker sticker) {
        if (stickerViewHolder.m30777c()) {
            this.f25808a.m25408a(sticker, this.f25814g, this.f25815h);
        } else if (this.f25813f.containsKey(stickerViewHolder) != null) {
            m30723b();
        }
    }

    public void onStickerLoadSuccess(StickerViewHolder stickerViewHolder, Sticker sticker) {
        if (this.f25809b.m25431d() != null) {
            this.f25809b.m25429b();
        }
        if (this.f25810c.m25431d() != null) {
            this.f25810c.m25429b();
        }
        this.f25813f.remove(stickerViewHolder);
    }

    public void onStickerLoadFailure(StickerViewHolder stickerViewHolder, Sticker sticker) {
        this.f25813f.put(stickerViewHolder, null);
    }

    /* renamed from: a */
    public void m30728a(@NonNull Collection<Sticker> collection, @NonNull C5889h c5889h, @Nullable String str) {
        this.f25812e = new ArrayList(collection);
        this.f25814g = c5889h;
        this.f25815h = str;
        m30725a();
    }

    @VisibleForTesting
    /* renamed from: a */
    protected void m30725a() {
        notifyDataSetChanged();
    }

    /* renamed from: b */
    private void m30723b() {
        for (StickerViewHolder a : this.f25813f.keySet()) {
            a.m30774a();
        }
    }
}
