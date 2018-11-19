package com.tinder.paywall.view.itemsgroup;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0014\b\u0001\u0010\u0003 \u0001*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00020\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\u001d\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H&¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0012H\u0004J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0018R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/paywall/view/itemsgroup/ItemsAdapter;", "T", "Lcom/tinder/paywall/view/itemsgroup/ItemViewModel;", "V", "Landroid/view/View;", "Lcom/tinder/paywall/view/itemsgroup/Bindable;", "", "()V", "elements", "", "getElements", "()Ljava/util/List;", "setElements", "(Ljava/util/List;)V", "updateListeners", "", "Lcom/tinder/paywall/view/itemsgroup/OnUpdateListener;", "addUpdateListener", "", "listener", "createView", "parent", "Landroid/view/ViewGroup;", "viewType", "", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "notifyChanges", "removeUpdateListener", "paywall_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.view.itemsgroup.a */
public abstract class C10080a<T extends ItemViewModel, V extends View & Bindable<? super T>> {
    /* renamed from: a */
    private final List<OnUpdateListener> f32984a = new ArrayList();

    @NotNull
    /* renamed from: a */
    public abstract List<T> mo10503a();

    @NotNull
    /* renamed from: b */
    public abstract V mo10504b(@NotNull ViewGroup viewGroup, int i);

    /* renamed from: c */
    public final int m41197c() {
        return 0;
    }

    /* renamed from: b */
    protected final void m41195b() {
        for (OnUpdateListener onItemsChanged : this.f32984a) {
            onItemsChanged.onItemsChanged();
        }
    }

    /* renamed from: a */
    public final void m41193a(@NotNull OnUpdateListener onUpdateListener) {
        C2668g.b(onUpdateListener, "listener");
        this.f32984a.add(onUpdateListener);
    }

    /* renamed from: b */
    public final void m41196b(@NotNull OnUpdateListener onUpdateListener) {
        C2668g.b(onUpdateListener, "listener");
        this.f32984a.remove(onUpdateListener);
    }
}
