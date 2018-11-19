package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class MetricWrapper {
    private static FileDescriptor descriptor;
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_OpMetric_descriptor */
    static final Descriptor f21756x7d71b049 = ((Descriptor) getDescriptor().getMessageTypes().get(0));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_OpMetric_fieldAccessorTable */
    static final FieldAccessorTable f21757xf3b47dc7 = new FieldAccessorTable(f21756x7d71b049, new String[]{"CounterMetric", "TimerMetric", "LevelMetric", "Metric"});

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.MetricWrapper$1 */
    static class C71501 implements InternalDescriptorAssigner {
        C71501() {
        }

        public ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor) {
            MetricWrapper.descriptor = fileDescriptor;
            return null;
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private MetricWrapper() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{OpMetrics.getDescriptor()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014metric_wrapper.proto\u0012'com.snapchat.kit.sdk.core.metrics.model\u001a\u0010op_metrics.proto\"á\u0001\n\bOpMetric\u0012E\n\u000ecounter_metric\u0018\u0001 \u0001(\u000b2+.com.snapchat.snapkit.metrics.CounterMetricH\u0000\u0012A\n\ftimer_metric\u0018\u0002 \u0001(\u000b2).com.snapchat.snapkit.metrics.TimerMetricH\u0000\u0012A\n\flevel_metric\u0018\u0003 \u0001(\u000b2).com.snapchat.snapkit.metrics.LevelMetricH\u0000B\b\n\u0006metricB\u0002P\u0001b\u0006proto3"}, fileDescriptorArr, new C71501());
        OpMetrics.getDescriptor();
    }
}
