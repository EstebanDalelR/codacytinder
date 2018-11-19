package com.tinder.reactions.navigation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.navigation.p397b.C16369a;
import com.tinder.reactions.navigation.p399d.C14688a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/tinder/reactions/navigation/view/GestureNavigationLoadingView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "gestureNavigationLoadingViewProvider", "Lcom/tinder/reactions/navigation/provider/GestureNavigationLoadingViewProvider;", "getGestureNavigationLoadingViewProvider$Tinder_release", "()Lcom/tinder/reactions/navigation/provider/GestureNavigationLoadingViewProvider;", "setGestureNavigationLoadingViewProvider$Tinder_release", "(Lcom/tinder/reactions/navigation/provider/GestureNavigationLoadingViewProvider;)V", "gestureNavigationReactionsLoadingFeature", "Lcom/tinder/reactions/navigation/feature/GestureNavigationLoadingFeature;", "getGestureNavigationReactionsLoadingFeature$Tinder_release", "()Lcom/tinder/reactions/navigation/feature/GestureNavigationLoadingFeature;", "setGestureNavigationReactionsLoadingFeature$Tinder_release", "(Lcom/tinder/reactions/navigation/feature/GestureNavigationLoadingFeature;)V", "bindFeatures", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GestureNavigationLoadingView extends FrameLayout {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14688a f46275a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C16369a f46276b;
    /* renamed from: c */
    private HashMap f46277c;

    /* renamed from: a */
    public View m55949a(int i) {
        if (this.f46277c == null) {
            this.f46277c = new HashMap();
        }
        View view = (View) this.f46277c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f46277c.put(Integer.valueOf(i), view);
        return view;
    }

    public GestureNavigationLoadingView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        attributeSet = C14398a.m54830a(context);
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) attributeSet).provideChatActivityComponent().inject(this);
        FrameLayout.inflate(context, R.layout.gesture_loading_animation_layout, this);
        context = this.f46275a;
        if (context == null) {
            C2668g.b("gestureNavigationLoadingViewProvider");
        }
        context.m55947a(this);
        m55948a();
    }

    @NotNull
    public final C14688a getGestureNavigationLoadingViewProvider$Tinder_release() {
        C14688a c14688a = this.f46275a;
        if (c14688a == null) {
            C2668g.b("gestureNavigationLoadingViewProvider");
        }
        return c14688a;
    }

    public final void setGestureNavigationLoadingViewProvider$Tinder_release(@NotNull C14688a c14688a) {
        C2668g.b(c14688a, "<set-?>");
        this.f46275a = c14688a;
    }

    @NotNull
    public final C16369a getGestureNavigationReactionsLoadingFeature$Tinder_release() {
        C16369a c16369a = this.f46276b;
        if (c16369a == null) {
            C2668g.b("gestureNavigationReactionsLoadingFeature");
        }
        return c16369a;
    }

    public final void setGestureNavigationReactionsLoadingFeature$Tinder_release(@NotNull C16369a c16369a) {
        C2668g.b(c16369a, "<set-?>");
        this.f46276b = c16369a;
    }

    /* renamed from: a */
    private final void m55948a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        C16369a c16369a = this.f46276b;
        if (c16369a == null) {
            C2668g.b("gestureNavigationReactionsLoadingFeature");
        }
        stringBuilder.append(c16369a);
        stringBuilder.append(".toString() bound to ");
        stringBuilder.append(this);
        stringBuilder.append("::class.java");
        C0001a.a(stringBuilder.toString(), new Object[0]);
    }
}
