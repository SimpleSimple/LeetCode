package DataStructureEx.Stack;

public class StackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(13);
        myStack.push(5);

        for (int i = 0; i < 5; i++) {
            if (!myStack.isEmpty()) {
                System.out.println(myStack.top());
            }   // 这里执行if条件后会继续执行下面的语句，所以堆栈里面的元素还是会依次减少

            System.out.println(myStack.pop());
        }
    }
}
