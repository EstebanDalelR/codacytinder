package com.tinder.bitmoji.repository;

import android.content.SharedPreferences;
import com.f2prateek.rx.preferences.C1159e;
import com.f2prateek.rx.preferences.Preference;
import com.tinder.bitmoji.C8321a;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00130\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/bitmoji/repository/BitmojiImageUrlDataRepository;", "Lcom/tinder/bitmoji/repository/BitmojiImageUrlRepository;", "sharedPreference", "Landroid/content/SharedPreferences;", "bitmojiAvatarImageApiClient", "Lcom/tinder/bitmoji/BitmojiAvatarImageApiClient;", "(Landroid/content/SharedPreferences;Lcom/tinder/bitmoji/BitmojiAvatarImageApiClient;)V", "avatarImageUrlPref", "Lcom/f2prateek/rx/preferences/Preference;", "", "kotlin.jvm.PlatformType", "rxPreferences", "Lcom/f2prateek/rx/preferences/RxSharedPreferences;", "clearImageUrl", "", "isUserBitmojiAvatarAvailable", "", "observeImageUrl", "Lio/reactivex/Observable;", "Ljava8/util/Optional;", "syncImageUrl", "Lio/reactivex/Completable;", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.repository.c */
public final class C10395c implements BitmojiImageUrlRepository {
    /* renamed from: a */
    private final C1159e f33880a;
    /* renamed from: b */
    private final Preference<String> f33881b = this.f33880a.a("bitmoji_avatar_image_url", null);
    /* renamed from: c */
    private final C8321a f33882c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "imageUrl", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.repository.c$b */
    static final class C10393b<T, R> implements Function<String, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C10395c f33878a;

        C10393b(C10395c c10395c) {
            this.f33878a = c10395c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m42212a((String) obj);
        }

        /* renamed from: a */
        public final C3956a m42212a(@NotNull final String str) {
            C2668g.b(str, "imageUrl");
            return C3956a.a(new Action() {
                public final void run() {
                    this.f33878a.f33881b.a(str);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.repository.c$c */
    static final class C10394c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C10395c f33879a;

        C10394c(C10395c c10395c) {
            this.f33879a = c10395c;
        }

        public /* synthetic */ void accept(Object obj) {
            m42213a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m42213a(Throwable th) {
            this.f33879a.f33881b.b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "", "kotlin.jvm.PlatformType", "imageUrl", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.repository.c$a */
    static final class C12621a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12621a f40723a = new C12621a();

        C12621a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m49845a((String) obj);
        }

        /* renamed from: a */
        public final Optional<String> m49845a(String str) {
            return Optional.b(str);
        }
    }

    public C10395c(@NotNull SharedPreferences sharedPreferences, @NotNull C8321a c8321a) {
        C2668g.b(sharedPreferences, "sharedPreference");
        C2668g.b(c8321a, "bitmojiAvatarImageApiClient");
        this.f33882c = c8321a;
        this.f33880a = C1159e.a(sharedPreferences);
    }

    @NotNull
    public C3956a syncImageUrl() {
        C3956a a = this.f33882c.m35430a().e(new C10393b(this)).a(new C10394c(this));
        C2668g.a(a, "bitmojiAvatarImageApiCli…arImageUrlPref.delete() }");
        return a;
    }

    @NotNull
    public C3959e<Optional<String>> observeImageUrl() {
        Observable k = this.f33881b.c().k(C12621a.f40723a);
        C2668g.a(k, "avatarImageUrlPref.asObs…al.ofNullable(imageUrl) }");
        return RxJavaInteropExtKt.toV2Observable(k);
    }

    public void clearImageUrl() {
        this.f33881b.b();
    }

    public boolean isUserBitmojiAvatarAvailable() {
        int i;
        CharSequence charSequence = (String) this.f33881b.a();
        if (charSequence != null) {
            if (charSequence.length() != 0) {
                i = 0;
                return i ^ true;
            }
        }
        i = 1;
        return i ^ true;
    }
}
