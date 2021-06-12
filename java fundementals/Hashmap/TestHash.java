import java.util.*;

public class TestHash{




public static void main(String[] args){
HashMap<String,String> trackList = new HashMap<String,String>();

trackList.put("ali sotak","ali sotak bilghona lisa alagani momkinak");
trackList.put("mihtagalak","mihtaghalak abo o ashki armi alaa abki o amsho");
trackList.put("kalimat","yosmo3ini hena yorakisni kalimat layst kalkalimat");
trackList.put("kon sadeqi","kama jameel law bakina asdidika");


System.out.println(trackList.get("ali sotak"));

Set<String> keys = trackList.keySet();
for(String key:keys){
System.out.println(key);
System.out.println(trackList.get(key));




}

}