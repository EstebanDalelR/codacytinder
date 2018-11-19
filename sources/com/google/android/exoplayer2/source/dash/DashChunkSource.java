package com.google.android.exoplayer2.source.dash;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.source.chunk.ChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.C3683b;
import com.google.android.exoplayer2.source.dash.p063a.C3684b;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;

public interface DashChunkSource extends ChunkSource {

    public interface Factory {
        DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, C3684b c3684b, int i, int[] iArr, TrackSelection trackSelection, int i2, long j, boolean z, boolean z2, @Nullable C3683b c3683b);
    }

    void updateManifest(C3684b c3684b, int i);
}
