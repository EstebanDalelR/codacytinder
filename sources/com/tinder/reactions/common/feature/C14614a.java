package com.tinder.reactions.common.feature;

import android.view.View;
import com.jakewharton.rxbinding.view.C5707b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"onBindComplete", "", "Lcom/tinder/reactions/common/feature/FeatureLifecycle;", "view", "Landroid/view/View;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.common.feature.a */
public final class C14614a {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.common.feature.a$a */
    static final class C18694a<T> implements Action1<Void> {
        /* renamed from: a */
        final /* synthetic */ FeatureLifecycle f58175a;

        C18694a(FeatureLifecycle featureLifecycle) {
            this.f58175a = featureLifecycle;
        }

        public /* synthetic */ void call(Object obj) {
            m67125a((Void) obj);
        }

        /* renamed from: a */
        public final void m67125a(Void voidR) {
            this.f58175a.onDetached();
        }
    }

    /* renamed from: a */
    public static final void m55766a(@NotNull FeatureLifecycle featureLifecycle, @NotNull View view) {
        C2668g.b(featureLifecycle, "$receiver");
        C2668g.b(view, "view");
        featureLifecycle.onAttached();
        C5707b.a(view).a(C19397a.a()).d(new C18694a(featureLifecycle));
    }
}
