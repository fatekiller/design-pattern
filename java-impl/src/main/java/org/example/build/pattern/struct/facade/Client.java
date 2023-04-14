package org.example.build.pattern.struct.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *       +-----------------+
 *       |    Facade       |
 *       +-----------------+
 *       | + doSomething() |
 *       +-----------------+
 *               |
 *               |
 *               v
 *       +-----------------+
 *       |  Subsystem 1    |
 *       +-----------------+
 *       | + operation1()  |
 *       +-----------------+
 *               |
 *               |
 *               v
 *       +-----------------+
 *       |  Subsystem 2    |
 *       +-----------------+
 *       | + operation2()  |
 *       +-----------------+
 *               |
 *               |
 *               v
 *       +-----------------+
 *       |  Subsystem 3    |
 *       +-----------------+
 *       | + operation3()  |
 *       +-----------------+
 *
 *       一个门面类，提供一个功能，内部聚合了一些子系统，外部不用关心子系统，只用调用接口实现功能
 *       例如slf4j；定义了一组log工厂和日志输出方式，然后可以根据需求选择
 *       自己的想要的，例如logBack或者log4j
 */
public class Client {

    public static void main(String[] args) {
        FacadePattern facadePattern = new FacadePattern(new SubSystemA(), new SubSystemB(), new SubSystemC());
        facadePattern.doSomething();

        Logger logger = LoggerFactory.getLogger(Client.class);
    }
}
