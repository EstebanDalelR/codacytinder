package com.tinder.home;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/home/ShimmerHomeTabTarget;", "", "setIconType", "", "iconType", "Lcom/tinder/home/ShimmerHomeTabTarget$IconType;", "IconType", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ShimmerHomeTabTarget {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/home/ShimmerHomeTabTarget$IconType;", "", "(Ljava/lang/String;I)V", "REGULAR_RED", "SAVORY_SHIMMER", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum IconType {
    }

    void setIconType(@NotNull IconType iconType);
}
