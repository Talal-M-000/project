package HospitalManagmentSystem;

import java.util.Calendar;

import java.io.*;
import java.util.*;
 
// A Class used to send a message
class Sender
{
    public void send(String msg)
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread  interrupted.");
        }
        System.out.println("\n" + msg);
    }
}
 
class ThreadedSend extends Thread
{
    private String msg;
    Sender  sender;
 
    ThreadedSend(String m,  Sender obj)
    {
        msg = m;
        sender = obj;
    }
 
    public void run()
    {
        synchronized(sender)
        {
            sender.send(msg);
        }
    }
}

public class Main {

	public static void main(String[] args) {

		Welcome obj = new Welcome ("Welcome");
		System.out.println(obj.getwelcome());	
			
	Calendar calendar = Calendar.getInstance();  
    System.out.println("The current date is : " + calendar.getTime());  
	
    Sender snd = new Sender();
    ThreadedSend S1 =
        new ThreadedSend( "HOSPITALMANAGMENT SYSTEM" , snd );
    ThreadedSend S2 =
        new ThreadedSend( "LOGIN" , snd );

    S1.start();
    S2.start();

    // wait for threads to end
    try
    {
        S1.join();
        S2.join();
    }
    catch(Exception e)
    {
        System.out.println("Interrupted");
    }
    
	LOGIN obj_LOGIN = new LOGIN();
	
	obj_LOGIN.tryLogin();
	
	}
	}
