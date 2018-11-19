package com.tinder.toppicks.intromodal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tinder.gold.TinderGoldButtonView;
import com.tinder.toppicks.C15235b.C15229e;
import com.tinder.toppicks.C15235b.C15230f;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/toppicks/intromodal/TopPicksIntroModalView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "topPicksIntroModalContinueButton", "Lcom/tinder/gold/TinderGoldButtonView;", "topPicksIntroModalPictures", "Landroid/widget/ImageView;", "bind", "", "viewModel", "Lcom/tinder/toppicks/intromodal/TopPicksIntroModalViewModel;", "setOnContinueClickListener", "action", "Lkotlin/Function0;", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksIntroModalView extends FrameLayout {
    /* renamed from: a */
    private final ImageView f47403a;
    /* renamed from: b */
    private final TinderGoldButtonView f47404b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.intromodal.TopPicksIntroModalView$a */
    static final class C15273a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ Function0 f47402a;

        C15273a(Function0 function0) {
            this.f47402a = function0;
        }

        public final void onClick(View view) {
            this.f47402a.invoke();
        }
    }

    public /* synthetic */ TopPicksIntroModalView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TopPicksIntroModalView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        FrameLayout.inflate(context, C15230f.top_picks_intro_modal, this);
        setLayoutParams((LayoutParams) new FrameLayout.LayoutParams(-1, -1));
        setClipChildren(null);
        context = findViewById(C15229e.top_picks_intro_modal_pictures);
        C2668g.a(context, "findViewById(R.id.top_picks_intro_modal_pictures)");
        this.f47403a = (ImageView) context;
        context = findViewById(C15229e.top_picks_intro_modal_continue_button);
        C2668g.a(context, "findViewById(R.id.top_pi…ro_modal_continue_button)");
        this.f47404b = (TinderGoldButtonView) context;
    }

    /* renamed from: a */
    public final void m57382a(@NotNull C15274b c15274b) {
        C2668g.b(c15274b, "viewModel");
        this.f47403a.setImageBitmap(c15274b.m57383a());
    }

    public final void setOnContinueClickListener(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "action");
        this.f47404b.setOnClickListener(new C15273a(function0));
    }
}
