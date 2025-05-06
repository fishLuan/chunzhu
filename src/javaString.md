## String
#### Java字符串的一个重要特点就是字符串不可变。这种不可变性是通过内部的private final char[]字段，以及没有任何修改char[]的方法实现的。
#### ` String s1 = "Hello!"; `
#### 实际上字符串在String内部是通过一个char[]数组表示的，因此，按下面的写法也是可以的：
#### `String s2 = new String(new char[] {'H', 'e', 'l', 'l', 'o', '!'});`

## 字符串比较
#### 当我们想要比较两个字符串是否相同时，要特别注意，我们实际上是想比较字符串的内容是否相同。必须使用equals()方法而不能用==。
```// String
public class Main {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
```
#### 忽略大小写的比较，用equalsIgnoreCase()
#### 是否包含子串
`"Hello".contains("ll"); // true`
#### 搜索子串
```"Hello".indexOf("l"); // 2
"Hello".lastIndexOf("l"); // 3
"Hello".startsWith("He"); // true
"Hello".endsWith("lo"); // true
```
#### 提取子串
```
"Hello".substring(2); // "llo"
"Hello".substring(2, 4); "ll"
```

## 去除首尾空白字符
#### 使用trim()方法可以移除字符串首尾空白字符。空白字符包括空格，\t，\r，\n：
`"  \tHello\r\n ".trim(); // "Hello"`
#### 另一个strip()方法也可以移除字符串首尾空白字符。它和trim()不同的是，类似中文的空格字符\u3000也会被移除：
```
"\u3000Hello\u3000".strip(); // "Hello"
" Hello ".stripLeading(); // "Hello "
" Hello ".stripTrailing(); // " Hello"
```
#### String还提供了isEmpty()和isBlank()来判断字符串是否为空和空白字符串：
```
"".isEmpty(); // true，因为字符串长度为0
"  ".isEmpty(); // false，因为字符串长度不为0
"  \n".isBlank(); // true，因为只包含空白字符
" Hello ".isBlank(); // false，因为包含非空白字符
```

## 替换子串
#### 要在字符串中替换子串，有两种方法。一种是根据字符或字符串替换
#### 另一种是通过正则表达式替换
```
String s = "hello";
s.replace('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'
s.replace("ll", "~~"); // "he~~o"，所有子串"ll"被替换为"~~"
```

## 分割字符串
#### 要分割字符串，使用split()方法，并且传入的也是正则表达式：
```
String s = "A,B,C,D";
String[] ss = s.split("\\,"); // {"A", "B", "C", "D"}
```

## 拼接字符串
#### 拼接字符串使用静态方法join()，它用指定的字符串连接字符串数组：
```
String[] arr = {"A", "B", "C"};
String s = String.join("***", arr); // "A***B***C"
```

## 格式化字符串
#### 字符串提供了formatted()方法和format()静态方法，可以传入其他参数，替换占位符，然后生成新的字符串：
```
// String
public class Main {
    public static void main(String[] args) {
        String s = "Hi %s, your score is %d!";
        System.out.println(s.formatted("Alice", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));
    }
}
```

## 类型转换
#### 要把任意基本类型或引用类型转换为字符串，可以使用静态方法valueOf()
```
String.valueOf(123); // "123"
String.valueOf(45.67); // "45.67"
String.valueOf(true); // "true"
String.valueOf(new Object()); // 类似java.lang.Object@636be97c
```
### 要把字符串转换为其他类型，就需要根据情况。
#### 例如，把字符串转换为int类型：
```
int n1 = Integer.parseInt("123"); // 123
int n2 = Integer.parseInt("ff", 16); // 按十六进制转换，255
```
#### 把字符串转换为boolean类型：
```
boolean b1 = Boolean.parseBoolean("true"); // true
boolean b2 = Boolean.parseBoolean("FALSE"); // false
```

## 转换为char[]
#### String和char[]类型可以互相转换，方法是(不是引用类型，改变char[],String不变)：
```
char[] cs = "Hello".toCharArray(); // String -> char[]
String s = new String(cs); // char[] -> String
```

## 字符编码
#### 在Java中，char类型实际上就是两个字节的Unicode编码。如果我们要手动把字符串转换成其他编码，可以这样做：
```
byte[] b1 = "Hello".getBytes(); // 按系统默认编码转换，不推荐
byte[] b2 = "Hello".getBytes("UTF-8"); // 按UTF-8编码转换
byte[] b2 = "Hello".getBytes("GBK"); // 按GBK编码转换
byte[] b3 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换
```
#### 如果要把已知编码的byte[]转换为String，可以这样做：
```
byte[] b = ...
String s1 = new String(b, "GBK"); // 按GBK转换
String s2 = new String(b, StandardCharsets.UTF_8); // 按UTF-8转换
```
### 始终牢记：Java的String和char在内存中总是以Unicode编码表示。
