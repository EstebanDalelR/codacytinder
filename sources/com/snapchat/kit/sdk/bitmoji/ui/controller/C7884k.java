package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewStub;
import android.view.ViewStub.OnInflateListener;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5880a;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5882c;
import com.snapchat.kit.sdk.bitmoji.OnBitmojiSearchFocusChangeListener;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.FragmentScope;
import com.snapchat.kit.sdk.bitmoji.models.Sticker;
import com.snapchat.kit.sdk.bitmoji.models.TagTile;
import com.snapchat.kit.sdk.bitmoji.models.TagTileFactory;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5887d;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5889h;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5891c;
import com.snapchat.kit.sdk.bitmoji.search.C5909d;
import com.snapchat.kit.sdk.bitmoji.search.PrefixTagSearchEngine;
import com.snapchat.kit.sdk.bitmoji.search.PrefixTagSearchEngine.TagResultsCallback;
import com.snapchat.kit.sdk.bitmoji.ui.controller.BitmojiTagResultsViewController.OnTagResultsDismissListener;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C5925j.C5924a;
import com.snapchat.kit.sdk.bitmoji.ui.controller.HideableNavbarOffsetController.OnNavbarOffsetChangeListener;
import com.snapchat.kit.sdk.bitmoji.ui.controller.TagTilesViewController.OnTagTileSelectedListener;
import com.snapchat.kit.sdk.bitmoji.ui.p157a.C7129a;
import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import com.snapchat.kit.sdk.bitmoji.ui.view.TagTileView;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

@FragmentScope
/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.k */
public class C7884k implements OnFocusChangeListener, OnInflateListener, TagResultsCallback, OnTagResultsDismissListener, FullScreenViewController, OnNavbarOffsetChangeListener, OnTagTileSelectedListener, C5924a {
    /* renamed from: a */
    private final Context f28452a;
    /* renamed from: b */
    private final C5927a f28453b;
    /* renamed from: c */
    private final PrefixTagSearchEngine f28454c;
    /* renamed from: d */
    private final C7129a f28455d;
    /* renamed from: e */
    private final BitmojiTagResultsViewController f28456e;
    /* renamed from: f */
    private final C5918a f28457f;
    /* renamed from: g */
    private final C5891c f28458g;
    /* renamed from: h */
    private final C5887d f28459h;
    /* renamed from: i */
    private final OnBitmojiSearchFocusChangeListener f28460i;
    /* renamed from: j */
    private RecyclerView f28461j;
    /* renamed from: k */
    private C5925j f28462k;
    /* renamed from: l */
    private TagTilesViewController f28463l;
    /* renamed from: m */
    private HideableNavbarOffsetController f28464m;
    /* renamed from: n */
    private List<Sticker> f28465n;
    /* renamed from: o */
    private List<TagTile> f28466o;
    /* renamed from: p */
    private C5909d f28467p = null;
    /* renamed from: q */
    private boolean f28468q = true;

    @Inject
    C7884k(Context context, @Named("sticker_picker") C5927a c5927a, PrefixTagSearchEngine prefixTagSearchEngine, C7129a c7129a, BitmojiTagResultsViewController bitmojiTagResultsViewController, C5918a c5918a, @Named("perceived:first_render_grid") C5891c c5891c, C5887d c5887d, @Nullable OnBitmojiSearchFocusChangeListener onBitmojiSearchFocusChangeListener) {
        this.f28452a = context;
        this.f28453b = c5927a;
        this.f28454c = prefixTagSearchEngine;
        this.f28455d = c7129a;
        this.f28456e = bitmojiTagResultsViewController;
        this.f28457f = c5918a;
        this.f28458g = c5891c;
        this.f28459h = c5887d;
        this.f28460i = onBitmojiSearchFocusChangeListener;
        this.f28453b.m25524a((OnInflateListener) this);
    }

    /* renamed from: a */
    public void mo7407a(String str) {
        if (str.length() < 2) {
            m33728a();
        } else {
            this.f28454c.m25480a(str, this.f28467p, false, this);
        }
    }

    public void onInflate(ViewStub viewStub, View view) {
        this.f28464m = new HideableNavbarOffsetController(this, this.f28452a.getResources().getDimensionPixelSize(C5880a.snap_connect_bitmoji_search_bar_height) * 2);
        this.f28461j = (RecyclerView) view.findViewById(C5882c.snap_connect_bitmoji_sticker_picker_view);
        this.f28462k = new C5925j(this.f28452a, view.findViewById(C5882c.snap_connect_bitmoji_search_bar), this.f28459h, this);
        this.f28463l = new TagTilesViewController(this.f28452a, view.findViewById(C5882c.snap_connect_bitmoji_tag_tile_container), this);
        this.f28455d.setHasStableIds(true);
        this.f28462k.m25515a();
        this.f28463l.m25501a();
        this.f28462k.m25517a((OnFocusChangeListener) this);
        this.f28456e.m30758a((OnTagResultsDismissListener) this);
        this.f28457f.m25504a(this.f28461j);
        this.f28461j.setAdapter(this.f28455d);
        this.f28461j.addOnScrollListener(this.f28464m);
    }

    public void onTagTileSelected(TagTileView tagTileView, TagTile tagTile) {
        this.f28464m.m30765a(0);
        this.f28462k.m25519b();
        this.f28456e.m30757a(tagTile, C7884k.m33731b(this.f28467p.m25490a(tagTile.getTag())), this.f28468q);
    }

    public void onNavbarOffsetChange(int i) {
        i = -i;
        this.f28463l.m25502a(i);
        this.f28462k.m25516a(i / 2);
    }

    public boolean shouldAdjustNavbarOffset() {
        return this.f28462k.m25521d() ^ 1;
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            this.f28464m.m30765a(0);
        }
        if (this.f28460i != null) {
            this.f28460i.onBitmojiSearchFocusChange(z);
        }
    }

    public void onComplete(@NonNull final List<String> list, @Nullable final String str, @Nullable final C5909d c5909d) {
        if (TextUtils.equals(this.f28462k.m25520c(), str)) {
            this.f28463l.m25503a(TagTileFactory.fromTags(list, c5909d), true);
            this.f28461j.postDelayed(new Runnable(this) {
                /* renamed from: d */
                final /* synthetic */ C7884k f21690d;

                public void run() {
                    if (TextUtils.equals(this.f21690d.f28462k.m25520c(), str)) {
                        Collection linkedHashSet = new LinkedHashSet();
                        int min = Math.min(list.size(), 10);
                        this.f21690d.f28468q = false;
                        if (c5909d != null) {
                            for (int i = 0; i < min; i++) {
                                linkedHashSet.addAll(c5909d.m25490a((String) list.get(i)));
                            }
                        }
                        this.f21690d.f28455d.m30728a(C7884k.m33731b(linkedHashSet), C5889h.TEXT, str);
                        this.f21690d.f28461j.scrollToPosition(0);
                    }
                }
            }, 300);
        }
    }

    public void onTagResultsDismiss(boolean z) {
        this.f28456e.hide();
        if (z) {
            this.f28462k.m25518a(null);
            m33728a();
        }
    }

    /* renamed from: a */
    public void m33733a(C5909d c5909d) {
        if (this.f28453b.m25525b() == 8) {
            this.f28458g.m25428a();
        }
        this.f28466o = TagTileFactory.fromStickerPacks(c5909d.m25492b());
        this.f28465n = C7884k.m33731b(c5909d.m25495c());
        this.f28453b.m25523a(0);
        this.f28467p = c5909d;
        if (this.f28468q != null) {
            this.f28455d.m30728a(this.f28465n, C5889h.POPULAR, null);
            this.f28463l.m25503a(this.f28466o, false);
        }
    }

    public void hide() {
        this.f28453b.m25523a(8);
        this.f28456e.hide();
    }

    @NonNull
    public BitmojiKitStickerPickerView getViewType() {
        return BitmojiKitStickerPickerView.STICKER_PICKER;
    }

    /* renamed from: a */
    private void m33728a() {
        if (!this.f28468q) {
            this.f28455d.m30728a(this.f28465n, C5889h.POPULAR, null);
            this.f28463l.m25503a(this.f28466o, true);
            this.f28468q = true;
        }
    }

    /* renamed from: b */
    private static List<Sticker> m33731b(Collection<Sticker> collection) {
        List<Sticker> arrayList = new ArrayList(collection.size());
        for (Sticker sticker : collection) {
            if (!sticker.isFriendmoji()) {
                arrayList.add(sticker);
            }
        }
        return arrayList;
    }
}
