package resources;

public class MyArrayList <T> {

    private Object[] storageData; //定义一个数组
    private final int DEFAULT_ARRAY_SIZE = 10; //数组初始大小10
    private int size; //用来记录数组长度

    public MyArrayList(){
        storageData = new Object[DEFAULT_ARRAY_SIZE]; //设置初始大小为10
    }

    public MyArrayList(int size){
        if(size>0){
            this.storageData = new Object[size]; //初始化指定数组大小
        } else {
            this.storageData = new Object[DEFAULT_ARRAY_SIZE]; //默认数组大小
        }
    }


    /**
     * 判断index下标是否越界
     */
    public void checkRange(int index){
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index超过界限");
        }
    }


    /**
     * add方法
     * 添加数据到数组
     * @param
     * @return
     */
    public boolean add(T t){
        isCapacityExpansion(size+1);
        storageData[size++] = t;
        return true;
    }
    //在指定位置添加数据
    public boolean add(int index,T t){
        checkRange(index); //检查index是否越界
        isCapacityExpansion(size+1);
        System.arraycopy(storageData, index, storageData, index+1, size-index); //原数组  从原数据的起始位置开始  目标数组  目标数组的开始起始位置  要copy的数组的长度
        storageData[index] = t;
        size++;
        return true;

    }
    //判断是否需要对数组进行扩容
    public void isCapacityExpansion(int size){
        if(size>DEFAULT_ARRAY_SIZE){ //如果扩容后长度仍然小于加入新元素后数组的长度，则将加入新元素后数组的长度赋值给新长度
            CapacityExpansion(size);
        }
    }

    //扩容
    public void CapacityExpansion(int size){
        int newLength = (int)(storageData.length * 1.5); //进行1.5倍扩容
        if(newLength-size<0){
            newLength = size;
        }
        copyOf(newLength); //实现扩容
    }
    public void copyOf(int newLength){
        //创建一个新的数组
        Object[] newStorageDate = new Object[newLength];
        //将原数组中所有元素复制到新数组中
        for(int i=0; i<storageData.length;i++){
            newStorageDate[i] = storageData[i];
        }
        storageData = newStorageDate; //把新数组给原数组
    }


    /**
     * 返回ArrayList的长度
     */
    public int size(){
        return size;
    }

    /**
     * get方法
     * 返回指定索引位置的元素
     */
    public T get(int index){
        checkRange(index);
        return (T) storageData[index];
    }

    /**
     * set方法
     * 修改指定下标元素
     */
    public void set(int index,T t){
        checkRange(index); //判断是否越界
        storageData[index] = t; //覆盖数据
    }

    /**
     * remove方法
     * 移除指定下标的元素
     */
    public void remove(int index){
        checkRange(index); //判断是否越界
        int moveSize = size-index-1;
        if(moveSize>0){
            System.arraycopy(storageData, index+1, storageData, index, moveSize);
        }
        storageData[--size] = null; //移除了一个元素，size对应减一，最后一位设为Null
    }
}


