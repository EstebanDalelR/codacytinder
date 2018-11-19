package com.tinder.profile.presenter;

import com.tinder.common.navigation.Screen;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.screenshotty.p401a.C14826a;
import io.reactivex.functions.BiFunction;

final /* synthetic */ class as implements BiFunction {
    /* renamed from: a */
    private final ak f50164a;
    /* renamed from: b */
    private final ProfileScreenSource f50165b;
    /* renamed from: c */
    private final String f50166c;

    as(ak akVar, ProfileScreenSource profileScreenSource, String str) {
        this.f50164a = akVar;
        this.f50165b = profileScreenSource;
        this.f50166c = str;
    }

    public Object apply(Object obj, Object obj2) {
        return this.f50164a.m54995a(this.f50165b, this.f50166c, (C14826a) obj, (Screen) obj2);
    }
}
