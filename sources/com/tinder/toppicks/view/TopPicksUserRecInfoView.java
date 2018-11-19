package com.tinder.toppicks.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.domain.recs.model.TopPickUserRec;
import com.tinder.recs.card.UserRecCard;
import com.tinder.recs.view.superlike.GridSuperLikeButtonView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18464j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0010J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014H\u0002J\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0014H\u0014J\b\u0010 \u001a\u00020\u0010H\u0002J\b\u0010!\u001a\u00020\u0010H\u0002J\u0014\u0010\"\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100$J\u0006\u0010%\u001a\u00020\u0010J\f\u0010&\u001a\u00020\u0014*\u00020\u0019H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/tinder/toppicks/view/TopPicksUserRecInfoView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "basicInfo", "Landroid/widget/TextView;", "expirationTime", "Lcom/tinder/toppicks/view/GoldShimmerTimerView;", "superLikeButton", "Lcom/tinder/recs/view/superlike/GridSuperLikeButtonView;", "teaserContainer", "Landroid/view/ViewGroup;", "bindInfo", "", "userRecCard", "Lcom/tinder/recs/card/UserRecCard;", "calculateBasicInfoViewWidth", "", "hideUserInfo", "inflateView", "injectSuperLike", "view", "Landroid/view/View;", "measureChildViews", "parentWidthSpec", "parentHeightSpec", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setBasicInfoViewWidth", "setSuperLikeButtonSize", "setSuperLikeOnClickListener", "action", "Lkotlin/Function0;", "showUserInfo", "getTotalHorizontalMargin", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksUserRecInfoView extends FrameLayout {
    /* renamed from: a */
    private TextView f47502a;
    /* renamed from: b */
    private GoldShimmerTimerView f47503b;
    /* renamed from: c */
    private GridSuperLikeButtonView f47504c;
    /* renamed from: d */
    private ViewGroup f47505d;

    public TopPicksUserRecInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        m57471a(context);
        context = findViewById(R.id.top_picks_rec_basic_info);
        C2668g.a(context, "findViewById(R.id.top_picks_rec_basic_info)");
        this.f47502a = (TextView) context;
        context = findViewById(R.id.recs_top_picks_expiration_time);
        C2668g.a(context, "findViewById(R.id.recs_top_picks_expiration_time)");
        this.f47503b = (GoldShimmerTimerView) context;
        context = findViewById(R.id.superlikeable_headline_star_icon);
        C2668g.a(context, "findViewById(R.id.superl…eable_headline_star_icon)");
        this.f47504c = (GridSuperLikeButtonView) context;
        context = findViewById(R.id.top_picks_rec_info_container);
        C2668g.a(context, "findViewById(R.id.top_picks_rec_info_container)");
        this.f47505d = (ViewGroup) context;
        setClipToPadding(null);
    }

    public /* synthetic */ TopPicksUserRecInfoView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public final void setSuperLikeOnClickListener(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "action");
        this.f47504c.setSuperLikeOnClickListener(function0);
    }

    /* renamed from: a */
    public final void m57477a(@NotNull View view) {
        C2668g.b(view, "view");
        this.f47504c.injectSuperLike(view);
    }

    protected void onMeasure(int i, int i2) {
        m57470a(i, i2);
        m57473c();
        m57474d();
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    public final void m57478a(@NotNull UserRecCard userRecCard) {
        C2668g.b(userRecCard, "userRecCard");
        if (userRecCard.showAge()) {
            String age = userRecCard.age();
            C2668g.a(age, "userRecCard.age()");
            if ((((CharSequence) age).length() == 0 ? 1 : null) == null) {
                TextView textView = this.f47502a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(userRecCard.userRec().getName());
                stringBuilder.append(", ");
                stringBuilder.append(userRecCard.age());
                textView.setText(stringBuilder.toString());
                userRecCard = userRecCard.userRec();
                if (userRecCard != null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.TopPickUserRec");
                }
                this.f47503b.m57459a(((TopPickUserRec) userRecCard).getExpirationTime());
                return;
            }
        }
        this.f47502a.setText(userRecCard.userRec().getName());
        userRecCard = userRecCard.userRec();
        if (userRecCard != null) {
            this.f47503b.m57459a(((TopPickUserRec) userRecCard).getExpirationTime());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.TopPickUserRec");
    }

    /* renamed from: a */
    public final void m57476a() {
        this.f47502a.setVisibility(0);
        this.f47503b.setVisibility(0);
    }

    /* renamed from: b */
    public final void m57479b() {
        this.f47502a.setVisibility(4);
        this.f47503b.setVisibility(4);
    }

    /* renamed from: a */
    private final void m57471a(Context context) {
        View.inflate(context, R.layout.recs_card_top_picks_info_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
    }

    /* renamed from: a */
    private final void m57470a(int i, int i2) {
        Iterable b = C18464j.m66925b(0, getChildCount());
        Collection arrayList = new ArrayList(C18457p.m66906a(b, 10));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((ab) it).mo13805b()));
        }
        Collection arrayList2 = new ArrayList();
        for (Object next : (List) arrayList) {
            View view = (View) next;
            C2668g.a(view, "it");
            if ((view.getVisibility() == 0 ? 1 : null) != null) {
                arrayList2.add(next);
            }
        }
        for (View measureChildWithMargins : (List) arrayList2) {
            measureChildWithMargins(measureChildWithMargins, i, 0, i2, 0);
        }
    }

    /* renamed from: c */
    private final void m57473c() {
        LayoutParams layoutParams = this.f47504c.getLayoutParams();
        layoutParams.width = this.f47505d.getMeasuredHeight();
        layoutParams.height = this.f47505d.getMeasuredHeight();
        this.f47504c.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    private final void m57474d() {
        int e = m57475e();
        LayoutParams layoutParams = this.f47502a.getLayoutParams();
        layoutParams.width = e;
        this.f47502a.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    private final int m57475e() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        return Math.max((measuredWidth - this.f47504c.getMeasuredWidth()) - m57472b(this.f47504c), 0);
    }

    /* renamed from: b */
    private final int m57472b(@NotNull View view) {
        view = view.getLayoutParams();
        if (view == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }
}
