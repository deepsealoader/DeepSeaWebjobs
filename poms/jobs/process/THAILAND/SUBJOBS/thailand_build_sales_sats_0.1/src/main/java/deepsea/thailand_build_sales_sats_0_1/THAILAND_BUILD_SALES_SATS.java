// ============================================================================
//
// Copyright (c) 2006-2015, Talend Inc.
//
// This source code has been automatically generated by_Talend Open Studio for Big Data
// / Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package deepsea.thailand_build_sales_sats_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 





@SuppressWarnings("unused")

/**
 * Job: THAILAND_BUILD_SALES_SATS Purpose: <br>
 * Description:  <br>
 * @author user@talend.com
 * @version 7.0.1.20180411_1414
 * @status 
 */
public class THAILAND_BUILD_SALES_SATS implements TalendJob {

protected static void logIgnoredError(String message, Throwable cause) {
       System.err.println(message);
       if (cause != null) {
               cause.printStackTrace();
       }

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	private Object[] multiThreadLockWrite = new Object[0];
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(WEBJOB_NAME != null){
				
					this.setProperty("WEBJOB_NAME", WEBJOB_NAME.toString());
				
			}
			
			if(COUNTRY != null){
				
					this.setProperty("COUNTRY", COUNTRY.toString());
				
			}
			
			if(DEEPSEA_AUTH_TOKEN != null){
				
					this.setProperty("DEEPSEA_AUTH_TOKEN", DEEPSEA_AUTH_TOKEN.toString());
				
			}
			
			if(DEEPSEA_HOSTNAME != null){
				
					this.setProperty("DEEPSEA_HOSTNAME", DEEPSEA_HOSTNAME.toString());
				
			}
			
			if(DEFAULT_DATE_FORMAT != null){
				
					this.setProperty("DEFAULT_DATE_FORMAT", DEFAULT_DATE_FORMAT.toString());
				
			}
			
			if(MONGODB_HOSTNAME != null){
				
					this.setProperty("MONGODB_HOSTNAME", MONGODB_HOSTNAME.toString());
				
			}
			
			if(POSTGRES_DATABASE != null){
				
					this.setProperty("POSTGRES_DATABASE", POSTGRES_DATABASE.toString());
				
			}
			
			if(POSTGRES_HOSTNAME != null){
				
					this.setProperty("POSTGRES_HOSTNAME", POSTGRES_HOSTNAME.toString());
				
			}
			
		}

public String WEBJOB_NAME;
public String getWEBJOB_NAME(){
	return this.WEBJOB_NAME;
}
public String COUNTRY;
public String getCOUNTRY(){
	return this.COUNTRY;
}
public String DEEPSEA_AUTH_TOKEN;
public String getDEEPSEA_AUTH_TOKEN(){
	return this.DEEPSEA_AUTH_TOKEN;
}
public String DEEPSEA_HOSTNAME;
public String getDEEPSEA_HOSTNAME(){
	return this.DEEPSEA_HOSTNAME;
}
public String DEFAULT_DATE_FORMAT;
public String getDEFAULT_DATE_FORMAT(){
	return this.DEFAULT_DATE_FORMAT;
}
public String MONGODB_HOSTNAME;
public String getMONGODB_HOSTNAME(){
	return this.MONGODB_HOSTNAME;
}
public String POSTGRES_DATABASE;
public String getPOSTGRES_DATABASE(){
	return this.POSTGRES_DATABASE;
}
public String POSTGRES_HOSTNAME;
public String getPOSTGRES_HOSTNAME(){
	return this.POSTGRES_HOSTNAME;
}
	}
	private ContextProperties context = new ContextProperties();
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "THAILAND_BUILD_SALES_SATS";
	private final String projectName = "DEEPSEA";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Object>());
		
	
		private final java.util.Map<String, Long> start_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Long>());
		private final java.util.Map<String, Long> end_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Long>());
		private final java.util.Map<String, Boolean> ok_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Boolean>());
		public  final java.util.List<String[]> globalBuffer = java.util.Collections.synchronizedList(new java.util.ArrayList<String[]>());
	

private RunStat runStat = new RunStat();

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}


private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	private String currentComponent = null;
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				THAILAND_BUILD_SALES_SATS.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(THAILAND_BUILD_SALES_SATS.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tRunJob_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tRunJob_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
		





public void tRunJob_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tRunJob_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_2", false);
		start_Hash.put("tRunJob_2", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_2";

	
		int tos_count_tRunJob_2 = 0;
		
    	class BytesLimit65535_tRunJob_2{
    		public void limitLog4jByte() throws Exception{
    			
    		}
    	}
    	
        new BytesLimit65535_tRunJob_2().limitLog4jByte();


 



/**
 * [tRunJob_2 begin ] stop
 */
	
	/**
	 * [tRunJob_2 main ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	
	java.util.List<String> paraList_tRunJob_2 = new java.util.ArrayList<String>();
	
	        			paraList_tRunJob_2.add("--father_pid="+pid);
	      			
	        			paraList_tRunJob_2.add("--root_pid="+rootPid);
	      			
	        			paraList_tRunJob_2.add("--father_node=tRunJob_2");
	      			
	        			paraList_tRunJob_2.add("--context=Production");
	      			
	//for feature:10589
	
		paraList_tRunJob_2.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_2.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_2 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_2 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_2".equals(tRunJobName_tRunJob_2) && childResumePath_tRunJob_2 != null){
		paraList_tRunJob_2.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_2.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_2");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_2 = new java.util.HashMap<String, Object>();

	
		
		context.synchronizeContext();
		
			parentContextMap_tRunJob_2.put("WEBJOB_NAME", context.WEBJOB_NAME);
			paraList_tRunJob_2.add("--context_type " + "WEBJOB_NAME" + "=" + "id_String");
		
			parentContextMap_tRunJob_2.put("COUNTRY", context.COUNTRY);
			paraList_tRunJob_2.add("--context_type " + "COUNTRY" + "=" + "id_String");
		
			parentContextMap_tRunJob_2.put("DEEPSEA_AUTH_TOKEN", context.DEEPSEA_AUTH_TOKEN);
			paraList_tRunJob_2.add("--context_type " + "DEEPSEA_AUTH_TOKEN" + "=" + "id_String");
		
			parentContextMap_tRunJob_2.put("DEEPSEA_HOSTNAME", context.DEEPSEA_HOSTNAME);
			paraList_tRunJob_2.add("--context_type " + "DEEPSEA_HOSTNAME" + "=" + "id_String");
		
			parentContextMap_tRunJob_2.put("DEFAULT_DATE_FORMAT", context.DEFAULT_DATE_FORMAT);
			paraList_tRunJob_2.add("--context_type " + "DEFAULT_DATE_FORMAT" + "=" + "id_String");
		
			parentContextMap_tRunJob_2.put("MONGODB_HOSTNAME", context.MONGODB_HOSTNAME);
			paraList_tRunJob_2.add("--context_type " + "MONGODB_HOSTNAME" + "=" + "id_String");
		
			parentContextMap_tRunJob_2.put("POSTGRES_DATABASE", context.POSTGRES_DATABASE);
			paraList_tRunJob_2.add("--context_type " + "POSTGRES_DATABASE" + "=" + "id_String");
		
			parentContextMap_tRunJob_2.put("POSTGRES_HOSTNAME", context.POSTGRES_HOSTNAME);
			paraList_tRunJob_2.add("--context_type " + "POSTGRES_HOSTNAME" + "=" + "id_String");
		 
		java.util.Enumeration<?> propertyNames_tRunJob_2 = context.propertyNames();
		while (propertyNames_tRunJob_2.hasMoreElements()) {
			String key_tRunJob_2 = (String) propertyNames_tRunJob_2.nextElement();
			Object value_tRunJob_2 = (Object) context.get(key_tRunJob_2);
			if(value_tRunJob_2!=null) {  
				paraList_tRunJob_2.add("--context_param " + key_tRunJob_2 + "=" + value_tRunJob_2);
			} else {
				paraList_tRunJob_2.add("--context_param " + key_tRunJob_2 + "=" + NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY);
			}
			
		}
		

	Object obj_tRunJob_2 = null;

	
		obj_tRunJob_2 = "sales.dksh.monthly";
		if(obj_tRunJob_2!=null) {
			paraList_tRunJob_2.add("--context_param COLLECTION=" + RuntimeUtils.tRunJobConvertContext(obj_tRunJob_2));
		} else {
			paraList_tRunJob_2.add("--context_param COLLECTION=" + NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY);
		}
		
		parentContextMap_tRunJob_2.put("COLLECTION", obj_tRunJob_2);
	
		obj_tRunJob_2 = "thailand.sales.dksh.monthly";
		if(obj_tRunJob_2!=null) {
			paraList_tRunJob_2.add("--context_param SOURCE=" + RuntimeUtils.tRunJobConvertContext(obj_tRunJob_2));
		} else {
			paraList_tRunJob_2.add("--context_param SOURCE=" + NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY);
		}
		
		parentContextMap_tRunJob_2.put("SOURCE", obj_tRunJob_2);
	
	
		deepsea.sat_sales_0_1.SAT_SALES childJob_tRunJob_2 = new deepsea.sat_sales_0_1.SAT_SALES();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_2 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_2) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_2 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_2 : talendDataSources_tRunJob_2
			        .entrySet()) {
	            dataSources_tRunJob_2.put(talendDataSourceEntry_tRunJob_2.getKey(),
	                    talendDataSourceEntry_tRunJob_2.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_2.setDataSources(dataSources_tRunJob_2);
	    }
		  
			childJob_tRunJob_2.parentContextMap = parentContextMap_tRunJob_2;
		  
		
		String[][] childReturn_tRunJob_2 = childJob_tRunJob_2.runJob((String[]) paraList_tRunJob_2.toArray(new String[paraList_tRunJob_2.size()]));
		
	  	
				((java.util.Map)threadLocal.get()).put("errorCode", childJob_tRunJob_2.getErrorCode());
			
	            
	    	if(childJob_tRunJob_2.getErrorCode() == null){
				globalMap.put("tRunJob_2_CHILD_RETURN_CODE", childJob_tRunJob_2.getStatus() != null && ("failure").equals(childJob_tRunJob_2.getStatus()) ? 1 : 0);
	    	}else{
				globalMap.put("tRunJob_2_CHILD_RETURN_CODE", childJob_tRunJob_2.getErrorCode());
		    }
		    if (childJob_tRunJob_2.getExceptionStackTrace() != null) { 
		    	globalMap.put("tRunJob_2_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_2.getExceptionStackTrace());
		    }
	  
			 
				if (childJob_tRunJob_2.getErrorCode() != null || ("failure").equals(childJob_tRunJob_2.getStatus())) {
	        		throw new RuntimeException("Child job running failed.\n"+childJob_tRunJob_2.getException().getClass().getName() + ": " + childJob_tRunJob_2.getException().getMessage());
				}
			
	  	

 


	tos_count_tRunJob_2++;

/**
 * [tRunJob_2 main ] stop
 */
	
	/**
	 * [tRunJob_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 



/**
 * [tRunJob_2 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 



/**
 * [tRunJob_2 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_2 end ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 

ok_Hash.put("tRunJob_2", true);
end_Hash.put("tRunJob_2", System.currentTimeMillis());




/**
 * [tRunJob_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_2 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 



/**
 * [tRunJob_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_2_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Production";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };

    private SyncInt runningThreadCount =new SyncInt();

    private class SyncInt
    {
        private int count = 0;
        public synchronized void add(int i)
        {
            count +=i;
        }

        public synchronized int getCount()
        {
            return count;
        }
    }

    private PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    

    public static void main(String[] args){
        final THAILAND_BUILD_SALES_SATS THAILAND_BUILD_SALES_SATSClass = new THAILAND_BUILD_SALES_SATS();

        int exitCode = THAILAND_BUILD_SALES_SATSClass.runJobInTOS(args);

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";

        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }


        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }

        try {
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = THAILAND_BUILD_SALES_SATS.class.getClassLoader().getResourceAsStream("deepsea/thailand_build_sales_sats_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = THAILAND_BUILD_SALES_SATS.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                //defaultProps is in order to keep the original context value
                defaultProps.load(inContext);
                inContext.close();
                context = new ContextProperties(defaultProps);
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
				    context.setContextType("WEBJOB_NAME", "id_String");
				
                context.WEBJOB_NAME=(String) context.getProperty("WEBJOB_NAME");
				    context.setContextType("COUNTRY", "id_String");
				
                context.COUNTRY=(String) context.getProperty("COUNTRY");
				    context.setContextType("DEEPSEA_AUTH_TOKEN", "id_String");
				
                context.DEEPSEA_AUTH_TOKEN=(String) context.getProperty("DEEPSEA_AUTH_TOKEN");
				    context.setContextType("DEEPSEA_HOSTNAME", "id_String");
				
                context.DEEPSEA_HOSTNAME=(String) context.getProperty("DEEPSEA_HOSTNAME");
				    context.setContextType("DEFAULT_DATE_FORMAT", "id_String");
				
                context.DEFAULT_DATE_FORMAT=(String) context.getProperty("DEFAULT_DATE_FORMAT");
				    context.setContextType("MONGODB_HOSTNAME", "id_String");
				
                context.MONGODB_HOSTNAME=(String) context.getProperty("MONGODB_HOSTNAME");
				    context.setContextType("POSTGRES_DATABASE", "id_String");
				
                context.POSTGRES_DATABASE=(String) context.getProperty("POSTGRES_DATABASE");
				    context.setContextType("POSTGRES_HOSTNAME", "id_String");
				
                context.POSTGRES_HOSTNAME=(String) context.getProperty("POSTGRES_HOSTNAME");
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }


        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("WEBJOB_NAME")) {
                context.WEBJOB_NAME = (String) parentContextMap.get("WEBJOB_NAME");
            }if (parentContextMap.containsKey("COUNTRY")) {
                context.COUNTRY = (String) parentContextMap.get("COUNTRY");
            }if (parentContextMap.containsKey("DEEPSEA_AUTH_TOKEN")) {
                context.DEEPSEA_AUTH_TOKEN = (String) parentContextMap.get("DEEPSEA_AUTH_TOKEN");
            }if (parentContextMap.containsKey("DEEPSEA_HOSTNAME")) {
                context.DEEPSEA_HOSTNAME = (String) parentContextMap.get("DEEPSEA_HOSTNAME");
            }if (parentContextMap.containsKey("DEFAULT_DATE_FORMAT")) {
                context.DEFAULT_DATE_FORMAT = (String) parentContextMap.get("DEFAULT_DATE_FORMAT");
            }if (parentContextMap.containsKey("MONGODB_HOSTNAME")) {
                context.MONGODB_HOSTNAME = (String) parentContextMap.get("MONGODB_HOSTNAME");
            }if (parentContextMap.containsKey("POSTGRES_DATABASE")) {
                context.POSTGRES_DATABASE = (String) parentContextMap.get("POSTGRES_DATABASE");
            }if (parentContextMap.containsKey("POSTGRES_HOSTNAME")) {
                context.POSTGRES_HOSTNAME = (String) parentContextMap.get("POSTGRES_HOSTNAME");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();




this.globalResumeTicket = true;//to run tPreJob




this.globalResumeTicket = false;//to run others jobs
final Thread launchingThread = Thread.currentThread();
        runningThreadCount.add(1);
        new Thread(){
            public void run() {
                java.util.Map threadRunResultMap = new java.util.HashMap();
                threadRunResultMap.put("errorCode", null);
                threadRunResultMap.put("status", "");
                threadLocal.set(threadRunResultMap);

                try {
((java.util.Map) threadLocal.get()).put("errorCode", null);tRunJob_2Process(globalMap);
if ( !"failure".equals(((java.util.Map)threadLocal.get()).get("status")) ) {
((java.util.Map) threadLocal.get()).put("status", "end");
}
}catch (TalendException e_tRunJob_2) {
globalMap.put("tRunJob_2_SUBPROCESS_STATE", -1);

e_tRunJob_2.printStackTrace();

}catch (java.lang.Error e_tRunJob_2) {
globalMap.put("tRunJob_2_SUBPROCESS_STATE", -1);
((java.util.Map) threadLocal.get()).put("status", "failure");throw e_tRunJob_2;

}
                finally {
                    Integer localErrorCode = (Integer)(((java.util.Map)threadLocal.get()).get("errorCode"));
                    String localStatus = (String)(((java.util.Map)threadLocal.get()).get("status"));
                    if (localErrorCode != null) {
                        if (errorCode == null || localErrorCode.compareTo(errorCode) > 0) {
                           errorCode = localErrorCode;
                        }
                    }
                    if (!status.equals("failure")){
                        status = localStatus;
                    }

                    if ("true".equals(((java.util.Map) threadLocal.get()).get("JobInterrupted"))) {
                        launchingThread.interrupt();
                    }

                    runningThreadCount.add(-1);
                }
            }
        }.start();

    boolean interrupted = false;
    while (runningThreadCount.getCount() > 0) {
        try {
            Thread.sleep(10);
        } catch (java.lang.InterruptedException e) {
            interrupted = true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    if (interrupted) {
        Thread.currentThread().interrupt();
    }



this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : THAILAND_BUILD_SALES_SATS");
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;
    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {


    }














    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();







        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        }else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		}

    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     37100 characters generated by Talend Open Studio for Big Data 
 *     on the April 2, 2019 5:29:09 PM SGT
 ************************************************************************************************/