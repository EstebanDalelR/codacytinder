package com.tinder.domain.message.usecase;

import com.tinder.domain.meta.model.CurrentUser;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/meta/model/CurrentUser;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class CommonMessagePropertiesAggregator$currentUserIdSingle$1<T, R> implements Func1<T, R> {
    public static final CommonMessagePropertiesAggregator$currentUserIdSingle$1 INSTANCE = new CommonMessagePropertiesAggregator$currentUserIdSingle$1();

    CommonMessagePropertiesAggregator$currentUserIdSingle$1() {
    }

    @NotNull
    public final String call(CurrentUser currentUser) {
        return currentUser.id();
    }
}
