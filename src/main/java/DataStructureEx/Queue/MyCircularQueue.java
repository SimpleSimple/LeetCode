package DataStructureEx.Queue;

import com.sun.glass.ui.Size;

import javax.swing.*;
import java.util.ArrayList;

// 双向循环指针队列
public class MyCircularQueue {
    // 使用一个固定大小的数组和两个指针

    int[] data;
    int capacity = 0;
    int size = 0;
    int front = 0;
    int back = -1;  // 头指针索引为0？为什么为指针为-1

    public MyCircularQueue(int k) {
        data = new int[k];
        capacity = k;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (size == 0) return -1;
        return data[front % data.length];
    }

    public int Rear() {
        if (size == 0) return -1;
        return data[back % data.length];
    }

    public boolean enQueue(int value) {
        //data.add(value);
        //tail++;
        //return true;

        //if (data.length < size) {
        if (!isFull()) {
            ++back; // enqueue后队列尾指针向后移动一格
            data[(back) % data.length] = value;
            ++size;
            return true;
        } else return false;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        ++front;
        --size;
        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size >= capacity;
    }

    // 总结：
    // 循环队列应该用什么数据结构呢
    // - 数组
    // - 链表、双向链表
    // -
}
