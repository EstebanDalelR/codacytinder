package com.tinder.ads.source.dfp;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.ads.C2340b.C2339a;
import com.google.android.gms.ads.doubleclick.C2345a;
import com.google.android.gms.ads.doubleclick.C2345a.C2344a;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.ads.AdSource;
import com.tinder.ads.AdSource.Type;
import com.tinder.ads.AdSourceFetcher;
import com.tinder.ads.AdSourceFetcher.AdFactory;
import com.tinder.ads.SourcePriority;
import com.tinder.ads.validation.AdValidator.Rule;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001b\u001cBE\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001a\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00000\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/ads/source/dfp/NativeDfpSource;", "Lcom/tinder/ads/AdSource;", "context", "Landroid/content/Context;", "validationRules", "", "Lcom/tinder/ads/validation/AdValidator$Rule;", "adUnitId", "", "templateId", "adFactory", "Lcom/tinder/ads/source/dfp/NativeDfpSource$NativeDfpAdFactory;", "location", "Landroid/location/Location;", "targetingValues", "Lcom/tinder/ads/source/dfp/DfpCustomTargetingValues;", "(Landroid/content/Context;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/ads/source/dfp/NativeDfpSource$NativeDfpAdFactory;Landroid/location/Location;Lcom/tinder/ads/source/dfp/DfpCustomTargetingValues;)V", "builder", "Lcom/google/android/gms/ads/AdLoader$Builder;", "createSourceFetcher", "Lcom/tinder/ads/AdSourceFetcher;", "Lcom/tinder/ads/source/dfp/NativeDfpAd;", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "isConfigured", "", "priority", "Lcom/tinder/ads/SourcePriority;", "Builder", "NativeDfpAdFactory", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class NativeDfpSource extends AdSource {
    private final NativeDfpAdFactory adFactory;
    private final C2339a builder;
    private final Location location;
    private final DfpCustomTargetingValues targetingValues;
    private final String templateId;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/ads/source/dfp/NativeDfpSource$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adFactory", "Lcom/tinder/ads/source/dfp/NativeDfpSource$NativeDfpAdFactory;", "adsUnitId", "", "location", "Landroid/location/Location;", "targetingValues", "Lcom/tinder/ads/source/dfp/DfpCustomTargetingValues;", "templateId", "validationRules", "", "Lcom/tinder/ads/validation/AdValidator$Rule;", "addValidationRule", "rule", "unitId", "build", "Lcom/tinder/ads/source/dfp/NativeDfpSource;", "customTargetingValues", "aggregator_release"}, k = 1, mv = {1, 1, 7})
    public static final class Builder {
        private NativeDfpAdFactory adFactory;
        private String adsUnitId;
        private final Context context;
        private Location location;
        private DfpCustomTargetingValues targetingValues;
        private String templateId;
        private Set<Rule> validationRules = ((Set) new LinkedHashSet());

        public Builder(@NotNull Context context) {
            C2668g.b(context, "context");
            this.context = context;
        }

        @NotNull
        public final Builder adsUnitId(@NotNull String str) {
            C2668g.b(str, "unitId");
            this.adsUnitId = str;
            return this;
        }

        @NotNull
        public final Builder templateId(@NotNull String str) {
            C2668g.b(str, "templateId");
            this.templateId = str;
            return this;
        }

        @NotNull
        public final Builder adFactory(@NotNull NativeDfpAdFactory nativeDfpAdFactory) {
            C2668g.b(nativeDfpAdFactory, "adFactory");
            this.adFactory = nativeDfpAdFactory;
            return this;
        }

        @NotNull
        public final Builder addValidationRule(@NotNull Rule rule) {
            C2668g.b(rule, "rule");
            this.validationRules.add(rule);
            return this;
        }

        @NotNull
        public final Builder location(@NotNull Location location) {
            C2668g.b(location, "location");
            this.location = location;
            return this;
        }

        @NotNull
        public final Builder customTargetingValues(@NotNull DfpCustomTargetingValues dfpCustomTargetingValues) {
            C2668g.b(dfpCustomTargetingValues, "targetingValues");
            this.targetingValues = dfpCustomTargetingValues;
            return this;
        }

        @NotNull
        public final NativeDfpSource build() {
            Context context = this.context;
            Set set = this.validationRules;
            String str = this.adsUnitId;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String str2 = this.templateId;
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            NativeDfpAdFactory nativeDfpAdFactory = this.adFactory;
            if (nativeDfpAdFactory == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Location location = this.location;
            if (location == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            DfpCustomTargetingValues dfpCustomTargetingValues = this.targetingValues;
            if (dfpCustomTargetingValues != null) {
                return new NativeDfpSource(context, set, str, str2, nativeDfpAdFactory, location, dfpCustomTargetingValues);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/ads/source/dfp/NativeDfpSource$NativeDfpAdFactory;", "Lcom/tinder/ads/AdSourceFetcher$AdFactory;", "Lcom/tinder/ads/source/dfp/NativeDfpAd;", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "Lcom/tinder/ads/source/dfp/NativeDfpSource;", "()V", "aggregator_release"}, k = 1, mv = {1, 1, 7})
    public static abstract class NativeDfpAdFactory implements AdFactory<NativeDfpAd, NativeCustomTemplateAd, NativeDfpSource> {
    }

    public boolean isConfigured() {
        return true;
    }

    private NativeDfpSource(Context context, Set<? extends Rule> set, String str, String str2, NativeDfpAdFactory nativeDfpAdFactory, Location location, DfpCustomTargetingValues dfpCustomTargetingValues) {
        super(context, Type.GOOGLE_DFP_NATIVE, set);
        this.templateId = str2;
        this.adFactory = nativeDfpAdFactory;
        this.location = location;
        this.targetingValues = dfpCustomTargetingValues;
        this.builder = new C2339a(context, str);
    }

    @NotNull
    public AdSourceFetcher<NativeDfpAd, NativeCustomTemplateAd, NativeDfpSource> createSourceFetcher() {
        if (isConfigured()) {
            C2339a c2339a = this.builder;
            C2345a a = new C2344a().a(this.location).a(DfpCustomTargetingValuesKt.ADS_TARGETING_AGE, this.targetingValues.getAge()).a("gender", this.targetingValues.getGenderId()).a(this.location).a();
            C2668g.a(a, "PublisherAdRequest.Build…                 .build()");
            return new NativeDfpAdSourceFetcher(this, c2339a, a, this.templateId, this.adFactory);
        }
        throw new IllegalStateException("Native DFP Source is not configured to serve ads yet");
    }

    @NotNull
    public SourcePriority priority() {
        return SourcePriority.HIGH;
    }
}
