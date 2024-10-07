import java.util.LinkedList;

 public class HashTab<K, V> {

    private LinkedList<KplusV<K, V>>[] indxList; 
    private int size = 0; 

    private class KplusV<Ke, Va> {
        Ke key;
        Va value;

        public KplusV(Ke ky, Va val) {
            this.key = ky;
            this.value = val;
        }
    }

    @SuppressWarnings("unchecked")
    public HashTab(int indxListLen) {
        indxList = (LinkedList<KplusV<K,V>>[]) new LinkedList[indxListLen];
    }

    public HashTab(){
        this(1000);
    }
 
    private int hash(K key) {
        
        return Math.abs(key.hashCode()) % indxList.length; 
    }

 
    public void put(K k_, V v_) {
        int index = hash(k_); 
        if (indxList[index] == null) {
            indxList[index] = new LinkedList<KplusV<K, V>>(); 
        } else {
            for (KplusV<K, V> KplusV : indxList[index]) {
                if (KplusV.key.equals(k_)) {
                    KplusV.value = v_; 
                    return;
                }
            }
        }
        indxList[index].add(new KplusV<K,V>(k_, v_)); 
        size++;
    }


    public V get(K k_) {
        int index = hash(k_);
        if (indxList[index] != null) {
            for (KplusV<K, V> KplusV : indxList[index]) {
                if (KplusV.key.equals(k_)) {
                    return KplusV.value;
                }
            }
        }
        return null;
    }

    public void remove(K k_){
        int index = hash(k_);
        if (indxList[index] == null){
            return;
        } else{
            for (KplusV<K,V> KplusV : indxList[index]){
                if (KplusV.key.equals(k_)){
                    indxList[index].remove(KplusV);
                    size--;
                }
            }
        }

    }

    public int sizeCon() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

}
