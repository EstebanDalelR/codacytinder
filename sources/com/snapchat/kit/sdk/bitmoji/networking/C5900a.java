package com.snapchat.kit.sdk.bitmoji.networking;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import com.google.gson.Gson;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.BitmojiScope;
import com.snapchat.kit.sdk.bitmoji.models.StickerPacks;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5890a;
import com.snapchat.kit.sdk.core.models.UserBitmojiData;
import com.snapchat.kit.sdk.core.models.UserDataResponse;
import com.snapchat.kit.sdk.core.networking.LoginClient;
import com.tinder.api.ManagerWebServices;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import javax.inject.Inject;
import org.apache.commons.lang3.time.FastDateFormat;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.RetrofitError.Kind;
import retrofit.client.C19370e;

@BitmojiScope
/* renamed from: com.snapchat.kit.sdk.bitmoji.networking.a */
public class C5900a {
    /* renamed from: a */
    private static final FastDateFormat f21604a = FastDateFormat.a("yyyy-MM-dd'T'HH:mm:ssZZ", Calendar.getInstance().getTimeZone());
    /* renamed from: b */
    private final LoginClient f21605b;
    /* renamed from: c */
    private final C5890a f21606c;
    /* renamed from: d */
    private final Gson f21607d;

    /* renamed from: com.snapchat.kit.sdk.bitmoji.networking.a$a */
    private interface C5899a<T> {
        @UiThread
        /* renamed from: a */
        void mo6389a(@NonNull UserBitmojiData userBitmojiData, @NonNull BitmojiClientCallback<T> bitmojiClientCallback);
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.networking.a$1 */
    class C71231 implements C5899a<String> {
        /* renamed from: a */
        final /* synthetic */ C5900a f25798a;

        C71231(C5900a c5900a) {
            this.f25798a = c5900a;
        }

        @UiThread
        /* renamed from: a */
        public void mo6389a(@NonNull UserBitmojiData userBitmojiData, @NonNull BitmojiClientCallback<String> bitmojiClientCallback) {
            bitmojiClientCallback.onSuccess(userBitmojiData.getAvatar());
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.networking.a$2 */
    class C71242 implements C5899a<StickerPacks> {
        /* renamed from: a */
        final /* synthetic */ C5900a f25799a;

        C71242(C5900a c5900a) {
            this.f25799a = c5900a;
        }

        @android.support.annotation.UiThread
        /* renamed from: a */
        public void mo6389a(@android.support.annotation.NonNull com.snapchat.kit.sdk.core.models.UserBitmojiData r3, @android.support.annotation.NonNull com.snapchat.kit.sdk.bitmoji.networking.BitmojiClientCallback<com.snapchat.kit.sdk.bitmoji.models.StickerPacks> r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r0 = r2.f25799a;	 Catch:{ JsonSyntaxException -> 0x0016 }
            r0 = r0.f21607d;	 Catch:{ JsonSyntaxException -> 0x0016 }
            r3 = r3.getPacksJson();	 Catch:{ JsonSyntaxException -> 0x0016 }
            r1 = com.snapchat.kit.sdk.bitmoji.models.StickerPacks.class;	 Catch:{ JsonSyntaxException -> 0x0016 }
            r3 = r0.fromJson(r3, r1);	 Catch:{ JsonSyntaxException -> 0x0016 }
            r3 = (com.snapchat.kit.sdk.bitmoji.models.StickerPacks) r3;	 Catch:{ JsonSyntaxException -> 0x0016 }
            r4.onSuccess(r3);	 Catch:{ JsonSyntaxException -> 0x0016 }
            goto L_0x001c;
        L_0x0016:
            r3 = 0;
            r0 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
            r4.onFailure(r3, r0);
        L_0x001c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.bitmoji.networking.a.2.a(com.snapchat.kit.sdk.core.models.UserBitmojiData, com.snapchat.kit.sdk.bitmoji.networking.BitmojiClientCallback):void");
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.networking.a$b */
    private static class C7126b<T> implements Callback<UserDataResponse> {
        /* renamed from: a */
        private final BitmojiClientCallback<T> f25804a;
        /* renamed from: b */
        private final C5899a<T> f25805b;

        public /* synthetic */ void success(Object obj, C19370e c19370e) {
            m30721a((UserDataResponse) obj, c19370e);
        }

        private C7126b(@NonNull BitmojiClientCallback<T> bitmojiClientCallback, @NonNull C5899a<T> c5899a) {
            this.f25804a = bitmojiClientCallback;
            this.f25805b = c5899a;
        }

        /* renamed from: a */
        public void m30721a(UserDataResponse userDataResponse, C19370e c19370e) {
            c19370e = C7126b.m30720a(userDataResponse);
            if (userDataResponse.hasError() == null) {
                if (c19370e != null) {
                    this.f25805b.mo6389a(c19370e, this.f25804a);
                    return;
                }
            }
            this.f25804a.onFailure(null, 500);
        }

        public void failure(RetrofitError retrofitError) {
            int i;
            if (retrofitError.b() == null) {
                i = -1;
            } else {
                i = retrofitError.b().b();
            }
            this.f25804a.onFailure(retrofitError.c() == Kind.NETWORK ? true : null, i);
        }

        @Nullable
        /* renamed from: a */
        private static UserBitmojiData m30720a(UserDataResponse userDataResponse) {
            userDataResponse = userDataResponse.getData();
            if (userDataResponse != null) {
                if (userDataResponse.getMe() != null) {
                    return userDataResponse.getMe().getBitmojiData();
                }
            }
            return null;
        }
    }

    @Inject
    C5900a(LoginClient loginClient, C5890a c5890a, Gson gson) {
        this.f21605b = loginClient;
        this.f21606c = c5890a;
        this.f21607d = gson;
    }

    /* renamed from: a */
    public void m25460a(@NonNull FetchAvatarUrlCallback fetchAvatarUrlCallback) {
        this.f21605b.fetchUserData("{me{bitmoji{avatar}}}", null, new C7126b(C5900a.m25458a(this.f21606c, "avatar", fetchAvatarUrlCallback), new C71231(this)));
    }

    /* renamed from: a */
    public void m25461a(@NonNull Locale locale, @NonNull BitmojiClientCallback<StickerPacks> bitmojiClientCallback) {
        Object hashMap = new HashMap(3);
        hashMap.put("page", "bitmoji-app");
        hashMap.put("time", f21604a.format(System.currentTimeMillis()));
        hashMap.put(ManagerWebServices.PARAM_LOCALE, C5900a.m25459a(locale));
        this.f21605b.fetchUserData("query ($page: String!, $time: String, $locale: String){me{bitmoji{packs(page: $page, time: $time, locale: $locale)}}}", this.f21607d.toJson(hashMap), new C7126b(C5900a.m25458a(this.f21606c, "packs", bitmojiClientCallback), new C71242(this)));
    }

    /* renamed from: a */
    private static String m25459a(@NonNull Locale locale) {
        if (locale.getCountry() == null) {
            return locale.getLanguage();
        }
        return String.format("%s-%s", new Object[]{locale.getLanguage(), locale.getCountry()});
    }

    /* renamed from: a */
    private static <T> BitmojiClientCallback<T> m25458a(C5890a c5890a, String str, BitmojiClientCallback<T> bitmojiClientCallback) {
        final long currentTimeMillis = System.currentTimeMillis();
        final C5890a c5890a2 = c5890a;
        final String str2 = str;
        final BitmojiClientCallback<T> bitmojiClientCallback2 = bitmojiClientCallback;
        return new BitmojiClientCallback<T>() {
            public void onSuccess(@Nullable T t) {
                c5890a2.m25425a(String.format("request:%s:success", new Object[]{str2}), 1);
                c5890a2.m25427b(String.format("request:%s", new Object[]{str2}), System.currentTimeMillis() - currentTimeMillis);
                bitmojiClientCallback2.onSuccess(t);
            }

            public void onFailure(boolean z, int i) {
                c5890a2.m25425a(String.format("request:%s:failure", new Object[]{str2}), 1);
                c5890a2.m25427b(String.format("request:%s", new Object[]{str2}), System.currentTimeMillis() - currentTimeMillis);
                bitmojiClientCallback2.onFailure(z, i);
            }
        };
    }
}
