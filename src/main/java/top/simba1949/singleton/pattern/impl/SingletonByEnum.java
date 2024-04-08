package top.simba1949.singleton.pattern.impl;

/**
 * 懒汉式——枚举
 * <p>
 * 优缺点：
 * 优点：线程安全，调用效率高，不能延时加载，实现简单。由于 JVM 从根本上提供保障，避免通过反射和反序列化的漏洞
 * <p>
 * 结论：推荐使用
 *
 * @author anthony
 * @version 2024/04/08
 * @since 2020/5/9 10:37
 */
public class SingletonByEnum {
	// 私有构造方法
	private SingletonByEnum() {
	}
	
	// 对外提供获取实例的方法
	public static SingletonByEnum getInstance() {
		return SingletonHolderEnum.INSTANCE.getInstance();
	}
	
	private enum SingletonHolderEnum {
		INSTANCE;
		private final SingletonByEnum instance;
		
		/**
		 * 枚举的构造方法
		 * JVM 保证这个方法绝对只会被调用一次
		 */
		SingletonHolderEnum() {
			instance = new SingletonByEnum();
		}
		
		public SingletonByEnum getInstance() {
			return instance;
		}
	}
}