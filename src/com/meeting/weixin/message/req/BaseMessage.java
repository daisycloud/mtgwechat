package com.meeting.weixin.message.req;

/**
* ����: BaseMessage
* ����: ������Ϣ�Ļ���
* ����ʱ�䣺2017-2-13
* �����汾��V1.0
 */

public class BaseMessage {

	// ������΢�ź�
	private String ToUserName;
	// ���ͷ��ʺ�(һ��OpenID)
	private String FromUserName;
	// ��Ϣ����ʱ��(����)
	private long CreateTime;
	// ��Ϣ����(text/ image/ location/ link)
	private String MsgType;
	// ��Ϣid, 64λ����
	private long MsgId;
	
	public String ToUserName(){
		return ToUserName;
	}
	
	public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }
	
	public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }
    
    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }
    
    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public long getMsgId() {
        return MsgId;
    }

    public void setMsgId(long msgId) {
        MsgId = msgId;
    }
	
}
















