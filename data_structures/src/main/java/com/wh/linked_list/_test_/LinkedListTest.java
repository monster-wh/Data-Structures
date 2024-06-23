package com.wh.linked_list._test_;


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import com.wh.linked_list.LinkedList;
import com.wh.linked_list.List;
import org.junit.Test;

public class LinkedListTest {

    private final Logger logger = LoggerFactory.getLogger(LinkedListTest.class);

    @Test
    public void test_linked_list() {
        List<String> list = new LinkedList<>();
        // 添加元素
        list.add("a");
        list.addFirst("b");
        list.addLast("c");
        // 打印列表
        list.printLinkList();
        // 头插元素
        list.addFirst("d");
        // 删除元素
        list.remove("b");
        // 打印列表
        list.printLinkList();
    }

}