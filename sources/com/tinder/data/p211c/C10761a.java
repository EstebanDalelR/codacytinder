package com.tinder.data.p211c;

import android.net.NetworkInfo.State;
import com.github.pwittchen.reactivenetwork.library.rx2.C1995a;
import com.tinder.domain.common.model.ConnectivityInfo;
import com.tinder.domain.common.model.ConnectivityStatus;
import com.tinder.domain.connectivity.ConnectivityRepository;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/tinder/data/connectivity/ConnectivityDataRepository;", "Lcom/tinder/domain/connectivity/ConnectivityRepository;", "reactiveNetworkWrapper", "Lcom/tinder/data/connectivity/ReactiveNetworkWrapper;", "(Lcom/tinder/data/connectivity/ReactiveNetworkWrapper;)V", "connectivityStatus", "Lcom/tinder/domain/common/model/ConnectivityStatus;", "Lcom/github/pwittchen/reactivenetwork/library/rx2/Connectivity;", "getConnectivityStatus", "(Lcom/github/pwittchen/reactivenetwork/library/rx2/Connectivity;)Lcom/tinder/domain/common/model/ConnectivityStatus;", "mapConnectivityToConnectivityInfo", "Lcom/tinder/domain/common/model/ConnectivityInfo;", "connectivity", "observe", "Lio/reactivex/Observable;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.c.a */
public final class C10761a implements ConnectivityRepository {
    /* renamed from: a */
    private final C8636b f35160a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/common/model/ConnectivityInfo;", "it", "Lcom/github/pwittchen/reactivenetwork/library/rx2/Connectivity;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.c.a$a */
    static final class C10760a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10761a f35159a;

        C10760a(C10761a c10761a) {
            this.f35159a = c10761a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43161a((C1995a) obj);
        }

        @NotNull
        /* renamed from: a */
        public final ConnectivityInfo m43161a(@NotNull C1995a c1995a) {
            C2668g.b(c1995a, "it");
            return this.f35159a.m43162a(c1995a);
        }
    }

    public C10761a(@NotNull C8636b c8636b) {
        C2668g.b(c8636b, "reactiveNetworkWrapper");
        this.f35160a = c8636b;
    }

    @NotNull
    public C3959e<ConnectivityInfo> observe() {
        C3959e<ConnectivityInfo> distinctUntilChanged = this.f35160a.m36790a().map(new C10760a(this)).distinctUntilChanged();
        C2668g.a(distinctUntilChanged, "reactiveNetworkWrapper\n …  .distinctUntilChanged()");
        return distinctUntilChanged;
    }

    /* renamed from: a */
    private final ConnectivityInfo m43162a(C1995a c1995a) {
        if (c1995a.b() == State.CONNECTED) {
            c1995a = m43164b(c1995a);
        } else {
            c1995a = ConnectivityStatus.INACTIVE;
        }
        return new ConnectivityInfo(c1995a);
    }

    /* renamed from: b */
    private final ConnectivityStatus m43164b(@NotNull C1995a c1995a) {
        if (C19303i.a(c1995a.c(), ConnectivityStatus.WIFI.getValue(), true)) {
            return ConnectivityStatus.WIFI;
        }
        if (C19303i.a(c1995a.c(), ConnectivityStatus.MOBILE.getValue(), true) != null) {
            return ConnectivityStatus.MOBILE;
        }
        return ConnectivityStatus.INACTIVE;
    }
}
