package com.tinder.toppicks.counter;

import android.animation.Animator;
import android.content.Context;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.base.view.IdViewAnimator;
import com.tinder.gold.TinderGoldButtonView;
import com.tinder.paywall.legacy.TopPicksPaywallSource;
import com.tinder.toppicks.C15224a;
import com.tinder.toppicks.C15235b.C15227c;
import com.tinder.toppicks.C15235b.C15229e;
import com.tinder.toppicks.C15235b.C15230f;
import com.tinder.toppicks.C15235b.C15231g;
import com.tinder.toppicks.FadeAnimation;
import com.tinder.toppicks.di.TopPicksInjector$Factory;
import com.tinder.utils.C15365p;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001.B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u00020\u0015H\u0016J\b\u0010)\u001a\u00020\u0015H\u0014J\b\u0010*\u001a\u00020\u0015H\u0014J\b\u0010+\u001a\u00020\u0015H\u0016J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\tH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R7\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/tinder/toppicks/counter/TopPicksBottomCounterView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/toppicks/counter/TopPicksBottomCounterTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "style", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "buttonContainer", "Lcom/tinder/base/view/IdViewAnimator;", "buttonView", "Lcom/tinder/gold/TinderGoldButtonView;", "paywallCallBack", "Lkotlin/Function1;", "Lcom/tinder/paywall/legacy/TopPicksPaywallSource;", "Lkotlin/ParameterName;", "name", "source", "", "getPaywallCallBack", "()Lkotlin/jvm/functions/Function1;", "setPaywallCallBack", "(Lkotlin/jvm/functions/Function1;)V", "presenter", "Lcom/tinder/toppicks/counter/TopPicksBottomCounterPresenter;", "getPresenter", "()Lcom/tinder/toppicks/counter/TopPicksBottomCounterPresenter;", "setPresenter", "(Lcom/tinder/toppicks/counter/TopPicksBottomCounterPresenter;)V", "topPicksCountText", "Landroid/widget/TextView;", "fadeContents", "Landroid/animation/Animator;", "fade", "Lcom/tinder/toppicks/FadeAnimation;", "duration", "", "hideLoading", "onAttachedToWindow", "onDetachedFromWindow", "showLoading", "updateCount", "newCount", "ButtonState", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksBottomCounterView extends LinearLayout implements TopPicksBottomCounterTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C15237a f52389a;
    /* renamed from: b */
    private final IdViewAnimator f52390b;
    /* renamed from: c */
    private final TinderGoldButtonView f52391c;
    /* renamed from: d */
    private final TextView f52392d;
    @Nullable
    /* renamed from: e */
    private Function1<? super TopPicksPaywallSource, C15813i> f52393e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/toppicks/counter/TopPicksBottomCounterView$ButtonState;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "LOADING", "NOT_LOADING", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    private enum ButtonState {
        ;
        
        private final int id;

        protected ButtonState(int i) {
            this.id = i;
        }

        public final int getId() {
            return this.id;
        }
    }

    public /* synthetic */ TopPicksBottomCounterView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TopPicksBottomCounterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        LinearLayout.inflate(getContext(), C15230f.top_picks_bottom_counter_view, this);
        setOrientation(null);
        context = getContext();
        C2668g.a(context, "context");
        context = C15365p.m57675b(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.toppicks.di.TopPicksInjector.Factory");
        }
        ((TopPicksInjector$Factory) context).provideTopPicksInjector().inject(this);
        setBackgroundResource(C15227c.bottom_counter_bg);
        context = findViewById(C15229e.get_more_top_picks_button);
        C2668g.a(context, "findViewById(R.id.get_more_top_picks_button)");
        this.f52391c = (TinderGoldButtonView) context;
        context = findViewById(C15229e.top_picks_count_text);
        C2668g.a(context, "findViewById(R.id.top_picks_count_text)");
        this.f52392d = (TextView) context;
        context = findViewById(C15229e.bottom_counter_button_container);
        C2668g.a(context, "findViewById(R.id.bottom_counter_button_container)");
        this.f52390b = (IdViewAnimator) context;
        this.f52391c.setButtonAction((Function0) new Function0<C15813i>() {
            public /* synthetic */ Object invoke() {
                m67467a();
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67467a() {
                Function1 paywallCallBack = this.getPaywallCallBack();
                if (paywallCallBack != null) {
                    C15813i c15813i = (C15813i) paywallCallBack.invoke(TopPicksPaywallSource.FOOTER_BUTTON);
                }
            }
        });
    }

    public /* synthetic */ TopPicksBottomCounterView(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet, i);
    }

    public TopPicksBottomCounterView(@NotNull Context context, @Nullable AttributeSet attributeSet, @StyleRes int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
        LinearLayout.inflate(getContext(), C15230f.top_picks_bottom_counter_view, this);
        setOrientation(null);
        context = getContext();
        C2668g.a(context, "context");
        context = C15365p.m57675b(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.toppicks.di.TopPicksInjector.Factory");
        }
        ((TopPicksInjector$Factory) context).provideTopPicksInjector().inject(this);
        setBackgroundResource(C15227c.bottom_counter_bg);
        context = findViewById(C15229e.get_more_top_picks_button);
        C2668g.a(context, "findViewById(R.id.get_more_top_picks_button)");
        this.f52391c = (TinderGoldButtonView) context;
        context = findViewById(C15229e.top_picks_count_text);
        C2668g.a(context, "findViewById(R.id.top_picks_count_text)");
        this.f52392d = (TextView) context;
        context = findViewById(C15229e.bottom_counter_button_container);
        C2668g.a(context, "findViewById(R.id.bottom_counter_button_container)");
        this.f52390b = (IdViewAnimator) context;
        this.f52391c.setButtonAction((Function0) /* anonymous class already generated */);
    }

    @NotNull
    public final C15237a getPresenter() {
        C15237a c15237a = this.f52389a;
        if (c15237a == null) {
            C2668g.b("presenter");
        }
        return c15237a;
    }

    public final void setPresenter(@NotNull C15237a c15237a) {
        C2668g.b(c15237a, "<set-?>");
        this.f52389a = c15237a;
    }

    @Nullable
    public final Function1<TopPicksPaywallSource, C15813i> getPaywallCallBack() {
        return this.f52393e;
    }

    public final void setPaywallCallBack(@Nullable Function1<? super TopPicksPaywallSource, C15813i> function1) {
        this.f52393e = function1;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C15237a c15237a = this.f52389a;
        if (c15237a == null) {
            C2668g.b("presenter");
        }
        c15237a.m57308a((TopPicksBottomCounterTarget) this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C15237a c15237a = this.f52389a;
        if (c15237a == null) {
            C2668g.b("presenter");
        }
        c15237a.m57307a();
    }

    public void updateCount(int i) {
        TextView textView = this.f52392d;
        Context context = getContext();
        C2668g.a(context, "context");
        textView.setText(context.getResources().getQuantityString(C15231g.top_picks_left_format, i, new Object[]{Integer.valueOf(i)}));
    }

    public void showLoading() {
        this.f52390b.setDisplayedChildId(ButtonState.LOADING.getId());
    }

    public void hideLoading() {
        this.f52390b.setDisplayedChildId(ButtonState.NOT_LOADING.getId());
    }

    @NotNull
    /* renamed from: a */
    public final Animator m62754a(@NotNull FadeAnimation fadeAnimation, long j) {
        C2668g.b(fadeAnimation, "fade");
        return new C15224a(this.f52392d, this.f52391c).m57292a(fadeAnimation, j);
    }
}
