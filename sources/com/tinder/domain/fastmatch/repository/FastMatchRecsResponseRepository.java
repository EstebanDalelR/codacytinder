package com.tinder.domain.fastmatch.repository;

import kotlin.C15813i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/fastmatch/repository/FastMatchRecsResponseRepository;", "", "observeResponseUpdate", "Lrx/Observable;", "", "observeToken", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface FastMatchRecsResponseRepository {
    @NotNull
    Observable<C15813i> observeResponseUpdate();

    @NotNull
    Observable<String> observeToken();
}
