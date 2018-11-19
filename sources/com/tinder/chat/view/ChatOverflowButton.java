package com.tinder.chat.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tinder.overflow.OverflowButton;
import com.tinder.overflow.actionitem.C10020a;
import java.util.LinkedHashSet;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R+\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8TX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/tinder/chat/view/ChatOverflowButton;", "Lcom/tinder/overflow/OverflowButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionItems", "Ljava/util/LinkedHashSet;", "Lcom/tinder/overflow/actionitem/ActionItem;", "Lkotlin/collections/LinkedHashSet;", "getActionItems", "()Ljava/util/LinkedHashSet;", "actionItems$delegate", "Lkotlin/Lazy;", "defaultSponsoredMessageSelectedBehavior", "Lkotlin/Function0;", "", "onDeleteSponsoredMessageSelected", "getOnDeleteSponsoredMessageSelected", "()Lkotlin/jvm/functions/Function0;", "setOnDeleteSponsoredMessageSelected", "(Lkotlin/jvm/functions/Function0;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ChatOverflowButton extends OverflowButton {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f34336a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(ChatOverflowButton.class), "actionItems", "getActionItems()Ljava/util/LinkedHashSet;"))};
    /* renamed from: b */
    private final Function0<C15813i> f34337b = ((Function0) ChatOverflowButton$defaultSponsoredMessageSelectedBehavior$1.f43631a);
    @NotNull
    /* renamed from: c */
    private Function0<C15813i> f34338c = this.f34337b;
    @NotNull
    /* renamed from: d */
    private final Lazy f34339d;

    @NotNull
    protected LinkedHashSet<C10020a> getActionItems() {
        Lazy lazy = this.f34339d;
        KProperty kProperty = f34336a[0];
        return (LinkedHashSet) lazy.getValue();
    }

    public ChatOverflowButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f34339d = C18451c.a((Function0) new ChatOverflowButton$actionItems$2(this, context));
    }

    @NotNull
    public final Function0<C15813i> getOnDeleteSponsoredMessageSelected() {
        return this.f34338c;
    }

    public final void setOnDeleteSponsoredMessageSelected(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "<set-?>");
        this.f34338c = function0;
    }
}
