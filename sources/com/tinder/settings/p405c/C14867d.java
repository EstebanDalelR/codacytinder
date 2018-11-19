package com.tinder.settings.p405c;

import de.psdev.licensesdialog.licenses.ApacheSoftwareLicense20;
import de.psdev.licensesdialog.licenses.BSD2ClauseLicense;
import de.psdev.licensesdialog.licenses.BSD3ClauseLicense;
import de.psdev.licensesdialog.model.Notice;
import de.psdev.licensesdialog.model.Notices;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/settings/repository/NoticeRepository;", "", "()V", "getNotices", "Lde/psdev/licensesdialog/model/Notices;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.c.d */
public final class C14867d {
    @NotNull
    /* renamed from: a */
    public final Notices m56288a() {
        Notices notices = new Notices();
        notices.addNotice(new Notice("Google Play Services", "https://developers.google.com/android/guides/overview", "The Android Open Source Project", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("Android InApp Billing v3", "https://github.com/anjlab/android-inapp-billing-v3", "AnjLab", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("Facebook Android SDK", "https://github.com/facebook/facebook-android-sdk", "Facebook, Inc.", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("GSON", "https://github.com/google/gson", "Google, Inc.", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("OkHTTP", "https://github.com/square/okhttp", "Square, Inc.", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("okio", "https://github.com/square/okio", "Square, Inc.", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("libphonenumber", "https://github.com/googlei18n/libphonenumber", "Google, Inc.", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("Stetho", "http://facebook.github.io/stetho/", "Facebook, Inc.", new BSD3ClauseLicense()));
        notices.addNotice(new Notice("Rebound", "http://facebook.github.io/rebound/", "Facebook, Inc.", new BSD2ClauseLicense()));
        notices.addNotice(new Notice("EventBus", "https://github.com/greenrobot/EventBus/", "Markus Junginger, greenrobot", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("Dagger", "https://github.com/google/dagger", "Square, Inc and Google, Inc", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("AndroidSVG", "https://github.com/BigBadaboom/androidsvg", "Paul LeBeau, Cave Rock Software Ltd.", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("SVG-Android", "https://github.com/japgolly/svg-android", "Larva Labs, LLC", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("Volley", "https://github.com/mcxiaoke/android-volley", "Xiaoke Zhang & The Android Open Source Project", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("Glide", "https://github.com/bumptech/glide", "Bumptech", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("StreamSupport", "http://sourceforge.net/projects/streamsupport/", "Stefan Zobel", new BSD2ClauseLicense()));
        notices.addNotice(new Notice("ViewPagerIndicator", "https://github.com/JakeWharton/ViewPagerIndicator", "Jake Wharton, Patrik Åkerfeldt, Francisco Figueiredo Jr.", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("RxAndroid", "https://github.com/ReactiveX/RxAndroid", "The RxAndroid authors", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("Retrofit", "https://github.com/square/retrofit", "Square, Inc.", new ApacheSoftwareLicense20()));
        notices.addNotice(new Notice("Android Image Cropper", "https://github.com/ArthurHub/Android-Image-Cropper", "Arthur Teplitzki, 2013, Edmodo, Inc", new ApacheSoftwareLicense20()));
        return notices;
    }
}
