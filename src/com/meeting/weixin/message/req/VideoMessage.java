package com.meeting.weixin.message.req;

/**
* ����: VideoMessage
* ����: ������Ϣ֮��Ƶ��Ϣ
* ����ʱ�䣺2017-2-13
* �����汾��V1.0
 */

public class VideoMessage  extends BaseMessage{

	 // ý��ID
    private String MediaId;
    // ��Ƶ��ʽ
    private String ThumbMediaId;

    public String getMediaId() {
        return MediaId;
    }
    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
    public String getThumbMediaId() {
        return ThumbMediaId;
    }
    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
    
}
