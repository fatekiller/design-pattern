package org.example.build.pattern.build.singleton;

public class Singleton {

    private volatile static Singleton instance;

    /**
     * 双重检测避免并发的时候情况变了
     * volatile避免指令重排序，new 的过程 分为 1 分配空间，2 赋值，3 修改指针；2，3可能重排
     * @return
     */
    public Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
