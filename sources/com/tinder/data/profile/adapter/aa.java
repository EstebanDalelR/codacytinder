package com.tinder.data.profile.adapter;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.profile.PlusControl;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.meta.model.PlusControlSettings;
import com.tinder.domain.meta.model.PlusControlSettings.Blend;
import com.tinder.domain.meta.model.PlusControlSettings.DiscoverableParty;
import java.util.Map;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002J\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/data/profile/adapter/PlusControlSettingsAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/meta/model/PlusControlSettings;", "Lcom/tinder/api/model/profile/PlusControl;", "()V", "blendApiMap", "", "Lcom/tinder/domain/meta/model/PlusControlSettings$Blend;", "", "discoverableApiMap", "Lcom/tinder/domain/meta/model/PlusControlSettings$DiscoverableParty;", "fromApi", "apiModel", "getBlendFrom", "apiBlend", "getDiscoverableParty", "apiDiscoverableParty", "toApi", "domainModel", "data_release"}, k = 1, mv = {1, 1, 10})
public final class aa extends C2646o<PlusControlSettings, PlusControl> {
    /* renamed from: a */
    private final Map<Blend, String> f35617a = ae.a(new Pair[]{C15811g.a(Blend.OPTIMAL, "optimal"), C15811g.a(Blend.POPULARITY, ManagerWebServices.PARAM_SPOTIFY_POPULARITY), C15811g.a(Blend.DISTANCE, "distance"), C15811g.a(Blend.RECENT_ACTIVITY, "recency")});
    /* renamed from: b */
    private final Map<DiscoverableParty, String> f35618b = ae.a(new Pair[]{C15811g.a(DiscoverableParty.EVERYONE, "everyone"), C15811g.a(DiscoverableParty.LIKED, "liked")});

    @NotNull
    /* renamed from: a */
    public PlusControlSettings m43476a(@NotNull PlusControl plusControl) {
        C2668g.b(plusControl, "apiModel");
        Boolean hideAds = plusControl.getHideAds();
        boolean z = false;
        boolean booleanValue = hideAds != null ? hideAds.booleanValue() : false;
        Boolean hideDistance = plusControl.getHideDistance();
        boolean booleanValue2 = hideDistance != null ? hideDistance.booleanValue() : false;
        Boolean hideAge = plusControl.getHideAge();
        if (hideAge != null) {
            z = hideAge.booleanValue();
        }
        plusControl = PlusControlSettings.builder().isHideAds(booleanValue).isHideDistance(booleanValue2).isHideAge(z).blend(m43473a(plusControl.getBlend())).discoverableParty(m43474b(plusControl.getDiscoverableParty())).build();
        C2668g.a(plusControl, "PlusControlSettings.buil…\n                .build()");
        return plusControl;
    }

    @NotNull
    /* renamed from: a */
    public final PlusControl m43475a(@NotNull PlusControlSettings plusControlSettings) {
        C2668g.b(plusControlSettings, "domainModel");
        boolean isHideAds = plusControlSettings.isHideAds();
        boolean isHideDistance = plusControlSettings.isHideDistance();
        return new PlusControl((String) this.f35618b.get(plusControlSettings.discoverableParty()), Boolean.valueOf(isHideAds), Boolean.valueOf(plusControlSettings.isHideAge()), Boolean.valueOf(isHideDistance), (String) this.f35617a.get(plusControlSettings.blend()));
    }

    /* renamed from: a */
    private final com.tinder.domain.meta.model.PlusControlSettings.Blend m43473a(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = com.tinder.domain.meta.model.PlusControlSettings.Blend.from(r4);	 Catch:{ IllegalArgumentException -> 0x000a }
        r1 = "PlusControlSettings.Blend.from(apiBlend)";	 Catch:{ IllegalArgumentException -> 0x000a }
        kotlin.jvm.internal.C2668g.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x000a }
        goto L_0x0019;
    L_0x000a:
        r0 = "Cannot convert %s to Blend.";
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r1[r2] = r4;
        p000a.p001a.C0001a.e(r0, r1);
        r0 = com.tinder.data.profile.adapter.ab.f30744a;
    L_0x0019:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.profile.adapter.aa.a(java.lang.String):com.tinder.domain.meta.model.PlusControlSettings$Blend");
    }

    /* renamed from: b */
    private final com.tinder.domain.meta.model.PlusControlSettings.DiscoverableParty m43474b(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = com.tinder.domain.meta.model.PlusControlSettings.DiscoverableParty.from(r4);	 Catch:{ IllegalArgumentException -> 0x000a }
        r1 = "PlusControlSettings.Disc…rom(apiDiscoverableParty)";	 Catch:{ IllegalArgumentException -> 0x000a }
        kotlin.jvm.internal.C2668g.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x000a }
        goto L_0x0019;
    L_0x000a:
        r0 = "Cannot convert %s to DiscoverableParty.";
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r1[r2] = r4;
        p000a.p001a.C0001a.e(r0, r1);
        r0 = com.tinder.data.profile.adapter.ab.f30745b;
    L_0x0019:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.profile.adapter.aa.b(java.lang.String):com.tinder.domain.meta.model.PlusControlSettings$DiscoverableParty");
    }
}
