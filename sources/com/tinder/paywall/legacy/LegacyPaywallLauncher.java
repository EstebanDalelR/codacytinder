package com.tinder.paywall.legacy;

import android.app.Activity;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001Jp\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/tinder/paywall/legacy/LegacyPaywallLauncher;", "", "launchPaywall", "", "source", "Lcom/tinder/paywall/legacy/PaywallTypeSource;", "activity", "Landroid/app/Activity;", "animationStartListener", "Lkotlin/Function0;", "dismissListener", "successListener", "failureListener", "imageUrls", "", "", "paywall_release"}, k = 1, mv = {1, 1, 10})
public interface LegacyPaywallLauncher {

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.legacy.LegacyPaywallLauncher$a */
    public static final class C10062a {
        /* renamed from: a */
        public static /* synthetic */ void m41130a(LegacyPaywallLauncher legacyPaywallLauncher, PaywallTypeSource paywallTypeSource, Activity activity, Function0 function0, Function0 function02, Function0 function03, Function0 function04, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchPaywall");
            }
            legacyPaywallLauncher.launchPaywall(paywallTypeSource, activity, (i & 4) != 0 ? (Function0) null : function0, (i & 8) != 0 ? (Function0) null : function02, (i & 16) != 0 ? (Function0) null : function03, (i & 32) != 0 ? (Function0) null : function04, (i & 64) != 0 ? C19301m.a() : list);
        }
    }

    void launchPaywall(@NotNull PaywallTypeSource paywallTypeSource, @NotNull Activity activity, @Nullable Function0<C15813i> function0, @Nullable Function0<C15813i> function02, @Nullable Function0<C15813i> function03, @Nullable Function0<C15813i> function04, @NotNull List<String> list);
}
