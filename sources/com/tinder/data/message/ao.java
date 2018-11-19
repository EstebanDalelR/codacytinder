package com.tinder.data.message;

import com.tinder.api.model.common.ApiMessageMedia;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.message.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/message/MessageMediaApiAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/message/Image;", "Lcom/tinder/api/model/common/ApiMessageMedia;", "()V", "fromApi", "messageMedia", "data_release"}, k = 1, mv = {1, 1, 10})
public final class ao extends C2646o<Image, ApiMessageMedia> {
    @Nullable
    /* renamed from: a */
    public Image m43281a(@NotNull ApiMessageMedia apiMessageMedia) {
        C2668g.b(apiMessageMedia, "messageMedia");
        try {
            String url = apiMessageMedia.getUrl();
            if (url == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String source = apiMessageMedia.getSource();
            if (source == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Integer width = apiMessageMedia.getWidth();
            if (width == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            int intValue = width.intValue();
            Integer height = apiMessageMedia.getHeight();
            if (height != null) {
                return new Image(source, url, intValue, height.intValue());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (IllegalArgumentException e) {
            Throwable th = e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error creating Image due to invalid API Message Media: ");
            stringBuilder.append(apiMessageMedia);
            C0001a.b(th, stringBuilder.toString(), new Object[0]);
            return null;
        }
    }
}
