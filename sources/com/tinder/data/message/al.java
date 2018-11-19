package com.tinder.data.message;

import com.tinder.data.model.MessageImageModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\t\u0010\r\u001a\u00020\u0007HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÂ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/data/message/MessageImage;", "Lcom/tinder/data/model/MessageImageModel;", "messageId", "", "source", "url", "width", "", "height", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "message_id", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
public final class al implements MessageImageModel {
    /* renamed from: a */
    private final String f35424a;
    /* renamed from: b */
    private final String f35425b;
    /* renamed from: c */
    private final String f35426c;
    /* renamed from: d */
    private final long f35427d;
    /* renamed from: e */
    private final long f35428e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof al) {
            al alVar = (al) obj;
            if (C2668g.a(this.f35424a, alVar.f35424a) && C2668g.a(this.f35425b, alVar.f35425b) && C2668g.a(this.f35426c, alVar.f35426c)) {
                if ((this.f35427d == alVar.f35427d ? 1 : null) != null) {
                    if ((this.f35428e == alVar.f35428e ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f35424a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f35425b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f35426c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long j = this.f35427d;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.f35428e;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MessageImage(messageId=");
        stringBuilder.append(this.f35424a);
        stringBuilder.append(", source=");
        stringBuilder.append(this.f35425b);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f35426c);
        stringBuilder.append(", width=");
        stringBuilder.append(this.f35427d);
        stringBuilder.append(", height=");
        stringBuilder.append(this.f35428e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public al(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, long j2) {
        C2668g.b(str, "messageId");
        C2668g.b(str2, "source");
        C2668g.b(str3, "url");
        this.f35424a = str;
        this.f35425b = str2;
        this.f35426c = str3;
        this.f35427d = j;
        this.f35428e = j2;
    }

    @NotNull
    public String message_id() {
        return this.f35424a;
    }

    @NotNull
    public String source() {
        return this.f35425b;
    }

    @NotNull
    public String url() {
        return this.f35426c;
    }

    public long width() {
        return this.f35427d;
    }

    public long height() {
        return this.f35428e;
    }
}
