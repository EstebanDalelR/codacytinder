package com.mapbox.mapboxsdk.offline;

public class OfflineRegionStatus {
    private long completedResourceCount = 0;
    private long completedResourceSize = 0;
    private long completedTileCount = 0;
    private long completedTileSize = 0;
    private int downloadState = 0;
    private long requiredResourceCount = 0;
    private boolean requiredResourceCountIsPrecise = true;

    private OfflineRegionStatus(int i, long j, long j2, long j3, long j4, long j5, boolean z) {
        this.downloadState = i;
        this.completedResourceCount = j;
        this.completedResourceSize = j2;
        this.completedTileCount = j3;
        this.completedTileSize = j4;
        this.requiredResourceCount = j5;
        this.requiredResourceCountIsPrecise = z;
    }

    public boolean isComplete() {
        return this.completedResourceCount == this.requiredResourceCount && this.downloadState == 0;
    }

    public int getDownloadState() {
        return this.downloadState;
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public long getCompletedTileCount() {
        return this.completedTileCount;
    }

    public long getCompletedTileSize() {
        return this.completedTileSize;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public boolean isRequiredResourceCountPrecise() {
        return this.requiredResourceCountIsPrecise;
    }
}
