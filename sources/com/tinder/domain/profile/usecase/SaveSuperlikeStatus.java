package com.tinder.domain.profile.usecase;

import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.superlike.SuperlikeStatus;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/profile/usecase/SaveSuperlikeStatus;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/domain/superlike/SuperlikeStatus;", "domain_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "Temporary solution to workaround legacy architecture. This should not be used")
public interface SaveSuperlikeStatus extends VoidUseCase<SuperlikeStatus> {
}
