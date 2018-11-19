package com.tinder.recs.usecase;

import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.listeners.ListenerUpdateProfileInfo;
import com.tinder.recs.usecase.UpdateDiscoverySettings.WhenMappings;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/CompletableEmitter;", "subscribe"}, k = 3, mv = {1, 1, 10})
final class UpdateDiscoverySettings$execute$1 implements CompletableOnSubscribe {
    final /* synthetic */ DiscoverySettings $request;
    final /* synthetic */ UpdateDiscoverySettings this$0;

    UpdateDiscoverySettings$execute$1(UpdateDiscoverySettings updateDiscoverySettings, DiscoverySettings discoverySettings) {
        this.this$0 = updateDiscoverySettings;
        this.$request = discoverySettings;
    }

    public final void subscribe(@NotNull final CompletableEmitter completableEmitter) {
        Pair pair;
        C2668g.b(completableEmitter, "emitter");
        switch (WhenMappings.$EnumSwitchMapping$0[this.$request.genderFilter().ordinal()]) {
            case 1:
                pair = new Pair(Boolean.valueOf(true), Boolean.valueOf(false));
                break;
            case 2:
                pair = new Pair(Boolean.valueOf(false), Boolean.valueOf(true));
                break;
            case 3:
                pair = new Pair(Boolean.valueOf(true), Boolean.valueOf(true));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.this$0.managerProfile.a(this.$request.isDiscoverable(), ((Boolean) pair.m59805c()).booleanValue(), ((Boolean) pair.m59806d()).booleanValue(), (float) this.$request.distanceFilter(), this.$request.minAgeFilter(), this.$request.maxAgeFilter(), null, false, new ListenerUpdateProfileInfo() {
            public void onProfileUpdateSuccess() {
                completableEmitter.onComplete();
            }

            public void onProfileUpdateFailed() {
                completableEmitter.onError(new Exception("Failed to Update Profile"));
            }
        });
    }
}
