package com.tinder.main.p345a;

import android.view.View;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.activities.MainActivity;
import com.tinder.common.view.Container;
import com.tinder.main.BackPressInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/main/interceptor/FocusedContainerInRootViewBackPressInterceptor;", "Lcom/tinder/main/BackPressInterceptor;", "mainActivity", "Lcom/tinder/activities/MainActivity;", "(Lcom/tinder/activities/MainActivity;)V", "intercept", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.a.a */
public final class C11989a implements BackPressInterceptor {
    /* renamed from: a */
    private final MainActivity f38941a;

    public C11989a(@NotNull MainActivity mainActivity) {
        C2668g.b(mainActivity, "mainActivity");
        this.f38941a = mainActivity;
    }

    public boolean intercept() {
        ViewGroup viewGroup = (ViewGroup) this.f38941a.findViewById(R.id.main_activity_container);
        C2668g.a(viewGroup, "rootView");
        View focusedChild = viewGroup.getFocusedChild();
        return (focusedChild instanceof Container) && ((Container) focusedChild).onBackPressed();
    }
}
