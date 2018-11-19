package com.snapchat.kit.sdk.bitmoji.p143a.p144a;

import android.support.annotation.NonNull;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.FragmentScope;
import com.snapchat.kit.sdk.core.metrics.business.KitEventBaseFactory;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare.Builder;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkSuccess;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerView;
import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import org.apache.commons.lang3.C15987b;

@FragmentScope
/* renamed from: com.snapchat.kit.sdk.bitmoji.a.a.a */
public class C5885a {
    /* renamed from: a */
    private final KitEventBaseFactory f21570a;
    /* renamed from: b */
    private final C5888f f21571b;

    @Inject
    C5885a(KitEventBaseFactory kitEventBaseFactory, C5888f c5888f) {
        this.f21570a = kitEventBaseFactory;
        this.f21571b = c5888f;
    }

    /* renamed from: a */
    public ServerEvent m25402a(String str, C5889h c5889h, String str2) {
        Builder shareCategory = BitmojiKitShare.newBuilder().setBitmojiKitEventBase(m25399d()).setStickerId(str).setShareCategory(c5889h.m25421b());
        if (c5889h.m25422c()) {
            shareCategory.setSearchCategory(c5889h.m25420a());
        }
        if (C15987b.a(str2) == null) {
            shareCategory.setSearchTerm(str2);
        }
        return m25398a(ServerEventData.newBuilder().setBitmojiKitShare(shareCategory));
    }

    /* renamed from: a */
    public ServerEvent m25401a(BitmojiKitStickerPickerView bitmojiKitStickerPickerView) {
        return m25398a(ServerEventData.newBuilder().setBitmojiKitStickerPickerOpen(BitmojiKitStickerPickerOpen.newBuilder().setBitmojiKitEventBase(m25399d()).setStickerPickerView(bitmojiKitStickerPickerView)));
    }

    /* renamed from: a */
    public ServerEvent m25403a(@NonNull Date date) {
        BitmojiKitStickerPickerClose.Builder bitmojiKitEventBase = BitmojiKitStickerPickerClose.newBuilder().setBitmojiKitEventBase(m25399d());
        Date d = this.f21571b.m25418d();
        if (d != null) {
            bitmojiKitEventBase.setStickerPickerSessionDurationMillis(date.getTime() - d.getTime());
        }
        return m25398a(ServerEventData.newBuilder().setBitmojiKitStickerPickerClose(bitmojiKitEventBase));
    }

    /* renamed from: a */
    public ServerEvent m25400a() {
        return m25398a(ServerEventData.newBuilder().setBitmojiKitCreateAvatarTap(BitmojiKitCreateAvatarTap.newBuilder().setBitmojiKitEventBase(m25399d())));
    }

    /* renamed from: b */
    public ServerEvent m25405b() {
        return m25398a(ServerEventData.newBuilder().setBitmojiKitSnapchatLinkTap(BitmojiKitSnapchatLinkTap.newBuilder().setBitmojiKitEventBase(m25399d())));
    }

    /* renamed from: c */
    public ServerEvent m25406c() {
        return m25398a(ServerEventData.newBuilder().setBitmojiKitSnapchatLinkSuccess(BitmojiKitSnapchatLinkSuccess.newBuilder().setBitmojiKitEventBase(m25399d())));
    }

    /* renamed from: a */
    public ServerEvent m25404a(@NonNull List<BitmojiKitSearchTerm> list) {
        return m25398a(ServerEventData.newBuilder().setBitmojiKitSearch(BitmojiKitSearch.newBuilder().setBitmojiKitEventBase(m25399d()).addAllSearchTerms(list)));
    }

    /* renamed from: a */
    private ServerEvent m25398a(ServerEventData.Builder builder) {
        return ServerEvent.newBuilder().setEventData(builder).build();
    }

    /* renamed from: d */
    private BitmojiKitEventBase m25399d() {
        BitmojiKitEventBase.Builder kitEventBase = BitmojiKitEventBase.newBuilder().setKitEventBase(this.f21570a.createKitEventBase(KitType.BITMOJI_KIT, "1.0.2"));
        if (this.f21571b.m25417c() != null) {
            kitEventBase.setStickerPickerSessionId(this.f21571b.m25417c());
        }
        return kitEventBase.build();
    }
}
