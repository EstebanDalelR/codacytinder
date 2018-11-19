package com.tinder.domain.profile.usecase;

import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.tinderplus.LikeStatus;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/profile/usecase/SaveLikeStatus;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/domain/tinderplus/LikeStatus;", "domain_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "Temporary solution to workaround legacy architecture. This should not be used")
public interface SaveLikeStatus extends CompletableUseCase<LikeStatus> {
}
