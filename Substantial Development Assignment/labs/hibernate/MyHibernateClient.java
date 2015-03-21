import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

import org.hibernate.MappingException;
import org.hibernate.HibernateException;


import com.conygre.cd.CompactDiscProduct;

public class MyHibernateClient
{
  public static void main(String[] args)
  {
    // Part 1 Creating a new object and new entry in the database

    // create a Configuration object



      // configure it to use the CompactDiscProduct class using the add() method
      // catch the MappingException that could be thrown


      // declare a new try block

      // create a SessionFactory


      // assign the Configuration to null. It's not needed now.


      // open a Session


      //  create an instance of the CompactDiscProduct bean


      // create transaction


      // save the CompactDiscProduct object


      // commit the transaction



      // Part 2 Extracting the Data

      // Begin a new transaction


      // declare a variable of type java.util.List, and a variable of type Query
      // pass as an argument, the basic HQL query "from CompactDiscProduct"


      // process the results using the Iterator from the List




    // catch any HibernateExceptions here

  }


}