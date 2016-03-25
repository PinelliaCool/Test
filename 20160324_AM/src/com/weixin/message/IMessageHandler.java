package com.weixin.message;

import com.weixin.spi.InputMessage;

/**
 * <p>
 * Title: 微信公众平台接受消息处理器</p>
 *
 * <p>
 * Description: 接受消息分8类，普通消息（1.文本消息、2.图片消息、3.语音消息<br />
 * 、4.视频消息、5.地理位置消息、6.链接消息）<br />
 * 事件推送（1.关注/取消关注事件、2.扫描带二维码参数事件、3.上报地理位置事件、4.自定义<br />
 * 菜单事件、5.点击菜单拉取消息时事件推送、6.点击菜单跳转链接时的事件推送</p>
 *
 * @author weixin4j<weixin4j@ansitech.com>
 */
public interface IMessageHandler {

    /**
     * 文字内容的消息处理
     *
     * @param msg 接受消息对象
     * @return 输出消息对象
     */
    public OutputMessage textTypeMsg(InputMessage msg);

    /**
     * 图片类型的消息处理
     *
     * @param msg 接受消息对象
     * @return 输出消息对象
     */
    public OutputMessage imageTypeMsg(InputMessage msg);

    /**
     * 语音类型的消息处理
     *
     * @param msg 接受消息对象
     * @return 输出消息对象
     */
    public OutputMessage voiceTypeMsg(InputMessage msg);

    /**
     * 视频类型的消息处理
     *
     * @param msg 接受消息对象
     * @return 输出消息对象
     */
    public OutputMessage videoTypeMsg(InputMessage msg);

    /**
     * 小视频类型的消息处理
     *
     * @param msg 接受消息对象
     * @return 输出消息对象
     */
    public OutputMessage shortvideoTypeMsg(InputMessage msg);

    /**
     * 地理位置类型的消息处理
     *
     * @param msg 接受消息对象
     * @return 输出消息对象
     */
    public OutputMessage locationTypeMsg(InputMessage msg);

    /**
     * 链接类型的消息处理
     *
     * @param msg 接受消息对象
     * @return 输出消息对象
     */
    public OutputMessage linkTypeMsg(InputMessage msg);

    /**
     * 事件类型的消息处理。<br/> 在用户首次关注公众账号时，系统将会推送一条subscribe的事件
     *
     * @param msg 接受消息对象
     * @return 输出消息对象
     */
    public OutputMessage eventTypeMsg(InputMessage msg);
}

