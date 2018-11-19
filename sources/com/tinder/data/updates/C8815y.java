package com.tinder.data.updates;

import com.tinder.api.model.updates.Updates;
import com.tinder.api.model.updates.UpdatesRequestBody;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/data/updates/UpdatesRequestContext;", "", "updates", "Lcom/tinder/api/model/updates/Updates;", "updatesRequestBody", "Lcom/tinder/api/model/updates/UpdatesRequestBody;", "(Lcom/tinder/api/model/updates/Updates;Lcom/tinder/api/model/updates/UpdatesRequestBody;)V", "isFromWebSocketNudge", "", "()Z", "isInitialRequest", "getUpdates", "()Lcom/tinder/api/model/updates/Updates;", "getUpdatesRequestBody", "()Lcom/tinder/api/model/updates/UpdatesRequestBody;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.y */
public final class C8815y {
    @NotNull
    /* renamed from: a */
    private final Updates f30914a;
    @NotNull
    /* renamed from: b */
    private final UpdatesRequestBody f30915b;

    public C8815y(@NotNull Updates updates, @NotNull UpdatesRequestBody updatesRequestBody) {
        C2668g.b(updates, "updates");
        C2668g.b(updatesRequestBody, "updatesRequestBody");
        this.f30914a = updates;
        this.f30915b = updatesRequestBody;
    }

    @NotNull
    /* renamed from: c */
    public final Updates m37518c() {
        return this.f30914a;
    }

    /* renamed from: a */
    public final boolean m37516a() {
        CharSequence lastActivityDate = this.f30915b.getLastActivityDate();
        if (lastActivityDate != null) {
            if (lastActivityDate.length() != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m37517b() {
        Boolean isFromWebSocketNudge = this.f30915b.isFromWebSocketNudge();
        return isFromWebSocketNudge != null ? isFromWebSocketNudge.booleanValue() : false;
    }
}
