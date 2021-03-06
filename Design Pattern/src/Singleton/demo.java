package Singleton;
/*
 * 单例模式，也叫单子模式，是一种常用的软件设计模式。在应用这个模式时，单例对象的类必须保证只有一个实例存在。
 * 许多时候整个系统只需要拥有一个的全局对象，这样有利于我们协调系统整体的行为。比如在某个服务器程序中，该服务器
 * 的配置信息存放在一个文件中，这些配置数据由一个单例对象统一读取，然后服务进程中的其他对象再通过这个单例对象获
 * 取这些配置信息。这种方式简化了在复杂环境下的配置管理。
 * 实现单例模式的思路是：一个类能返回对象一个引用(永远是同一个)和一个获得该实例的方法
 * （必须是静态方法，通常使用getInstance这个名称）；当我们调用这个方法时，如果类持有的引用不为空就返回这个引用，
 * 如果类保持的引用为空就创建该类的实例并将实例的引用赋予该类保持的引用；同时我们还将该类的构造函数定义为私有方法，
 * 这样其他处的代码就无法通过调用该类的构造函数来实例化该类的对象，只有通过该类提供的静态方法来得到该类的唯一实例。
 * Step 1:Create a Singleton Class.SingleObject.java
 * Step 2:Get the only object from the singleton class.SingletonPatternDemo.java
 */
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObject object=SingleObject.getinstance();
		
		object.print();

	}

}
