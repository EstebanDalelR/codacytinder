package com.tinder.places.viewmodel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.domain.places.model.Place;
import com.tinder.domain.places.model.Place.Alternative;
import com.tinder.places.C6257b.C6256e;
import com.tinder.places.p312g.p313a.C10211a;
import com.tinder.places.viewmodel.PlaceColor.C14346b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u0000 >2\u00020\u0001:\u0001>B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0012HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\"J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003Jz\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u000207J\u000e\u00108\u001a\u00020\u00062\u0006\u00106\u001a\u000207J\u000e\u00109\u001a\u00020\u00032\u0006\u00106\u001a\u000207J\u000e\u0010:\u001a\u00020;2\u0006\u00106\u001a\u000207J\t\u0010<\u001a\u00020\u0006HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001b¨\u0006?"}, d2 = {"Lcom/tinder/places/viewmodel/PlaceCardViewModel;", "", "id", "", "name", "numOfVisitors", "", "background", "Lcom/tinder/places/viewmodel/PlaceColor$PlacesGradient;", "toolbarDrawableResource", "buttonColorResource", "viewed", "", "alternatives", "", "Lcom/tinder/domain/places/model/Place$Alternative;", "corrected", "expirationTime", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/tinder/places/viewmodel/PlaceColor$PlacesGradient;IIZLjava/util/List;ZLorg/joda/time/DateTime;)V", "getAlternatives", "()Ljava/util/List;", "getBackground", "()Lcom/tinder/places/viewmodel/PlaceColor$PlacesGradient;", "getButtonColorResource", "()I", "getCorrected", "()Z", "getExpirationTime", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getName", "getNumOfVisitors", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getToolbarDrawableResource", "getViewed", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/tinder/places/viewmodel/PlaceColor$PlacesGradient;IIZLjava/util/List;ZLorg/joda/time/DateTime;)Lcom/tinder/places/viewmodel/PlaceCardViewModel;", "equals", "other", "getBackgroundDrawable", "Lcom/tinder/places/view/util/PlacesGradientDrawable;", "context", "Landroid/content/Context;", "getColor", "getIntroText", "getToolbarDrawable", "Landroid/graphics/drawable/Drawable;", "hashCode", "toString", "Factory", "places_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.viewmodel.b */
public final class C14349b {
    /* renamed from: a */
    public static final C14348a f45514a = new C14348a();
    @NotNull
    /* renamed from: b */
    private final String f45515b;
    @NotNull
    /* renamed from: c */
    private final String f45516c;
    @Nullable
    /* renamed from: d */
    private final Integer f45517d;
    @NotNull
    /* renamed from: e */
    private final C14346b f45518e;
    /* renamed from: f */
    private final int f45519f;
    /* renamed from: g */
    private final int f45520g;
    /* renamed from: h */
    private final boolean f45521h;
    @NotNull
    /* renamed from: i */
    private final List<Alternative> f45522i;
    /* renamed from: j */
    private final boolean f45523j;
    @NotNull
    /* renamed from: k */
    private final DateTime f45524k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/places/viewmodel/PlaceCardViewModel$Factory;", "", "()V", "fromPlace", "Lcom/tinder/places/viewmodel/PlaceCardViewModel;", "place", "Lcom/tinder/domain/places/model/Place;", "places_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.viewmodel.b$a */
    public static final class C14348a {
        private C14348a() {
        }

        @NotNull
        /* renamed from: a */
        public final C14349b m54652a(@NotNull Place place) {
            C2668g.b(place, "place");
            long id = place.getId();
            String name = place.getName();
            PlaceColor a = PlaceColor.Companion.m54648a(place.getId());
            return new C14349b(String.valueOf(id), name, null, a.getBackgroundGradient(), a.getToolbarBackground(), a.getPrimary(), place.getViewed(), place.getAlternatives(), place.getCorrected(), place.getExpirationTime());
        }
    }

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ C14349b m54653a(C14349b c14349b, String str, String str2, Integer num, C14346b c14346b, int i, int i2, boolean z, List list, boolean z2, DateTime dateTime, int i3, Object obj) {
        C14349b c14349b2 = c14349b;
        int i4 = i3;
        return c14349b2.m54655a((i4 & 1) != 0 ? c14349b2.f45515b : str, (i4 & 2) != 0 ? c14349b2.f45516c : str2, (i4 & 4) != 0 ? c14349b2.f45517d : num, (i4 & 8) != 0 ? c14349b2.f45518e : c14346b, (i4 & 16) != 0 ? c14349b2.f45519f : i, (i4 & 32) != 0 ? c14349b2.f45520g : i2, (i4 & 64) != 0 ? c14349b2.f45521h : z, (i4 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? c14349b2.f45522i : list, (i4 & 256) != 0 ? c14349b2.f45523j : z2, (i4 & 512) != 0 ? c14349b2.f45524k : dateTime);
    }

    @NotNull
    /* renamed from: a */
    public final C14349b m54655a(@NotNull String str, @NotNull String str2, @Nullable Integer num, @NotNull C14346b c14346b, int i, int i2, boolean z, @NotNull List<Alternative> list, boolean z2, @NotNull DateTime dateTime) {
        String str3 = str;
        C2668g.b(str3, "id");
        String str4 = str2;
        C2668g.b(str4, "name");
        C14346b c14346b2 = c14346b;
        C2668g.b(c14346b2, "background");
        List<Alternative> list2 = list;
        C2668g.b(list2, "alternatives");
        DateTime dateTime2 = dateTime;
        C2668g.b(dateTime2, "expirationTime");
        return new C14349b(str3, str4, num, c14346b2, i, i2, z, list2, z2, dateTime2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14349b) {
            C14349b c14349b = (C14349b) obj;
            if (C2668g.a(this.f45515b, c14349b.f45515b) && C2668g.a(this.f45516c, c14349b.f45516c) && C2668g.a(this.f45517d, c14349b.f45517d) && C2668g.a(this.f45518e, c14349b.f45518e)) {
                if ((this.f45519f == c14349b.f45519f ? 1 : null) != null) {
                    if ((this.f45520g == c14349b.f45520g ? 1 : null) != null) {
                        if ((this.f45521h == c14349b.f45521h ? 1 : null) != null && C2668g.a(this.f45522i, c14349b.f45522i)) {
                            return (this.f45523j == c14349b.f45523j ? 1 : null) != null && C2668g.a(this.f45524k, c14349b.f45524k);
                        }
                    }
                }
            }
        }
    }

    public int hashCode() {
        String str = this.f45515b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f45516c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f45517d;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        C14346b c14346b = this.f45518e;
        hashCode = (((((hashCode + (c14346b != null ? c14346b.hashCode() : 0)) * 31) + this.f45519f) * 31) + this.f45520g) * 31;
        int i2 = this.f45521h;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        List list = this.f45522i;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        i2 = this.f45523j;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        DateTime dateTime = this.f45524k;
        if (dateTime != null) {
            i = dateTime.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlaceCardViewModel(id=");
        stringBuilder.append(this.f45515b);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f45516c);
        stringBuilder.append(", numOfVisitors=");
        stringBuilder.append(this.f45517d);
        stringBuilder.append(", background=");
        stringBuilder.append(this.f45518e);
        stringBuilder.append(", toolbarDrawableResource=");
        stringBuilder.append(this.f45519f);
        stringBuilder.append(", buttonColorResource=");
        stringBuilder.append(this.f45520g);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.f45521h);
        stringBuilder.append(", alternatives=");
        stringBuilder.append(this.f45522i);
        stringBuilder.append(", corrected=");
        stringBuilder.append(this.f45523j);
        stringBuilder.append(", expirationTime=");
        stringBuilder.append(this.f45524k);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14349b(@NotNull String str, @NotNull String str2, @Nullable Integer num, @NotNull C14346b c14346b, int i, int i2, boolean z, @NotNull List<Alternative> list, boolean z2, @NotNull DateTime dateTime) {
        C2668g.b(str, "id");
        C2668g.b(str2, "name");
        C2668g.b(c14346b, "background");
        C2668g.b(list, "alternatives");
        C2668g.b(dateTime, "expirationTime");
        this.f45515b = str;
        this.f45516c = str2;
        this.f45517d = num;
        this.f45518e = c14346b;
        this.f45519f = i;
        this.f45520g = i2;
        this.f45521h = z;
        this.f45522i = list;
        this.f45523j = z2;
        this.f45524k = dateTime;
    }

    @NotNull
    /* renamed from: a */
    public final String m54656a() {
        return this.f45515b;
    }

    @NotNull
    /* renamed from: b */
    public final String m54658b() {
        return this.f45516c;
    }

    @Nullable
    /* renamed from: c */
    public final Integer m54659c() {
        return this.f45517d;
    }

    /* renamed from: d */
    public final boolean m54661d() {
        return this.f45521h;
    }

    @NotNull
    /* renamed from: e */
    public final List<Alternative> m54662e() {
        return this.f45522i;
    }

    @NotNull
    /* renamed from: f */
    public final DateTime m54663f() {
        return this.f45524k;
    }

    @NotNull
    /* renamed from: a */
    public final C10211a m54654a(@NotNull Context context) {
        C2668g.b(context, "context");
        return this.f45518e.m54649a(context);
    }

    @NotNull
    /* renamed from: b */
    public final Drawable m54657b(@NotNull Context context) {
        C2668g.b(context, "context");
        context = context.getResources().getDrawable(this.f45519f);
        C2668g.a(context, "context.resources.getDra…(toolbarDrawableResource)");
        return context;
    }

    @NotNull
    /* renamed from: c */
    public final String m54660c(@NotNull Context context) {
        C2668g.b(context, "context");
        context = context.getResources().getString(this.f45521h ? C6256e.youve_been_to : C6256e.new_place);
        C2668g.a(context, "context.resources.getString(resource)");
        return context;
    }
}
