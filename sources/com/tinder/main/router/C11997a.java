package com.tinder.main.router;

import com.tinder.activities.MainActivity;
import com.tinder.base.p172b.C8301a;
import com.tinder.main.model.MainPage;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/main/router/TinderMainPageRouter;", "Lcom/tinder/main/router/MainPageRouter;", "mainActivity", "Lcom/tinder/activities/MainActivity;", "mainThreadExecutionVerifier", "Lcom/tinder/base/concurrency/MainThreadExecutionVerifier;", "(Lcom/tinder/activities/MainActivity;Lcom/tinder/base/concurrency/MainThreadExecutionVerifier;)V", "navigateTo", "", "mainPage", "Lcom/tinder/main/model/MainPage;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.router.a */
public final class C11997a implements MainPageRouter {
    /* renamed from: a */
    private final MainActivity f38952a;
    /* renamed from: b */
    private final C8301a f38953b;

    public C11997a(@NotNull MainActivity mainActivity, @NotNull C8301a c8301a) {
        C2668g.b(mainActivity, "mainActivity");
        C2668g.b(c8301a, "mainThreadExecutionVerifier");
        this.f38952a = mainActivity;
        this.f38953b = c8301a;
    }

    public void navigateTo(@NotNull MainPage mainPage) {
        C2668g.b(mainPage, "mainPage");
        this.f38953b.m35392a();
        this.f38952a.e().setDisplayedPage(mainPage);
    }
}
