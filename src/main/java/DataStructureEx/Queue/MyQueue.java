package DataStructureEx.Queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue<T> {
    List<T> data;
    int p_start;    // 队列头指针

    public MyQueue() {
        data = new ArrayList<T>();
        p_start = 0;
    }

    public boolean enQueue(T item) {
        data.add(item); // 添加队列数据
        return true;
    }

    public boolean deQueue() {
        p_start++;
        return p_start >= data.size();
    }

    public int size() {
        return data.size();
    }

}
