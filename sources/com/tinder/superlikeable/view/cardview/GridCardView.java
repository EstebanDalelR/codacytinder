package com.tinder.superlikeable.view.cardview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.superlikeable.C15088a.C15083a;
import com.tinder.superlikeable.C15088a.C15085c;
import com.tinder.superlikeable.C15088a.C15086d;
import com.tinder.superlikeable.view.SuperLikeableGridView.CellView;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0016H\u0003J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\bH\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\bH\u0002J\b\u0010\"\u001a\u00020\bH\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0002J\u0018\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0014J\u0018\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016J\b\u0010+\u001a\u00020\u0018H\u0002J\u000e\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\bJ\f\u0010.\u001a\u00020\b*\u00020/H\u0002R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/tinder/superlikeable/view/cardview/GridCardView;", "Lcom/tinder/superlikeable/view/SuperLikeableGridView$CellView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "<set-?>", "", "currentPhotoIndex", "getCurrentPhotoIndex", "()I", "setCurrentPhotoIndex", "(I)V", "fab", "Landroid/support/design/widget/FloatingActionButton;", "imageView", "Landroid/widget/ImageView;", "nameView", "Landroid/widget/TextView;", "stamp", "userRec", "Lcom/tinder/domain/recs/model/UserRec;", "bind", "", "bindImage", "imageUrl", "", "bindTeaserText", "rec", "calculateAndSetFabSize", "cardMeasuredWidth", "calculateAndsetStampSize", "cardWidth", "calculateNameViewWidth", "calculateStampsAlpha", "", "dragY", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onViewMoved", "dragX", "setNameTextViewWidth", "showPhotoAtIndex", "index", "getTotalHorizontalMargin", "Landroid/view/View;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
public final class GridCardView extends CellView {
    /* renamed from: a */
    private final ImageView f56428a;
    /* renamed from: b */
    private final TextView f56429b;
    /* renamed from: c */
    private final FloatingActionButton f56430c;
    /* renamed from: d */
    private final ImageView f56431d;
    /* renamed from: e */
    private int f56432e;
    /* renamed from: f */
    private UserRec f56433f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.cardview.GridCardView$a */
    static final class C15176a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ GridCardView f47203a;

        C15176a(GridCardView gridCardView) {
            this.f47203a = gridCardView;
        }

        public final void onClick(View view) {
            this.f47203a.m62510a(this.f47203a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.cardview.GridCardView$b */
    static final class C15177b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ GridCardView f47204a;

        C15177b(GridCardView gridCardView) {
            this.f47204a = gridCardView;
        }

        public final void onClick(View view) {
            this.f47204a.m62511b(this.f47204a);
        }
    }

    public /* synthetic */ GridCardView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public GridCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        View.inflate(context, C15086d.view_superlikeable_grid_rec_card, this);
        context = findViewById(C15085c.superlikeable_grid_item_image_view);
        C2668g.a(context, "findViewById<ImageView>(…ble_grid_item_image_view)");
        this.f56428a = (ImageView) context;
        context = findViewById(C15085c.superlikeable_grid_item_name);
        C2668g.a(context, "findViewById<TextView>(R…rlikeable_grid_item_name)");
        this.f56429b = (TextView) context;
        context = findViewById(C15085c.superlikeable_headline_star_icon);
        C2668g.a(context, "findViewById<FloatingAct…eable_headline_star_icon)");
        this.f56430c = (FloatingActionButton) context;
        context = findViewById(C15085c.superlikeable_grid_item_stamp);
        C2668g.a(context, "findViewById<ImageView>(…likeable_grid_item_stamp)");
        this.f56431d = (ImageView) context;
        setRadius((float) getResources().getDimensionPixelSize(C15083a.grid_card_corner_radius));
    }

    private final void setCurrentPhotoIndex(int i) {
        this.f56432e = i;
    }

    public final int getCurrentPhotoIndex() {
        return this.f56432e;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m65997c(getMeasuredWidth());
        m65995b(getMeasuredWidth());
        m65994b();
    }

    /* renamed from: a */
    public final void m66000a(@NotNull UserRec userRec) {
        C2668g.b(userRec, "userRec");
        this.f56433f = userRec;
        m65996b(userRec);
        m65999a((int) null);
        this.f56430c.setOnClickListener(new C15176a(this));
        setOnClickListener((OnClickListener) new C15177b(this));
    }

    /* renamed from: a */
    public final void m65999a(int i) {
        UserRec userRec = this.f56433f;
        if (userRec == null) {
            C2668g.b("userRec");
        }
        List photos = userRec.getUser().profileUser().photos();
        C2668g.a(photos, "userRec.user.profileUser().photos()");
        Photo photo = (Photo) C19299w.m68813c(photos, i);
        if (photo != null) {
            this.f56432e = i;
            String url = photo.url();
            C2668g.a(url, "it.url()");
            m65993a(url);
        }
    }

    /* renamed from: a */
    private final void m65993a(String str) {
        C0994i.b(getContext()).a(str).a(DiskCacheStrategy.SOURCE).d().e().a(this.f56428a);
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: b */
    private final void m65996b(UserRec userRec) {
        if (userRec.getUser().profileUser().hideAge() || TextUtils.isEmpty(userRec.getAge())) {
            this.f56429b.setText(userRec.getName());
            return;
        }
        TextView textView = this.f56429b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(userRec.getName());
        stringBuilder.append(", ");
        stringBuilder.append(userRec.getAge());
        textView.setText(stringBuilder.toString());
    }

    /* renamed from: a */
    private final int m65991a() {
        int measuredWidth = getMeasuredWidth();
        return Math.max((measuredWidth - this.f56430c.getMeasuredWidth()) - m65992a((View) this.f56430c), 0);
    }

    /* renamed from: b */
    private final void m65995b(int i) {
        LayoutParams layoutParams = this.f56430c.getLayoutParams();
        i /= 4;
        layoutParams.width = i;
        layoutParams.height = i;
        this.f56430c.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    private final void m65994b() {
        int a = m65991a();
        LayoutParams layoutParams = this.f56429b.getLayoutParams();
        layoutParams.width = a;
        this.f56429b.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private final int m65992a(@NotNull View view) {
        view = view.getLayoutParams();
        if (view == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* renamed from: a */
    public void mo13541a(float f, float f2) {
        this.f56431d.setTranslationY(f2 / ((float) 1.4E-44f));
        if (this.f56428a.getHeight() > null && f2 <= ((float) 0.0f)) {
            f = m65990a(f2);
            if (this.f56431d.getAlpha() != f) {
                this.f56431d.setAlpha(f);
            }
        }
    }

    /* renamed from: a */
    private final float m65990a(float f) {
        return Math.max(Math.min(Math.abs(((float) 2) * f) / ((float) this.f56428a.getHeight()), 1.0f), 0.0f);
    }

    /* renamed from: c */
    private final void m65997c(int i) {
        i /= 2;
        LayoutParams layoutParams = this.f56431d.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f56431d.setLayoutParams(layoutParams);
    }
}
