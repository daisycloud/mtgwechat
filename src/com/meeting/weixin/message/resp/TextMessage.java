package com.meeting.weixin.message.resp;

/**
* ����: TextMessage 
* ����: �ı���Ϣ
* ����ʱ�䣺2017-2-13
* �����汾��V1.0
 */

public class TextMessage extends BaseMessage {
	
	 // �ظ�����Ϣ����
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
