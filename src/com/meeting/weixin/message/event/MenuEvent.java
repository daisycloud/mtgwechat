package com.meeting.weixin.message.event;

/**
* ����: MenuEvent 
* ����: �Զ���˵��¼�
* ����ʱ�䣺2017-2-13
* �����汾��V1.0
 */

public class MenuEvent  extends BaseEvent {

	 // �¼�KEYֵ�����Զ���˵��ӿ���KEYֵ��Ӧ
	private String EventKey;
	
	public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }
	
}
