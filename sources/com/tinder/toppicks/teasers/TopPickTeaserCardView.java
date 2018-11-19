package com.tinder.toppicks.teasers;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.tinder.cardstack.model.C8395a;
import com.tinder.domain.recs.model.Tag;
import com.tinder.domain.toppicks.model.TopPickTeaser;
import com.tinder.recs.view.RecCardView;
import com.tinder.toppicks.C15235b.C15229e;
import com.tinder.toppicks.C15235b.C15230f;
import com.tinder.toppicks.view.C18244a;
import com.tinder.toppicks.view.GoldShimmerTimerView;
import com.tinder.toppicks.view.TopPicksTagView;
import com.tinder.view.grid.ParallaxFrameLayout;
import com.tinder.view.grid.ParallaxFrameLayout.C15421a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/toppicks/teasers/TopPickTeaserCardView;", "Lcom/tinder/recs/view/RecCardView;", "Lcom/tinder/toppicks/teasers/TopPickTeaserCard;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bottomGradient", "Landroid/widget/ImageView;", "parallaxLayout", "Lcom/tinder/view/grid/ParallaxFrameLayout;", "tagView", "Lcom/tinder/toppicks/view/TopPicksTagView;", "teaser", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "getTeaser", "()Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "setTeaser", "(Lcom/tinder/domain/toppicks/model/TopPickTeaser;)V", "timerView", "Lcom/tinder/toppicks/view/GoldShimmerTimerView;", "topPickTeaserPhoto", "bind", "", "recCard", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "setParallaxManager", "parallaxManager", "Lcom/tinder/view/grid/ParallaxFrameLayout$ParallaxManager;", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class TopPickTeaserCardView extends RecCardView<C17117b> {
    /* renamed from: a */
    private ParallaxFrameLayout f56538a;
    /* renamed from: b */
    private ImageView f56539b;
    /* renamed from: c */
    private ImageView f56540c;
    /* renamed from: d */
    private GoldShimmerTimerView f56541d;
    /* renamed from: e */
    private TopPicksTagView f56542e;
    @Nullable
    /* renamed from: f */
    private TopPickTeaser f56543f;

    public /* synthetic */ void bind(C8395a c8395a) {
        m66104a((C17117b) c8395a);
    }

    public /* synthetic */ void bind(Object obj) {
        m66104a((C17117b) obj);
    }

    public /* synthetic */ TopPickTeaserCardView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TopPickTeaserCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        CardView.inflate(context, C15230f.view_top_pick_teaser_card, this);
        super.onFinishInflate();
        context = cardStampsDecoration();
        if (context != null) {
            context.setShowSuperlikeStamp(null);
        }
        context = findViewById(C15229e.parallax_layout);
        C2668g.a(context, "findViewById(R.id.parallax_layout)");
        this.f56538a = (ParallaxFrameLayout) context;
        context = findViewById(C15229e.top_pick_card_bottom_gradient);
        C2668g.a(context, "findViewById(R.id.top_pick_card_bottom_gradient)");
        this.f56539b = (ImageView) context;
        context = findViewById(C15229e.top_pick_card_user_image);
        C2668g.a(context, "findViewById(R.id.top_pick_card_user_image)");
        this.f56540c = (ImageView) context;
        context = findViewById(C15229e.top_pick_card_timer_view);
        C2668g.a(context, "findViewById(R.id.top_pick_card_timer_view)");
        this.f56541d = (GoldShimmerTimerView) context;
        context = findViewById(C15229e.tag_view);
        C2668g.a(context, "findViewById(R.id.tag_view)");
        this.f56542e = (TopPicksTagView) context;
    }

    @Nullable
    public final TopPickTeaser getTeaser() {
        return this.f56543f;
    }

    public final void setTeaser(@Nullable TopPickTeaser topPickTeaser) {
        this.f56543f = topPickTeaser;
    }

    /* renamed from: a */
    public void m66104a(@NotNull C17117b c17117b) {
        List tags;
        C2668g.b(c17117b, "recCard");
        super.bind(c17117b);
        this.f56543f = (TopPickTeaser) c17117b.getItem();
        c17117b = C0994i.b(getContext());
        TopPickTeaser topPickTeaser = this.f56543f;
        c17117b = c17117b.a(topPickTeaser != null ? topPickTeaser.getPhotoUrl() : null).a(DiskCacheStrategy.SOURCE);
        topPickTeaser = this.f56543f;
        if (topPickTeaser != null) {
            tags = topPickTeaser.getTags();
            if (tags != null) {
                if (tags.isEmpty()) {
                    this.f56542e.m57469a(((Tag) C19299w.m68829f(tags)).getName());
                    Transformation[] transformationArr = new Transformation[1];
                    Context context = getContext();
                    C2668g.a(context, "context");
                    transformationArr[0] = new C18244a(context);
                    c17117b.a(transformationArr);
                    this.f56539b.setVisibility(8);
                } else {
                    topPickTeaser = this.f56543f;
                    if (topPickTeaser != null) {
                        this.f56541d.m57459a(topPickTeaser.getExpirationTime().getMillis());
                    }
                    this.f56542e.m57468a();
                    this.f56539b.setVisibility(0);
                }
                c17117b.a(this.f56540c);
            }
        }
        tags = C17554o.m64195a();
        if (tags.isEmpty()) {
            this.f56542e.m57469a(((Tag) C19299w.m68829f(tags)).getName());
            Transformation[] transformationArr2 = new Transformation[1];
            Context context2 = getContext();
            C2668g.a(context2, "context");
            transformationArr2[0] = new C18244a(context2);
            c17117b.a(transformationArr2);
            this.f56539b.setVisibility(8);
        } else {
            topPickTeaser = this.f56543f;
            if (topPickTeaser != null) {
                this.f56541d.m57459a(topPickTeaser.getExpirationTime().getMillis());
            }
            this.f56542e.m57468a();
            this.f56539b.setVisibility(0);
        }
        c17117b.a(this.f56540c);
    }

    protected void onMeasure(int i, int i2) {
        i = MeasureSpec.getSize(i);
        i2 = (int) (((float) i) * 1069044204);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i2, 1073741824);
        i = MeasureSpec.makeMeasureSpec(i, 1073741824);
        super.onMeasure(i, makeMeasureSpec);
        this.f56539b.measure(i, MeasureSpec.makeMeasureSpec((int) (((float) i2) * 1048576000), 1073741824));
    }

    public final void setParallaxManager(@NotNull C15421a c15421a) {
        C2668g.b(c15421a, "parallaxManager");
        this.f56538a.setParallaxManager(c15421a);
    }
}
