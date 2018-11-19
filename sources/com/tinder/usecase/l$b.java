package com.tinder.usecase;

import com.firebase.jobdispatcher.C1886n;
import com.tinder.match.DeleteSponsoredMessageJobService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
final class l$b implements Action0 {
    /* renamed from: a */
    final /* synthetic */ C3953l f58728a;

    l$b(C3953l c3953l) {
        this.f58728a = c3953l;
    }

    public final void call() {
        int toSeconds = (int) TimeUnit.HOURS.toSeconds(12);
        C3953l.a(this.f58728a).a(C3953l.a(this.f58728a).a().a(DeleteSponsoredMessageJobService.class).a(C1886n.a(toSeconds, ((int) TimeUnit.MINUTES.toSeconds(30)) + toSeconds)).a(2).a(new int[]{4}).b(true).a("sponsored-messages-cleaner-job").a());
    }
}
