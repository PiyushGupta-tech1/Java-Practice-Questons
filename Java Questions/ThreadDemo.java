public class ThreadDemo    
{   
    public static void main(String[] args) {   
     
     
    Thread1 t1 = new Thread1();   
    Thread2 t2 = new Thread2();   
     
    
    t1.start();   
     
    t2.yield();   
      
    try    
    {   
        t1.sleep(1000);   
    }    
    catch (InterruptedException e)    
    {   
        e.printStackTrace();   
    }   
    t2.start();   
    System.out.println("Main Thread End");   
 }   
}   
 