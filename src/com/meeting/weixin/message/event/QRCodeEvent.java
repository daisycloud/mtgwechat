package com.meeting.weixin.message.event;

/**
* ����: QRCodeEvent
* ����: ɨ���������ά���¼�
* ����ʱ�䣺2017-2-13
* �����汾��V1.0
 */

public class QRCodeEvent extends BaseEvent {

	// �¼�KEYֵ
	private String EventKey;
	// ���ڻ�ȡ��ά��ͼƬ
	private String Ticket;
	
	 public String getEventKey() {
	        return EventKey;
	    }

	    public void setEventKey(String eventKey) {
	        EventKey = eventKey;
	    }

	    public String getTicket() {
	        return Ticket;
	    }

	    public void setTicket(String ticket) {
	        Ticket = ticket;
	    }
}
