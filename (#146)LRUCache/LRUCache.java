class LRUCache {
    int capacity;
    HashMap<Integer, BiLinkedNode> map;
    BiLinkedNode head, tail;
    int count;
    
    
    public void addNode(BiLinkedNode node){
        node.pre = head;
        node.next = head.next;
        
        head.next.pre = node;
        head.next = node;
    }
    
    public void removeNode(BiLinkedNode node){
        BiLinkedNode pre = node.pre;
        BiLinkedNode next = node.next;

        pre.next = next;
        next.pre = pre;
    }
    
    public void moveToHead(BiLinkedNode node){
        removeNode(node);
        addNode(node);
    }
    
    public BiLinkedNode popTail(){
        BiLinkedNode node = tail.pre;
        removeNode(node);
        return node;
    }
    

//------------------------------------------------------------------------------------------
    public LRUCache(int capacity) {
        count = 0;
        map = new HashMap<>();
        this.capacity = capacity;
        head = new BiLinkedNode();
        tail = new BiLinkedNode();
        head.pre = null;
        tail.next = null;
        head.next = tail;
        tail.pre = head;
        
    }
    
    public int get(int key) {
        BiLinkedNode node = map.get(key);
        if(node == null)
             return -1;
        this.moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        BiLinkedNode node = map.get(key);
        if(node == null){           
            node = new BiLinkedNode(key, value);
            this.addNode(node);
            map.put(key, node);
            count++;
            
            if(count > capacity){
                BiLinkedNode rub = popTail();
                map.remove(rub.key);
                count--;
            }
        }else{
            node.value = value;
            this.moveToHead(node);
        }
    }
}

class BiLinkedNode{
    int key;
    int value;
    BiLinkedNode pre;
    BiLinkedNode next;
    public BiLinkedNode(){
        
    }
    public BiLinkedNode(int key, int value){
        this.key = key;
        this.value = value;
    }
}