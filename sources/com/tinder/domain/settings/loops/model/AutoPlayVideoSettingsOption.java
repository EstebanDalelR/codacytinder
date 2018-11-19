package com.tinder.domain.settings.loops.model;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tinder/domain/settings/loops/model/AutoPlayVideoSettingsOption;", "", "autoPlayLoopMappedValue", "", "(Ljava/lang/String;II)V", "getAutoPlayLoopMappedValue", "()I", "ON_WIFI_AND_MOBILE_DATA", "ON_WIFI_ONLY", "ON_NEVER_AUTOPLAY", "domain_release"}, k = 1, mv = {1, 1, 10})
public enum AutoPlayVideoSettingsOption {
    ;
    
    private final int autoPlayLoopMappedValue;

    protected AutoPlayVideoSettingsOption(int i) {
        this.autoPlayLoopMappedValue = i;
    }

    public final int getAutoPlayLoopMappedValue() {
        return this.autoPlayLoopMappedValue;
    }
}
