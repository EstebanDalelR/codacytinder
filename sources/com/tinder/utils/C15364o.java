package com.tinder.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"networkClass", "Lcom/tinder/utils/NetworkClass;", "Landroid/net/ConnectivityManager;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.utils.o */
public final class C15364o {
    @NotNull
    /* renamed from: a */
    public static final NetworkClass m57673a(@NotNull ConnectivityManager connectivityManager) {
        C2668g.b(connectivityManager, "$receiver");
        if (connectivityManager.getActiveNetworkInfo() != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            C2668g.a(activeNetworkInfo, "activeNetworkInfo");
            if (activeNetworkInfo.isConnected()) {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                C2668g.a(activeNetworkInfo, "activeNetworkInfo");
                if (activeNetworkInfo.getType() == 1) {
                    return NetworkClass.WIFI;
                }
                connectivityManager = connectivityManager.getActiveNetworkInfo();
                C2668g.a(connectivityManager, "activeNetworkInfo");
                switch (connectivityManager.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        connectivityManager = NetworkClass.NET_2G;
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        connectivityManager = NetworkClass.NET_3G;
                        break;
                    case 13:
                        connectivityManager = NetworkClass.NET_4G;
                        break;
                    default:
                        connectivityManager = NetworkClass.UNKNOWN;
                        break;
                }
                return connectivityManager;
            }
        }
        return NetworkClass.NOT_CONNECTED;
    }
}
