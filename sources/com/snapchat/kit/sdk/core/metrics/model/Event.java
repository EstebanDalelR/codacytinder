package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.DescriptorProtos.FieldOptions;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessage.GeneratedExtension;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Event {
    public static final int SERVER_EVENT_TIER_FIELD_NUMBER = 99999;
    private static FileDescriptor descriptor;
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitCreateAvatarTap_descriptor */
    static final Descriptor f21718x89a1fa3c = ((Descriptor) getDescriptor().getMessageTypes().get(12));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitCreateAvatarTap_fieldAccessorTable */
    static final FieldAccessorTable f21719x108124ba = new FieldAccessorTable(f21718x89a1fa3c, new String[]{"BitmojiKitEventBase"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitEventBase_descriptor */
    static final Descriptor f21720xdf02607f = ((Descriptor) getDescriptor().getMessageTypes().get(4));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitEventBase_fieldAccessorTable */
    static final FieldAccessorTable f21721x180497fd = new FieldAccessorTable(f21720xdf02607f, new String[]{"KitEventBase", "StickerPickerSessionId"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitSearchTerm_descriptor */
    static final Descriptor f21722x650b94fe = ((Descriptor) getDescriptor().getMessageTypes().get(8));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitSearchTerm_fieldAccessorTable */
    static final FieldAccessorTable f21723xf98cdd7c = new FieldAccessorTable(f21722x650b94fe, new String[]{"Category", "Value"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitSearch_descriptor */
    static final Descriptor f21724xf1213b0a = ((Descriptor) getDescriptor().getMessageTypes().get(9));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitSearch_fieldAccessorTable */
    static final FieldAccessorTable f21725xf3d1b788 = new FieldAccessorTable(f21724xf1213b0a, new String[]{"BitmojiKitEventBase", "SearchTerms"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitShare_descriptor */
    static final Descriptor f21726xa2a9d2ab = ((Descriptor) getDescriptor().getMessageTypes().get(7));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitShare_fieldAccessorTable */
    static final FieldAccessorTable f21727x39dd1e29 = new FieldAccessorTable(f21726xa2a9d2ab, new String[]{"BitmojiKitEventBase", "SubjectUserIds", "StickerId", "ShareCategory", "SearchCategory", "SearchTerm"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitSnapchatLinkSuccess_descriptor */
    static final Descriptor f21728x9fa52963 = ((Descriptor) getDescriptor().getMessageTypes().get(11));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitSnapchatLinkSuccess_fieldAccessorTable */
    static final FieldAccessorTable f21729x9a523ce1 = new FieldAccessorTable(f21728x9fa52963, new String[]{"BitmojiKitEventBase"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitSnapchatLinkTap_descriptor */
    static final Descriptor f21730xf74b81c3 = ((Descriptor) getDescriptor().getMessageTypes().get(10));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitSnapchatLinkTap_fieldAccessorTable */
    static final FieldAccessorTable f21731xbca3541 = new FieldAccessorTable(f21730xf74b81c3, new String[]{"BitmojiKitEventBase"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitStickerPickerClose_descriptor */
    static final Descriptor f21732x598b8505 = ((Descriptor) getDescriptor().getMessageTypes().get(6));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitStickerPickerClose_fieldAccessorTable */
    static final FieldAccessorTable f21733x34fbd683 = new FieldAccessorTable(f21732x598b8505, new String[]{"BitmojiKitEventBase", "StickerPickerSessionDurationMillis"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitStickerPickerOpen_descriptor */
    static final Descriptor f21734xf10311b5 = ((Descriptor) getDescriptor().getMessageTypes().get(5));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_BitmojiKitStickerPickerOpen_fieldAccessorTable */
    static final FieldAccessorTable f21735xc133b333 = new FieldAccessorTable(f21734xf10311b5, new String[]{"BitmojiKitEventBase", "StickerPickerView"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_CreativeKitEventBase_descriptor */
    static final Descriptor f21736x2d97abb6 = ((Descriptor) getDescriptor().getMessageTypes().get(13));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_CreativeKitEventBase_fieldAccessorTable */
    static final FieldAccessorTable f21737xe8d2bc34 = new FieldAccessorTable(f21736x2d97abb6, new String[]{"KitEventBase"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_CreativeKitShareComplete_descriptor */
    static final Descriptor f21738x506b8669 = ((Descriptor) getDescriptor().getMessageTypes().get(16));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_CreativeKitShareComplete_fieldAccessorTable */
    static final FieldAccessorTable f21739x7b0633e7 = new FieldAccessorTable(f21738x506b8669, new String[]{"CreativeKitEventBase", "IsSuccess"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_CreativeKitShareStart_descriptor */
    static final Descriptor f21740xaa3363b8 = ((Descriptor) getDescriptor().getMessageTypes().get(15));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_CreativeKitShareStart_fieldAccessorTable */
    static final FieldAccessorTable f21741xf2bf5236 = new FieldAccessorTable(f21740xaa3363b8, new String[]{"CreativeKitEventBase"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_KitEventBase_descriptor */
    static final Descriptor f21742xe4340465 = ((Descriptor) getDescriptor().getMessageTypes().get(3));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_KitEventBase_fieldAccessorTable */
    static final FieldAccessorTable f21743x245ef5e3 = new FieldAccessorTable(f21742xe4340465, new String[]{"OauthClientId", "Locale", "KitUserAgent", "IpAddress", "OsMinorVersion", "KitVariant", "KitVariantVersion", "KitClientTimestampMillis"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_LoginKitAuthComplete_descriptor */
    static final Descriptor f21744x646cbecc = ((Descriptor) getDescriptor().getMessageTypes().get(18));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_LoginKitAuthComplete_fieldAccessorTable */
    static final FieldAccessorTable f21745x4cc6594a = new FieldAccessorTable(f21744x646cbecc, new String[]{"LogKitEventBase", "IsSuccess"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_LoginKitAuthStart_descriptor */
    static final Descriptor f21746xc3b4be35 = ((Descriptor) getDescriptor().getMessageTypes().get(17));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_LoginKitAuthStart_fieldAccessorTable */
    static final FieldAccessorTable f21747x6fb0dfb3 = new FieldAccessorTable(f21746xc3b4be35, new String[]{"LogKitEventBase"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_LoginKitEventBase_descriptor */
    static final Descriptor f21748x91629ca4 = ((Descriptor) getDescriptor().getMessageTypes().get(14));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_LoginKitEventBase_fieldAccessorTable */
    static final FieldAccessorTable f21749xe24cdf22 = new FieldAccessorTable(f21748x91629ca4, new String[]{"KitEventBase"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_ServerEventBatch_descriptor */
    static final Descriptor f21750x7d50d397 = ((Descriptor) getDescriptor().getMessageTypes().get(2));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_ServerEventBatch_fieldAccessorTable */
    static final FieldAccessorTable f21751x2c9a7315 = new FieldAccessorTable(f21750x7d50d397, new String[]{"ServerUploadTs", "MaxSequenceIdOnInstance", "ServerEvents"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_ServerEventData_descriptor */
    static final Descriptor f21752xaa6c74c1 = ((Descriptor) getDescriptor().getMessageTypes().get(1));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_ServerEventData_fieldAccessorTable */
    static final FieldAccessorTable f21753x6bbf4a3f = new FieldAccessorTable(f21752xaa6c74c1, new String[]{"CreativeKitShareStart", "CreativeKitShareComplete", "BitmojiKitStickerPickerOpen", "BitmojiKitStickerPickerClose", "BitmojiKitShare", "BitmojiKitSearch", "BitmojiKitSnapchatLinkTap", "BitmojiKitSnapchatLinkSuccess", "BitmojiKitCreateAvatarTap", "LoginKitAuthStart", "LoginKitAuthComplete", "EventType"});
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_ServerEvent_descriptor */
    static final Descriptor f21754x678ca14b = ((Descriptor) getDescriptor().getMessageTypes().get(0));
    /* renamed from: internal_static_com_snapchat_kit_sdk_core_metrics_model_ServerEvent_fieldAccessorTable */
    static final FieldAccessorTable f21755xb8d74cc9 = new FieldAccessorTable(f21754x678ca14b, new String[]{"EventName", "RequestId", "ServerTs", "UserId", "UserAgent", "Country", "City", "Region", "EventId", "InstanceId", "SequenceId", "OsType", "OsVersion", "AppVersion", "AppBuild", "EventData"});
    public static final GeneratedExtension<FieldOptions, ServerTier> serverEventTier = GeneratedMessage.newFileScopedGeneratedExtension(ServerTier.class, null);

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.Event$1 */
    static class C71481 implements InternalDescriptorAssigner {
        C71481() {
        }

        public ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor) {
            Event.descriptor = fileDescriptor;
            return null;
        }
    }

    private Event() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(serverEventTier);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{DescriptorProtos.getDescriptor()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000bevent.proto\u0012'com.snapchat.kit.sdk.core.metrics.model\u001a\u0010descriptor.proto\"ó\u0002\n\u000bServerEvent\u0012\u0012\n\nevent_name\u0018\u0001 \u0001(\t\u0012\u0012\n\nrequest_id\u0018\u0002 \u0001(\t\u0012\u0011\n\tserver_ts\u0018\u0003 \u0001(\u0001\u0012\u000f\n\u0007user_id\u0018\u0004 \u0001(\t\u0012\u0012\n\nuser_agent\u0018\u0005 \u0001(\t\u0012\u000f\n\u0007country\u0018\u0006 \u0001(\t\u0012\f\n\u0004city\u0018\u0007 \u0001(\t\u0012\u000e\n\u0006region\u0018\b \u0001(\t\u0012\u0010\n\bevent_id\u0018\t \u0001(\t\u0012\u0013\n\u000binstance_id\u0018\n \u0001(\t\u0012\u0013\n\u000bsequence_id\u0018\u000b \u0001(\u0004\u0012\u000f\n\u0007os_type\u0018\f \u0001(\t\u0012\u0012\n\nos_version\u0018\r \u0001(\t\u0012\u0013\n\u000bapp_version\u0018\u000e \u0001(\t\u0012\u0011\n\tapp_build\u0018\u000f \u0001(\t\u0012L\n\nevent_data\u0018d \u0001(\u000b28.com.snapchat.kit.sdk.core.metrics.model.ServerEventData\"Ð\t\n\u000fServerEventData\u0012h\n\u0018creative_kit_share_start\u0018\u001c \u0001(\u000b2>.com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStartB\u0004øé0\u0002H\u0000\u0012n\n\u001bcreative_kit_share_complete\u0018\u001d \u0001(\u000b2A.com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareCompleteB\u0004øé0\u0002H\u0000\u0012u\n\u001fbitmoji_kit_sticker_picker_open\u0018\u001e \u0001(\u000b2D.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpenB\u0004øé0\u0002H\u0000\u0012w\n bitmoji_kit_sticker_picker_close\u0018\u001f \u0001(\u000b2E.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerCloseB\u0004øé0\u0002H\u0000\u0012[\n\u0011bitmoji_kit_share\u0018  \u0001(\u000b28.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShareB\u0004øé0\u0002H\u0000\u0012]\n\u0012bitmoji_kit_search\u0018! \u0001(\u000b29.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchB\u0004øé0\u0002H\u0000\u0012q\n\u001dbitmoji_kit_snapchat_link_tap\u0018\" \u0001(\u000b2B.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTapB\u0004øé0\u0002H\u0000\u0012y\n!bitmoji_kit_snapchat_link_success\u0018# \u0001(\u000b2F.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkSuccessB\u0004øé0\u0002H\u0000\u0012q\n\u001dbitmoji_kit_create_avatar_tap\u0018$ \u0001(\u000b2B.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTapB\u0004øé0\u0002H\u0000\u0012`\n\u0014login_kit_auth_start\u0018% \u0001(\u000b2:.com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStartB\u0004øé0\u0002H\u0000\u0012f\n\u0017login_kit_auth_complete\u0018& \u0001(\u000b2=.com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthCompleteB\u0004øé0\u0002H\u0000B\f\n\nevent_type\"\u0001\n\u0010ServerEventBatch\u0012\u0018\n\u0010server_upload_ts\u0018\u0001 \u0001(\u0001\u0012#\n\u001bmax_sequence_id_on_instance\u0018\u0003 \u0001(\u0004\u0012K\n\rserver_events\u0018\u0004 \u0003(\u000b24.com.snapchat.kit.sdk.core.metrics.model.ServerEvent\"\u0002\n\fKitEventBase\u0012\u0017\n\u000foauth_client_id\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006locale\u0018\u0002 \u0001(\t\u0012\u0016\n\u000ekit_user_agent\u0018\u0003 \u0001(\t\u0012\u0012\n\nip_address\u0018\u0004 \u0001(\t\u0012\u0018\n\u0010os_minor_version\u0018\u0005 \u0001(\t\u0012E\n\u000bkit_variant\u0018\u0006 \u0001(\u000e20.com.snapchat.kit.sdk.core.metrics.model.KitType\u0012\u001b\n\u0013kit_variant_version\u0018\u0007 \u0001(\t\u0012#\n\u001bkit_client_timestamp_millis\u0018\b \u0001(\u0004\"\u0001\n\u0013BitmojiKitEventBase\u0012M\n\u000ekit_event_base\u0018\u0001 \u0001(\u000b25.com.snapchat.kit.sdk.core.metrics.model.KitEventBase\u0012!\n\u0019sticker_picker_session_id\u0018\u0002 \u0001(\t\"Þ\u0001\n\u001bBitmojiKitStickerPickerOpen\u0012\\\n\u0016bitmoji_kit_event_base\u0018\u0001 \u0001(\u000b2<.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase\u0012a\n\u0013sticker_picker_view\u0018\u0002 \u0001(\u000e2D.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerView\"¬\u0001\n\u001cBitmojiKitStickerPickerClose\u0012\\\n\u0016bitmoji_kit_event_base\u0018\u0001 \u0001(\u000b2<.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase\u0012.\n&sticker_picker_session_duration_millis\u0018\u0002 \u0001(\u0004\"è\u0002\n\u000fBitmojiKitShare\u0012\\\n\u0016bitmoji_kit_event_base\u0018\u0001 \u0001(\u000b2<.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase\u0012\u0018\n\u0010subject_user_ids\u0018\u0002 \u0003(\t\u0012\u0012\n\nsticker_id\u0018\u0003 \u0001(\t\u0012X\n\u000eshare_category\u0018\u0004 \u0001(\u000e2@.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShareCategory\u0012Z\n\u000fsearch_category\u0018\u0005 \u0001(\u000e2A.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchCategory\u0012\u0013\n\u000bsearch_term\u0018\u0006 \u0001(\t\"z\n\u0014BitmojiKitSearchTerm\u0012S\n\bcategory\u0018\u0001 \u0001(\u000e2A.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchCategory\u0012\r\n\u0005value\u0018\u0002 \u0001(\t\"Å\u0001\n\u0010BitmojiKitSearch\u0012\\\n\u0016bitmoji_kit_event_base\u0018\u0001 \u0001(\u000b2<.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase\u0012S\n\fsearch_terms\u0018\u0002 \u0003(\u000b2=.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm\"y\n\u0019BitmojiKitSnapchatLinkTap\u0012\\\n\u0016bitmoji_kit_event_base\u0018\u0001 \u0001(\u000b2<.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase\"}\n\u001dBitmojiKitSnapchatLinkSuccess\u0012\\\n\u0016bitmoji_kit_event_base\u0018\u0001 \u0001(\u000b2<.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase\"y\n\u0019BitmojiKitCreateAvatarTap\u0012\\\n\u0016bitmoji_kit_event_base\u0018\u0001 \u0001(\u000b2<.com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase\"e\n\u0014CreativeKitEventBase\u0012M\n\u000ekit_event_base\u0018\u0001 \u0001(\u000b25.com.snapchat.kit.sdk.core.metrics.model.KitEventBase\"b\n\u0011LoginKitEventBase\u0012M\n\u000ekit_event_base\u0018\u0001 \u0001(\u000b25.com.snapchat.kit.sdk.core.metrics.model.KitEventBase\"w\n\u0015CreativeKitShareStart\u0012^\n\u0017creative_kit_event_base\u0018\u0001 \u0001(\u000b2=.com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase\"\u0001\n\u0018CreativeKitShareComplete\u0012^\n\u0017creative_kit_event_base\u0018\u0001 \u0001(\u000b2=.com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase\u0012\u0012\n\nis_success\u0018\u0002 \u0001(\b\"k\n\u0011LoginKitAuthStart\u0012V\n\u0012log_kit_event_base\u0018\u0001 \u0001(\u000b2:.com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase\"\u0001\n\u0014LoginKitAuthComplete\u0012V\n\u0012log_kit_event_base\u0018\u0001 \u0001(\u000b2:.com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase\u0012\u0012\n\nis_success\u0018\u0002 \u0001(\b*@\n\nServerTier\u0012\f\n\bOPS_TIER\u0010\u0000\u0012\u0011\n\rCRITICAL_TIER\u0010\u0001\u0012\u0011\n\rBUSINESS_TIER\u0010\u0002*Q\n\u0007KitType\u0012\u0014\n\u0010UNKNOWN_KIT_TYPE\u0010\u0000\u0012\u000f\n\u000bBITMOJI_KIT\u0010\u0001\u0012\u0010\n\fCREATIVE_KIT\u0010\u0002\u0012\r\n\tLOGIN_KIT\u0010\u0003*{\n\u001bBitmojiKitStickerPickerView\u0012#\n\u001fUNKNOWN_BITMOJI_KIT_PICKER_VIEW\u0010\u0000\u0012\u0012\n\u000eSTICKER_PICKER\u0010\u0001\u0012\u0011\n\rCREATE_AVATAR\u0010\u0002\u0012\u0010\n\fLINK_ACCOUNT\u0010\u0003*Z\n\u0017BitmojiKitShareCategory\u0012&\n\"UNKNOWN_BITMOJI_KIT_SHARE_CATEGORY\u0010\u0000\u0012\u000b\n\u0007POPULAR\u0010\u0001\u0012\n\n\u0006SEARCH\u0010\u0002*u\n\u0018BitmojiKitSearchCategory\u0012'\n#UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY\u0010\u0000\u0012\b\n\u0004TEXT\u0010\u0001\u0012\u0010\n\fAUTOCOMPLETE\u0010\u0002\u0012\u0014\n\u0010PROGRAMMED_PILLS\u0010\u0003:o\n\u0011server_event_tier\u0012\u001d.google.protobuf.FieldOptions\u0018\u0006 \u0001(\u000e23.com.snapchat.kit.sdk.core.metrics.model.ServerTierB\u000bP\u0001 \u0001\u0001¢\u0002\u0003SCAb\u0006proto3"}, fileDescriptorArr, new C71481());
        serverEventTier.internalInit((FieldDescriptor) descriptor.getExtensions().get(0));
        ExtensionRegistry newInstance = ExtensionRegistry.newInstance();
        newInstance.add(serverEventTier);
        FileDescriptor.internalUpdateFileDescriptor(descriptor, newInstance);
        DescriptorProtos.getDescriptor();
    }

    public static FileDescriptor getDescriptor() {
        return descriptor;
    }
}
