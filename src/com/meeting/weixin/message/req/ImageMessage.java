package com.meeting.weixin.message.req;

/**
* ����: ImageMessage
* ����: ������Ϣ֮ͼƬ��Ϣ
* ����ʱ�䣺2017-2-13
* �����汾��V1.0
 */

public class ImageMessage extends BaseMessage {

	// ͼƬ����
    private String PicUrl;
    private String MediaId;
    
    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
