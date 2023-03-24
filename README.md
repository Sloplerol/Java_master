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

# 第二章

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

        原理:`相邻两个元素之间比较大小，每次循环都将最大的数放到右边`

    * 选择排序

        原理: `将第一个元素的值和后面所有的元素进行比较发现最小放最左边，然后第二个元素再和后面进行比较，每次循环都将最小值放到左边`

    * 二分查找(需要数据是从小到大的)

        原理:`将数组首元素下标和尾元素下标相加/2，查找该下标对应的元素，如果在右边，那么就让这个元素+1和最后的元素相加/2重复同样的操作，直到最后`

* String

    * 介绍

        `String定义的类型为字符串类型，属于引用数据类型，由于字符串使用比较频繁，jdk定义的String都是存储在方法区的常量池当中的。`

    * 特点

        * 字符串创建出来是无法改变的
        * 垃圾回收器是不会回收常量的

    * 存储原理

        ```
        String x = "123"; //相当于是在栈内存中创建了一个引用指向方法区内存中的常量池里的字符串
        String x1 = new String("1233"); //相当于是在堆内存中创建了一个空间里面保存着指向常量池的地址，保存在栈内存里的x1通过引用指向堆内存
        ```

    * 注意

        * 垃圾回收器是不会回收常量的
        * 字符串比较使用要equals

    * 构造方法

        ```
        String s1 = new String("");
        String s2 = "";
        String s3 = new String(char数组);
        String s4 = new String(char数组,起始位置，延伸长度);
        String s3 = new String(byte数组);
        String s4 = new String(byte数组,起始位置，延伸长度);
        ```

    * String的常用方法

        * charAt: 查找字符串里某个字符
        * compareTo 返回结果为前-后
        * contains查看是否包含
        * endsWith 查看是否以某个字符串结尾
        * equalsIgnoreCase判断两个字符串忽略大小是否相等
        * getBytes将字符串转化为byte数组
        * indexOf判断子字符串出现在当前字符串第一个位置的下标索引
        * isEmpty判断字符串是否为空
        * lastIndexOf判断字符串最后一次出现的索引
        * replace替换字符串里字符
        * split通过字符来拆分字符串并放入数组
        * startsWith判断字符串是否以什么开始
        * substring截取字符串 当包含一个参数时代表起始位置 两个参数代表起始位置和终止位置 (左闭右开)
        * toCharArray将字符串转化为char类型的数组
        * toUpperCase 将字符串全部大写 
        * toLowerCase将字符串全部小写
        * valueOf将非字符串类型转化为字符串 println其实内部调用了valueOf方法

    * StringBuffer和StringBuilder拼接字符串

        * 通过 +进行字符串拼接的弊端

            `每一次拼接得到的结果需要创建在方法区内存的常量存储池里，如果拼接多了就会出现浪费存储池的问题`

        * StringBuffer默认情况下开辟了16字节空间的数组，当然StringBuffer可以自定义byte数组空间的大小

        * 通过append来进行拼接字符串的动作，如果空间不够那么就会自动扩容

        * StringBuffer 线程安全 StringBuilder非线程安全

    * 八种包装类

        | 基本数据类型 | 包装类型            |
        | ------------ | ------------------- |
        | Byte         | Java,lang.Byte      |
        | Short        | Java,lang.Short     |
        | Int          | Java,lang.Interger  |
        | Long         | Java,lang.Long      |
        | Char         | Java,lang.Character |
        | Boolean      | Java,lang.Boolean   |
        | Float        | Java,lang.Float     |
        | Double       | Java,lang.Double    |
        |              |                     |

    * 装箱和拆箱

        * 装箱

            ```
            //基本数据类型转化成引用数据类型
            Interger a = new Interger(123);
            ```

        * 拆箱

            ```
            //引用数据类型转化成基本数据类型
            float a1 = a.floatValue();
            ```

        * 自动装箱，自动拆箱

            ```
            //自动装箱
            Interger x = 100;
            //自动拆箱
            int y = x;
            ```

    * 面试题

        1. 为什么String定义的字符串不可以改变

            `查看源代码，String类里包含了一个byte类型的数组，它是用来存储每一条数据的，这个数组是用final来修饰的，数组长度是无法修改的，并且引用一旦指向对象就无法指向其余对象`

        2. 为什么StringBuffer和StringBuilder可以进行改变

            `因为内部的byte类型的数组并没有拿final进行修饰，初始化容量为16，底层采用了arrcopy来进行扩容，适用于字符拼接`

        3. 字符串不可变是什么意思

            ```
            String a = "abc";
            a = "xyc";
            //这个可变吗？ 答案：不可变
            字符串不可变意思是存储池里存储的字符串对象不能发生修改
            ```

    * 字符串类型转化

        * 字符串转int

            ```
            int a = Integer.parseInt("123");
            ```

        * 字符串转float

            ```
            float h1 = Float.parseFloat("1.2");
            ```

        * 字符串转double

            ```
            double h = Double.parseDouble("1.23");
            ```

    * int String Integer类型直接互相转换

        ```
        //int -> String
        String a = int + "";
        String a1 = String.valueOf(int);
        
        //String -> int
        int a2 = Integer.parseInt("123");
        
        //int -> Integer 装箱
        Integer x = 100;
        
        //Integer -> int 拆箱
        int x1 = x.intValue();
        
        //String -> Integer
        Integer.valueOf("123");
        
        //Integer -> String
        String.valueOf(Integer)
        ```

        

* Date

    * 获取当前时间并进行初始化

        ```
        Date newdate = new Date();
        SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SS");
        String nowTime = formatTime.format(newdate);
        ```

    * 初始化时间转化为系统时间

        ```
        String time = "2023-03-19 12:12:56 668";
        Date day = formatTime.parse(time);
        System.out.println(day);
        ```

    * 转化成毫秒数

        ```
        System.currentTimeMillis()
        ```

* Number

    * DecimalFormat

        `通过特殊字符进行划分数据操作`

    * BigDecimal

        `定义大精度类型的数据，但是计算需要使用BigDecimal独有的方法`

* Random

    ```
    Random rd = new Random(); //创建一个随机数字
    Random rd = new Random(11); //创建一个[1-10]以内的数字
    ```

    

* 枚举

    ```
    一枚一枚列举出来多种可能发生后的结果
    ```

* 异常

    * 概念: 程序执行过程中出现的不正常的信息 

    * 好处：通过异常可以捕获出错误信息让程序更加健壮

    * 语法

        ```
        //通过异常类来创建异常对象 在程序发生错误的时候会new一个异常类形成异常对象 并且将其输出到控制台中
        NumberFormatException nfe = new NumberFormatException("出错了");
        ```

    * 异常的执行机制

        * 需要通过查看UML图来明确所有类之间的关系
        * Object下有thro wable(可抛出的)，throwable下有两个分支Error(不可处理直接退出JVM)和Exception(可处理)，Exception下包含编译时异常(直接子类)，运行时异常 
        * 编译时异常出现的概率比较高，需要在编译时进行预处理操作，运行时异常出现的概率比较低
        * 所有异常都是发生在运行阶段

    * 处理异常的两种方式

        * 异常上抛 

            `如果某个方法出现异常了如果选择上抛的形式需要注意调用这个方法的人也需要进行上抛或者捕获异常`

        * 捕获异常

    * Try catch深入

        `catch可以捕获多个异常，但是异常一定要从小到大，java8新特性，可以将一些同级异常通过|的形式写到一块`

    * 打印异常信息的常用方法

        * getMessage：打印异常传入字符串参数信息
        * printStackTrace：打印异常堆栈信息

    * finally

        * 特征
            * finally子句必须和trycatch同时存在
            * finally子句是在最后执行的
        * 出现的场景
            * 主要用于资源的释放
            * finally里的代码一定会执行(System.exit退出虚拟机才不执行)
            * 执行一些try异常语句后的一些特殊语句

    * 错误输出语句中可以通过throw 异常来取代sout输出

    * 异常类覆盖父类必须比子类的编译时异常多

* 集合

    * 概念：相当于是一个容器,容纳多个内存地址

    * 注意点

        * 集合里面存储的不是基本数据类型也不是java对象，存储的是引用

        * 集合本身也是一个对象

        * java每一个集合对应的可能是不同的数据结构，向集合内存储数据相当于是在向数据结构内存储数据

            > 数组，二叉树，链表，哈希表，

    * 集合的位置

        > 存在于java.util.*，所有的集合类和集合接口都存储在这

    * 集合分为两大类

        * Collection接口(单个值直接存入)

            * 迭代原理

                ```
                Collection继承了Iterable接口，调用其里面的Iterator方法创建了Iterator迭代器对象，通过对象点形式调用方法对集合进行操作
                ```

            * Set、List接口继承(泛化)于Collection

                * List

                    ```
                    存储的数据有序，可以重复，包含下标，如何存入，如何取出
                    ```

                    * List的实现类

                        * ArrayList

                            > 采用数组的数据结构，非线程安全
                            >
                            > 往往添加元素都是往后面添加元素，效率不受影响，数组查找元素一般很快

                        * LinkedList

                            > 采用了双向链表数据结构
                            >
                            > 增删数据效率高

                        * Vector

                            > 采用数组的数据结构，线程安全，效率低

                    * List接口常用方法

                        * Add(添加的元素) 或者是 add(添加元素，下标索引)

                        * get(下标索引)

                            ```
                            通过索引获取集合指定对象
                            ```

                        * remove(下标)

                        * set(下标，替换后的元素对象)

                        * indexOf(指定对象)

                            ```
                            获取指定对象第一个的下标索引
                            ```

                        * lastindexOf(指定对象)

                            ```
                            获取指定对象的最后一个的下标索引
                            ```

                            

                * Set

                    ```
                    无序不可以重复，没有下标
                    ```

                    * Set的实现类

                        * HashSet

                            > 使用HashSet时候底层实际上是new了一个HashMap数据结构，存储数据实际上存储到的是hashmap里，哈希表数据结构

                        * SortedMap接口

                            > 这个接口实际上是有TreeSet来实现的，TreeSet底层是new了一个TreeMap，属于二叉树数据结构，该接口是可以自动按照大小进行排序的，不可以重复

                * Collections工具类

                    * 排序

                        ```
                        Collections.sort(集合)
                        ```

                    * 转化成线程安全的集合

                        ```
                        Collections.synchronizedList(想要转化的非线程集合)
                        ```

                        

        * Map(通过键值对的形式进行存储)

            * Map集合的key是无序并且无法重复的

            * 实现类

                * HashMap

                    > 底层是哈希表数据结构，是非线程安全的

                * HashTable

                    > HashTable是非线程安全的

                    * Properties继承于HashTable

                        > 属于非线程安全的，Properties存储元素采用的是key value的形式，又被称为属性类

                * SortedMap接口

        * 集合中的方法

            * add()

                > 向集合内部添加元素

            * size()

                > 统计集合内部元素的个数

            * clear()

                > 清空集合的个数

            * contains()

                > 判断是否集合内包含该元素
                >
                > 存放在集合里的内容一定要重写equals

            * remove()

                > 移除集合内某个元素
                >
                > 需要重写了equals方法

            * isEmpty()

                > 判断集合是否为空

            * toArray()

                > 可以将集合里的元素转化成字符串数组

        * Iterator的方法

            * hasNext

                ```
                判断是否有下一个集合元素
                ```

            * next

                ```
                迭代下一个元素
                ```

            * 注意点

                * 如果集合结构发生了改变需要重新获取迭代器
                * 在删除元素的时候，需要通过迭代器来删除，会自动更新迭代器，如果通过集合删除，数据结构将会发生改变报错

        * 数组数据结构

            * 初始容量是10，扩容1.5倍

            * 优点

                ```
                查找元素快速，因为数组的内存地址是连续的
                ```

            * 缺点

                ```
                增删效率低，因为当某一元素发生变化其余的元素内存地址会受到牵连
                ```

                

        * 单向链表

            * 基本单元是节点

            * 节点里主要存储两个数据分别是data和下一个节点的内存地址

            * 头节点里面存储这下一个节点的内存地址，每一次新增节点相当于是将尾节点里面的内存地址改为新增的内存地址，尾节点永远存储地址为null

            * 优点

                ```
                增删效率高不会牵连别的元素
                ```

            * 缺点

                ```
                查询效率低，需要对每一个元素进行遍历
                ```

        * 双向链表

            * 节点里存储的数据有data和上一个节点内存地址也有下一个节点内存地址

        * Vector

            * 初始容量为10，扩容2倍
            * Vector所有方法都是线程同步的都带有synachronic关键字
            * 可以通过Collections.synachronic将非安全线程转化为安全线程

        * 泛型

            * 转化成某一类不需要向下转型
            * 通过泛型可以直接保证传入数据类型的统一
            * 还可自定义泛型

        * forEach遍历数组

            ```
            int[] arr = {1,2,3,4};
            for(int data : arr){
            		System.out.println(data);
            }
            ```

        * HashSet，TreeSet

            * HashSet无序，元素不可重复
            * TreeSet无序，但是可以排序，元素不能重复

        * Map常用方法

            * put(键，值)

                ```
                向集合中push元素
                ```

            * get(键)

                ```
                通过某个键来获取对应的value
                ```

            * size()

                ```
                获取集合长度
                ```

            * remove(键)

                ```
                删除该键和该键所对应的value
                ```

            * containsKey

                ```
                判断是否包含某个Key
                ```

            * containsValue

                ```
                判断是否包含某个value
                ```

            * isEmpty

                ```
                判断是否为空
                ```

            * clear

                ```
                清除集合中的所有元素
                ```

            * values()

                ```
                //获取集合中的所有元素
                Collection<String> values = map.values();
                ```

            * keySet()

                ```
                获取所有的key值，可以通过key值来获取value的值但是效率较低
                ```

            * entry直接获取key和value

                ```
                Set<Map.Entry<Integer,String>> set = map.entrySet(); //集合的节点对象的类型是Map.Entry<Integer,String>
                ```

        * 哈希表

            * 特点

                * HashMap底层的数据结构是哈希表/散列表
                * 哈希表是数组和单向列表的结合体
                * 数组查找数据高效，单向类标增删数据效率高，双方弥补了别人的不足点 

            * 哈希表put数据和get数据

                * HashMap

                    * put

                    > 先将key和value放到Node列表中，通过调用key的hashCode方法生成hash值，经过hash算法将这个值转化成数组下标，通过数组下标找到元素，如果没有元素那么就将这个元素添加到该位置，如果存在链表再去比对key值，如果相等那么直接替换掉，如果不等那么就将其放入链表的末尾

                    * get

                    > 同理先将key和value放到Node列表中，通过调用key的hashCode方法生成hash值，经过hash算法将这个值转化成数组下标，通过数组下标快速的定位位置，如果get这个位置什么都没有，那么返回结果为null，如果有单向链表那么就拿着key于所有链表进行比对如果没有返回结果为false，如果equals成功了那么就返回value值

                    * HashSet key部分的元素以及HashSet里的元素都对equals和hashCode进行了重写,hashCode默认情况下返回的对象的内存地址
                    * 如果想要发挥出哈希表最大性能需要对每一个元素散列均匀的分布，相当于是每一个位置上挂载的节点数相似
                    * HashMap初始化容量需要是2的倍数，达到散列分布均匀的效果，提高了效率
                    * 当HashMap的容量使用了75%的时候就会进行自动扩容操作，默认初始化容量为16
                    * JDK8新增特性：当单向链表数超过8个，会讲单向链表变成二叉树，当二叉树上的节点数小于6的时候，会变回来
                    * HashMap的key和value可以都是null

                * HashTable

                    * hashtable的key和value值都是不能为空的

                    * HashTable是采用了线程安全的，所有方法都带有syna关键字，效率低，但是现在有了更好的解决方法

                    * HashTable扩容是原容量的二倍再加一

                    * Properities

                        * setProperty

                            > 设置key value

                        * getProperty

                            > 通过key值来获取value

                * TreeSet

                    * 如果想要排序两个对象
                        * 通过自定义类实现comparable接口，并在类的内部重写compareTo方法
                        * Comparator比较器
                    * 如何选择
                        * 如果比较规则只有一个的话，那么使用comparable
                        * 如果比较规则需要来回切换的话使用Comparator

                * 自平衡二叉树结构

                    * 采取左小右大的原则进行存放
                    * 遍历二叉树的三种方式
                        * 根左右
                        * 左根右
                        * 左右根

* I/O流

    * 概念

        > 输入输出通过IO流可以完成硬盘的读和写

        

* 

    

    

    





​          

​    

​    


​    
