package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AMAN on 6/26/2016.
 */
public class ExcelSheet {
    Map<Integer,Character> characterMap ;
    public ExcelSheet(){
        characterMap = new HashMap<Integer,Character>();
    }

    public void createMapping(){
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<str.length();i++){
            characterMap.put(i+1,str.charAt(i));
        }
        characterMap.put(0,'Z');
    }

    public String   convertToTitle(int n) {
        StringBuilder excelColumn = new StringBuilder();
        int q = 0;
        int r = 0;
        //excelColumn.append(characterMap.get(r));
        int remaining = n;
        while(remaining>26){

            q = (remaining-1)/26;
            r= remaining%26;
            excelColumn.append(characterMap.get(r));
            remaining = q;
        }
        excelColumn.append(characterMap.get(remaining));
       // excelColumn.append(characterMap.get(r));
        return excelColumn.reverse().toString();

    }

    public static void main(String[] args){
        ExcelSheet sheet = new ExcelSheet();
        sheet.createMapping();
        System.out.print(sheet.convertToTitle(1));

    }





}
