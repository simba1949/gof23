# Gof23

## 前言

博客书

版本说明

```properties

```

相关链接：

* 



## 七大原则

> 高内聚、低耦合，可维护性，可扩展性，灵活性；

1. **单一职责原则**：
2. **接口隔离原则**：
3. **依赖倒转原则**：
4. **里式替换原则**：
5. **开闭原则（OCP）**：工厂模式使用到
6. **迪米特法则**：
7. **合成复用原则**：

### 单一职责原则

对类来说，即一个类应该只负责一项职责，如类A负责两个不同的职责：职责1，指责。

当职责1需求变更而改变类A，可能造成职责2执行错误，所以需要将类A的粒度分解为A1,A2

### 接口隔离原则

一个类对另外一个类的依赖应该建立在最小的接口上；

### 依赖倒转原则

1. 高层模块不应该依赖底层模块，二者都应该依赖其抽象；
2. 抽象不应该依赖细节，细节应该依赖抽象；
3. 依赖倒转的中心思想是面向接口编程；
4. 设计理念：相对于细节的多变性，抽象的东西要稳定的多；
5. 使用接口或者抽象类的目的是制定好规范。

方式

* 通过接口传递实现依赖
* 通过构造方法实现依赖
* 通过 `setter` 方法实现依赖

注意事项和细节

1. 底层模块尽量都要有抽象类或者接口，或者两者都有，程序稳定性更好；
2. 变量的声明类型尽量是抽象类或者接口，这样我们的变量引用和实际对象间就存在一个缓冲层，利于程序的扩展和优化；
3. 继承时遵循里式替换原则；

### 里式替换原则

通常的做法是，原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉，采用依赖、聚合、组合等关系替代；

### 开闭原则

1. 一个软件实体如类、模块和函数应该对扩展开放（对提供方），对修改关闭（对适用方）。用抽象构建框架，用实现扩展细节；
2. 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化；

### 迪米特法则

1. 迪米特法则的核心降低类的耦合度