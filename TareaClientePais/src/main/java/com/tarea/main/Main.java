package com.tarea.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.tarea.entidades.Cliente;
import com.tarea.entidades.Pais;




public class Main {
	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();

	public static void main(String[] args) {
		
		 Cliente cliente1 = new Cliente (0,"Bryan","Alvarado","Garcia");
		 Cliente cliente2 = new Cliente (0,"Ronald","Rosado","Delgado");
		 Cliente cliente3 = new Cliente (0,"Katherine","Armijos","Pita");
		 
			 
		 
		
		     ingresarCliente(cliente1);
		     ingresarCliente(cliente2); 
		     ingresarCliente(cliente3);
			    
		    
		    
		    
		    
		    
         Pais pais1 = new Pais (0,"Ecuador");
         Pais pais2 = new Pais (0,"Argentina");
         Pais pais3 = new Pais (0,"Dubai");
         Pais pais4 = new Pais (0,"Mexico");
         Pais pais5 = new Pais (0,"Senegal");
         Pais pais6 = new Pais (0,"Espa�a");
         
         
         
             ingresarPais (pais1);
             ingresarPais (pais2);
             ingresarPais (pais3);
             ingresarPais (pais4);
             ingresarPais (pais5);
             ingresarPais (pais6);
        
		

	}
	
	
	 static void ingresarCliente(Cliente cliente) {
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(cliente);
			
			session.getTransaction().commit();
			session.close();
			System.out.println(cliente.getId());
		}
	  
	 
	 static void ingresarPais(Pais pais) {
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(pais);
			
			session.getTransaction().commit();
			session.close();
			System.out.println(pais.getId());
		}
	

}
