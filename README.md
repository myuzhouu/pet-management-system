宠物管理系统（Pet Management System）
项目简介

这是一个基于 Java 面向对象思想开发的控制台宠物管理系统。

本项目主要用于练习：

Java 面向对象编程
类与对象
继承
多态
抽象类
Map 集合
类型判断（instanceof）
方法封装
管理系统逻辑设计

系统目前支持：

添加宠物
删除宠物
查看宠物信息
查看宠物数量
宠物执行普通行为
宠物执行特殊行为
项目结构
Test
 ├── Animal.java
 ├── Dog.java
 ├── Cat.java
 ├── AnimalManager.java
 └── App.java
类说明
1. Animal（抽象父类）

所有宠物的父类。

包含：

name（名字）
age（年龄）

以及公共行为：

eat()
sleep()

采用抽象类设计，由子类实现具体行为。

2. Dog 类

继承 Animal。

实现：

eat()
sleep()

扩展特殊行为：

watchHouse()

用于模拟狗看家。

同时维护：

static int dogSum

用于统计狗的数量。

3. Cat 类

继承 Animal。

实现：

eat()
sleep()

扩展特殊行为：

catchMouse()

用于模拟猫抓老鼠。

同时维护：

static int catSum

用于统计猫的数量。

4. AnimalManager 类

系统核心管理类。

负责：

管理 Map 集合
添加宠物
删除宠物
查询宠物
执行宠物行为

内部使用：

Map<Integer, Animal>

来存储所有宠物。

其中：

key：宠物编号
value：宠物对象
5. App 类

程序入口。

负责：

菜单显示
用户输入
调用 AnimalManager 功能
已实现功能
1. 添加宠物

支持：

添加狗
添加猫

系统会自动分配宠物编号。

2. 删除宠物

支持根据宠物编号删除。

删除前会：

判断编号是否存在
判断删除的是 Dog 还是 Cat
自动更新对应数量统计
3. 查看宠物总数

支持查看：

所有宠物数量
狗的数量
猫的数量
4. 查看所有宠物信息

显示：

宠物编号
名字
年龄
5. 普通行为

所有宠物都会执行：

eat()
sleep()

体现多态思想。

6. 特殊行为

根据宠物类型执行：

Dog：

watchHouse()

Cat：

catchMouse()

通过：

instanceof

判断类型。

技术点总结

本项目主要练习了以下 Java 核心知识：

技术	说明
面向对象	类与对象设计
继承	Dog/Cat 继承 Animal
多态	父类引用指向子类对象
抽象类	Animal 使用 abstract
方法重写	eat() / sleep()
Map 集合	存储宠物数据
HashMap	key-value 数据管理
instanceof	判断对象类型
static	统计宠物数量
封装	AnimalManager 管理业务逻辑
switch	菜单系统
Scanner	用户输入
系统运行示例
欢迎来到宠物管理系统！

1 添加宠物
2 删除宠物
3 查看宠物总数
4 查看修狗总数
5 查看喵喵总数
6 查看所有宠物信息
7 让所有宠物执行行为
8 让宠物执行特殊行为
0 退出系统
当前项目特点

本项目虽然是控制台程序，但已经具备：

小型 CRUD 管理系统结构
基本业务逻辑
数据管理思想
面向对象分层设计

属于 Java 初学阶段非常重要的练习项目。

后续可扩展方向

后续计划可以继续扩展：

功能扩展
修改宠物信息
根据编号查询宠物
模糊搜索宠物
删除全部宠物
按类型分类显示
技术扩展
ArrayList 与 Map 对比
文件存储（持久化）
异常处理
泛型优化
GUI 图形界面
MySQL 数据库
Spring Boot 后端化
项目目的

本项目主要用于：

巩固 Java 基础
理解面向对象思想
练习管理系统开发逻辑
为后续学习 Java Web 与 Spring Boot 打基础