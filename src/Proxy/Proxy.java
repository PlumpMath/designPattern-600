package Proxy;

public class Proxy implements Subject{
	private RealSubject realSubject;
	public Proxy() {
		realSubject = new RealSubject();
	}
	@Override
	public void request() {
		System.out.println("proxy do something");
		realSubject.request();
	}

}
