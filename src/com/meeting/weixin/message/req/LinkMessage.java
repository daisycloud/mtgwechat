package com.meeting.weixin.message.req;

/**
* 类名: LinkMessage
* 描述: 请求消息之链接消息
* 创建时间：2017-2-13
* 发布版本：V1.0
 */

public class LinkMessage extends BaseMessage {

	 // 消息标题
    private String Title;
    // 消息描述
    private String Description;
    // 消息链接
    private String Url;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
    
}
