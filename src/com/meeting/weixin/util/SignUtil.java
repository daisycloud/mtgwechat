package com.meeting.weixin.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
* ����: SignUtil 
* ����: ����signature ������ 
* ����ʱ�䣺  2017-2-10
* �����汾��V1.0
 */

public class SignUtil {

	//��ӿ�������Ϣ�е�TokenҪһ��
	private static String token = "mtgweixin";
	
	/**
	    * ��������checkSignature
	    * ��������֤ǩ��
	    * ����ʱ�䣺 2017-2-10
	    * @param signature
	    * @param timestamp
	    * @param nonce
	    * @return
	    * @throws
	     */
	public static boolean checkSignature(String signature, String timestamp,String nonce) {
		// 1.��token��timestamp��nonce�������������ֵ�������
        String[] arr = new String[] { token, timestamp, nonce };
        Arrays.sort(arr);
        
        // 2. �����������ַ���ƴ�ӳ�һ���ַ�������sha1����
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            content.append(arr[i]);
        }
        MessageDigest md = null;
        String tmpStr = null;
        try {
            md = MessageDigest.getInstance("SHA-1");
            // �����������ַ���ƴ�ӳ�һ���ַ�������sha1����
            byte[] digest = md.digest(content.toString().getBytes());
            tmpStr = byteToStr(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        
        content = null;
		// 3����shal���ܺ���ַ�����signature�Աȣ���־������������΢��
		return tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false;
	 }
	
	 /**
	    * ��������byteToStr
	    * ���������ֽ�����ת��Ϊʮ�������ַ���
	    * ����ʱ�䣺 2017-2-10
	    * @param byteArray
	    * @return
	    * @throws
	     */
	private static String byteToStr(byte[] byteArray){
		String strDigest = "";
		for(int i = 0 ; i < byteArray.length; i ++){
			strDigest += byteToHexStr(byteArray[i]);
		}
		return strDigest;
	}
	
	/**
	    * ��������byteToHexStr
	    * ���������ֽ�ת��Ϊʮ�������ַ���
	    * ����ʱ�䣺2017-2-10
	    * @param mByte
	    * @return
	    * @throws
	     */
	private static String byteToHexStr(byte mByte){
		char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A','B', 'C', 'D', 'E', 'F' };
		char[] tempArr = new char[2];
		tempArr[0] = Digit[(mByte >>> 4) & 0X0F];
        tempArr[1] = Digit[mByte & 0X0F];
        String s = new String(tempArr);
        return s;
	}
	

}
