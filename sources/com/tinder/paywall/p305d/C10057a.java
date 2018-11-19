package com.tinder.paywall.p305d;

import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.support.annotation.PluralsRes;
import android.support.annotation.StringRes;
import com.tinder.R;
import com.tinder.boost.viewmodel.RefreshUnit;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.domain.common.model.TimeInterval;
import com.tinder.domain.meta.model.BoostSettings$Unit;
import com.tinder.domain.superlike.SuperlikeStatus;
import javax.inject.Inject;

/* renamed from: com.tinder.paywall.d.a */
public class C10057a {
    /* renamed from: a */
    private final Resources f32955a;

    @Inject
    public C10057a(Resources resources) {
        this.f32955a = resources;
    }

    /* renamed from: a */
    public String m41124a(@StringRes int i, @Nullable BoostStatus boostStatus) {
        if (boostStatus == null) {
            return "";
        }
        String str;
        i = this.f32955a.getString(i);
        String quantityString = this.f32955a.getQuantityString(R.plurals.boost, boostStatus.getRefreshAmount());
        if (boostStatus.getRefreshInterval() <= 1) {
            str = "";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" ");
            stringBuilder.append(String.valueOf(boostStatus.getRefreshInterval()));
            str = stringBuilder.toString();
        }
        String quantityString2 = this.f32955a.getQuantityString(C10057a.m41122a(boostStatus.getRefreshIntervalUnit()).getStringRes(), boostStatus.getRefreshInterval());
        return String.format(i, new Object[]{Integer.valueOf(boostStatus.getRefreshAmount()), quantityString, str, quantityString2});
    }

    /* renamed from: a */
    public String m41126a(@Nullable BoostStatus boostStatus, boolean z) {
        if (boostStatus == null) {
            return "";
        }
        if (z) {
            return m41124a((int) true, boostStatus);
        }
        z = this.f32955a.getQuantityString(C10057a.m41122a(boostStatus.getRefreshIntervalUnit()).getStringRes(), boostStatus.getRefreshInterval());
        switch (boostStatus.getRefreshAmount()) {
            case 1:
                boostStatus = String.format(this.f32955a.getString(R.string.controlla_boost_description_male_one), new Object[]{z});
                break;
            case 2:
                boostStatus = String.format(this.f32955a.getString(R.string.controlla_boost_description_male_two), new Object[]{z});
                break;
            default:
                boostStatus = String.format(this.f32955a.getString(R.string.controlla_boost_description_male_other), new Object[]{Integer.valueOf(boostStatus), z});
                break;
        }
        return boostStatus;
    }

    /* renamed from: a */
    public String m41125a(@PluralsRes int i, @Nullable SuperlikeStatus superlikeStatus) {
        if (superlikeStatus == null) {
            return "";
        }
        i = this.f32955a.getQuantityString(i, superlikeStatus.refreshInterval().length());
        String quantityString = this.f32955a.getQuantityString(R.plurals.superlike_paywall_options, superlikeStatus.refreshAmount());
        String a = m41123a(superlikeStatus.refreshInterval());
        if (superlikeStatus.refreshInterval().length() > 0) {
            a = String.format(a, new Object[]{Integer.valueOf(superlikeStatus.refreshInterval().length())});
        }
        return String.format(i, new Object[]{Integer.valueOf(superlikeStatus.refreshAmount()), quantityString, a});
    }

    /* renamed from: a */
    private static RefreshUnit m41122a(BoostSettings$Unit boostSettings$Unit) {
        switch (boostSettings$Unit) {
            case DAY:
                return RefreshUnit.DAYS;
            case WEEK:
                return RefreshUnit.WEEKS;
            case MONTH:
                return RefreshUnit.MONTHS;
            case SECOND:
                return RefreshUnit.SECONDS;
            default:
                return RefreshUnit.MONTHS;
        }
    }

    /* renamed from: a */
    private String m41123a(TimeInterval timeInterval) {
        switch (timeInterval.unit()) {
            case SECOND:
                return this.f32955a.getQuantityString(R.plurals.every_second, timeInterval.length());
            case HOUR:
                return this.f32955a.getQuantityString(R.plurals.every_hour, timeInterval.length());
            case DAY:
                return this.f32955a.getQuantityString(R.plurals.every_day, timeInterval.length());
            case WEEK:
                return this.f32955a.getQuantityString(R.plurals.every_week, timeInterval.length());
            case MONTH:
                return this.f32955a.getQuantityString(R.plurals.every_month, timeInterval.length());
            default:
                return this.f32955a.getQuantityString(R.plurals.every_day, timeInterval.length());
        }
    }
}
