# -# java
java实验2

## 实验内容
基本要求：完成教材p110 第四题关于PC、内存等模拟的程序。
附加要求：
类中定义不少于两个构造方法；
每个类定义不少于2个属性，且属性的类型应该多样化；
根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。

## 实验过程
创一个包 四个类分别是test主类和cpu harddisk pc三个类 用定义的方法将其各种信息获取出来 分别为Speed Amount type capacity 将这些show()
## 实验方法
创一个包 四个类 test为主类 用定义的获取方法将其show出来

## 核心代码
package package1;
public class Test {
	public static void main(String args[]){
		//创建一个CPU对象
		CPU cpu =new CPU();
		//将cpu的speed设置为2200
		cpu.setSpeed(2200);
		cpu.settype("Intel Core i7");
		//创建一个HardDisk对象
		HardDisk disk=new HardDisk();
		//将disk的amount设置为200
		disk.setAmount(200);
		disk.setcapacity(250);
		//创建一个PC对象
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
		
	}
 
}
## 实验结果
![](121602167916_.pic_hd.png)
## 实验感想
熟悉了类的创建及基本数据类型使用，并且查看了自己计算机的信息将其用java代码的形式展示出来，有了很好的对java应用体验感。
