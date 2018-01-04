package il.org.yadvashem.map_ap_cbs;

public class AccessPoint {

	private String name = "";
	private String authfilenumber = "";
	private String source = "";

    public void setName( String name ){
        this.name = name;
    }
    
    public void setAuthFileNumber( String authfilenumber ){
        this.authfilenumber = authfilenumber;
    }
        
    public void setSource( String source ){
        this.source = source;
    }
	
    public String getName(){
        return this.name;
    }
    public String getAuthFileNumber(){
        return this.authfilenumber;
    }
    public String getSource(){
        return this.source;
    }
 
}
