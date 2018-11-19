package com.tinder.toppicks.exhausted;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bumptech.glide.C0994i;
import com.tinder.toppicks.C15235b.C15226b;
import com.tinder.toppicks.C15235b.C15229e;
import com.tinder.toppicks.C15235b.C15230f;
import com.tinder.toppicks.C15235b.C15233i;
import com.tinder.toppicks.view.PortraitCardView;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/toppicks/exhausted/TeaserExhaustedCardView;", "Lcom/tinder/toppicks/view/PortraitCardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "picture", "Landroid/widget/ImageView;", "bindImage", "", "url", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class TeaserExhaustedCardView extends PortraitCardView {
    /* renamed from: b */
    private final ImageView f56514b;

    public /* synthetic */ TeaserExhaustedCardView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TeaserExhaustedCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet, C15233i.TopPicksExhaustedCardView);
        CardView.inflate(context, C15230f.view_teaser_exhausted_card, this);
        setRadius((float) getResources().getDimensionPixelSize(C15226b.rec_card_radius));
        context = findViewById(C15229e.picture);
        C2668g.a(context, "findViewById(R.id.picture)");
        this.f56514b = (ImageView) context;
    }

    /* renamed from: a */
    public final void m66079a(@NotNull String str) {
        C2668g.b(str, "url");
        C0994i.b(getContext()).a(str).a().a(this.f56514b);
    }
}
