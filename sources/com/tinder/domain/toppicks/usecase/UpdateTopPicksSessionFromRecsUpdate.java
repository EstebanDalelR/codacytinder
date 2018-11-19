package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/domain/toppicks/usecase/UpdateTopPicksSessionFromRecsUpdate;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/domain/toppicks/usecase/UpdateTopPicksSessionFromRecsUpdate$Request;", "topPicksSessionRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksSessionRepository;", "(Lcom/tinder/domain/toppicks/repo/TopPicksSessionRepository;)V", "execute", "Lio/reactivex/Completable;", "request", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class UpdateTopPicksSessionFromRecsUpdate implements CompletableUseCase<Request> {
    private final TopPicksSessionRepository topPicksSessionRepository;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/domain/toppicks/usecase/UpdateTopPicksSessionFromRecsUpdate$Request;", "", "hasTopPicks", "", "(Z)V", "getHasTopPicks", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        private final boolean hasTopPicks;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = request.hasTopPicks;
            }
            return request.copy(z);
        }

        public final boolean component1() {
            return this.hasTopPicks;
        }

        @NotNull
        public final Request copy(boolean z) {
            return new Request(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Request) {
                if ((this.hasTopPicks == ((Request) obj).hasTopPicks ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            boolean z = this.hasTopPicks;
            return z ? 1 : z;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(hasTopPicks=");
            stringBuilder.append(this.hasTopPicks);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(boolean z) {
            this.hasTopPicks = z;
        }

        public final boolean getHasTopPicks() {
            return this.hasTopPicks;
        }
    }

    @Inject
    public UpdateTopPicksSessionFromRecsUpdate(@NotNull TopPicksSessionRepository topPicksSessionRepository) {
        C2668g.b(topPicksSessionRepository, "topPicksSessionRepository");
        this.topPicksSessionRepository = topPicksSessionRepository;
    }

    @NotNull
    public C3956a execute(@NotNull Request request) {
        C2668g.b(request, "request");
        request = this.topPicksSessionRepository.observeTopPicksSession().e().f(new UpdateTopPicksSessionFromRecsUpdate$execute$1(request)).e(new UpdateTopPicksSessionFromRecsUpdate$execute$2(this));
        C2668g.a(request, "topPicksSessionRepositor…ssion(it) }\n            }");
        return request;
    }
}
