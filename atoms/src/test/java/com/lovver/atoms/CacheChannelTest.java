package com.lovver.atoms;

import java.util.ArrayList;
import java.util.List;

import com.lovver.atoms.core.CacheChannel;

public class CacheChannelTest {

	public static void main(String[] args) throws InterruptedException {
		CacheChannel cc=CacheChannel.getInstance();
//		cc.set("hello", "dddd", "nihaoya");
//		cc.set("hello", "dddd2", "nihaoya");
//		while(true){
//			Object value=cc.get("hello", "dddd");
//			if(value==null){
//				System.out.println("==============="+value);
//			}else{
//				System.out.println("==============="+value);
//			}
//		}
//		List<String> dd=new ArrayList<String>();
//		dd.add("dddd");
//		dd.add("dddd2");
//		cc.evict("hello", dd);
//
		
//		Thread.sleep(3000);



//		List keys=cc.keys("hello");
//		System.out.println("removed!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		for(int i=0;i<10;i++){
			cc.set("hello", "dddd", "jobell_"+i,1);
			System.out.println("==============="+cc.get("hello", "dddd"));
			Thread.sleep(2000);
		}
        cc.evict("hello","dddd");



//		cc.set("jiangbiao", "hello", "ddddddd");
//		for(int i=0;i<100000;i++){
//			System.out.println("==============="+cc.get("jiangbiao", "hello"));
//		}
	}

}
