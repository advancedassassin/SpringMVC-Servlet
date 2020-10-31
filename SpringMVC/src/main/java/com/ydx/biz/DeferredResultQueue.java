package com.ydx.biz;

import org.springframework.web.context.request.async.DeferredResult;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @ClassName DeferredResult
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/31 11:37
 * @Version 1.0
 **/
public class DeferredResultQueue {

    private static Queue<DeferredResult<Object>> queue = new ConcurrentLinkedDeque<DeferredResult<Object>>();

    public static void saveOrder( DeferredResult<Object> objectDeferredResult){
        queue.add(objectDeferredResult);

    }

    public static DeferredResult<Object> get(){
        return queue.poll();
    }
}
