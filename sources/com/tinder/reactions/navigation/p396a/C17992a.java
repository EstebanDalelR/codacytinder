package com.tinder.reactions.navigation.p396a;

import android.content.Context;
import android.support.annotation.UiThread;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.common.p463a.C16313a;
import com.tinder.reactions.gestures.animators.C14646c;
import com.tinder.reactions.gestures.animators.C14647d;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.gestures.viewmodel.C14678h;
import com.tinder.reactions.navigation.viewmodel.GrandGestureNavigationItem;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J \u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J.\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J&\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016J&\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016J\u0016\u0010#\u001a\u00020\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100%H\u0007J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/tinder/reactions/navigation/adapter/GesturesAdapter;", "Lcom/tinder/reactions/common/adapter/TypedPagerAdapter;", "Lcom/tinder/reactions/gestures/animators/GrandGestureAnimator;", "gestureAnimationMediator", "Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "context", "Landroid/content/Context;", "(Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;Landroid/content/Context;)V", "animatorFactory", "Lcom/tinder/reactions/gestures/animators/GrandGestureAnimatorFactory;", "getAnimatorFactory$Tinder_release", "()Lcom/tinder/reactions/gestures/animators/GrandGestureAnimatorFactory;", "setAnimatorFactory$Tinder_release", "(Lcom/tinder/reactions/gestures/animators/GrandGestureAnimatorFactory;)V", "grandGestureItems", "", "Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem;", "createGrandGestureAnimator", "inflater", "Landroid/view/LayoutInflater;", "collection", "Landroid/view/ViewGroup;", "position", "", "destroyItem", "", "view", "classType", "Ljava/lang/Class;", "getCount", "instantiateItem", "isViewFromObject", "", "Landroid/view/View;", "object", "setData", "navItems", "", "setupDagger", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.navigation.a.a */
public final class C17992a extends C16313a<C14646c> {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14647d f55925a;
    /* renamed from: b */
    private final Set<GrandGestureNavigationItem> f55926b = ((Set) new LinkedHashSet());
    /* renamed from: c */
    private final C14641a f55927c;

    /* renamed from: a */
    public /* synthetic */ Object mo13497a(ViewGroup viewGroup, int i, Class cls) {
        return m65357b(viewGroup, i, cls);
    }

    public C17992a(@NotNull C14641a c14641a, @NotNull Context context) {
        C2668g.b(c14641a, "gestureAnimationMediator");
        C2668g.b(context, "context");
        super(C14646c.class);
        this.f55927c = c14641a;
        m65350a(context);
    }

    @UiThread
    /* renamed from: a */
    public final void m65354a(@NotNull Set<GrandGestureNavigationItem> set) {
        C2668g.b(set, "navItems");
        this.f55926b.clear();
        if (!set.isEmpty()) {
            this.f55926b.addAll(set);
            notifyDataSetChanged();
        }
    }

    @NotNull
    /* renamed from: b */
    public C14646c m65357b(@NotNull ViewGroup viewGroup, int i, @NotNull Class<C14646c> cls) {
        C2668g.b(viewGroup, "collection");
        C2668g.b(cls, "classType");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C2668g.a(from, "LayoutInflater.from(collection.context)");
        return m65349a(from, viewGroup, i);
    }

    /* renamed from: a */
    public void m65352a(@NotNull ViewGroup viewGroup, int i, @NotNull C14646c c14646c, @NotNull Class<C14646c> cls) {
        C2668g.b(viewGroup, "collection");
        C2668g.b(c14646c, "view");
        C2668g.b(cls, "classType");
        viewGroup.removeView(c14646c.m55838a());
    }

    /* renamed from: a */
    public boolean m65355a(@NotNull View view, @NotNull C14646c c14646c, @NotNull Class<C14646c> cls) {
        C2668g.b(view, "view");
        C2668g.b(c14646c, "object");
        C2668g.b(cls, "classType");
        return C2668g.a(view, c14646c.m55838a());
    }

    public int getCount() {
        return this.f55926b.size();
    }

    /* renamed from: a */
    private final void m65350a(Context context) {
        context = C14398a.m54830a(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
    }

    /* renamed from: a */
    private final C14646c m65349a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        GrandGestureNavigationItem grandGestureNavigationItem = (GrandGestureNavigationItem) C19299w.m68805b((Iterable) this.f55926b, i);
        C14678h c = grandGestureNavigationItem.m55967c();
        C14647d c14647d = this.f55925a;
        if (c14647d == null) {
            C2668g.b("animatorFactory");
        }
        layoutInflater = layoutInflater.inflate(c14647d.m55840a(c), viewGroup, false);
        viewGroup.addView(layoutInflater);
        viewGroup = this.f55925a;
        if (viewGroup == null) {
            C2668g.b("animatorFactory");
        }
        i = grandGestureNavigationItem.m55966b();
        C2668g.a(layoutInflater, "grandGestureView");
        return viewGroup.m55841a(i, c, layoutInflater, this.f55927c);
    }
}
