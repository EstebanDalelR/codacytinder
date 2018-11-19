package com.tinder.reactions.common.p463a;

import android.support.v4.view.C0600i;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J3\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0002\u0010\u000eJ \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J+\u0010\u000f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0002\u0010\u0010J+\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/reactions/common/adapter/TypedPagerAdapter;", "T", "", "Landroid/support/v4/view/PagerAdapter;", "classType", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "destroyItem", "", "collection", "Landroid/view/ViewGroup;", "position", "", "view", "(Landroid/view/ViewGroup;ILjava/lang/Object;Ljava/lang/Class;)V", "instantiateItem", "(Landroid/view/ViewGroup;ILjava/lang/Class;)Ljava/lang/Object;", "isViewFromObject", "", "Landroid/view/View;", "object", "(Landroid/view/View;Ljava/lang/Object;Ljava/lang/Class;)Z", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.common.a.a */
public abstract class C16313a<T> extends C0600i {
    /* renamed from: a */
    private final Class<T> f50751a;

    @NotNull
    /* renamed from: a */
    public abstract T mo13497a(@NotNull ViewGroup viewGroup, int i, @NotNull Class<T> cls);

    /* renamed from: a */
    public abstract void mo13498a(@NotNull ViewGroup viewGroup, int i, @NotNull T t, @NotNull Class<T> cls);

    /* renamed from: a */
    public abstract boolean mo13499a(@NotNull View view, @NotNull T t, @NotNull Class<T> cls);

    public C16313a(@NotNull Class<T> cls) {
        C2668g.b(cls, "classType");
        this.f50751a = cls;
    }

    @NotNull
    public Object instantiateItem(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "collection");
        return mo13497a(viewGroup, i, this.f50751a);
    }

    public void destroyItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
        C2668g.b(viewGroup, "collection");
        C2668g.b(obj, "view");
        obj = this.f50751a.cast(obj);
        C2668g.a(obj, "classType.cast(view)");
        mo13498a(viewGroup, i, obj, this.f50751a);
    }

    public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
        C2668g.b(view, "view");
        C2668g.b(obj, "object");
        obj = this.f50751a.cast(obj);
        C2668g.a(obj, "classType.cast(`object`)");
        return mo13499a(view, obj, this.f50751a);
    }
}
