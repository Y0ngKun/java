package com.Kwon.ch15Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Stream ����� ���ڱ������ ��ȯ ó��
//����� scanner ��ü�� �̿��Ͽ� Ű���� �Է� ó��
public class Ex15_12 {
	
	public static void main(String[] args) {
		
		String line = "";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			//InputStreamReader�� ��� Reader
			//System.in ������ ǥ�� �Է� ��Ʈ������ InputStream��ü��
			
			BufferedReader br = new BufferedReader(isr);
			System.out.println("������� OS�� ���ڵ� : " + isr.getEncoding());
			
			do {
				System.out.println("������ �Է��ϼ���. ��ġ�÷��� q�� �Է��ϼ���. >");
				line = br.readLine();
				System.out.println("�Է��Ͻ� ���� : " + line);
				
			} while (!(line.equalsIgnoreCase("q")));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}