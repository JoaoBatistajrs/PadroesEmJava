package gof.singleton;

public class SingletonLazyHolder {
  
  private static class InstanceHolder{
    private static SingletonLazyHolder instancia;
  }
  
  private SingletonLazyHolder(){
    super();
  }
  
  public static SingletonLazyHolder getInstancia(){
    if (InstanceHolder.instancia == null){
      InstanceHolder.instancia = new SingletonLazyHolder();
    }
    return InstanceHolder.instancia;
  }
}