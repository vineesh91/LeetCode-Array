public class ResizingArray {
    private int[] stack;
    private int index = 0;
    public ResizingArray() {
        stack = new int[5];
    }
    public boolean isEmpty() {
        return index == 0;
    }
    public void push(int a) {
        if (index == stack.length) {
            int[] s2 = new int[stack.length * 2];
            for(int i = 0; i < stack.length; i++) {
                s2[i] = stack[i];
            }
            stack = s2;
        }
        stack[index++] = a;
    }

    public int pop() {
        return stack[--index];
    }
}
