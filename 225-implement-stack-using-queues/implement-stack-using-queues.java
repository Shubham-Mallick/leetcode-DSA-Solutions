class MyStack {

    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.add(x);
        for (int i = 1; i < queue.size(); i++)
            queue.add(queue.remove()); // add the element
    }

    public int pop() {
        return queue.remove();   // return the removed element
    }

    public int top() {
        return queue.peek(); // return the top element
    }

    public boolean empty() {
        return queue.isEmpty(); // checks empty or not
    }
}


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */