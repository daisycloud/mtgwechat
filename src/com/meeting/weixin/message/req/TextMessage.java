package com.meeting.weixin.message.req;

/**
* ����: TextMessage
* ����: ������Ϣ֮�ı���Ϣ
* ����ʱ�䣺2017-2-13
* �����汾��V1.0
 */

public class TextMessage  extends BaseMessage {
	// ��Ϣ����
    private String Content;
    
    public String getContent() {
        return Content;
    }
    
    public void setContent(String content) {
        Content = content;
    }
    
    
    
}
