package redis;

/**
 * 3 . 模拟线程进行秒杀服务
 * Created by liuyang on 2017/4/20.
 */
public class ThreadA extends Thread {
	
	private Service service;

	public ThreadA(Service service) {
		this.service = service;
	}

	@Override
	public void run() {
		
		service.seckill();
		
	}
}
