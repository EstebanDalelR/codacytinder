package com.tinder.scarlet.p468a.p469a;

import com.tinder.api.ManagerWebServices;
import com.tinder.scarlet.C14789c;
import com.tinder.scarlet.C14789c.C16513a;
import com.tinder.scarlet.MessageAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/scarlet/messageadapter/builtin/ByteArrayMessageAdapter;", "Lcom/tinder/scarlet/MessageAdapter;", "", "()V", "fromMessage", "message", "Lcom/tinder/scarlet/Message;", "toMessage", "data", "scarlet-message-adapter-builtin"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.a.a.b */
public final class C16500b implements MessageAdapter<byte[]> {
    public /* synthetic */ Object fromMessage(C14789c c14789c) {
        return m61923a(c14789c);
    }

    public /* synthetic */ C14789c toMessage(Object obj) {
        return m61922a((byte[]) obj);
    }

    @NotNull
    /* renamed from: a */
    public byte[] m61923a(@NotNull C14789c c14789c) {
        C2668g.b(c14789c, "message");
        if (c14789c instanceof C16513a) {
            return ((C16513a) c14789c).m61932a();
        }
        throw ((Throwable) new IllegalArgumentException("This Message Adapter only supports bytes Messages"));
    }

    @NotNull
    /* renamed from: a */
    public C14789c m61922a(@NotNull byte[] bArr) {
        C2668g.b(bArr, ManagerWebServices.FB_DATA);
        return new C16513a(bArr);
    }
}
