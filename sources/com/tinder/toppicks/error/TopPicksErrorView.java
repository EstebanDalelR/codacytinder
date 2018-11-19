package com.tinder.toppicks.error;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.toppicks.C15235b.C15229e;
import com.tinder.toppicks.C15235b.C15230f;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/toppicks/error/TopPicksErrorView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "tryAgainButton", "Landroid/widget/TextView;", "setOnTryAgainClickListener", "", "clickListener", "Lkotlin/Function1;", "Landroid/view/View;", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksErrorView extends LinearLayout {
    /* renamed from: a */
    private final TextView f47374a;

    public /* synthetic */ TopPicksErrorView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TopPicksErrorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        LinearLayout.inflate(context, C15230f.top_picks_error_view, this);
        setGravity(17);
        setOrientation(1);
        context = findViewById(C15229e.top_picks_try_again);
        C2668g.a(context, "findViewById(R.id.top_picks_try_again)");
        this.f47374a = (TextView) context;
    }

    public final void setOnTryAgainClickListener(@NotNull Function1<? super View, C15813i> function1) {
        C2668g.b(function1, "clickListener");
        this.f47374a.setOnClickListener(new C15259a(function1));
    }
}
