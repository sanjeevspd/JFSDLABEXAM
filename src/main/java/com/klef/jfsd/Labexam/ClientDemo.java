package com.klef.jfsd.Labexam;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Device.class);
        cfg.addAnnotatedClass(SmartPhone.class);
        cfg.addAnnotatedClass(Tablet.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction t = session.beginTransaction();

      
    
        
        Device d=new Device();
        d.setId(1);
        d.setBrand("Google");
        d.setModel("A1");
        d.setPrice(12.00);
        

        session.persist(d);
     

        t.commit();
        System.out.println("Vehicles saved successfully!");

        session.close();
        sf.close();
    }
}