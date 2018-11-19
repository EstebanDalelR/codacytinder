package com.tinder.paywall.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.C4103d;
import com.tinder.R;
import com.tinder.utils.au;
import java.util.List;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\nH\u0002J(\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/tinder/paywall/views/TopPicksPaywallTeaserView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "frameDrawable", "Landroid/graphics/drawable/Drawable;", "leftPick", "Landroid/widget/ImageView;", "mainPick", "radius", "", "rightPick", "stroke", "bind", "", "imageUrls", "", "", "loadPick", "photoUrl", "view", "onSizeChanged", "w", "", "h", "oldw", "oldh", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksPaywallTeaserView extends FrameLayout {
    /* renamed from: a */
    private ImageView f33058a;
    /* renamed from: b */
    private ImageView f33059b;
    /* renamed from: c */
    private ImageView f33060c;
    /* renamed from: d */
    private Drawable f33061d = au.b(this, R.drawable.frame);
    /* renamed from: e */
    private final float f33062e;
    /* renamed from: f */
    private final float f33063f;

    public TopPicksPaywallTeaserView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f33062e = context.getResources().getDimension(R.dimen.top_pick_radius);
        this.f33063f = context.getResources().getDimension(R.dimen.top_pick_stroke);
        FrameLayout.inflate(context, R.layout.top_picks_teaser_photos, this);
        context = findViewById(R.id.main_pick);
        C2668g.a(context, "findViewById(R.id.main_pick)");
        this.f33058a = (ImageView) context;
        context = findViewById(R.id.left_pick);
        C2668g.a(context, "findViewById(R.id.left_pick)");
        this.f33059b = (ImageView) context;
        context = findViewById(R.id.right_pick);
        C2668g.a(context, "findViewById(R.id.right_pick)");
        this.f33060c = (ImageView) context;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i2 -= getPaddingBottom() + getPaddingTop();
        i = (int) (((float) i2) / 1068121457);
        this.f33058a.setLayoutParams((LayoutParams) new FrameLayout.LayoutParams(i, i2, 17));
        this.f33059b.setLayoutParams((LayoutParams) new FrameLayout.LayoutParams(i, i2, 17));
        this.f33060c.setLayoutParams((LayoutParams) new FrameLayout.LayoutParams(i, i2, 17));
    }

    /* renamed from: a */
    public final void m41297a(@NotNull List<String> list) {
        C2668g.b(list, "imageUrls");
        if (list.size() >= 3) {
            m41296a((String) list.get(0), this.f33058a);
            m41296a((String) list.get(1), this.f33059b);
            m41296a((String) list.get(2), this.f33060c);
        }
    }

    /* renamed from: a */
    private final void m41296a(String str, ImageView imageView) {
        C0994i.b(getContext()).a(str).a(new Transformation[]{new C4103d(getContext()), new RoundedCornersTransformation(getContext(), (int) this.f33062e, (int) this.f33063f)}).a(DiskCacheStrategy.SOURCE).a(imageView);
    }
}
