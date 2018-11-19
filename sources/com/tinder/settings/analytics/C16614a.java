package com.tinder.settings.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.pd;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/settings/analytics/AddPassportMenuOpenEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/settings/analytics/AddPassportMenuOpenEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.analytics.a */
public final class C16614a implements VoidUseCase<C14863a> {
    /* renamed from: a */
    private final C2630h f51471a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/tinder/settings/analytics/AddPassportMenuOpenEvent$Request;", "", "isRecsTimeout", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.analytics.a$a */
    public static final class C14863a {
        /* renamed from: a */
        private final boolean f46532a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C14863a) {
                if ((this.f46532a == ((C14863a) obj).f46532a ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            boolean z = this.f46532a;
            return z ? 1 : z;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(isRecsTimeout=");
            stringBuilder.append(this.f46532a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14863a(boolean z) {
            this.f46532a = z;
        }

        /* renamed from: a */
        public final boolean m56276a() {
            return this.f46532a;
        }
    }

    @Inject
    public C16614a(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f51471a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m62058a((C14863a) obj);
    }

    /* renamed from: a */
    public void m62058a(@NotNull C14863a c14863a) {
        C2668g.b(c14863a, "request");
        this.f51471a.a(pd.a().a(Boolean.valueOf(c14863a.m56276a())).a(Integer.valueOf(2)).a());
    }
}
