package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.CommonConnection;
import com.tinder.etl.event.ut;
import com.tinder.etl.event.ut.C9296a;
import com.tinder.managers.bk;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.Profile.Adornment;
import java.util.List;
import javax.inject.Inject;

/* renamed from: com.tinder.profile.b.s */
public class C14392s {
    @NonNull
    /* renamed from: a */
    private final C2630h f45587a;
    @NonNull
    /* renamed from: b */
    private final bk f45588b;

    @Inject
    public C14392s(@NonNull C2630h c2630h, @NonNull bk bkVar) {
        this.f45587a = c2630h;
        this.f45588b = bkVar;
    }

    /* renamed from: a */
    public void m54827a(@NonNull String str, @NonNull Profile profile) {
        C9296a a = ut.a().b(profile.mo11651a()).a(Integer.valueOf(C14392s.m54823a(this.f45588b.N()))).a(Boolean.valueOf(profile.mo11647B()));
        if (!profile.mo11672v().isEmpty()) {
            a.b(Integer.valueOf(C14392s.m54824a(profile.mo11672v()))).c(Integer.valueOf(C14392s.m54826b(profile.mo11672v())));
        }
        a.a(str).b(Boolean.valueOf(profile.mo11661k().contains(Adornment.PASSPORT)));
        this.f45587a.a(a.a());
    }

    /* renamed from: a */
    private static int m54823a(@NonNull String str) {
        int hashCode = str.hashCode();
        if (hashCode != -2023617739) {
            if (hashCode != -1249477246) {
                if (hashCode != 288459765) {
                    if (hashCode == 1082295151) {
                        if (str.equals("recency") != null) {
                            str = 3;
                            switch (str) {
                                case null:
                                    return 0;
                                case 1:
                                    return 1;
                                case 2:
                                    return 2;
                                case 3:
                                    return 3;
                                default:
                                    return 0;
                            }
                        }
                    }
                } else if (str.equals("distance") != null) {
                    str = 2;
                    switch (str) {
                        case null:
                            return 0;
                        case 1:
                            return 1;
                        case 2:
                            return 2;
                        case 3:
                            return 3;
                        default:
                            return 0;
                    }
                }
            } else if (str.equals("optimal") != null) {
                str = null;
                switch (str) {
                    case null:
                        return 0;
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                    default:
                        return 0;
                }
            }
        } else if (str.equals(ManagerWebServices.PARAM_SPOTIFY_POPULARITY) != null) {
            str = true;
            switch (str) {
                case null:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                default:
                    return 0;
            }
        }
        str = -1;
        switch (str) {
            case null:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private static int m54824a(@NonNull List<CommonConnection> list) {
        return C14392s.m54825a((List) list, 1);
    }

    /* renamed from: b */
    private static int m54826b(@NonNull List<CommonConnection> list) {
        return C14392s.m54825a((List) list, 2);
    }

    /* renamed from: a */
    private static int m54825a(@NonNull List<CommonConnection> list, int i) {
        int i2 = 0;
        for (CommonConnection degree : list) {
            if (degree.degree() == i) {
                i2++;
            }
        }
        return i2;
    }
}
