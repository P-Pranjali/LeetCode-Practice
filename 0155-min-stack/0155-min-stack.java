class MinStack {

     Deque<Integer> stackA;
    Deque<Integer> stackB;

    //int currentMin = Integer.MAX_VALUE;

    public MinStack() {
        stackA = new ArrayDeque<>();
        stackB = new ArrayDeque<>();
        
    }
    
    public void push(int value) {
        stackA.push(value);
        if(stackB.isEmpty()) stackB.push(value);
      else{int currentMin = Math.min(value, stackB.peek());
        stackB.push(currentMin);}
        
    }
    
    public void pop() {
        stackA.pop();
        stackB.pop();
        
    }
    
    public int top() {
       return stackA.peek();
        
    }
    
    public int getMin() {
        return stackB.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */