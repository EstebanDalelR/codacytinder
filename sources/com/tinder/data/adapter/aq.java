package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.C1391d;
import com.foursquare.internal.util.C1948m;
import com.tinder.api.model.meta.SuperLikes;
import com.tinder.domain.common.model.TimeInterval;
import com.tinder.domain.common.model.TimeUnit;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.domain.superlike.SuperlikeStatus.Builder;
import java8.util.Objects;
import javax.inject.Inject;
import org.joda.time.DateTime;

public class aq extends C2646o<SuperlikeStatus, SuperLikes> {
    /* renamed from: a */
    private static final TimeInterval f35128a = TimeInterval.create(1, TimeUnit.DAY);
    @NonNull
    /* renamed from: b */
    private final C10738l f35129b;

    /* renamed from: a */
    private int m43112a() {
        return 5;
    }

    @Inject
    public aq(@NonNull C10738l c10738l) {
        this.f35129b = c10738l;
    }

    @NonNull
    /* renamed from: a */
    public SuperlikeStatus m43118a(@NonNull SuperLikes superLikes) {
        Builder refreshInterval = SuperlikeStatus.builder().refreshAmount(m43116d(superLikes)).refreshInterval(m43117e(superLikes));
        int b = m43114b(superLikes);
        refreshInterval.remainingCount(b).hasSuperlikes(b != 0);
        superLikes = m43115c(superLikes);
        if (superLikes != null) {
            refreshInterval.resetDate(superLikes);
            refreshInterval.resetDateInMillis(superLikes.getMillis());
            refreshInterval.millisUntilResetDate(Math.max(superLikes.getMillis() - DateTime.a().getMillis(), 0));
        } else {
            refreshInterval.resetDate(null);
            refreshInterval.resetDateInMillis(0);
            refreshInterval.millisUntilResetDate(0);
        }
        return refreshInterval.build();
    }

    /* renamed from: b */
    private int m43114b(@NonNull SuperLikes superLikes) {
        return ((Integer) Objects.b(superLikes.remaining(), Integer.valueOf(0))).intValue();
    }

    @Nullable
    /* renamed from: c */
    private DateTime m43115c(@NonNull SuperLikes superLikes) {
        String resetsAt = superLikes.resetsAt();
        if (resetsAt == null) {
            return null;
        }
        return this.f35129b.m43129a(resetsAt);
    }

    /* renamed from: d */
    private int m43116d(@NonNull SuperLikes superLikes) {
        superLikes = superLikes.refreshAmount();
        if (superLikes == null) {
            return m43112a();
        }
        return superLikes.intValue();
    }

    @NonNull
    /* renamed from: e */
    private TimeInterval m43117e(@NonNull SuperLikes superLikes) {
        Integer refreshInterval = superLikes.refreshInterval();
        String refreshIntervalUnit = superLikes.refreshIntervalUnit();
        if (refreshInterval != null) {
            if (refreshIntervalUnit != null) {
                return TimeInterval.create(refreshInterval.intValue(), m43113a(refreshIntervalUnit));
            }
        }
        return f35128a;
    }

    @NonNull
    /* renamed from: a */
    private TimeUnit m43113a(@NonNull String str) {
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode == 119) {
                            if (str.equals("w") != null) {
                                str = 3;
                                switch (str) {
                                    case null:
                                        return TimeUnit.SECOND;
                                    case 1:
                                        return TimeUnit.HOUR;
                                    case 2:
                                        return TimeUnit.DAY;
                                    case 3:
                                        return TimeUnit.WEEK;
                                    case 4:
                                        return TimeUnit.MONTH;
                                    default:
                                        return TimeUnit.DAY;
                                }
                            }
                        }
                    } else if (str.equals("s") != null) {
                        str = null;
                        switch (str) {
                            case null:
                                return TimeUnit.SECOND;
                            case 1:
                                return TimeUnit.HOUR;
                            case 2:
                                return TimeUnit.DAY;
                            case 3:
                                return TimeUnit.WEEK;
                            case 4:
                                return TimeUnit.MONTH;
                            default:
                                return TimeUnit.DAY;
                        }
                    }
                } else if (str.equals(C1948m.f5228a) != null) {
                    str = 4;
                    switch (str) {
                        case null:
                            return TimeUnit.SECOND;
                        case 1:
                            return TimeUnit.HOUR;
                        case 2:
                            return TimeUnit.DAY;
                        case 3:
                            return TimeUnit.WEEK;
                        case 4:
                            return TimeUnit.MONTH;
                        default:
                            return TimeUnit.DAY;
                    }
                }
            } else if (str.equals("h") != null) {
                str = true;
                switch (str) {
                    case null:
                        return TimeUnit.SECOND;
                    case 1:
                        return TimeUnit.HOUR;
                    case 2:
                        return TimeUnit.DAY;
                    case 3:
                        return TimeUnit.WEEK;
                    case 4:
                        return TimeUnit.MONTH;
                    default:
                        return TimeUnit.DAY;
                }
            }
        } else if (str.equals(C1391d.f3780a) != null) {
            str = 2;
            switch (str) {
                case null:
                    return TimeUnit.SECOND;
                case 1:
                    return TimeUnit.HOUR;
                case 2:
                    return TimeUnit.DAY;
                case 3:
                    return TimeUnit.WEEK;
                case 4:
                    return TimeUnit.MONTH;
                default:
                    return TimeUnit.DAY;
            }
        }
        str = -1;
        switch (str) {
            case null:
                return TimeUnit.SECOND;
            case 1:
                return TimeUnit.HOUR;
            case 2:
                return TimeUnit.DAY;
            case 3:
                return TimeUnit.WEEK;
            case 4:
                return TimeUnit.MONTH;
            default:
                return TimeUnit.DAY;
        }
    }
}
