package com.tinder.domain.connectivity;

import com.tinder.domain.common.model.ConnectivityInfo;
import io.reactivex.C3959e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/connectivity/ConnectivityRepository;", "", "observe", "Lio/reactivex/Observable;", "Lcom/tinder/domain/common/model/ConnectivityInfo;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface ConnectivityRepository {
    @NotNull
    C3959e<ConnectivityInfo> observe();
}
