# 宠物管理系统（Pet Management System）

## 项目简介
这是一个使用 Java 编写的控制台宠物管理系统，用于练习面向对象编程（OOP）思想。

支持对宠物进行简单管理，例如添加、删除、查看等操作。

---

## 功能列表

- 添加宠物（支持 Dog 和 Cat）
- 删除宠物（按编号删除）
- 查看宠物总数
- 查看狗 / 猫数量
- 查看所有宠物信息
- 宠物执行行为（eat / sleep）
- 宠物执行特殊行为（看家 / 抓老鼠）

---

## 技术点

- Java 基础语法
- 面向对象（继承、抽象类、多态）
- ArrayList 集合
- 控制台交互（Scanner）

---

## 项目结构
src/Test/
├── App.java // 主程序入口
├── Animal.java // 抽象父类
├── Dog.java // 狗类
├── Cat.java // 猫类


---

## 运行方式

编译：

```bash
javac -d bin src/Test/*.java
运行：
java -cp bin Test.App
后续改进方向
使用 Map 实现唯一编号（避免删除后编号变化）
增加修改宠物信息功能
增加查询功能（按名字查找）
使用接口优化设计