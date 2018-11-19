package com.tinder.overflow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tinder.overflow.actionitem.C10020a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u0014H\u0014J\b\u0010\u001a\u001a\u00020\u0014H\u0014J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002R\"\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/tinder/overflow/OverflowButton;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionItems", "Ljava/util/LinkedHashSet;", "Lcom/tinder/overflow/actionitem/ActionItem;", "Lkotlin/collections/LinkedHashSet;", "getActionItems", "()Ljava/util/LinkedHashSet;", "menuItems", "", "Lcom/tinder/overflow/MenuItem;", "getMenuItems", "()Ljava/util/List;", "onClick", "Lkotlin/Function0;", "", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "setOnClick", "(Lkotlin/jvm/functions/Function0;)V", "onAttachedToWindow", "onDetachedFromWindow", "onDrop", "onTake", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class OverflowButton extends ImageView {
    @NotNull
    /* renamed from: a */
    private Function0<C15813i> f32871a = ((Function0) OverflowButton$onClick$1.f44797a);

    @NotNull
    protected abstract LinkedHashSet<C10020a> getActionItems();

    public OverflowButton(@NotNull final Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                new OverflowMenuDialog(context, this.getMenuItems(), this).show();
                this.getOnClick().invoke();
            }
        });
    }

    @NotNull
    protected final Function0<C15813i> getOnClick() {
        return this.f32871a;
    }

    protected final void setOnClick(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "<set-?>");
        this.f32871a = function0;
    }

    private final List<C10019a> getMenuItems() {
        Iterable<C10020a> actionItems = getActionItems();
        Collection arrayList = new ArrayList(C19301m.a(actionItems, 10));
        for (C10020a a : actionItems) {
            arrayList.add(a.m41051a());
        }
        return (List) arrayList;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m41025a();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m41026b();
    }

    /* renamed from: a */
    private final void m41025a() {
        for (C10020a c : getActionItems()) {
            c.mo10691c();
        }
    }

    /* renamed from: b */
    private final void m41026b() {
        for (C10020a d : getActionItems()) {
            d.mo10692d();
        }
    }
}
