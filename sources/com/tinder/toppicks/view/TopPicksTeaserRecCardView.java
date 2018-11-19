package com.tinder.toppicks.view;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.C3018c;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.tinder.R;
import com.tinder.cardstack.model.C8395a;
import com.tinder.domain.recs.model.Tag;
import com.tinder.recs.card.TopPickTeaserRecCard;
import com.tinder.recs.view.RecCardView;
import com.tinder.view.grid.ParallaxFrameLayout;
import com.tinder.view.grid.ParallaxFrameLayout.C15421a;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0014J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/toppicks/view/TopPicksTeaserRecCardView;", "Lcom/tinder/recs/view/RecCardView;", "Lcom/tinder/recs/card/TopPickTeaserRecCard;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "parallaxLayout", "Lcom/tinder/view/grid/ParallaxFrameLayout;", "tagView", "Lcom/tinder/toppicks/view/TopPicksTagView;", "topPickTeaserPhoto", "Landroid/widget/ImageView;", "bind", "", "recCard", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "setParallaxManager", "parallaxManager", "Lcom/tinder/view/grid/ParallaxFrameLayout$ParallaxManager;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksTeaserRecCardView extends RecCardView<TopPickTeaserRecCard> {
    /* renamed from: a */
    private ParallaxFrameLayout f56555a;
    /* renamed from: b */
    private ImageView f56556b;
    /* renamed from: c */
    private TopPicksTagView f56557c;
    /* renamed from: d */
    private HashMap f56558d;

    public void _$_clearFindViewByIdCache() {
        if (this.f56558d != null) {
            this.f56558d.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f56558d == null) {
            this.f56558d = new HashMap();
        }
        View view = (View) this.f56558d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f56558d.put(Integer.valueOf(i), view);
        return view;
    }

    public /* synthetic */ void bind(C8395a c8395a) {
        m66121a((TopPickTeaserRecCard) c8395a);
    }

    public /* synthetic */ void bind(Object obj) {
        m66121a((TopPickTeaserRecCard) obj);
    }

    public /* synthetic */ TopPicksTeaserRecCardView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TopPicksTeaserRecCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        CardView.inflate(context, R.layout.view_top_picks_teaser_rec_card, this);
        super.onFinishInflate();
        context = cardStampsDecoration();
        if (context != null) {
            context.setShowSuperlikeStamp(null);
        }
        context = findViewById(R.id.parallax_layout);
        C2668g.a(context, "findViewById(R.id.parallax_layout)");
        this.f56555a = (ParallaxFrameLayout) context;
        context = findViewById(R.id.top_pick_card_user_image);
        C2668g.a(context, "findViewById(R.id.top_pick_card_user_image)");
        this.f56556b = (ImageView) context;
        context = findViewById(R.id.tag_view);
        C2668g.a(context, "findViewById(R.id.tag_view)");
        this.f56557c = (TopPicksTagView) context;
    }

    /* renamed from: a */
    public void m66121a(@NotNull TopPickTeaserRecCard topPickTeaserRecCard) {
        C2668g.b(topPickTeaserRecCard, "recCard");
        super.bind(topPickTeaserRecCard);
        C3018c a = C0994i.b(getContext()).a(topPickTeaserRecCard.getItem().getImageUrl()).a(DiskCacheStrategy.SOURCE);
        topPickTeaserRecCard = topPickTeaserRecCard.getItem().getTags();
        if ((((Collection) topPickTeaserRecCard).isEmpty() ^ 1) != 0) {
            this.f56557c.m57469a(((Tag) C19299w.m68829f((List) topPickTeaserRecCard)).getName());
            topPickTeaserRecCard = new Transformation[1];
            Context context = getContext();
            C2668g.a(context, "context");
            topPickTeaserRecCard[0] = new C18244a(context);
            a.a(topPickTeaserRecCard);
        } else {
            this.f56557c.m57468a();
        }
        a.a(this.f56556b);
    }

    protected void onMeasure(int i, int i2) {
        i = MeasureSpec.getSize(i);
        super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec((int) (((float) i) * 1069044204), 1073741824));
    }

    public final void setParallaxManager(@NotNull C15421a c15421a) {
        C2668g.b(c15421a, "parallaxManager");
        this.f56555a.setParallaxManager(c15421a);
    }
}
