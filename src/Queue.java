public class Queue {
    int front, back,size;
    int capacity;
    int array[];

    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size =0;
        back = capacity-1;
        array = new int[this.capacity];
    }
    boolean  isEmpty(Queue queue){
        return  (queue.size ==0);
    }
    boolean isFull(Queue queue){
        return (queue.size == queue.capacity);
    }
    void add(int x){
        if (isFull(this))
            return;
        this.back = (this.back + 1) % this
                .capacity;
        this.array[this.back] = x;
        this.size = this.size +1;
        //System.out.println("valu added");

    }
     int remove(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        this.front = (this.front +1) % this.capacity;
        int item = this.array[this.front];
        this.size = this.size -1;
        return item;
    }
    int front(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        return  this.array[this.front];
    }
    int back(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        return  this.array[this.back];
    }
    void printQueue(){
        for (int i = front; i<=back; i++){
            System.out.println(array[i]);
        }
    }


}
