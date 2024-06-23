package com.wh.linked_list;

/**
 * Description:
 *
 * @Author WangHao
 * @Create 2024/6/23 18:12
 */
public interface List <E>{
    boolean add(E e);

    boolean addFirst( E e);

    boolean addLast(E e);

    boolean remove(Object o);

    E get(int index);

    void printLinkList();
}
