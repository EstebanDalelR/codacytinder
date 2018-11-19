package com.tinder.addy.source.nativedfp;

import android.content.Context;
import com.google.android.gms.ads.C2338a;
import com.google.android.gms.ads.C2340b.C2339a;
import com.google.android.gms.ads.C2414k.C2413a;
import com.google.android.gms.ads.doubleclick.C2345a;
import com.google.android.gms.ads.formats.NativeAdOptions.C2350a;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.tinder.addy.Ad;
import com.tinder.addy.AdLoader;
import com.tinder.addy.LoaderPriority;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Single;
import rx.SingleEmitter;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B7\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/addy/source/nativedfp/NativeDfpLoader;", "Lcom/tinder/addy/AdLoader;", "context", "Landroid/content/Context;", "adsUnitId", "", "templateId", "adFactory", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$AdFactory;", "priority", "Lcom/tinder/addy/LoaderPriority;", "publisherAdRequestFactory", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$PublisherAdRequestFactory;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$AdFactory;Lcom/tinder/addy/LoaderPriority;Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$PublisherAdRequestFactory;)V", "loadAd", "Lrx/Single;", "Lcom/tinder/addy/Ad;", "AdFactory", "Builder", "PublisherAdRequestFactory", "addy-source-nativedfp_release"}, k = 1, mv = {1, 1, 10})
public final class NativeDfpLoader implements AdLoader {
    /* renamed from: a */
    private final Context f26417a;
    /* renamed from: b */
    private final String f26418b;
    /* renamed from: c */
    private final String f26419c;
    /* renamed from: d */
    private final AdFactory f26420d;
    /* renamed from: e */
    private final LoaderPriority f26421e;
    /* renamed from: f */
    private final PublisherAdRequestFactory f26422f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$AdFactory;", "", "create", "Lcom/tinder/addy/Ad;", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "addy-source-nativedfp_release"}, k = 1, mv = {1, 1, 10})
    public interface AdFactory {
        @NotNull
        Ad create(@NotNull NativeCustomTemplateAd nativeCustomTemplateAd);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$PublisherAdRequestFactory;", "", "create", "Lrx/Single;", "Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;", "addy-source-nativedfp_release"}, k = 1, mv = {1, 1, 10})
    public interface PublisherAdRequestFactory {
        @NotNull
        Single<C2345a> create();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adFactory", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$AdFactory;", "adsUnitId", "", "priority", "Lcom/tinder/addy/LoaderPriority;", "publisherAdRequestFactory", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$PublisherAdRequestFactory;", "templateId", "unitId", "build", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader;", "loaderPriority", "addy-source-nativedfp_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.source.nativedfp.NativeDfpLoader$a */
    public static final class C6191a {
        /* renamed from: a */
        private String f22749a;
        /* renamed from: b */
        private String f22750b;
        /* renamed from: c */
        private AdFactory f22751c;
        /* renamed from: d */
        private LoaderPriority f22752d;
        /* renamed from: e */
        private PublisherAdRequestFactory f22753e;
        /* renamed from: f */
        private final Context f22754f;

        public C6191a(@NotNull Context context) {
            C2668g.b(context, "context");
            this.f22754f = context;
        }

        @NotNull
        /* renamed from: a */
        public final C6191a m26811a(@NotNull String str) {
            C2668g.b(str, "unitId");
            this.f22749a = str;
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C6191a m26813b(@NotNull String str) {
            C2668g.b(str, "templateId");
            this.f22750b = str;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C6191a m26809a(@NotNull AdFactory adFactory) {
            C2668g.b(adFactory, "adFactory");
            this.f22751c = adFactory;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C6191a m26808a(@NotNull LoaderPriority loaderPriority) {
            C2668g.b(loaderPriority, "loaderPriority");
            this.f22752d = loaderPriority;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C6191a m26810a(@NotNull PublisherAdRequestFactory publisherAdRequestFactory) {
            C2668g.b(publisherAdRequestFactory, "publisherAdRequestFactory");
            this.f22753e = publisherAdRequestFactory;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final NativeDfpLoader m26812a() {
            Context context = this.f22754f;
            String str = this.f22749a;
            if (str == null) {
                C2668g.b("adsUnitId");
            }
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String str2 = this.f22750b;
            if (str2 == null) {
                C2668g.b("templateId");
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            AdFactory adFactory = this.f22751c;
            if (adFactory == null) {
                C2668g.b("adFactory");
            }
            if (adFactory == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            LoaderPriority loaderPriority = this.f22752d;
            if (loaderPriority == null) {
                C2668g.b("priority");
            }
            if (loaderPriority == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            PublisherAdRequestFactory publisherAdRequestFactory = this.f22753e;
            if (publisherAdRequestFactory == null) {
                C2668g.b("publisherAdRequestFactory");
            }
            if (publisherAdRequestFactory != null) {
                return new NativeDfpLoader(context, str, str2, adFactory, loaderPriority, publisherAdRequestFactory);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/addy/Ad;", "kotlin.jvm.PlatformType", "it", "Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.source.nativedfp.NativeDfpLoader$b */
    static final class C7977b<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ NativeDfpLoader f28591a;

        C7977b(NativeDfpLoader nativeDfpLoader) {
            this.f28591a = nativeDfpLoader;
        }

        public /* synthetic */ Object call(Object obj) {
            return m33858a((C2345a) obj);
        }

        /* renamed from: a */
        public final Single<Ad> m33858a(final C2345a c2345a) {
            return Single.a(new Action1<SingleEmitter<T>>() {

                @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "kotlin.jvm.PlatformType", "onCustomTemplateAdLoaded"}, k = 3, mv = {1, 1, 10})
                /* renamed from: com.tinder.addy.source.nativedfp.NativeDfpLoader$b$1$a */
                static final class C7302a implements OnCustomTemplateAdLoadedListener {
                    /* renamed from: a */
                    final /* synthetic */ C81211 f26413a;
                    /* renamed from: b */
                    final /* synthetic */ SingleEmitter f26414b;

                    C7302a(C81211 c81211, SingleEmitter singleEmitter) {
                        this.f26413a = c81211;
                        this.f26414b = singleEmitter;
                    }

                    public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
                        try {
                            AdFactory d = this.f28591a.f26420d;
                            C2668g.a(nativeCustomTemplateAd, "nativeCustomTemplateAd");
                            this.f26414b.onSuccess(d.create(nativeCustomTemplateAd));
                        } catch (NativeCustomTemplateAd nativeCustomTemplateAd2) {
                            this.f26414b.onError(nativeCustomTemplateAd2);
                        }
                    }
                }

                @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "kotlin.jvm.PlatformType", "clickAction", "", "onCustomClick"}, k = 3, mv = {1, 1, 10})
                /* renamed from: com.tinder.addy.source.nativedfp.NativeDfpLoader$b$1$b */
                static final class C7303b implements OnCustomClickListener {
                    /* renamed from: a */
                    public static final C7303b f26415a = new C7303b();

                    C7303b() {
                    }

                    public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
                        C0001a.b(str, new Object[null]);
                    }
                }

                @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/addy/source/nativedfp/NativeDfpLoader$loadAd$1$1$adLoader$3", "Lcom/google/android/gms/ads/AdListener;", "(Lrx/SingleEmitter;)V", "onAdFailedToLoad", "", "errorCode", "", "addy-source-nativedfp_release"}, k = 1, mv = {1, 1, 10})
                /* renamed from: com.tinder.addy.source.nativedfp.NativeDfpLoader$b$1$c */
                public static final class C7304c extends C2338a {
                    /* renamed from: a */
                    final /* synthetic */ SingleEmitter f26416a;

                    C7304c(SingleEmitter singleEmitter) {
                        this.f26416a = singleEmitter;
                    }

                    public void onAdFailedToLoad(int i) {
                        this.f26416a.onError(new NativeDfpException(i));
                    }
                }

                public /* synthetic */ void call(Object obj) {
                    m34528a((SingleEmitter) obj);
                }

                /* renamed from: a */
                public final void m34528a(SingleEmitter<Ad> singleEmitter) {
                    new C2339a(this.f28591a.f26417a, this.f28591a.f26418b).a(this.f28591a.f26419c, new C7302a(this, singleEmitter), C7303b.f26415a).a(new C7304c(singleEmitter)).a(new C2350a().a(new C2413a().b(true).a(true).a()).a()).a().a(c2345a);
                }
            });
        }
    }

    private NativeDfpLoader(Context context, String str, String str2, AdFactory adFactory, LoaderPriority loaderPriority, PublisherAdRequestFactory publisherAdRequestFactory) {
        this.f26417a = context;
        this.f26418b = str;
        this.f26419c = str2;
        this.f26420d = adFactory;
        this.f26421e = loaderPriority;
        this.f26422f = publisherAdRequestFactory;
    }

    @NotNull
    public Single<Ad> loadAd() {
        Single<Ad> a = this.f26422f.create().a(new C7977b(this));
        C2668g.a(a, "publisherAdRequestFactor…          }\n            }");
        return a;
    }

    @NotNull
    public LoaderPriority priority() {
        return this.f26421e;
    }
}
