package com.weixin.spi;

/**
 * POST的XML数据包转换为消息接受对象
 *
 * <p>
 * 由于POST的是XML数据包，所以不确定为哪种接受消息，<br/>
 * 所以直接将所有字段都进行转换，最后根据<tt>MsgType</tt>字段来判断取何种数据</p>
 *
 * @author weixin4j<weixin4j@ansitech.com>
 */
public class InputMessage {

    private String ToUserName;
    private String FromUserName;
    private Long CreateTime;
    private String MsgType = "text";
    private Long MsgId;
    // 文本消息
    private String Content;
    // 图片消息
    private String PicUrl;
    // 位置消息
    private String Location_X;
    private String Location_Y;
    private Long Scale;
    private String Label;
    // 链接消息
    private String Title;
    private String Description;
    private String Url;
    // 语音信息
    private String MediaId;
    private String Format;
    private String Recognition;
    // 事件
    private String Event;
    private String EventKey;
    private String Ticket;
    //上报地理位置事件
    private String Latitude;
    private String Longitude;
    private String Precision;
    //群发消息事件
    private String MsgID;
    private String Status;
    private int TotalCount;
    private int FilterCount;
    private int SentCount;
    private int ErrorCount;
    //扫码推事件
    private ScanCodeInfo ScanCodeInfo;
    //拍照发图
    private SendPicsInfo SendPicsInfo;
    //发送地理位置
    private SendLocationInfo SendLocationInfo;

    public String getToUserName() {
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

    public Long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public Long getMsgId() {
        return MsgId;
    }

    public void setMsgId(Long msgId) {
        MsgId = msgId;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getLocation_X() {
        return Location_X;
    }

    public void setLocation_X(String locationX) {
        Location_X = locationX;
    }

    public String getLocation_Y() {
        return Location_Y;
    }

    public void setLocationY(String location_Y) {
        Location_Y = location_Y;
    }

    public Long getScale() {
        return Scale;
    }

    public void setScale(Long scale) {
        Scale = scale;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

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

    public String getEvent() {
        //转成小写
        return Event.toLowerCase();
    }

    public void setEvent(String event) {
        Event = event;
    }

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }

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

    public String getRecognition() {
        return Recognition;
    }

    public void setRecognition(String recognition) {
        Recognition = recognition;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    public String getPrecision() {
        return Precision;
    }

    public void setPrecision(String Precision) {
        this.Precision = Precision;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(int TotalCount) {
        this.TotalCount = TotalCount;
    }

    public int getFilterCount() {
        return FilterCount;
    }

    public void setFilterCount(int FilterCount) {
        this.FilterCount = FilterCount;
    }

    public int getSentCount() {
        return SentCount;
    }

    public void setSentCount(int SentCount) {
        this.SentCount = SentCount;
    }

    public int getErrorCount() {
        return ErrorCount;
    }

    public void setErrorCount(int ErrorCount) {
        this.ErrorCount = ErrorCount;
    }

    public String getMsgID() {
        return MsgID;
    }

    public void setMsgID(String MsgID) {
        this.MsgID = MsgID;
    }

    public ScanCodeInfo getScanCodeInfo() {
        return ScanCodeInfo;
    }

    public void setScanCodeInfo(ScanCodeInfo ScanCodeInfo) {
        this.ScanCodeInfo = ScanCodeInfo;
    }

    public SendLocationInfo getSendLocationInfo() {
        return SendLocationInfo;
    }

    public void setSendLocationInfo(SendLocationInfo SendLocationInfo) {
        this.SendLocationInfo = SendLocationInfo;
    }

    public SendPicsInfo getSendPicsInfo() {
        return SendPicsInfo;
    }

    public void setSendPicsInfo(SendPicsInfo SendPicsInfo) {
        this.SendPicsInfo = SendPicsInfo;
    }
}

