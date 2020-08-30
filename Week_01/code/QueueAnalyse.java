import java.util.Queue;

public interface QueueAnalyse extends Queue{

    /**
     * 增加元素到队列中，容量满了抛出异常
     * @param o
     * @return
     */
    @Override
    default boolean add(Object o) {
        return false;
    }

    /**
     *增加元素到队列中，容量满了返回false
     * @param o
     * @return
     */
    @Override
    default boolean offer(Object o) {
        return false;
    }

    /**
     * 删除头部元素并返回，失败抛出异常
     * @return
     */
    @Override
    default Object remove() {
        return null;
    }

    /**
     * 删除头部元素并返回，失败返回false
     * @return
     */
    @Override
    default Object poll() {
        return null;
    }

    /**
     * 获取头部元素，失败抛出异常
     * @return
     */
    @Override
    default Object element() {
        return null;
    }

    /**
     * 获取头部元素，失败返回false
     * @return
     */
    @Override
    default Object peek() {
        return null;
    }
}
