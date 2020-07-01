package com.moonyue.mistakes.comom;

import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
public class Utils {
    public static void loadPropertySource(Class clazz, String filename){
        try{
            Properties p = new Properties();
            p.load(clazz.getResourceAsStream(filename));
            p.forEach((k, v) ->{
                log.info("{}={}", k, v);
                System.setProperty(k.toString(),v.toString());
            });
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
