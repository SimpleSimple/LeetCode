package DataStructureEx.Stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    /**
     * 栈的应用：
     * 栈是一种先进先出的数据结构
     * <p>
     * 包含方法：
     * - push
     * - pop
     * - remove
     */

    List<Integer> data; // 定于一个动态数组存储堆栈的数据

    public MyStack() {
        data = new ArrayList<Integer>();
    }

    protected boolean push(int x) {
        data.add(x);
        return true;
    }

    protected boolean pop() {
        if (isEmpty()) {
            return false;
        }
        data.remove(data.size() - 1);
        return true;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void get(int index) {

    }

    public int top() {
        return data.get(data.size() - 1);
    }
}
