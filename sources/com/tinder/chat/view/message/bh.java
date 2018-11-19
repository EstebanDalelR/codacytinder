package com.tinder.chat.view.message;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup.LayoutParams;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.presenter.aq;
import com.tinder.chat.target.TypingIndicatorItemTarget;
import com.tinder.chat.view.ChatAvatarView;
import com.tinder.deadshot.Deadshot;
import com.tinder.profile.p365d.C14398a;
import com.tinder.typingindicator.view.TypingIndicatorView;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0014J\b\u0010\u001e\u001a\u00020\u0019H\u0014J\b\u0010\u001f\u001a\u00020\u0019H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148@X\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/tinder/chat/view/message/TypingIndicatorItemView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/chat/view/message/SimpleBindableChatItemView;", "Lcom/tinder/chat/target/TypingIndicatorItemTarget;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "chatAvatarView", "Lcom/tinder/chat/view/ChatAvatarView;", "getChatAvatarView", "()Lcom/tinder/chat/view/ChatAvatarView;", "chatAvatarView$delegate", "Lkotlin/Lazy;", "presenter", "Lcom/tinder/chat/presenter/TypingIndicatorItemPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/chat/presenter/TypingIndicatorItemPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/chat/presenter/TypingIndicatorItemPresenter;)V", "typingIndicatorView", "Lcom/tinder/typingindicator/view/TypingIndicatorView;", "getTypingIndicatorView$Tinder_release", "()Lcom/tinder/typingindicator/view/TypingIndicatorView;", "typingIndicatorView$delegate", "bind", "", "bindAvatar", "url", "", "onAttachedToWindow", "onDetachedFromWindow", "setupDagger", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class bh extends ConstraintLayout implements TypingIndicatorItemTarget, SimpleBindableChatItemView {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f34676a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(bh.class), "typingIndicatorView", "getTypingIndicatorView$Tinder_release()Lcom/tinder/typingindicator/view/TypingIndicatorView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(bh.class), "chatAvatarView", "getChatAvatarView()Lcom/tinder/chat/view/ChatAvatarView;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public aq f34677b;
    @NotNull
    /* renamed from: c */
    private final Lazy f34678c = C18451c.a(LazyThreadSafetyMode.NONE, new TypingIndicatorItemView$$special$$inlined$bindView$1(this, R.id.typingIndicatorView));
    /* renamed from: d */
    private final Lazy f34679d = C18451c.a(LazyThreadSafetyMode.NONE, new TypingIndicatorItemView$$special$$inlined$bindView$2(this, R.id.chatAvatarView));

    private final ChatAvatarView getChatAvatarView() {
        Lazy lazy = this.f34679d;
        KProperty kProperty = f34676a[1];
        return (ChatAvatarView) lazy.getValue();
    }

    @NotNull
    public final TypingIndicatorView getTypingIndicatorView$Tinder_release() {
        Lazy lazy = this.f34678c;
        KProperty kProperty = f34676a[0];
        return (TypingIndicatorView) lazy.getValue();
    }

    public bh(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        if (!isInEditMode()) {
            m42817a();
        }
        ConstraintLayout.inflate(context, R.layout.chat_typing_indicator_item_view, this);
        setLayoutParams(new LayoutParams(-2, -2));
    }

    @NotNull
    public final aq getPresenter$Tinder_release() {
        aq aqVar = this.f34677b;
        if (aqVar == null) {
            C2668g.b("presenter");
        }
        return aqVar;
    }

    public final void setPresenter$Tinder_release(@NotNull aq aqVar) {
        C2668g.b(aqVar, "<set-?>");
        this.f34677b = aqVar;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        aq aqVar = this.f34677b;
        if (aqVar == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, aqVar);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void bind() {
        getTypingIndicatorView$Tinder_release().a();
    }

    public void bindAvatar(@NotNull String str) {
        C2668g.b(str, "url");
        getChatAvatarView().m36175a(str);
    }

    /* renamed from: a */
    private final void m42817a() {
        Context a = C14398a.a(getContext());
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) a).provideChatActivityComponent().inject(this);
    }
}
