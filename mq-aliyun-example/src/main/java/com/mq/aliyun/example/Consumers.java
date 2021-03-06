package com.mq.aliyun.example;

import com.github.mq.consumer.ConsumerAble;
import com.github.mq.consumer.Ons;
import com.github.mq.consumer.models.ConsumerOptional;
import com.mq.aliyun.example.consumers.TestConsumer;

/**
 * Created by wangziqing on 17/7/25.
 */

public class Consumers implements ConsumerAble {
    @Override
    public void init(Ons ons) {
        //订阅普通消息(无序)
        ons.consumer("CID_MEICANYUN_ORDER")
                .subscribeTopic("MEICANYUN")
                .subscribeTag("dish.add || dish.update",TestConsumer::dishAdd)
                .subscribeTag("dish.del",TestConsumer::dishDel);

        //订阅顺序消息
        ons.consumerOrdered("CID_ORDER_TEST_DISH",new ConsumerOptional().setConsumeThread(10))
                .subscribeTopic("ORDER_TEST")
                .subscribeTag("dish.add || dish.update",TestConsumer::dishAdd)
                .subscribeTag("dish.del",TestConsumer::dishDel);
    }
}
