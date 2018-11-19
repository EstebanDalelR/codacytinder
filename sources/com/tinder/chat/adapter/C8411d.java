package com.tinder.chat.adapter;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.tinder.typingindicator.model.TypingIndicatorExperimentUtility;
import dagger.Lazy;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/chat/adapter/ExperimentAwareChatItemAnimatorWrapper;", "", "typingIndicatorExperimentUtility", "Lcom/tinder/typingindicator/model/TypingIndicatorExperimentUtility;", "noMorphTypingIndicatorItemAnimator", "Ldagger/Lazy;", "Lcom/tinder/chat/adapter/NoMorphTypingIndicatorItemAnimator;", "typingIndicatorMessageMorphItemAnimator", "Lcom/tinder/chat/adapter/TypingIndicatorMessageMorphItemAnimator;", "defaultChatItemAnimator", "Landroid/support/v7/widget/RecyclerView$ItemAnimator;", "(Lcom/tinder/typingindicator/model/TypingIndicatorExperimentUtility;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;)V", "itemAnimator", "getItemAnimator", "()Landroid/support/v7/widget/RecyclerView$ItemAnimator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.adapter.d */
public final class C8411d {
    @NotNull
    /* renamed from: a */
    private final ItemAnimator f29851a;

    @Inject
    public C8411d(@NotNull TypingIndicatorExperimentUtility typingIndicatorExperimentUtility, @NotNull Lazy<C13660f> lazy, @NotNull Lazy<C13661h> lazy2, @NotNull Lazy<ItemAnimator> lazy3) {
        C2668g.b(typingIndicatorExperimentUtility, "typingIndicatorExperimentUtility");
        C2668g.b(lazy, "noMorphTypingIndicatorItemAnimator");
        C2668g.b(lazy2, "typingIndicatorMessageMorphItemAnimator");
        C2668g.b(lazy3, "defaultChatItemAnimator");
        if (typingIndicatorExperimentUtility.isTypingIndicatorEnabled()) {
            if (typingIndicatorExperimentUtility.isTypingIndicatorMorphAnimationEnabled() != null) {
                typingIndicatorExperimentUtility = (DefaultItemAnimator) lazy2.get();
            } else {
                typingIndicatorExperimentUtility = (DefaultItemAnimator) lazy.get();
            }
            C2668g.a(typingIndicatorExperimentUtility, "if (typingIndicatorExper…mator.get()\n            }");
            typingIndicatorExperimentUtility = (ItemAnimator) typingIndicatorExperimentUtility;
        } else {
            typingIndicatorExperimentUtility = lazy3.get();
            C2668g.a(typingIndicatorExperimentUtility, "defaultChatItemAnimator.get()");
            typingIndicatorExperimentUtility = (ItemAnimator) typingIndicatorExperimentUtility;
        }
        this.f29851a = typingIndicatorExperimentUtility;
    }

    @NotNull
    /* renamed from: a */
    public final ItemAnimator m35886a() {
        return this.f29851a;
    }
}
