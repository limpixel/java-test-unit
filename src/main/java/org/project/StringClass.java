package org.project;

public class StringClass {

    public String getStringValue(String input) throws  IllegalArgumentException{

        if(input == null){
            throw new IllegalArgumentException("Input Cannot Be Null");
        }else if(input.isEmpty()){
            return "Empty String";
        }else if(input.trim().isEmpty()){
            return "WhiteSpace";
        }else{
            return input.toUpperCase();
        }

    }
}