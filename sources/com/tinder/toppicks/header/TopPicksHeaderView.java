package com.tinder.toppicks.header;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.cardstack.view.CardCollectionLayout;
import com.tinder.cardstack.view.CardView;
import com.tinder.toppicks.C15235b.C15226b;
import com.tinder.toppicks.C15235b.C15229e;
import com.tinder.toppicks.C15235b.C15230f;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0012H\u0016J\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/toppicks/header/TopPicksHeaderView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/cardstack/view/CardView;", "Lcom/tinder/toppicks/header/TopPicksHeaderCard;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "byline", "Landroid/widget/TextView;", "padding", "", "title", "bind", "", "p0", "onAttachedToCardCollectionLayout", "Lcom/tinder/cardstack/view/CardCollectionLayout;", "onCardViewRecycled", "onDetachedFromCardCollectionLayout", "onMovedToTop", "onRemovedFromTop", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksHeaderView extends LinearLayout implements CardView<C17028c> {
    /* renamed from: a */
    private final TextView f52471a;
    /* renamed from: b */
    private final TextView f52472b;
    /* renamed from: c */
    private final int f52473c;

    /* renamed from: a */
    public void m62819a(@Nullable C17028c c17028c) {
    }

    /* renamed from: c */
    public void m62821c(@Nullable C17028c c17028c) {
    }

    public void onAttachedToCardCollectionLayout(@NotNull CardCollectionLayout cardCollectionLayout) {
        C2668g.b(cardCollectionLayout, "p0");
    }

    public void onCardViewRecycled() {
    }

    public void onDetachedFromCardCollectionLayout(@NotNull CardCollectionLayout cardCollectionLayout) {
        C2668g.b(cardCollectionLayout, "p0");
    }

    public /* synthetic */ void bind(Object obj) {
        m62820b((C17028c) obj);
    }

    public /* synthetic */ void onMovedToTop(Object obj) {
        m62821c((C17028c) obj);
    }

    public /* synthetic */ void onRemovedFromTop(Object obj) {
        m62819a((C17028c) obj);
    }

    public /* synthetic */ TopPicksHeaderView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TopPicksHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f52473c = (int) context.getResources().getDimension(C15226b.space_s);
        LinearLayout.inflate(context, C15230f.top_picks_header_view, this);
        setOrientation(1);
        setGravity(17);
        setPadding(this.f52473c, this.f52473c, this.f52473c, this.f52473c);
        context = findViewById(C15229e.top_picks_header_title);
        C2668g.a(context, "findViewById(R.id.top_picks_header_title)");
        this.f52471a = (TextView) context;
        context = findViewById(C15229e.top_picks_header_byline);
        C2668g.a(context, "findViewById(R.id.top_picks_header_byline)");
        this.f52472b = (TextView) context;
    }

    /* renamed from: b */
    public void m62820b(@Nullable C17028c c17028c) {
        if (c17028c != null) {
            C15271b c15271b = (C15271b) c17028c.getItem();
            if (c15271b != null) {
                c17028c = c15271b.m57376a();
                if (c17028c != null) {
                    this.f52471a.setText(c17028c.getTitle());
                    this.f52472b.setText(c17028c.getByline());
                }
            }
        }
    }
}
