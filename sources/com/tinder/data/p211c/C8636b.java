package com.tinder.data.p211c;

import android.app.Application;
import com.github.pwittchen.reactivenetwork.library.rx2.C1995a;
import com.github.pwittchen.reactivenetwork.library.rx2.C1997c;
import io.reactivex.C3959e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/data/connectivity/ReactiveNetworkWrapper;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "observeNetworkConnectivity", "Lio/reactivex/Observable;", "Lcom/github/pwittchen/reactivenetwork/library/rx2/Connectivity;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.c.b */
public final class C8636b {
    /* renamed from: a */
    private final Application f30490a;

    @Inject
    public C8636b(@NotNull Application application) {
        C2668g.b(application, "application");
        this.f30490a = application;
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<C1995a> m36790a() {
        C3959e<C1995a> a = C1997c.a(this.f30490a);
        C2668g.a(a, "ReactiveNetwork.observeN…Connectivity(application)");
        return a;
    }
}
