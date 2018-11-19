package com.tinder.interactors;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/interactors/ConnectivityInteractor;", "", "telephonyManager", "Landroid/telephony/TelephonyManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "(Landroid/telephony/TelephonyManager;Landroid/net/ConnectivityManager;)V", "dataProvider", "", "getDataProvider", "()Ljava/lang/String;", "isOnWifi", "", "()Z", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "Use ConnectivityRepository.observe() to subscribe to ConnectivityInfo updates.", replaceWith = @ReplaceWith(expression = "observe()", imports = {"com.tinder.domain.connectivity.ConnectivityRepository"}))
/* renamed from: com.tinder.interactors.c */
public final class C2647c {
    /* renamed from: a */
    private final TelephonyManager f8295a;
    /* renamed from: b */
    private final ConnectivityManager f8296b;

    @Inject
    public C2647c(@NotNull TelephonyManager telephonyManager, @NotNull ConnectivityManager connectivityManager) {
        C2668g.m10309b(telephonyManager, "telephonyManager");
        C2668g.m10309b(connectivityManager, "connectivityManager");
        this.f8295a = telephonyManager;
        this.f8296b = connectivityManager;
    }

    @NotNull
    /* renamed from: a */
    public final String m10050a() {
        if (m10049b()) {
            return "wifi";
        }
        Object networkOperatorName = this.f8295a.getNetworkOperatorName();
        C2668g.m10305a(networkOperatorName, "telephonyManager.networkOperatorName");
        return networkOperatorName;
    }

    /* renamed from: b */
    private final boolean m10049b() {
        Object networkInfo = this.f8296b.getNetworkInfo(1);
        C2668g.m10305a(networkInfo, "connectivityManager.getN…ctivityManager.TYPE_WIFI)");
        return networkInfo.isConnected();
    }
}
