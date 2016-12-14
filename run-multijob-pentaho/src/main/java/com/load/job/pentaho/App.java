package com.load.job.pentaho;

import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;

public class App 
{
    public static void main( String[] args )
    {
    	 try {
             KettleEnvironment.init();
             TransMeta metaData = new TransMeta("/home/osboxes/Documents/first_transformation.ktr");
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
}
