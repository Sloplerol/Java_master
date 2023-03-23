# 第一章

* java发展史
    - 自行搜索谢谢
* 编译阶段
    - 如果编译的文件符合java语法会生成字节码文件 .class
        否则不生成
    - class文件无法直接在操作系统内执行
    - 使用jdk工具包内自带的javac命令来进行java的编译
    - javac是编译器工具 使用：javac + 路径
    - 删除java源文件对编译后的class没有影响
    - class文件是打不开的 需要对java进行修改才能更新class里面的内容
* 运行阶段
    - jdk安装后除了javac编译工具外还有java.exe工具来运行环境
    - java如何使用
        如果要运行a.class -- java a
    - 过程
        * 打开DOS运行窗口
        * 输入java a
        * java命令启动JVM java虚拟机，JVM启动Classloader
        * 在硬盘上寻找a.class文件 将该文件装载到JVM里
        * JVM解析a.class文件 翻译成二进制
        * 通过二进制文件与底层硬件交互

* jdk，jre，jvm
    - jdk：java工具包，如果需要在电脑上进行java程序的编译，
    - jre：仅提供java运行环境
    - jvm：java虚拟机，被包含在jre内部

* DOS面板运行javac出现不是内部命令，说明系统不知道你的javac在哪，所以需要我们指明，也就是需要我们去配置环境变量
    - 了解一下window是如何读取内部命令的
        * 首先会在当前目录下去寻找
        * 没有的话会去环境变量里面去查找
        * 如果找不到会报错
    - 配置环境变量
        * 环境变量添加javac所在的目录，记住path路径下每条环境变量都需要用;分隔(英文的)
    - DOS输入javac 和 java则 没有出现错误则显示配置成功

* 运行java程序
    - javac + java文件路径 生成.class文件
    - cd到当前目录下 java + class文件名(不含class后缀)
    - classpath : . //在当前目录下查找

* 注释
    - 对于java文件的解释和说明
    - 只会出现在源文件内，不会出现在class文件中
    - 单行注释
        //
    - 多行注释
        /*
        */
    - javadoc注释： 专业注释，会被javadoc.exe解析，生成帮助文档
        /**
        *
        *
        */

* public class和class的区别
    - 一个源文件里不一定要有public class
    - 一个class对应生成一个class文件
    - 源文件内定义public class的名必须与当前源文件的名一致 且public class只能有一个
    - 想执行class文件必须要有主方法(入口)

* 总结
    - 搭建java环境
    - 编写HelloWorld文件
    - 掌握环境变量的原理
    - public和class区别

## 第二章

* 标识符
    1. 概念
        - 有权自己命名的单词都是标识符
    2. 命名规则
        - 不能以数字开头
        - 不能起关键字名
        - 只能由数字字母$_组成
        - 严格区分大小写
    3. 命名规范
        - 见名知意
        - 遵循驼峰命名
        - 类名，接口名：首字母大写，后面每个单词首字母大写
        - 变量名，方法名：首字母小写，后面每个单词首字母大写
        - 常量名：全部大写
* 关键字
    - 自行记忆

* 字面值
    * 概念
        - 1，2
        - false
        - "a"
    * 字面值就是数据
    * 数据是有分类的
        - 123 属于整型字面值
        - 3.32 属于浮点型字面值
        - false 属于布尔值型字面值
        - 你好 属于字符串型字面值 必须要以双引号括起来
        - 你 属于字符型字面值 必须要以单引号括起来


* 变量

    * 概念
        - 变量相当于内存开辟的一段空间，包括名字，类型，字面值，是存储数据最基本的单元
    * 数据类型的含义
        - 不同数据有不同的数据类型，每一种数据类型占用不同的内存空间
    * 变量要求
        - 字面值和数据的类型一定要保持一致
    * 声明并赋值
        - int a = 1;
    * 变量可以重复赋值
    * 有了变量空间可以重复对内存空间中的一块数据进行修改
    * 对变量操作无疑就两种一个拿一个改
    * 变量必须要先声明再赋值才能开辟一段内存空间
    * 执行程序是有先后顺序的
    * 在**同一块作用域**下变量不能重复声明，但是可以进行赋值操作
    * 变量的作用域
        - 变量的有效范围
        - 出了大括号就不认识了
    * 变量的类型
        * 局部变量
            - 方法体内声明的变量
        * 成员变量
            - 方法体外声明的变量，类体内声明的变量
    * 注意事项
        - 类体内不能编写java语句
        - 作用域不同声明的变量可以重名

* 数据类型

    * 概念

        - 数据类型是用来指导JVM应为这块数据开辟多大空间的指标

    * 数据类型的分类

        * 基本数据类型

            * 四大类八小种
                - 整形
                    byte,int,long,short
                - 字符型
                    char
                - 布尔型
                    boolean
                - 浮点型
                    float,double
                    `字符串"abc"属于引用数据类型`
            * 数据类型所占空间比

            | 基本数据类型 | 占用空间大小(字节) |
            | ------------ | ------------------ |
            | byte         | 1                  |
            | int          | 4                  |
            | long         | 8                  |
            | short        | 2                  |
            | char         | 2                  |
            | boolean      | 1                  |
            | float        | 4                  |
            | double       | 8                  |

            * 计算机在任何情况下只认识二进制文件，底层计算机采用交流电，有接通和断开两种状态

            * 二进制是什么

                - 二进制是表示数据的一种形式

            * 字节(byte)

                - 一个字节代表8个二进制位
                - 1Byte = 8bit 1KB = 1024Byte 1MB = 1024KB 1MB = 1024KB 1GB = 1024MB 1TB = 1024GB

            * Byte类型的取值范围

                - java里面的数字类型都是有正负号，二进制的最左边的数字就是符号位代表数字的正负 0代表正 1代表负
                - 最大值是01111111 转化为10进制=2^7 - 1 = 127
                - 最小值是10000000 转化为10进制为-128
                - 所以byte类型可以表示256个数字

            * 二进制十进制之间的转换

                | 0                                        | 1    | 2    | 3    | 4    | 5    |
                | ---------------------------------------- | ---- | ---- | ---- | ---- | ---- |
                | 2^0                                      | 2^1  | 2^2  | 2^3  | 2^4  | 2^5  |
                | `ex:97 = 2^6 + 2^5 + 2^0 result=1100001` |      |      |      |      |      |
                | `ex:8 = 2^3 result=1000`                 |      |      |      |      |      |
                | 反之同理                                 |      |      |      |      |      |

            * 计算机是如何识别显示生活中的文字

                * 由于计算机的底层是数字，所以针对char类型计算机是无法解析的，但是由于字节包含的二进制位有256条，于是制定了一张表去对应文字和二进制位，也就是字符编码，最先出现的字符编码是ASCII码
                * ASCII解码和编码 
                    - ASCII解码 'a' -> 01100001 
                    - ASCII编码 01100001 -> 'a'
                    - 解码和编码需要遵循统一套字典，否则乱码
                * 字符编码
                    - 人为干涉通过二进制来表达文字的一种方式
                    - 支持简体中文的字符编码: GB2312 < GBK < GB18030 
                    - 支持繁体中文: big5
                    - 统一全球的编码格式: Unicode
                        - Unicode有多种实现的方式
                            - utf-8
                            - utf-16
                            - utf-32
                        - Java语言采用的是Unicode编码
                        - 开发时使用的是utf-8编码格式

            * 数据类型取值范围

            | 基本数据类型 | 取值范围                 |
            | ------------ | ------------------------ |
            | byte         | (-128~127)               |
            | int          | (-2147483648~2147483647) |
            | long         |                          |
            | short        | (-32768~32767)           |
            | char         | (0~65535)                |
            | boolean      | (true,false)             |
            | float        |                          |
            | double       |                          |

            * 成员变量数据类型的默认值 

            | 基本数据类型        | 默认值     |
            | ------------------- | ---------- |
            | byte,int,long,short | 0          |
            | char                | \u0000(空) |
            | float,double        | 0.0        |
            | boolean             | false      |

            * 字符型

                - 常见报错类型

                ```
                char a = 'abc'; //报错需要是字符串型
                char b = "a"; //报错需要是字符型
                ```

                - 转义字符

                    | 转义字符 | 含义        |
                    | -------- | ----------- |
                    | \t       | tab         |
                    | \n       | 换行        |
                    | \'       | '           |
                    | \u       | unicode编码 |

            * 整型

                - 其他种写法就是十进制
                - 以0开头代表是八进制
                - 以0x开始是十六进制   
                - 常见问题
                    - long a = 10; a的数据类型是什么？ 是int类型不是long类型 long类型数字后面需要有L
                    - long b =  2147483648; 会不会报错？  会报错 因为超出了int的范围 需要在数字后加上L表明占用更大的字节空间来存储这段数据
                    - long -> int 当出现大容量转化为小容量的时候会报错 需要强制类型转换(int) 虽然编译成功了但是会出现精度损失的效果
                        强制转化的原理: 00000000 00000000 00000000 00000000 00000000 00000000 10111000 10000000 => 00000000 00000000 10111000 10000000
                    - 当给byte,short,char类型赋值 如果没有超出范围可以直接赋值 超过的话 会报错 ex: byte a = 50 可行 byte b = 128 报错范围超了
                - 拓展知识
                    - 原码 补码 反码转换
                        计算机底层采用补码的形式对数据进行存储
                        正数的补码是其本身
                        负数的补码是绝对值二进制位取反加1

            * 浮点型

                - java语言浮点型默认都被当成double类型处理 如果想要转化为float类型需要在字面值后面加上f或者直接强制类型转化
                - 计算机存储某些无限循环小数会去寻找近似值 因为计算机的存储是有限的

            * 布尔型

                - 0代表错误 1代表正确
                - 主要用于逻辑判断语句中

            * 基本数据类型的互相转化

                - 容量从小到大排序: byte < short/char < int < long < float < double
                - 小数类型容量永远都比整形大 char和short类型容量一样大 但是char类型取的数更大
                - 编译器只会检查语法 不会进行运算 int a = 10; byte b = a / 3;
                - 多种数据混合运算的时候先转化成数据类型最大的那种再做运算
                - byte,short,char运算的时候先转化为int再做运算

        * 引用数据类型

            * String.class Sun提供
            * System.class  Sun提供
            * Student.class 以下都是程序员自定义的
            * User.class


* 运算符

    * 算术运算符 + - * / % ++ --

        - a++ 先赋值再++
        - ++a 直接++

    * 关系运算符 > >= < <= != ==

        - 关系运算符运行结果一定是布尔值

    * 逻辑运算符 & | ! ^ && ||

        - ^ 两边的结果只要不一样结果就为真
        - 短路与和或存在短路现象
        - 短路与和逻辑与区别

        ```
        int a = 10;
        System.out.println(false & a++ < 4); //false
        此时a = 11;
        System.out.println(false && a++ < 4); //false
        此时a = 10;
        //如果有特殊业务逻辑需要使用逻辑与
        ```

        - 什么时候发生短路与
            当第一个表达式为false
        - 什么时候发生短路或
            当第一个表达式为true

    * 赋值类运算符 = += -= /= *=

        - a = a + 5 != a+=5
            byte a = 0;
            a+=5 相当于是 a = (byte)(a+5);
        - 扩展类运算符不改变结果类型

    * 字符串连接运算符

        - 字符串拼接 10 + 'a' = 10a
        - "" ++ 填充变量

    * 三元运算符

        - 布尔表达式 ? 表达式1 : 表达式2
        - 常见错误语句: char c = sex ? '男' : "女"; //编译错误结果有可能是char 也可能是String

* 控制语句

    - 选择语句

        - if分支语句 如果只有一条java语句的话 可以省略大括号不写 (不推荐)
        - switch(int/String) case int/String
            `当然switch后面可以写byte，short，char类型因为会自动转化为int类型`
            ``` case可以合并 switch { case1: case2: case3: case4:  System.out.print("hello world")} ```

    - 循环语句

        - for循环 (重复执行代码)

        > for(一般表达式；布尔表达式；更新表达式) 执行顺序为一般表达式->布尔表达式->java语句->更新表达式->布尔表达式->java语句->更新表达式

        - while循环

    - 循环控制语句

        - break 整个循环直接停止
        - continue 本次循环停止，进入下一次循环

* 方法

    * 概念 
        - 代码片段的复用，方法定义在类体中
    * 语法结构
        - 修饰符列表 返回值类型 方法名
    * 注意事项
        - 当返回类型为void的时候不需要写return
        - 可以书写return ;这样的语句
        - 返回值必须写 如果没有返回值写void
        - 当return语句执行完 方法结束
        - 形参的数据类型有一定的决定作用
    * 方法调用
        - 当调用本类中的方法省略类名
        - 当调用其他类里的方法一定要指明类
        - 一个java文件一个class
    * 深入return
        - return后不能编写代码
        - 一个方法必须要有return
        - 返回类型为void可以可以写return但是不能返回任何值
        - reutrn终止的是整个方法
    * JVM分配内存
        * 方法只定义未调用是不会为方法开辟空间的
        * JVM划分的主要有三块内存区域
            - 堆内存
            - 栈内存
                - 遵循先进后出 后进先出的原理
                - 方法在被调用的时候，会在栈内分配给方法内存空间，此时发生压栈，当调用完方法后，释放内存空间，此时发生弹栈效果
                - 局部变量在栈内存储，方法体中声明
            - 方法区内存
                - 存放方法的代码片段
            - 关于栈数据结构
                - 数据结构反应的存储数据的形态
    * 重载
        - 功能相同，方法名一致
        - 参数不同 顺序不同 类型不同
        - 方法重载和返回类型没有关系
    * 递归
        - 方法自己调用自己
        - 递归能不用就不用

# 第三章

* 面向对象和面向过程

    - 面向对象三大特征
        - 封装: 内部封装的代码极其复杂但是使用起来提供了一个良好的接口 封装生成独立体 可以进行重复使用 并且提高了安全性
        - 继承
        - 多态
    - 采用面向对象生命周期短术语
        - 面向周期的分析 OOA
        - 面向对象的设计 OOD
        - 面向对象的编程 OOP

* 对象的创建和使用

    - 方法区内存: 在类加载的时候 class字节码片段会被存放到这块区域
    - 栈内存(局部变量): 当方法执行的时候会出现压栈的现象 
    - 堆内存: new的对象会在堆内存中存储
    - 成员变量中的实例对象存储在堆内存的java对象内部
    - 不能直接通过类来访问实例对象，因为实例变量存储与java内部，需要现有对象
    - String对象每次发生修改的时候都会开辟内存空间，修改的值保存的是一块内存地址，指向开辟出来的空间
    - 引用数据类型定义的是一个引用，内部存储着地址
    - 引用可以是局部变量 也可以是成员变量

* 总结

    1. JVM内存主要划分为3大区域: 方法区内存，栈内存，堆内存
    2. 栈内存主要存储局部变量
    3. 程序使用new运算符相当于创建了一个对象，其存储于堆内存，该对象内部存储实例变量，所以说实例变量存储于堆内存
    4. 方法调用的时候出现压栈现象，调用结束释放内存，出现弹栈现象
    5. 方法的代码片段在类加载的时候会放到方法区内存里
    6. 变量
        - 局部变量
        - 成员变量
            - 实例变量
            - 静态变量 修饰符前面有static
    7. 静态变量存储在方法区内存中
    8. 最先有数据的是方法区内存 执行最频繁的是栈内存 垃圾回收站是堆内存
    9. 当没有更多的引用指向对象，那么这块java对象就会变成垃圾

* 关于java集成开发环境

    * 集成开发环境可以让编译更加高效

    * 没IDE

        - 需要安装jdk 手动配置环境变量 需要手动编译生成class文件

    * 有IDE

        - 相反 比如eclispe

    * eclispe基本使用

        - .metadata存储了工作区状态

    * 封装的基本步骤

        - 简单介绍:封装private实现了数据的私有化 保证了只能在当前文件下访问该实例变量
        - 如果外部想要访问私有数据 需要通过get和set两种方法来进行访问
        - get方法的简单使用

        ```
        public int getdata(){
            return 
        }
        ```

        - set方法的简单使用

        ```
        public void setdata(int a){
            
        }
        ```

        - 需要背会的内容
            * setter和getter没有static关键字
            * 有static关键字通过类名.方法名(实参)
            * 没有static关键字通过引用.方法名(实参)

    * 构造方法

        - 语法

        ```
        修饰符 构造函数名(参数){
            构造函数体
        }
        ```

        - 构造方法名必须和类名一致
        - 调用构造方法: new 构造方法名(实参列表名)
        - 无参数的构造方法称为缺省构造器
        - 注意点
            * 构造方法返回值，但是不需要写return
            * 返回结果的类型构造方法所在类的类型一致 所以返回值不需要书写
            * 当构造方法已被定义了，那么缺省构造器就无法使用 建议开发时提供无参数构造器
            * 定义构造方法的时候是可以进行重载的
            * 创建对象的同时，初始化实例变量的内存空间
            * 当对象创建对象后为实例变量默认赋值
            * 引用只是一个变量是什么变量看情况
            * 局部变量存储于方法当中，而成员变量存放于方法体外

    * 对象和引用

        - 构造方法的意义
            * 创建对象
            * 给对象实例变量赋值
            * 传递参数
                - 传递参数传递的是字面值也可能是对象地址

    * this关键字

        - this在new完对象之后进行创建，this内部存储了当前对象的地址，这块地址指向自己
        - this在大多数情况下可以省略不写
        - 每一个对象动作所得的结果是不同的
        - 没有static的变量称为实例变量，没有static的方法称为实例方法
        - 是否带上static
            * 当方法为实例方法的时候不需要加static
        - 包含static调用方法的语法
            * 类名 + 方法名
            * 无法使用this去访问 因为是通过类名来访问 没有对象这一概念
            * 如果非要访问内部的实例变量可以通过创建对象的方式进行访问

    * static

        - 当所有对象的某一属性相同，将其声明为静态变量
        - 当所有对象的某一属性不同，将其声明为实例变量
        - static修饰的所有元素都可以通过类名的方式进行访问，也可以通过引用的方式进行访问但是不推荐
        - 工具类都属于静态变量
        - 静态方法不存在覆盖现象

* 继承 

    - 基本作用：代码复用 有了继承才有覆盖和多态的概念
    - 语法

    ```
    修饰符 class 类名 extends 父类{
        类体 = 属性 + 方法
    }
    ```

    - 继承了哪些数据
        * private和构造方法数据除外都继承
    - 如果没有说继承那个类默认情况下继承的是Object类

* 方法重写

    - 当子类继承的父类已经无法满足子类业务需要，就会出现方法重写
    - 方法重写发生具有继承的父子类之间
    - 方法重写建议复制粘贴
    - 私有方法和构造方法不能方法覆盖 static方法不存在覆盖 
    - 方法重写的条件
        * 两个类之间有继承关系
        * 方法名一致
        * 返回值类型一致
        * 参数列表个数一致
    - 注意点
        * 普通数据类型返回值必须保持一致
        * 如果是引用数据类型覆盖可以由大变小，反之不行

* 多态

    * 向上转型(子类型向父类型转型)
        - 无论Banana是否重写Garden的方法，最终调用的时候调用的都Banana的方法
        - 父类型引用指向子类型对象包含了两种形态： 编译阶段和运行阶段
    * 向下转型
        - 当调用的方法是子类型特有的，父类型里不存在
        - 通过强制类型转化来解决 Banana ban = (Banana)ban; //将garden类型强制转化为Banana类型
        - 注意点
            * Apple ban = (Apple) ban; //由于Apple和garden是继承关系，所以想要强制类型转化是没有问题的。但是JVM上真实存在的是Banana类型，Apple对象和Banana对象没有任何继承关系所以会报错
        - 如何避免强制类型转化出现的问题
            * instanceof解决
                - 语法: 引用 instanceof 数据类型名
                - 返回结果为true/false
                - 判断引用指向的对象是否正确 true 否则 false

    父类型向子类型转型

    * 编译阶段
        ex: Garden ban = new Banana();
        为ban规定为Garden类型，通过类型来查找方法，如果在Garden字节码文件里找到了，那么绑定成功即静态绑定成功
    * 运行阶段
        JVM实际创建的是Banana对象，那么运行阶段一定会调用Banana的方法，即动态绑定

* final关键字

    - final修饰的类无法被覆盖
    - final修饰的类无法被继承
    - final修饰的变量只能赋值一次
    - final修饰的变量如果是一个引用的话，内存地址无法被修改 并且这个对象不会被垃圾回收站回收
    - final定义的实例变量需要手动赋值或者通过构造方法进行赋值(赶在系统为实例变量附上默认值之前进行赋值)
    - 注意
        * final定义的引用虽然无法修改，但是对象内部定义的实例变量是可以修改值的
        * 局部变量没有初始值，成员变量有 
        * 实例变量是在new对象的时候赋值
    - 常量
        - 既然final修饰的变量不能发生改变，那么声明为实例变量占用堆内存空间，肯定是不好的，所以需要修改为静态
        - final + static = 常量
        - 语法: public final static 类型 常量名 = 值 
        - 常量名书写规范： 全部大写并且每个单词间用_分隔

* 包的命名机制

    - 域名倒序 + 项目名 + 模块名 + 功能名
    - 如果包名叫test.day03.scmat.user 那么项目名叫做test.day03.scmat.user.项目名    
    - 将java源文件编译到某一个目录下: javac -d 目标目录 java源文件路径
    - 两种引用其他包内到class文件的方式 
        * 包名.文件名 m = new 包名.文件名();
        * import 引入直接 文件名 m = new 文件名();

* 访问修饰权限

    - 来显示用户访问的范围
    - 包括
        * private:只在当前类下访问
        * protected:同包下，子类里
        * public:在所有类下都可以访问
        * 缺省:同包

* super

    - super关键字全部小写
        想要学习super应该和this对比着学

    - this关键字

        * 只能出现在实例方法里和构造方法里
        * 用法: this. this()
        * this. 什么时候不能省略: 当出现局部变量和实例变量重名的情况
        * this() 只能出现在构造方法第一行 目的是调用本类构造方法，为了复写代码

    - super关键字

        * 只能出现在实例方法里和构造方法里
        * 用法: super. super()
        * super. 什么时候不能省略:
        * super() 只能出现在构造方法第一行 目的是调用父类构造方法，为了复写代码
        * 通过super调用子类构造方法必须要先有父亲，才能调用子类
        * 如果一个类没有提供构造方法，系统会默认生成一个无参数构造方法
        * 当一个构造方法既没有super()也没有this()，默认情况下会有一个super(),相当于是通过子类来调用父类无参数构造方法

    - 注意

        * super和this只能出现一个因为都得出现在构造方法的第一行
        * Object是最先执行最后调用的

    - 思考: super(实参)到底是干什么的

        * 初始化当前父类型特征
        * 并不是创建对象，对象实际就一个

    - super开辟空间的流程图
        ![super流程图](../Desktop/super.png)

        > 根据上述图片我们可以得到子类构造调用父类构造，父类开辟的内存空间都是在子类的内部进行开辟的，所以说通过子类的引用是可以拿到父类的数据的

    - 什么时候super可以省略

        > 当父类和子类有同名属性，且你想访问的父类里的该属性，不能省略

    - super特征

        - 输出引用的时候会调用Object的toString方法
        - super不代表引用 super不能单独使用 super不保存地址，不指向任何对象
        - 静态方法内部无法使用super和this
        - 如果想要在子类中访问到父类的属性和方法需要通过super.关键字来获取

    

# 第四章

* 抽象类

    - 概念

        `具有共同特征类的，将这些类抽离出来形成抽象类`

        类到对象是实例化，对象到类是抽象

    - 类型: 引用数据类型

    - 语法

        ```
        修饰符 abstract class 类名
        ```

    - 注意点

        - 抽象类是无法实例化对象，但是有构造方法，供子类使用
        - 主要是用来继承的
        - final和abstract不能同时出现
        - 抽象类的子类可以是抽象类

    - 抽象方法

        ```
        ex: public abstract void hello();
        ```

        - 没有方法体，分号结束，需要包含abstract
        - 抽象类里不一定有抽象方法，但是抽象方法一定要出现在抽象类中

* 接口

    * 特征

        * 接口是一种引用数据类型
        * 接口完全抽象
        * 接口支持单继承也支持多继承
        * 接口中只包含常量和抽象接口
        * 接口中public abstract可以进行省略
        * 接口里定义的东西都是公开的
        * 接口里定义的常量public static final可以省略
        * 接口都是和多态联合使用的
        * 提高程序的扩展力

    * 语法

        ```
        修饰符 interface 接口名(){}
        ```

    * 类和类之间叫继承extends，类和接口之间叫实现implements

    * implement和extends可以同时存在

        ```
        class Apple extends Fruit implements fly
        ```

    * 作用

        `解耦合`

* 类和类型的关系

    * is a 继承
    * has a 类中 定义属性
    * like a 实现

* 抽象类和接口的区别

    * 抽象类半抽象，接口完全抽象
    * 抽象类里面有构造方法，接口没有
    * 接口和接口之间支持多继承，类和类之间只支持单继承
    * 接口一般是对行为进行抽象

* package

    * 为什么要使用包

        `包方便了程序的管理，不同的功能放到与之对应的包下`

    * 语法

        ```
        package 包名
        ```

    * 命名规范: 采用公司域名倒序 + 项目名 + 模块名 + 功能名

    * 包名手动设置 编译的时候需要根据自己设置的包名去运行

    * 如果想要运行当前目录下的文件，不走包文件设置的路径可以这么写

        ```
        javac -d . 文件名
        ```

* import机制

    * 什么时候使用

        `当某一个类想要调用另一个类的时候，并且两类不再统一包下使用`

    * 只能出现在package下 class之上

    * 还可以采用*的形式表示引入当前目录下的所有类

    * 解释Scanner

    ```
    java.util.Scanner s = new java.util.Scanner(System.in);
    //java.util就是Scanner存在的包，通过improt可以简化代码
    import java.util.Scanner;
    Scanner s = new Scanner(System.in);
    ```

    `java.lang包下的文件不用import导入可以直接使用,不同包下的文件即便重名但是不是一个文件`

* 访问控制权限

    * 各种访问权限访问的范围

    | 访问修饰符 | 本类 | 同包 | 子类 | 任意位置 |
    | ---------- | ---- | ---- | ---- | -------- |
    | 默认       | 可以 | 可以 | 不行 | 不行     |
    | Protected  | 可以 | 可以 | 可以 | 不行     |
    | Private    | 可以 | 不行 | 不行 | 不行     |
    | Public     | 可以 | 可以 | 可以 | 可以     |

    * 访问修饰符可以修饰什么
        * 属性和方法四个都行
        * 类和接口public和默认行

    

* Object类

    * toString(默认是将内存地址转化为16进制)

        `需要进行重写避免出现内存地址调用toString返回 包名+@+十六进制，希望得到一些有用的日期信息`

    * equals

        `也需要对public boolean equals(Object obj)进行重写`

        * java中所有基本数据类型通过==来判断是否相等，引用数据类型通过equals来判断

    * finalize

        > 垃圾回收的一个时机，不需要程序员手动调用，只需要进行重写

    * hashcode

        > 对对象的内存地址进行hash算法得到hash值

* 内部类

    * 概念：类的内部又定义了一个类
    * 分类
        * 静态内部类
        * 局部内部类
            * 匿名内部类通过在new花括号里添加的实现接口功能的方法(建议不使用，由于没有定义实现类的名，代码比较缭乱)
        * 实例内部类

* 数组

    * 简单介绍

        `引用数据类型父类是Object`

    * 特点

        * 数组可以存储基本数据类型，也可以存储引用数据类型
        * 由于是引用数据类型，所以数据存储在堆内存当中
        * 数组里面可以存储对象的引用
        * 数组一旦创建，长度不可改变
        * 数组分为一维二维和多维数组
        * java里内存地址是连续的
        * 所有的数组都是拿数组里面第一条数据作为主要内存地址的
        * 优点
            * 检索效率高
            * 内存地址在空间上是连续的
            * 知道第一个内存地址，所有内存地址都可以计算出来
            * 数组每一个元素占用空间相同并且类型也相同
            * 通过数学表达式快速查找不会一个一个找
        * 缺点
            * 由于数组连续，所以对数组的增删可能会导致后面的数组单元前移或后移
            * 很难在内存空间里找到一块比较大的连续的内存空间

    * 语法

        * 如何定义

            ```
            int[] age;
            String[] name;
            Boolean[] isTrue;
            ```

        * 如何初始化

            * 静态初始化

                ```
                int[] age = {100,200,300};
                ```

            * 动态初始化

                ```
                int [] age = new int[4];
                ```

            * 如何选择: 当确定好数据的内容的时候用静态初始化

        * main方法讲解

            * main方法传进来的是一个数组，通过直接运行我们可以得出数组长度为0，但是没有数据
            * main方法实际上是用来接收用户传入的数据的 args也就是容器

        * 扩容

            ```
            System.arraycopy(obj,0,obj1,0,3); //拷贝源 源头位置 拷贝到 到位置 拷贝几条
            ```

        * 二维数组

            * 如何初始化

                * 静态创建二维数组

                    ```
                    int[][] arr1 = {{1,2,3},{1,2,3},{2,3,4}};
                    ```

                * 动态创建二维数组

                    ```
                    int[][] arr2 = new int[3][4];
                    ```

    * 模拟栈内存和酒店管理系统项目实操

    * 冒泡排序

        ```
        
        ```

        

* 

* 

    

    
    
