package com.meeting.weixin.message.req;

/**
* ����: VoiceMessage
* ����: ������Ϣ֮������Ϣ
* ����ʱ�䣺2017-2-13
* �����汾��V1.0
 */

public class VoiceMessage extends BaseMessage {

	 // ý��ID
    private String MediaId;
    // ������ʽ
    private String Format;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }
    
}