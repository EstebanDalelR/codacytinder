package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.ViewStub.OnInflateListener;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5880a;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5882c;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.FragmentScope;
import com.snapchat.kit.sdk.bitmoji.models.Sticker;
import com.snapchat.kit.sdk.bitmoji.models.TagTile;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5887d;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5889h;
import com.snapchat.kit.sdk.bitmoji.ui.controller.HideableNavbarOffsetController.OnNavbarOffsetChangeListener;
import com.snapchat.kit.sdk.bitmoji.ui.p157a.C7129a;
import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import com.snapchat.kit.sdk.bitmoji.ui.view.TagTileView;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

@FragmentScope
public class BitmojiTagResultsViewController implements OnInflateListener, Hideable, OnNavbarOffsetChangeListener {
    /* renamed from: a */
    private final Context f25840a;
    /* renamed from: b */
    private final C5927a f25841b;
    /* renamed from: c */
    private final C7129a f25842c;
    /* renamed from: d */
    private final C5918a f25843d;
    /* renamed from: e */
    private final C5887d f25844e;
    /* renamed from: f */
    private View f25845f;
    /* renamed from: g */
    private TagTileView f25846g;
    /* renamed from: h */
    private RecyclerView f25847h;
    /* renamed from: i */
    private OnTagResultsDismissListener f25848i;

    /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.BitmojiTagResultsViewController$1 */
    class C59131 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ BitmojiTagResultsViewController f21655a;

        C59131(BitmojiTagResultsViewController bitmojiTagResultsViewController) {
            this.f21655a = bitmojiTagResultsViewController;
        }

        public void onClick(View view) {
            if (this.f21655a.f25848i != null) {
                this.f21655a.f25848i.onTagResultsDismiss(true);
            }
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.BitmojiTagResultsViewController$2 */
    class C59142 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ BitmojiTagResultsViewController f21656a;

        C59142(BitmojiTagResultsViewController bitmojiTagResultsViewController) {
            this.f21656a = bitmojiTagResultsViewController;
        }

        public void onClick(View view) {
            if (this.f21656a.f25848i != null) {
                this.f21656a.f25848i.onTagResultsDismiss(false);
            }
        }
    }

    public interface OnTagResultsDismissListener {
        void onTagResultsDismiss(boolean z);
    }

    public boolean shouldAdjustNavbarOffset() {
        return true;
    }

    @Inject
    BitmojiTagResultsViewController(Context context, @Named("tag_results") C5927a c5927a, C7129a c7129a, C5918a c5918a, C5887d c5887d) {
        this.f25840a = context;
        this.f25841b = c5927a;
        this.f25842c = c7129a;
        this.f25843d = c5918a;
        this.f25844e = c5887d;
        this.f25841b.m25524a((OnInflateListener) this);
    }

    public void onInflate(ViewStub viewStub, View view) {
        viewStub = view.findViewById(C5882c.snap_connect_bitmoji_results_clear_button);
        OnScrollListener hideableNavbarOffsetController = new HideableNavbarOffsetController(this, this.f25840a.getResources().getDimensionPixelSize(C5880a.snap_connect_bitmoji_search_bar_height));
        this.f25845f = view.findViewById(C5882c.snap_connect_bitmoji_results_bar);
        this.f25846g = (TagTileView) view.findViewById(C5882c.snap_connect_bitmoji_results_tag);
        this.f25847h = (RecyclerView) view.findViewById(C5882c.snap_connect_bitmoji_results_grid);
        viewStub.setOnClickListener(new C59131(this));
        this.f25845f.setOnClickListener(new C59142(this));
        this.f25843d.m25504a(this.f25847h);
        this.f25847h.setAdapter(this.f25842c);
        this.f25847h.addOnScrollListener(hideableNavbarOffsetController);
    }

    public void onNavbarOffsetChange(int i) {
        this.f25845f.setTranslationY((float) (-i));
    }

    /* renamed from: a */
    public void m30758a(OnTagResultsDismissListener onTagResultsDismissListener) {
        this.f25848i = onTagResultsDismissListener;
    }

    /* renamed from: a */
    public void m30757a(TagTile tagTile, List<Sticker> list, boolean z) {
        z = z ? C5889h.PROGRAMMED_PILLS : C5889h.AUTOCOMPLETE;
        this.f25841b.m25523a(0);
        this.f25842c.m30728a(list, z, tagTile.getTag());
        this.f25844e.m25410a(z, tagTile.getTag());
        this.f25847h.scrollToPosition(0);
        this.f25846g.setBackgroundColor(tagTile.getColor());
        this.f25846g.setText(tagTile.getTag());
    }

    public void hide() {
        this.f25841b.m25523a(8);
    }
}
