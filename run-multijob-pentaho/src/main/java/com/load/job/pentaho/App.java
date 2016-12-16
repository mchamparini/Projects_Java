package com.load.job.pentaho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.exception.KettleXMLException;
import org.pentaho.di.job.Job;
import org.pentaho.di.job.JobMeta;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;

public class App 
{
	private static ExecutorService executor;
    public static void main( String[] args ) throws KettleException          
    {
    	    	    
    	 executor = Executors.newFixedThreadPool(3);
    	 
         executor.execute(new Runnable() {
			public void run() {
			 
			 }
		});   
       executor.shutdown();   
    	 executeJob(args);     	  
    	 //executeTrans();
    }
	public static void executeJob(String[] args) throws KettleException, KettleXMLException {
		String filename = args[0];
    	  KettleEnvironment.init();
    	  JobMeta jobMeta = new JobMeta(filename, null);
    	  Job job = new Job(null, jobMeta);
    	  job.start();
    	  job.waitUntilFinished();
    	  if (job.getErrors()!=0) {
    	    System.out.println("Error encountered!");
    	  	}
	}
	public static void executeTrans() {
		try {
             KettleEnvironment.init();
             TransMeta metaData = new TransMeta("/home/martinc/Documents/first_transformation.ktr");
             Trans trans = new Trans( metaData );
             trans.execute( null );
             trans.waitUntilFinished();
             if ( trans.getErrors() > 0 ) {
                 System.out.print( "Error Executing transformation" );
             }
         } catch( KettleException e ) {
             e.printStackTrace();
         }
	}
	public static List<String> getListkjb(){
	       ArrayList<String> lst=new ArrayList<String>();
		   Connection conn=null;
	       ResultSet rs = null;
	       Statement statement=null;
	       String url = "jdbc:oracle:thin:@falda.claro.amx:1521:dsmart2";
	       String user = "MCHAMPARINI";
	       String pass = "passQueNose";
	       String sql = "SELECT NOMBRE_KJB FROM PROCESS_TO_RUN WHERE STATUS = 5"; 
	       
	       try {
	             Class.forName("oracle.jdbc.driver.OracleDriver");
	             conn = DriverManager.getConnection(url,user,pass);
	             statement =  conn.createStatement();
	             rs =   statement.executeQuery(sql);
	             while (rs.next()){
	                 lst.add(rs.getString("NOMBRE_CSV"));                 
	            }
	        } catch (Exception e) {            
	            System.out.println(""+e.getMessage());
	        }finally{
	                if (rs != null) {
	                        try {
	                            rs.close();
	                        } catch (SQLException e) { /* ignored */}
	                    }
	                if (statement != null) {
	                        try {
	                            statement.close();
	                        } catch (SQLException e) { /* ignored */}
	                 }
	                if (conn != null) {
	                        try {
	                            conn.close();
	                        } catch (SQLException e) { /* ignored */}
	                }
	            }    
	        return lst;	        
	}
}
